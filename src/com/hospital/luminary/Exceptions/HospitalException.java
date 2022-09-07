package com.hospital.luminary.Exceptions;

public class HospitalException extends Exception{
    public HospitalException() {
    }

    public HospitalException(String message) {
        super(message);
    }

    public HospitalException(String message, Throwable cause) {
        super(message, cause);
    }

    public HospitalException(Throwable cause) {
        super(cause);
    }
}
