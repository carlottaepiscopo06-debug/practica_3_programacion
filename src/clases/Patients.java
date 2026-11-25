package clases;
//Represents a general patient arriving at the hospital emergency room.

public class Patients {
    protected String name;
    protected int age;
    protected boolean allergy;
    protected double UrgencyLevel;
    protected String PatientCondition;
//we are declared the class as a public to have access from the other classes, and declaed the attributes as protected to have access from the subclases(son calsses) without being public 
    public Patients(String name, int age, Boolean allergy, Double UrgencyLevel, String PatientCondition) {
        this.name = name;
        this.age = age;
        this.allergy = allergy;
        this.UrgencyLevel = UrgencyLevel;
        this.PatientCondition = PatientCondition;
        //we declred the constructor to initialize the attributes of  a new object, this identify the current object
    }

        public String getName() {
        return name;
    }// it is a getter to have acces to the name and return the value 

    public void setName(String name) {
        this.name = name;
    }// it is a setter to set or modify the value of the name 

    public int getAge() {
        return age;
    }// it is a getter of the age to get the vaue 

    public void setAge(int age) {
        this.age = age;
    }// it is a setter of the age to set or modify it 

    public Boolean getAllergy() {
        return allergy;
    }// it is a boolean to get true or false if the patience have or not allergy 

    public void setAllergy(Boolean allergy) {
        this.allergy = allergy;
    }// it is a setter for the allergy 

    public String getPatientCondition() {
        return PatientCondition;
    }//it give us a string with the condition of the patience 
    
    public Double calculateUrgencyLevel() {
        UrgencyLevel = age / 20.0;
        return UrgencyLevel;
    }//it calculate the urgency level with the age parameter , it can be modified inside the subclasses

}
