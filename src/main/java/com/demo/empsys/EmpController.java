package com.ups.seas;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/seas/api/v1")
public class SeasController {
    Logger logger = LoggerFactory.getLogger(SeasController.class);

    @Autowired
    private SeasService upsService;

    @GetMapping("/employee/{employeeID}")
    public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("employeeID") String employeeId)
            throws FileNotFoundException, IOException{

        logger.info("inside the controller method getEmployeeDetails() for given employeeID : {}",employeeId);

        Employee upsEmployee=upsService.getEmployeeDetails(employeeId);
        if(upsEmployee==null) {
            return new ResponseEntity<>(upsEmployee,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(upsEmployee,HttpStatus.OK);
    }
}
