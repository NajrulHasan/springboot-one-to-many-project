package com.jsp.springbootonetomanyproject.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Doctor {

	@Id
	private int doctorId;
	private String doctorName;
	private String doctorEmail;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Patient> patients ;
	
}
