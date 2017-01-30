# SpringMicroServiceBooking
Code for article https://techannotation.wordpress.com/2017/01/30/spring-microservices-with-mongodb/

# Eureka Server
java.exe -classpath SpringMicroServiceBooking.jar;lib\*; it.blog.microservice.eureka.EurekaServer 

# Node 2
java.exe -classpath SpringMicroServiceBooking.jar;lib\*; it.blog.microservice.eureka.EurekaServerNode2 

# Business Logic
java.exe -classpath SpringMicroServiceBooking.jar;lib\*; it.blog.microservice.booking.BookingServer

# WebLayer
java.exe -classpath SpringMicroServiceBooking.jar;lib\*; it.blog.microservice.webmvc.WebServer

# Host
127.0.0.1 peer1
127.0.0.1 peer2
