package models;

import com.hospital.luminary.enums.HealthProfessionalTypes;
import com.hospital.luminary.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    private Doctor drRae;
    private HealthProfessional boyo;

    private Patient eden;

    @BeforeEach
    void setUp() {
        drRae = new Doctor("Rae");
        boyo = new Nurse("Boyo");
        eden= new Patient("e1","Eden");
    }
    @Test
    public void createHealthProfessionals() {
        assertEquals(HealthProfessionalTypes.DOCTOR, drRae.getProfessionalTypes());
        assertNotEquals(HealthProfessionalTypes.DOCTOR, boyo.getProfessionalTypes());
        assertEquals(HealthProfessionalTypes.NURSE, boyo.getProfessionalTypes());

        boyo = new Pharmacist("Wimp");

        assertNotEquals(HealthProfessionalTypes.NURSE, boyo.getProfessionalTypes());
    }


    @Test
    public void getDoctorPatients(){
        assertNotNull(drRae);
        assertNotNull(drRae.getPatients());
        assertEquals(0, drRae.getPatients().size());
        drRae.getPatients().put(eden.getPatientId(), eden);
        assertFalse(drRae.getPatients().isEmpty());

        Patient aPatient = drRae.getPatients().get("e1");
        assertEquals(eden, aPatient);


        }
    @Test
    public void createPatient(){
        Patient eden = new Patient("e1");
    }
}