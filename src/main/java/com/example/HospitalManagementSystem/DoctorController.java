package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    HashMap<Integer,Doctor> doctorDb=new HashMap<>();

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){

        int key=doctor.getDoctorID();
        if(doctorDb.containsKey(key))
            return "DoctorId already exist";
        doctorDb.put(key,doctor);
        return "Doctor added successfully";
    }

    @GetMapping("/get")
    public Doctor getDoctor(@RequestParam("doctorId") int doctorId)
    {
        if(doctorDb.containsKey(doctorId))
        {
            return doctorDb.get(doctorId);
        }
        return null;
    }

    @GetMapping("/getList")
    public List<Doctor> getDoctors(){
        if(doctorDb.size()==0)
            return new ArrayList<>();
        List<Doctor> doctorList=new ArrayList<>();
        for(Doctor d:doctorDb.values())
        {
            doctorList.add(d);
        }
        return doctorList;
    }
}
