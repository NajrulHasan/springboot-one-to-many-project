package com.jsp.springbootonetomanyproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootonetomanyproject.dto.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{


}
