/**
 * Appointment class - stores scheduled visit between patient and doctor.
 */
public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;

    /**
     * Creates a new appointment with patient, doctor, date and time.
     */
    public Appointment(int id, int patientId, int doctorId, String date, String time) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    /** Returns appointment ID */
    public int getId() { return id; }

    /** Returns patient ID for this appointment */
    public int getPatientId() { return patientId; }

    /** Returns doctor ID for this appointment */
    public int getDoctorId() { return doctorId; }

    /** Returns appointment date */
    public String getDate() { return date; }

    /** Returns appointment time */
    public String getTime() { return time; }

    /** Prints appointment details to the console */
    public void display() {
        System.out.println("Appointment ID: " + id);
        System.out.println("Patient ID: " + patientId + " | Doctor ID: " + doctorId);
        System.out.println("Date: " + date + " | Time: " + time);
        System.out.println("------------------------");
    }
}
