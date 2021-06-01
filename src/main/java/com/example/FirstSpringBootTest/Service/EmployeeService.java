package com.example.FirstSpringBootTest.Service;

import com.example.FirstSpringBootTest.Connector.JpaServiceCallImpl;
import com.example.FirstSpringBootTest.Exception.ResourceNotFoundException;
import com.example.FirstSpringBootTest.Exception.ServiceException;
import com.example.FirstSpringBootTest.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

    @Autowired
    JpaServiceCallImpl jpaServiceCall;

    public Student getempdetail( Integer empID, HttpHeaders httpHeaders)  throws ResourceNotFoundException {
        throw new ResourceNotFoundException("Hey,what the phackkk");

        //todo accept headers object and pass to connector
//     return    jpaServiceCall.getStdudentJPADetails(empID,httpHeaders);


        //todo conevrtor - student anme- empname map stuent to Emp
        //stuid- empid
        //

//        System.out.println("Employee Details");
//        Employee emp1 = new Employee(3, "Ram");
//        emp1.getEmpid();
//        emp1.getName();
//        return emp1;
    }

}
