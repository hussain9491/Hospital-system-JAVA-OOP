/**
 * Abstract base class for all hospital staff (Doctor, Nurse).
 * Demonstrates ABSTRACTION and ENCAPSULATION.
 */
public abstract class Staff {
    // Private fields - encapsulation
    private int id;
    private String name;
    private String department;

    /**
     * Constructor to create a staff member with basic details.
     */
    public Staff(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    /** Returns staff ID */
    public int getId() { return id; }

    /** Returns staff name */
    public String getName() { return name; }

    /** Returns department name */
    public String getDepartment() { return department; }

    /** Updates staff name */
    public void setName(String name) { this.name = name; }

    /** Updates department */
    public void setDepartment(String department) { this.department = department; }

    /**
     * Abstract method - each subclass (Doctor, Nurse) implements it differently.
     * Demonstrates POLYMORPHISM.
     */
    public abstract void handleTreatment(String patientName);
}
