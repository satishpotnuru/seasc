package com.ups.seas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class FirestoreRepository {
	Logger logger = LoggerFactory.getLogger(FirestoreRepository.class);
	
	public Employee getEmployeeDetails(String employeeId) throws JsonMappingException, JsonProcessingException {
		
		
		logger.info("inside the repository method getEmployeeDetails() for given employeeID : {}",employeeId);

		Employee upsEmployee=new Employee();
		
		if(!employeeId.isBlank() && !employeeId.isEmpty()
				&& employeeId.matches("[0-9]{7}")) {
		
			
			upsEmployee.setEmployeeID("AA");
			upsEmployee.setBuildingMnemonic("ABEDN");
			upsEmployee.setFirstName("John");
			upsEmployee.setMiddleName("A");
			upsEmployee.setLastName("Doe");
			upsEmployee.setFirstNameAlternative("Jack");
			upsEmployee.setMiddleNameAlternative("A");
			upsEmployee.setLastNameAlternative("Doe");
			upsEmployee.setPrimaryPhoneNumber("xxx-xxx-xxxx");
			upsEmployee.setPreferredEmail("jdoe@gmail.com");
			upsEmployee.setBirthDate("mm/dd");
			upsEmployee.setSupervisoryOrganization("");
			upsEmployee.setJobCode("0072");
			upsEmployee.setOriginalHireDate("202203020000EST");
			upsEmployee.setRehireDate("202203020000EST");
			upsEmployee.setTerminationDate("202203020000EST");
			upsEmployee.setWorkerType("EMP");
			upsEmployee.setHomePostalCode("7834");
			upsEmployee.setHomeCountryCode("US");
			upsEmployee.setUnionID("");
			upsEmployee.setUnionType("T");
			
			upsEmployee.setEmploymentStatus("A");
			upsEmployee.setUserProfilePicture("");
			upsEmployee.setSystemIdentifier("G8");
			upsEmployee.setCompanyID("228");
			upsEmployee.setCompanyName("UPS General Services");
			upsEmployee.setCompanyCountry("US");
			upsEmployee.setDepartmentID("");
			upsEmployee.setDepartmentName("");
			upsEmployee.setDepartmentHead("");
			upsEmployee.setDepartmentParent("");
			upsEmployee.setCenterCode("0010");
			upsEmployee.setCenterName("");
			upsEmployee.setJobLevel("77");
			upsEmployee.setJobLevelName("FT Supervisor");
			upsEmployee.setJobFunctionCode("CAP");
			upsEmployee.setJobFunction("Operations");
			upsEmployee.setRegionID("03");
			upsEmployee.setRegionName("AMERICAS");
			upsEmployee.setDistrictID("01");
			upsEmployee.setDistrictName("North Carolina");
			upsEmployee.setLocationID("FLBAY");

			upsEmployee.setLocationName("Bayside Center");
			upsEmployee.setLocationAddress1("5201 EAGLE TRAIL DRIVE");
			upsEmployee.setLocationAddress2("APT 929");
			upsEmployee.setLocationCity("Tampa");
			upsEmployee.setLocationState("FL");
			upsEmployee.setLocationCountry("US");
			upsEmployee.setLocationDistrictID("");
			upsEmployee.setLocationRegionID("");
			upsEmployee.setLocationPostalCode("33592");
			upsEmployee.setPositionName("");
			upsEmployee.setFullTimeIndicator("F");
			upsEmployee.setSortType("0");
			upsEmployee.setEmployeeTypeCode("B");
			upsEmployee.setBusinessUnit("");
			upsEmployee.setManagerID("0000054");
			upsEmployee.setWorkLocationNameHost("");
			upsEmployee.setWorkLocationAddress1Host("");
			upsEmployee.setWorkLocationAddress2Host("");
			upsEmployee.setWorkLocationCityHost("");
			upsEmployee.setWorkLocationStateHost("");
			upsEmployee.setWorkLocationCountryHost("");
			
			upsEmployee.setWorkLocationNameHome("");
			upsEmployee.setWorkLocationAddress1Home("");
			upsEmployee.setWorkLocationAddress2Home("");
			upsEmployee.setWorkLocationCityHome("");
			upsEmployee.setWorkLocationStateHome("");
			upsEmployee.setWorkLocationCountryHome("");
			upsEmployee.setVersion("0.1.1");
			}
			
			return upsEmployee;	
		
	}

}
