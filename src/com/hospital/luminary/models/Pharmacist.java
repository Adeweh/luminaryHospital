package com.hospital.luminary.models;

import com.hospital.luminary.enums.HealthProfessionalTypes;

public class Pharmacist extends HealthProfessional{
    @Override
    public HealthProfessionalTypes getProfessionalTypes() {
        return HealthProfessionalTypes.PHARMACIST;
    }

    public Pharmacist(String name){
        super(name);
    }


}
