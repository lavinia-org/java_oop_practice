package person;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Trainer extends Person{
    private String specialization;
    private int yearsOfExperience;
    private MultiValuedMap<String, Integer> feedback = new ArrayListValuedHashMap<>();

    public Trainer(String firstName, String lastName, String specialization, int yearsOfExperience) {
        super(firstName, lastName);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.feedback = feedback;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public MultiValuedMap<String, Integer> getFeedback() {
        return feedback;
    }

    /**
     * Adds values to feedback map for desired Trainer
     * @param studentName
     * @param mark
     */
    public void addFeedback(String studentName, Integer mark){
        if(mark>=0 && mark <=10){
            feedback.put(studentName, mark);
        } else {
            System.out.println("Please provide a mark from 0 to 10");
        }
    }

    /**
     * Overloading method// Adds values to feedback map for desired Trainer
     * @param mark
     */
    public void addFeedback(Integer mark){
        if(mark>=0 && mark <=10){
            feedback.put("Anonymous student", mark);
        } else {
            System.out.println("Please provide a value from 0 to 10");
        }
    }

    /**
     * Overriding print method from Person class to print Trainer details
     */
    @Override
    public void printPersonDetails() {
        System.out.println(super.getFirstName() + ", " + super.getLastName() + ", " + specialization + ", " + yearsOfExperience);
    }
}
