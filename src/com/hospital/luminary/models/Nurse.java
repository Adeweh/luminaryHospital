package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalTypes;

public class Nurse extends HealthProfessional{
    @Override
    public HealthProfessionalTypes getProfessionalTypes() {
        return HealthProfessionalTypes.NURSE;
    }

    public Nurse(String name){
        super(name);
    }


}