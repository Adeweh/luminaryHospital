package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalTypes;

public class Doctor extends HealthProfessional{
    @Override
    public HealthProfessionalTypes getProfessionalTypes() {
        return HealthProfessionalTypes.DOCTOR;
    }

       // public Doctor(){}

        public Doctor(String name){
            super(name);
        }


}
