package clases;

public class Others extends Patients {
    protected String Symptoms;

    public Others(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        super(name, age, allergy, UrgencyLevel, PatientCondition);
        this.Symptoms = Symptoms;
    }

    public String toString() {
        return "symptoms: " + Symptoms;
    }
    
}
