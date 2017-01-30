package it.blog.microservice.webmvc;

import it.blog.microservice.booking.Booking;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("jsp/home", "command", new Booking());
	}
	
	@RequestMapping("/bookings")
	public ModelAndView getBooking() {
		
		Booking[] booking = restTemplate.getForObject("http://BOOKING-SERVICE/list", Booking[].class);
		
		ModelAndView model = new ModelAndView("jsp/list");
		model.addObject("bookings", Arrays.asList(booking));
		return model;
				
	}
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public ModelAndView addBooking(@ModelAttribute Booking booking) {
	
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		MultiValueMap<String, Object> variables = buildRequest(booking);
		
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(variables, requestHeaders);
		
		ResponseEntity<?> response = restTemplate.postForEntity("http://BOOKING-SERVICE/add", requestEntity, ResponseEntity.class);
		//ResponseEntity<?> response = restTemplate.exchange("http://BOOKING-SERVICE/add", HttpMethod.POST, requestEntity, ResponseEntity.class);
		
		System.out.println(response);
		
		return welcome();
				
	}
	
	
	protected MultiValueMap<String, Object> buildRequest(Booking booking)
	{
		MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
		param.add("code", booking.getCode());
		param.add("FlightNumber", booking.getFlightNumber());
		param.add("Name", booking.getName());
		param.add("Surname", booking.getSurname());
		param.add("Seat", booking.getSeat());
		return param;
	}
	
}
