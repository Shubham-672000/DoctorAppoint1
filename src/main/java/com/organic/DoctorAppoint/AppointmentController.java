package com.organic.DoctorAppoint;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/patientdetails")
public class AppointmentController {
    PatientService service;

    public AppointmentController(PatientService service) {
        this.service = service;
    }
    
    @GetMapping("{patientid}") //read data for a id from db
    public String getAppointment(@PathVariable("patientid")String patientid){
        return service.getAppointment(patientid);
        // return "success";    
    }

    @GetMapping//reading all the data from db
    public List<RegistrationDetails>getAllPatientDetails(){
        return service.getAllPatientDetails();    
    }

     @PostMapping
    public String bookAppointment(@RequestBody RegistrationDetails patient){
         service.bookAppointment(patient);
         return "created successfully";
    }
    @PutMapping
    public String updateAppointment(@RequestBody RegistrationDetails patient){
        service.updateAppointment(patient);
        return "updated scuccessfully";
    }
    @DeleteMapping("{patientid}")
    public String deleteAppointment(@PathVariable("patientid")String patientid){
        return service.deleteAppointment(patientid);
        // return "success";
    }

    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Home Page");
        return "index";
    }
    
    @GetMapping("/book-appointment")
    public String bookAppointment(Model model) {
        model.addAttribute("pageTitle", "Book Appointment");
        return "bookAppointment";
    }
    
    @PostMapping("/saveAppointment")
    public String saveAppointment(RegistrationDetails patient, Model model) {
        service.saveAppointment(patient);
        model.addAttribute("message", "Appointment booked successfully!");
        return "success"; // Create a success.html Thymeleaf template for displaying success message
    }
}
