package at.stefanproell;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import at.stefanproell.model.Employee;
import at.stefanproell.service.HibernateSearchService;
import ch.qos.logback.classic.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchaRooApplicationTests {
	private final Logger logger = (Logger) LoggerFactory.getLogger(SearchaRooApplicationTests.class);


	@Autowired
	HibernateSearchService service;
	
	@Test
	@Transactional

	public void searchSingleTerm() {
		List<Employee> result =service.fuzzySearch("Muntz");
		logger.info("Found " + result.size() + " employees");
		assert(result.size()>0);
		
		for(Employee emp : result){
			logger.info("Id: "+ emp.getEmployee_id() + " " + emp.getFirstname() + " " + emp.getLastname() );
		}
	}

}
