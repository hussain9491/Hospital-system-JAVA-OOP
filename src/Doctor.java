/**
 * Doctor class - inherits from Staff.
 * Demonstrates INHERITANCE and POLYMORPHISM.
 */
public class Doctor extends Staff {
    private String specialization;

    /**
     * Creates a new doctor with id, name, department and specialization.
     */
    public Doctor(int id, String name, String department, String specialization) {
        super(id, name, department);
        this.specialization = specialization;
    }

    /** Returns doctor's specialization */
    public String getSpecialization() { return specialization; }

    /** Sets doctor's specialization */
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    /**
     * Doctor's version of handling treatment (polymorphism).
     */
    @Override
    public void handleTreatment(String patientName) {
        System.out.println("Doctor " + getName() + " (" + specialization + ") is treating patient: " + patientName);
    }
}
