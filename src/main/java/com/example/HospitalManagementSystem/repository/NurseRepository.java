package com.example.HospitalManagementSystem.repository;

import com.example.HospitalManagementSystem.models.Doctor;
import com.example.HospitalManagementSystem.models.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {

    HashMap<Integer, Nurse> nurseDb=new HashMap<>();

    public String addnurse(Nurse nurse) {
        int key= nurse.getNurseId();
        if(nurseDb.containsKey(key))
            return "nurseId already exist";
        nurseDb.put(key,nurse);
        return "Nurse added successfully";
    }

    public Nurse getnurse(int nurseId) {
        if(nurseDb.containsKey(nurseId))
        {
            return nurseDb.get(nurseId);
        }
        return null;
    }

    public List<Nurse> getList() {
        List<Nurse> nurseList=new ArrayList<>();
        for(Nurse n:nurseDb.values())
        {
            nurseList.add(n);
        }
        return nurseList;
    }

    public List<Nurse> getListByQualification(String q) {
        List<Nurse> nurseList=new ArrayList<>();
        for(Nurse n:nurseDb.values())
        {
            if(n.getQualification().equals(q))
             nurseList.add(n);
        }
        return nurseList;
    }

    public List<Nurse> getListByQualificationAndAge(String q, int age) {
        List<Nurse> nurseList=new ArrayList<>();
        for(Nurse n:nurseDb.values())
        {
            if(n.getQualification().equals(q) && age==n.getAge())
                nurseList.add(n);
        }
        return nurseList;
    }

    public String deleteNurse(int id) {
        if(nurseDb.containsKey(id))
        {
           nurseDb.remove(id);
           return "Nurse with nurseId "+id+" got deleted Successfully ";
        }
        else {
            return "NurseId does not exist";
        }
    }
}
