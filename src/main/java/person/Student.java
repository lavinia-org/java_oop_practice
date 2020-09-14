package person;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
   private Boolean graduated;
   private static String code;
   private int interviewScore;
   private Map<String, Integer> disciplineMarks = new HashMap<String, Integer>();

    public Student(String firstName, String lastName, Boolean graduated, int interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

}
