package com.example.HospitalManagementSystem;

public class Doctor {
    private int doctorID;//primary key
    private String name;
    private int age;
    private String gender;
    private String specialization;
    private int noOfOperations;

    public Doctor(int doctorID, String name, int age, String gender, String specialization, int noOfOperations) {
        this.doctorID = doctorID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
        this.noOfOperations = noOfOperations;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getNoOfOperations() {
        return noOfOperations;
    }

    public void setNoOfOperations(int noOfOperations) {
        this.noOfOperations = noOfOperations;
    }
}
