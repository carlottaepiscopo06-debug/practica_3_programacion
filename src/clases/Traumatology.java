package clases;

public class Traumatology extends Patients {
    protected String injuryZone;

    public Traumatology(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        super(name, age, allergy, UrgencyLevel, PatientCondition);
        this.injuryZone = injuryZone;
    }
    
 }

