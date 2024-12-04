package com.organic.DoctorAppoint;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organic.DoctorAppoint.RegistrationDetails;

public interface PatientDetailsRepo extends JpaRepository<RegistrationDetails, String>{
    
}
