package com.jsp.springbootonetomanyproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomanyproject.Repository.DoctorRepository;
import com.jsp.springbootonetomanyproject.Repository.PatientRepository;
import com.jsp.springbootonetomanyproject.dto.Doctor;
import com.jsp.springbootonetomanyproject.dto.Patient;

@Repository
public class DoctorPatientDao {
	@Autowired
	private DoctorRepository doctorRep;
	
	@Autowired
	private PatientRepository patientRep;
	
	
	/*
	 * save method
	 */
	
	
	public List<Object> saveDoctorPatient(Doctor doctor) {
		List<Patient> patients=doctor.getPatients();
		List<Object> patients2=new ArrayList<Object>();
		
		for(Patient patient : patients) {
			patient.setDoctor(doctor);
			patients2.add(doctor);
			patientRep.save(patient);
		}
		return patients2;
	}
	
	
	/*
	 * getById Method
	 */
	
	
	
}
