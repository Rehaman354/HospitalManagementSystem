package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.models.Doctor;
import com.example.HospitalManagementSystem.models.Nurse;
import com.example.HospitalManagementSystem.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    NurseService nurseservice;

    @PostMapping("/add")
    public ResponseEntity<String> addNurse(@RequestBody Nurse nurse){
        String response=nurseservice.addNurse(nurse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public Nurse getNurse(@RequestParam("nurseId") int nurseId)
    {
        return nurseservice.getNurse(nurseId);
    }

    @GetMapping("/getList")
    public List<Nurse> getList(){
         return nurseservice.getList();
    }
    @GetMapping("/getList/{qualification}")
    public List<Nurse> getListByQualification(@PathVariable("qualification")String q){
        return nurseservice.getListByQualification(q);
    }
    @GetMapping("/getList/{qualification}/{age}")
    public List<Nurse> getListByQualificationAndAge(@PathVariable("qualification")String q,@PathVariable("age") int age){
        return nurseservice.getListByQualificationAndAge(q,age);
    }
    @DeleteMapping("/delete")
    public String deleteNurse(@RequestParam("nurseId") int Id)
    {
        return nurseservice.deleteNurse(Id);
    }

}
