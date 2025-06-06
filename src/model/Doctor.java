package model;
import java.io.Serializable;

public class Doctor implements Serializable {
    private String id;
    private String name;
    private String specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    public String toString() {
        return "Dr. " + name + " (" + specialization + ")";
    }
}
