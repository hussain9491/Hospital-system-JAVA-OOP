/**
 * Treatment class - manages treatment for a patient.
 * Status can be: Pending, In Progress, Completed.
 */
public class Treatment {
    private int id;
    private int patientId;
    private String description;
    private String status;

    /**
     * Creates a new treatment linked to a patient.
     * Initial status is "Pending".
     */
    public Treatment(int id, int patientId, String description) {
        this.id = id;
        this.patientId = patientId;
        this.description = description;
        this.status = "Pending";
    }

    /** Returns treatment ID */
    public int getId() { return id; }

    /** Returns patient ID linked to this treatment */
    public int getPatientId() { return patientId; }

    /** Returns treatment description */
    public String getDescription() { return description; }

    /** Returns current treatment status */
    public String getStatus() { return status; }

    /** Starts the treatment - changes status to In Progress */
    public void start() {
        status = "In Progress";
        System.out.println("Treatment " + id + " started.");
    }

    /** Updates treatment status to a new value */
    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Treatment " + id + " status updated to: " + status);
    }

    /** Marks treatment as completed */
    public void complete() {
        status = "Completed";
        System.out.println("Treatment " + id + " completed.");
    }

    /** Prints treatment details to the console */
    public void display() {
        System.out.println("Treatment ID: " + id + " | Patient ID: " + patientId);
        System.out.println("Description: " + description + " | Status: " + status);
    }
}
