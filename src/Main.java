import java.util.Scanner;

/**
 * Main class - entry point of the program.
 * Shows a menu to manage hospital operations.
 */
public class Main {

    /**
     * Main method - runs the console menu.
     */
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City General Hospital");
        Scanner sc = new Scanner(System.in);

        // Pre-load sample doctors and nurses for testing
        hospital.addDoctor(new Doctor(1, "Dr. Ali", "Cardiology", "Heart Specialist"));
        hospital.addDoctor(new Doctor(2, "Dr. Sara", "General", "Physician"));
        hospital.addNurse(new Nurse(1, "Nurse Ayesha", "Ward A", "Morning"));
        hospital.addNurse(new Nurse(2, "Nurse Bilal", "Ward B", "Night"));

        int choice;
        do {
            // Display menu options
            System.out.println("\n=== Hospital Patient & Staff Management ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient");
            System.out.println("3. Assign Doctor to Patient");
            System.out.println("4. Start Treatment");
            System.out.println("5. Update Treatment Status");
            System.out.println("6. Complete Treatment");
            System.out.println("7. Schedule Appointment");
            System.out.println("8. Nurse Assist (Polymorphism Demo)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Add new patient
                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Condition: ");
                    String cond = sc.nextLine();
                    hospital.addPatient(new Patient(pid, pname, age, cond));
                    break;

                case 2:
                    // View patient by ID
                    System.out.print("Enter Patient ID: ");
                    hospital.viewPatient(sc.nextInt());
                    break;

                case 3:
                    // Assign doctor to patient
                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();
                    System.out.print("Patient ID: ");
                    int patId = sc.nextInt();
                    hospital.assignDoctorToPatient(did, patId);
                    break;

                case 4:
                    // Create and start treatment
                    System.out.print("Treatment ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Patient ID: ");
                    int tpId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    hospital.addTreatment(new Treatment(tid, tpId, desc));
                    hospital.startTreatment(tid);
                    break;

                case 5:
                    // Update treatment status
                    System.out.print("Treatment ID: ");
                    int utid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New status: ");
                    hospital.updateTreatmentStatus(utid, sc.nextLine());
                    break;

                case 6:
                    // Complete treatment
                    System.out.print("Treatment ID: ");
                    hospital.completeTreatment(sc.nextInt());
                    break;

                case 7:
                    // Schedule appointment
                    System.out.print("Appointment ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Patient ID: ");
                    int apPat = sc.nextInt();
                    System.out.print("Doctor ID: ");
                    int apDoc = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Date (e.g. 2026-05-20): ");
                    String date = sc.nextLine();
                    System.out.print("Time (e.g. 10:30): ");
                    String time = sc.nextLine();
                    hospital.scheduleAppointment(new Appointment(aid, apPat, apDoc, date, time));
                    break;

                case 8:
                    // Polymorphism demo with nurse
                    System.out.print("Patient name for nurse assist: ");
                    hospital.nurseAssist(0, sc.nextLine());
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
