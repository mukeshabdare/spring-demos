package com.example.batch.batchdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public Person process(final Person item) throws Exception {

		final Person p = new Person(item.getFirstName().toUpperCase(),
				item.getLastName().toUpperCase());
		
		log.info("transforming Person "+item+" into person "+p);
		
		return p;
	}

}
