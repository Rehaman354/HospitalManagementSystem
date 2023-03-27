package com.example.HospitalManagementSystem.models;

public class Patient {

    private int patientID;//primary key
    private String name;
    private int age;
    private String disease;
    private String bloodGroup;
    private String gender;

    public Patient(int patientID, String name, int age, String disease, String bloodGroup, String gender) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
