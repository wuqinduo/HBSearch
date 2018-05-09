package at.stefanproell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import at.stefanproell.service.HibernateSearchService;

@SpringBootApplication
@ComponentScan("at.stefanproell")
public class SearchaRooApplication extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		
		
		SpringApplication.run(SearchaRooApplication.class);

	
	}
	
	
}
