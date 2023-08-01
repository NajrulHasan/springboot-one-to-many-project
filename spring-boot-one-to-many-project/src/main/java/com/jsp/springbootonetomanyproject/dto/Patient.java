package com.jsp.springbootonetomanyproject.dto;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	private String patientGender;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctorId")
	@JsonBackReference
	private Doctor doctor;
}
