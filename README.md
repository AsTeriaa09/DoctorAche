# DoctorAche

DoctorAche is a simple Java-based console application for managing doctor appointments. It allows users to add doctors and patients, book and list appointments, and persist all data locally. The system is designed to be easy to use and extend for small clinics or educational purposes.

---

### Features

- Add new doctors with unique IDs, names, and specializations.
- Add new patients with unique IDs, names, and ages.
- Book appointments by selecting a doctor and patient and specifying a date.
- List all booked appointments in a readable format.
- Save and load appointment data to and from local storage (serialization).
 
---
### System Workflow

![DoctorAche](https://github.com/user-attachments/assets/678200cf-700e-4374-b4df-3a5e27e7ea16)


---

### Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/AsTeriaa09/DoctorAche.git
   cd DoctorAche
   ```
2. **Compile the Java source code:**
   Make sure you have Java (JDK 8 or higher) installed.
   ```sh
   javac -d bin src/model/*.java src/system/*.java
   ```
3. **Run the application:**
   ```sh
   java -cp bin system.Main
   ```

---

### Usage

When you run the application, you will see a menu with options:

```
DoctorAche - Menu:
1. Add Doctor
2. Add Patient
3. Book Appointment
4. List Appointments
5. Save & Exit
Choose:
```

- **Add Doctor:** Enter doctor ID, name, and specialization.
- **Add Patient:** Enter patient ID, name, and age.
- **Book Appointment:** Provide patient ID, doctor ID, and date (format: dd-mm-yyyy).
- **List Appointments:** See all booked appointments.
- **Save & Exit:** Save all data and exit the program.

---

### Project Structure

```
src/
  model/
    Doctor.java
    Patient.java
    Appointment.java
  system/
    Main.java
    AppointmentSystem.java
data/
  appointments.ser  (created after saving)
```

---

### Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to improve functionality, fix bugs, or suggest new features.

---

## License

This project is licensed under the MIT License.

---
