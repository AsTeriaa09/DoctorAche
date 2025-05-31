package model;
import java.io.Serializable;

public class Patient implements Serializable {
    private String id;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return name + ", Age: " + age;
    }
}
