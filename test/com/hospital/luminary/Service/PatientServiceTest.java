package com.hospital.luminary.Service;

import com.hospital.luminary.Exceptions.HospitalException;
import com.hospital.luminary.models.LuminaryHospital;
import com.hospital.luminary.models.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    private Logger logger = Logger.getLogger(PatientServiceTest.class.getName());
    private PatientService patientService;
    private Patient olamide;

    @BeforeEach
    void setUp() {
        patientService = new PatientServiceImpl();
    }
    @Test
    public void register(){
        assertTrue(LuminaryHospital.getPatientDB().isEmpty());
        olamide = new Patient("01", "Olamide");
        try {
            patientService.register(olamide);
        }catch (HospitalException hospitalException){
            logger.log(Level.FINE, hospitalException.getMessage());
        }
        assertFalse(LuminaryHospital.getPatientDB().isEmpty());

    }
    @Test
    public void registerWithNullPatient(){
        assertFalse(LuminaryHospital.getPatientDB().isEmpty());
        assertThrows(HospitalException.class, ()-> patientService.register(olamide));
        //assertTrue(LuminaryHospital.getPatientDB().isEmpty());

    }
}