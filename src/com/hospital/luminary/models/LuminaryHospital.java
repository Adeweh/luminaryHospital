package com.hospital.luminary.models;

import java.util.Map;
import java.util.TreeMap;

public class LuminaryHospital {
    private static Map<String, Patient> patientDB = new TreeMap<>();

    public static Map<String, Patient> getPatientDB() {
        return patientDB;
    }
}
