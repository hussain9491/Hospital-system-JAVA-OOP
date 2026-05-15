import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hospital class - central manager for patients, staff, treatments and appointments.
 * Uses ArrayList and HashMap collections.
 */
public class Hospital {
    private String name;

    // ArrayList - stores all records in lists
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Treatment> treatments;
    private ArrayList<Appointment> appointments;

    // HashMap - fast lookup by ID
    private HashMap<Integer, Patient> patientMap;
    private HashMap<Integer, Doctor> doctorMap;
    private HashMap<Integer, Treatment> treatmentMap;

    /**
     * Creates a hospital and initializes empty collections.
     */
    public Hospital(String name) {
        this.name = name;
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
        treatments = new ArrayList<>();
        appointments = new ArrayList<>();
        patientMap = new HashMap<>();
        doctorMap = new HashMap<>();
        treatmentMap = new HashMap<>();
    }

    /**
     * Adds a new patient to the hospital.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        patientMap.put(patient.getId(), patient);
        System.out.println("Patient added: " + patient.getName());
    }

    /**
     * Shows patient information by patient ID.
     */
    public void viewPatient(int patientId) {
        Patient p = patientMap.get(patientId);
        if (p == null) {
            System.out.println("Patient not found.");
        } else {
            p.displayInfo();
        }
    }

    /**
     * Registers a doctor in the hospital.
     */
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        doctorMap.put(doctor.getId(), doctor);
    }

    /**
     * Registers a nurse in the hospital.
     */
    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    /**
     * Assigns a doctor to a patient and calls handleTreatment (polymorphism).
     */
    public void assignDoctorToPatient(int doctorId, int patientId) {
        Doctor doc = doctorMap.get(doctorId);
        Patient pat = patientMap.get(patientId);
        if (doc == null || pat == null) {
            System.out.println("Invalid doctor or patient ID.");
            return;
        }
        pat.setAssignedDoctorId(doctorId);
        System.out.println("Doctor " + doc.getName() + " assigned to patient " + pat.getName());
        doc.handleTreatment(pat.getName());
    }

    /**
     * Adds a treatment record to the hospital.
     */
    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
        treatmentMap.put(treatment.getId(), treatment);
    }

    /**
     * Starts a treatment by treatment ID.
     */
    public void startTreatment(int treatmentId) {
        Treatment t = treatmentMap.get(treatmentId);
        if (t != null) t.start();
        else System.out.println("Treatment not found.");
    }

    /**
     * Updates treatment status by treatment ID.
     */
    public void updateTreatmentStatus(int treatmentId, String status) {
        Treatment t = treatmentMap.get(treatmentId);
        if (t != null) t.updateStatus(status);
        else System.out.println("Treatment not found.");
    }

    /**
     * Marks a treatment as completed by treatment ID.
     */
    public void completeTreatment(int treatmentId) {
        Treatment t = treatmentMap.get(treatmentId);
        if (t != null) t.complete();
        else System.out.println("Treatment not found.");
    }

    /**
     * Schedules a new appointment and displays it.
     */
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled (ID: " + appointment.getId() + ")");
        appointment.display();
    }

    /**
     * Demo method - nurse assists with treatment (polymorphism).
     */
    public void nurseAssist(int nurseIndex, String patientName) {
        if (nurseIndex >= 0 && nurseIndex < nurses.size()) {
            nurses.get(nurseIndex).handleTreatment(patientName);
        }
    }
}
