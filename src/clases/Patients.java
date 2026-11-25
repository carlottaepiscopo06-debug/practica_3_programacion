package clases;

public class Patients {
    protected String name;
    protected int age;
    protected boolean allergy;
    protected double UrgencyLevel;
    protected String PatientCondition;

    public Patients(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        this.name = name;
        this.age = age;
        this.allergy = allergy;
        this.UrgencyLevel = UrgencyLevel;
        this.PatientCondition = PatientCondition;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getAllergy() {
        return allergy;
    }

    public void setAllergy(Boolean allergy) {
        this.allergy = allergy;
    }

    public String getPatientCondition() {
        return PatientCondition;
    }
    
    public Double calculateUrgencyLevel() {
        UrgencyLevel = age / 20.0;
        return UrgencyLevel;
    }

}
