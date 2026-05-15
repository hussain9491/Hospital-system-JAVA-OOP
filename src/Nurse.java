/**
 * Nurse class - inherits from Staff.
 * Demonstrates INHERITANCE and POLYMORPHISM.
 */
public class Nurse extends Staff {
    private String shift;

    /**
     * Creates a new nurse with id, name, department and shift.
     */
    public Nurse(int id, String name, String department, String shift) {
        super(id, name, department);
        this.shift = shift;
    }

    /** Returns nurse's shift (Morning/Night) */
    public String getShift() { return shift; }

    /** Sets nurse's shift */
    public void setShift(String shift) { this.shift = shift; }

    /**
     * Nurse's version of handling treatment (polymorphism).
     */
    @Override
    public void handleTreatment(String patientName) {
        System.out.println("Nurse " + getName() + " (" + shift + " shift) is assisting with patient: " + patientName);
    }
}
