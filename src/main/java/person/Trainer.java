package person;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person{
    private String specialization;
    private int yearsOfExperience;
    private Map<String, Integer> feedback = new HashMap<>();

    public Trainer(String firstName, String lastName, String specialization, int yearsOfExperience) {
        super(firstName, lastName);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }
}
