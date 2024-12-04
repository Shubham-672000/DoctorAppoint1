package com.organic.DoctorAppoint;

import java.util.List;

public interface PatientService {
    public String bookAppointment(RegistrationDetails patient);
    public void saveAppointment(RegistrationDetails patient);
    public String updateAppointment(RegistrationDetails patient);
    public String getAppointment(String patientid);
    public String deleteAppointment(String patientid);
    public List<RegistrationDetails> getAllPatientDetails();
    
}
