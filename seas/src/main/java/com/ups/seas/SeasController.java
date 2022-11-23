package com.ups.seas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeasController {

    @GetMapping("/seas/employees")
    public String getEmployeeAttributes(){
        return "Started";
    }
}
