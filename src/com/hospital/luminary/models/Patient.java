package com.hospital.luminary.models;

import com.hospital.luminary.enums.Gender;

public class Patient {
    private String patientId;
    private String firstName;
    private String lastName;
    private Gender gender;


    public Patient(String id) {
        patientId = id;
    }

    public Patient(String id, String firstName) {
        this(id);
        this.firstName = firstName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
