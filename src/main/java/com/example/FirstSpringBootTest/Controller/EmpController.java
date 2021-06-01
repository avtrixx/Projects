package com.example.FirstSpringBootTest.Controller;

import com.example.FirstSpringBootTest.Exception.ResourceNotFoundException;
import com.example.FirstSpringBootTest.Model.Student;
import com.example.FirstSpringBootTest.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/springtest")
    public String testserver() {
        return "Hi! Test run for EmployeeController successful";
    }

    @GetMapping("/getempdetails")
    public ResponseEntity<Student> getempdetail(@RequestParam Integer empId,
                                                @RequestHeader HttpHeaders httpHeaders)
            throws ResourceNotFoundException {

        return new ResponseEntity<Student>(employeeService.getempdetail(empId, httpHeaders), HttpStatus.OK);
    }

}
