package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.models.Nurse;
import com.example.HospitalManagementSystem.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseService {
    @Autowired
    NurseRepository nurseRepo;

    public String addNurse(Nurse nurse) {
        return nurseRepo.addnurse(nurse);
    }

    public Nurse getNurse(int nurseId) {
       return  nurseRepo.getnurse(nurseId);
    }

    public List<Nurse> getList() {
        return nurseRepo.getList();
    }

    public List<Nurse> getListByQualification(String q) {
        return nurseRepo.getListByQualification(q);
    }

    public List<Nurse> getListByQualificationAndAge(String q, int age) {
        return nurseRepo.getListByQualificationAndAge(q,age);
    }

    public String deleteNurse(int id) {
        return nurseRepo.deleteNurse(id);
    }
}
