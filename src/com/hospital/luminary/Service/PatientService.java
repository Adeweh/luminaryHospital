package com.hospital.luminary.Service;

import com.hospital.luminary.Exceptions.HospitalException;
import com.hospital.luminary.models.Patient;

public interface PatientService {
    void register(Patient newPatient) throws HospitalException;


}
