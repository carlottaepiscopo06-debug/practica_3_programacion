package clases;
// it rappresent a patience of the gynecology departement,the class is a subclass of patience class
// it add parameters about gestatinal diabetes and pregnacy, it modify the urgency level 


public class Ginecology extends Patients {
    protected boolean firstChild;
    protected boolean diabetes;
// we did the declariotin of that sub class , and two boolean about those 2 protected attributes specific of that suclass
    public Ginecology(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        super(name, age, allergy, UrgencyLevel, PatientCondition);
        this.firstChild = firstChild;
        this.diabetes = diabetes;
    }// costructor for the patience of that subcalss

    public Double calculateUrgencyLevel() {
        Double UrgencyLevel = age/20.0;
        
        if (firstChild) {
            UrgencyLevel += 0.3;
        }
        if (diabetes) {
            UrgencyLevel += 0.1;
        }
        return UrgencyLevel;
    }// it modify the urgency level (calculated previusly by the mother class just from the age parameter)
    //the urgency lever icreas by 0.3 if it is the first chiuld ; 0.1 if the patience id positive to gestational diabetes, than return the value modiefied only if those conditions are true
}
