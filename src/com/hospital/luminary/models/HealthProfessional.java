package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalTypes;

import java.util.Map;
import java.util.TreeMap;

public abstract class HealthProfessional {
    private int professionalId;
    private String firstName;
    private String lastName;
    private HealthProfessionalTypes professionalTypes;

    private Map<String, Patient> patients = new TreeMap<>();

    public HealthProfessional(String name){
        this.firstName = name;
    }


    public int getProfessionalId() {
        return professionalId;
    }



    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
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

    public abstract HealthProfessionalTypes getProfessionalTypes();


    public void setProfessionalTypes(HealthProfessionalTypes professionalTypes) {
        this.professionalTypes = professionalTypes;
    }

    public Map<String, Patient> getPatients() {
        return LuminaryHospital.getPatientDB();
    }


}
