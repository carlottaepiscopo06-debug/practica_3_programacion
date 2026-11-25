package clases;


public class Cardiology extends Patients {
    protected Double minutesSinceSymptoms;

    public Cardiology(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        super(name, age, allergy, UrgencyLevel, PatientCondition);
        this.minutesSinceSymptoms = minutesSinceSymptoms;
    }

    public Double calculateUrgencyLevel() {
        Double UrgencyLevel = (minutesSinceSymptoms / 5.0)*0.1;
        return UrgencyLevel;
    }

}
