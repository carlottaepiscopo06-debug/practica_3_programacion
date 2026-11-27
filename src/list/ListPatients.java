package list;
import clases.Patients;
import exceptions.exception;

public class ListPatients {
    private Patients[] patients;
    private int numPatients;
    private static final int maxPatients = 30;

    public ListPatients() {
        this.patients = new Patients[maxPatients];
        this.numPatients = 0;
    }

    private void addPatient(Patients patient) {
        if (numPatients < maxPatients) {
            patients[numPatients] = patient;
            numPatients++;
        } else {
            throw new exception("Maximum number of patients reached.");
        }
    }

    public void addPointsToUrgencyLevel(Double Points) {
        for (int i = 0; i < numPatients; i++) {
            patients[i].setUrgencyLevel(patients[i].calculateUrgencyLevel() + Points);
        }
    }

    public String getMaxUrgencyLevelPatient() {
        if (numPatients == 0) {
            return "No patients in the list.";
        }

        Patients maxUrgencyPatient = patients[0];
        for (int i = 1; i < numPatients; i++) {
            if (patients[i].calculateUrgencyLevel() > maxUrgencyPatient.calculateUrgencyLevel()) {
                maxUrgencyPatient = patients[i];
            }
        }
        return "Patient with maximum urgency level: " + maxUrgencyPatient.getName() + ", Urgency Level: " + maxUrgencyPatient.calculateUrgencyLevel();
    }

}
