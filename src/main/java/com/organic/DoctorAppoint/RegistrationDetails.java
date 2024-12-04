package com.organic.DoctorAppoint;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_details_info")
public class RegistrationDetails {
    @Id
    private String registrationId;
    
    private String name;
    private String email;
    private String phonenumber;
    private String reasonforappointment;
    private String dateofvisit;

    public RegistrationDetails() {
    }

    public RegistrationDetails(String registrationId, String name, String email, String phonenumber,
            String reasonforappointment, String dateofvisit) {
        this.registrationId = registrationId;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.reasonforappointment = reasonforappointment;
        this.dateofvisit = dateofvisit;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getReasonforappointment() {
        return reasonforappointment;
    }

    public void setReasonforappointment(String reasonforappointment) {
        this.reasonforappointment = reasonforappointment;
    }

    public String getDateofvisit() {
        return dateofvisit;
    }

    public void setDateofvisit(String dateofvisit) {
        this.dateofvisit = dateofvisit;
    }    
}
