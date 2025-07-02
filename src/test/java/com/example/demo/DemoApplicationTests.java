package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
class DemoApplicationTests {
	@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public static class featurecontroller
	{

	@Autowired

	public featureservice service;

	@PostMapping("/projects/{project_id}/addfeature")
	public Feature addfeature(@RequestBody Feature feature){
		return service.addfeature(feature);
	}
	@GetMapping("/projects/{project_id}/features")
	public List<Feature> viewfeatures(){
		return service.viewfeatures();
	}
}

	@Test
	void contextLoads() {

	}

}
