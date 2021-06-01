package com.example.FirstSpringBootTest.Connector;

import com.example.FirstSpringBootTest.Controller.EmpController;
import com.example.FirstSpringBootTest.Model.Student;
import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;

@Service
public class JpaServiceCallImpl implements JpaServiceCall {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EmpController empController;

   @Value("${service.url}")
    private String baseurl;


    @Override
    public Student getStdudentJPADetails(Integer empId,HttpHeaders httpHeaders) {
        //Todo change return type in Interface and use value.yml to read property from Applictaion.yml
        // avoid hard coding
        String url = baseurl + empId ;
        System.out.println(url);
        HttpEntity<String> entity = new HttpEntity<>("parameters" , httpHeaders);
        ResponseEntity<Student> responseEntity = restTemplate.exchange(url
                    ,
                HttpMethod.GET, entity, Student.class);
      return responseEntity.getBody();
    }
}
