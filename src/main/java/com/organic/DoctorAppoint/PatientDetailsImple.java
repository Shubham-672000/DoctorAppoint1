package com.organic.DoctorAppoint;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientDetailsImple implements PatientService {
     PatientDetailsRepo repo;

     public void saveAppointment(RegistrationDetails patient) {
        repo.save(patient);
    }
    
    public PatientDetailsImple(PatientDetailsRepo repo) {
        this.repo = repo;
    }

    @Override
    public String bookAppointment(RegistrationDetails patient) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'bookAppointment'");
        repo.save(patient);
        return "success";
    }

    @Override
    public String updateAppointment(RegistrationDetails patient) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateAppointment'");
        repo.save(patient);
        return "success";
    }

    @Override
    public String getAppointment(String patientid) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAppointment'");
        repo.findById(patientid).get();
        return "success";
    }

    @Override
    public String deleteAppointment(String patientid) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteAppointment'");
        repo.deleteById(patientid);
        return "success";
    }

    @Override
    public List<RegistrationDetails> getAllPatientDetails() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllPatientDetails'");
        return repo.findAll();
    }
    
}
