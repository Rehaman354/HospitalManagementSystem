package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    HashMap<Integer,Patient> patientDb=new HashMap<>();
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){

        int key=patient.getPatientID();
        if(patientDb.containsKey(key))
         return "patientId already exist";
        patientDb.put(key,patient);
        return "patient added successfully";
    }

    @GetMapping("/get")
    public Patient getPatient(@RequestParam("patientId") int patientId)
    {
        if(patientDb.containsKey(patientId))
        {
           return patientDb.get(patientId);
        }
        return null;
    }

    @GetMapping("/getList")
    public List<Patient> getPatients(){
        if(patientDb.size()==0)
            return new ArrayList<>();
        List<Patient> patientList=new ArrayList<>();
        for(Patient p:patientDb.values())
        {
            patientList.add(p);
        }
        return patientList;
    }


}
