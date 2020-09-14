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

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public int getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(int interviewScore) {
        this.interviewScore = interviewScore;
    }

    public Map<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(Map<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String discipline, int mark){
        disciplineMarks.put(discipline, mark);
    }
}
