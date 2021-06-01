package com.example.FirstSpringBootTest.Connector;

import com.example.FirstSpringBootTest.Model.Student;
import org.springframework.http.HttpHeaders;

public interface JpaServiceCall {
      public Student getStdudentJPADetails(Integer empId,HttpHeaders httpHeaders);

}
