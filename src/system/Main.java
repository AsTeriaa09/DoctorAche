package system;

import model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        AppointmentSystem system = new AppointmentSystem();
        system.loadData();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoctorAche - Menu:");
            System.out.println("1. Add Doctor\n2. Add Patient\n3. Book Appointment\n4. List Appointments\n5. Save & Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Doctor ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Specialization: "); String spec = sc.nextLine();
                    system.addDoctor(new Doctor(id, name, spec));
                }
                case 2 -> {
                    System.out.print("Patient ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
                    system.addPatient(new Patient(id, name, age));
                }
                case 3 -> {
                    System.out.print("Patient ID: "); String pid = sc.nextLine();
                    System.out.print("Doctor ID: "); String did = sc.nextLine();
                    System.out.print("Date (dd-mm-yyyy): "); String date = sc.nextLine();
                    system.bookAppointment(pid, did, date);
                }
                case 4 -> system.listAppointments();
                case 5 -> {
                    system.saveData(); return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
