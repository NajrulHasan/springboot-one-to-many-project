package com.jsp.springbootonetomanyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootonetomanyproject.dao.DoctorPatientDao;
import com.jsp.springbootonetomanyproject.dto.Doctor;


@RestController
public class DoctorPatientController {

	@Autowired
	private DoctorPatientDao dao;
	
 @PostMapping (value = "/saveDoctorPatient")
		 public Doctor saveDoctorPatient(@RequestBody Doctor doctor) {
	 List<Object> doctors=dao.saveDoctorPatient(doctor);
	 
	 for (Object object : doctors) {
		if(object instanceof Doctor) {
			return (Doctor) object;
			
		}
	}
	 return null;
 }
}
