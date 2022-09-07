package com.hospital.luminary.Service;

import com.hospital.luminary.Exceptions.HospitalException;
import com.hospital.luminary.models.LuminaryHospital;
import com.hospital.luminary.models.Patient;

public class PatientServiceImpl implements PatientService{
    @Override
    public void register(Patient newPatient) throws HospitalException {
        validatePatient(newPatient);
        LuminaryHospital.getPatientDB().put(newPatient.getPatientId(), newPatient);

    }
    private void validatePatient(Patient patient) throws HospitalException{
        if (patient == null){
            throw new HospitalException("Patient cannot be null");
        }
    }
}
