package at.stefanproell.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
public class HibernateSearchConfiguration {
	private final Logger logger = LoggerFactory.getLogger(HibernateSearchConfiguration.class);


	@PersistenceContext
	private EntityManager entityManager;

	@Bean
	HibernateSearchService hibernateSearchService() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();
		System.out.println("-----------------");
		System.out.println(entityManager);
		System.out.println("-----------------");
		HibernateSearchService hibernateSearchService = new HibernateSearchService(entityManager);
		hibernateSearchService.initializeHibernateSearch();
		return hibernateSearchService;
	}

	


}
