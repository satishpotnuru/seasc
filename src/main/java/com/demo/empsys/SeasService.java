package com.demo.empsys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Service
public class SeasService {
	
	@Autowired
	private FirestoreRepository upsRepository;
	
	Logger logger = LoggerFactory.getLogger(SeasService.class);
	
	public Employee getEmployeeDetails(String employeeId) throws JsonMappingException, JsonProcessingException {
		
		logger.info("inside the service method getEmployeeDetails() for given employeeID : {}",employeeId);

		Employee upsEmployee=new Employee();
		if(!employeeId.isBlank() && !employeeId.isEmpty() && employeeId.matches("[0-9]{7}")) {
		
			upsEmployee=upsRepository.getEmployeeDetails(employeeId);
		}else {
			logger.info("for given employeeId : {} no employee details obtained",employeeId);
			return null;
		}
		logger.info("for given employeeId : {} employee details obtained",employeeId);
		return upsEmployee;
	}
	
}
