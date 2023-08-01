package com.jsp.springbootonetomanyproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootonetomanyproject.dto.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
