package at.stefanproell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import at.stefanproell.model.Employee;
import at.stefanproell.service.HibernateSearchService;

@RestController
@RequestMapping("/sh")
public class SearchController {
	
	@Autowired
	HibernateSearchService service;
	
	@RequestMapping("/get")
	public List<Employee> getByName(@RequestParam("name")String name){
		
		List<Employee> result =service.fuzzySearch(name);
		System.out.println("总数==========="+result.size());
		
		return  result;
	}
	
	@RequestMapping("/lastname")
	public List<Employee> getByFirtName(@RequestParam("name")String name){
		
		List<Employee> result =service.searchByName(name);
		System.out.println("总数==========="+result.size());
		
		return  result;
	}

}
