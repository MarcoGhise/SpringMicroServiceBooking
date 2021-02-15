package it.blog.microservice.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

	@Autowired
    private BookingRepository repository;

	@RequestMapping("/list")
    public List<Booking> getColleagues(){
        return repository.findAll();
    }

	/*
	 * 	POST http://localhost:8080/save HTTP/1.1
		User-Agent: Fiddler
		Content-Type: application/x-www-form-urlencoded

		code=JKS22&flightNumber=AZ-231&name=Marco&surname=Ghise&seat=1A
	 */
	@RequestMapping(method = RequestMethod.POST, path="/add")
    public ResponseEntity<String> addColleague(@ModelAttribute Booking booking){
    	
        repository.save(booking);
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
