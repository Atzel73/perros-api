package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;

@Controller
public class  TesterController {
	@RequestMapping("/another")
	public String lista() {
		return "another";
	}
	
	@RequestMapping("/countries")
	public String GetCountries(Model modelo){
	    try {
	        String url = "https://restcountries.com/v3.1/all";
	        RestTemplate restTemplate = new RestTemplate();
	        Object[] countries = restTemplate.getForObject(url, Object[].class);
	        List<Object> paises = Arrays.asList(countries);
	        modelo.addAttribute("paises", paises);
	        return "countries";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "error"; 
	    }
	}

	
	
}