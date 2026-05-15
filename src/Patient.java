/**
 * Patient class - stores patient information.
 * Demonstrates ENCAPSULATION with private fields and getters/setters.
 */
public class Patient {
    private int id;
    private String name;
    private int age;
    private String condition;
    private int assignedDoctorId; // -1 means no doctor assigned yet

    /**
     * Creates a new patient with id, name, age and medical condition.
     */
    public Patient(int id, String name, int age, String condition) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.assignedDoctorId = -1;
    }

    /** Returns patient ID */
    public int getId() { return id; }

    /** Returns patient name */
    public String getName() { return name; }

    /** Returns patient age */
    public int getAge() { return age; }

    /** Returns medical condition */
    public String getCondition() { return condition; }

    /** Returns assigned doctor ID (-1 if none) */
    public int getAssignedDoctorId() { return assignedDoctorId; }

    /** Updates patient name */
    public void setName(String name) { this.name = name; }

    /** Updates patient age */
    public void setAge(int age) { this.age = age; }

    /** Updates medical condition */
    public void setCondition(String condition) { this.condition = condition; }

    /** Assigns a doctor to this patient by doctor ID */
    public void setAssignedDoctorId(int assignedDoctorId) { this.assignedDoctorId = assignedDoctorId; }

    /** Prints all patient details to the console */
    public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Condition: " + condition);
        System.out.println("Assigned Doctor ID: " + (assignedDoctorId == -1 ? "None" : assignedDoctorId));
    }
}
