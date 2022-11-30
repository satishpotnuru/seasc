package com.demo.empsys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Component
public class FirestoreRepository {
	Logger logger = LoggerFactory.getLogger(FirestoreRepository.class);
	
	public Employee getEmployeeDetails(String employeeId) throws JsonMappingException, JsonProcessingException {
		
		
		logger.info("inside the repository method getEmployeeDetails() for given employeeID : {}",employeeId);

		Employee emp = new Employee();
		emp.setEmployeeID("AA");
		emp.setFirstName("John");
		emp.setMiddleName("A");
		emp.setLastName("Doe");

			return emp;
		
	}

}
