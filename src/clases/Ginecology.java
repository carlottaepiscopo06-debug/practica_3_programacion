package clases;

public class Ginecology extends Patients {
    protected boolean firstChild;
    protected boolean diabetes;

    public Ginecology(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        super(name, age, allergy, UrgencyLevel, PatientCondition);
        this.firstChild = firstChild;
        this.diabetes = diabetes;
    }

    public Double calculateUrgencyLevel() {
        Double UrgencyLevel = age/20.0;
        
        if (firstChild) {
            UrgencyLevel += 0.3;
        }
        if (diabetes) {
            UrgencyLevel += 0.1;
        }
        return UrgencyLevel;
    }
}
