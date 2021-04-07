package web.api.sample.controller;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import web.api.sample.model.Person;

@RestController
@RequestMapping("/data")
public class RecordRetrieverAPI {

	@Autowired(required=true)
	RestTemplate restTemplate;
	
	@GetMapping("/retrieve")
	public Person getData(@RequestParam("id") int id) {
		String urlString = "http://localhost:8080/record/person/{id}";		
		Person p = restTemplate.getForObject(urlString.replace("{id}", id+""), Person.class);	
		return p;
	}
	
	
}
