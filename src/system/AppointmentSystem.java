package system;

import model.*;
import java.io.*;
import java.util.*;

public class AppointmentSystem {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private final String FILE_NAME = "data/appointments.ser";

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void bookAppointment(String patientId, String doctorId, String date) {
        Patient p = findPatient(patientId);
        Doctor d = findDoctor(doctorId);
        if (p != null && d != null) {
            appointments.add(new Appointment(p, d, date));
            System.out.println("Appointment booked!");
        } else {
            System.out.println("Invalid patient or doctor ID!");
        }
    }

    public void listAppointments() {
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }

    public void saveData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(appointments);
            System.out.println("Data saved.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            appointments = (List<Appointment>) in.readObject();
            System.out.println("Data loaded.");
        } catch (Exception e) {
            System.out.println("No previous data found or error loading data.");
        }
    }

    private Doctor findDoctor(String id) {
        for (Doctor d : doctors) if (d.getId().equals(id)) return d;
        return null;
    }

    private Patient findPatient(String id) {
        for (Patient p : patients) if (p.getId().equals(id)) return p;
        return null;
    }
}
