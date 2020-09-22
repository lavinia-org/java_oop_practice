package person;

import java.util.*;

public class Student extends Person {
   private Boolean graduated;
   private static String code = " ";
   private int interviewScore;
   private Map<String, Integer> disciplineMarks = new HashMap<String, Integer>();
   private  static List<String> studentCatalog = new ArrayList<>();

    public Student(String firstName, String lastName, Boolean graduated, int interviewScore, String code) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        Student.code += code;
        studentCatalog.add(this.getLastName() + " " + getFirstName());
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        Student.code = code;
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

    public static List<String> getStudentCatalog() {
        return studentCatalog;
    }

    public static void setStudentCatalog(List<String> studentCatalog) {
        studentCatalog = studentCatalog;
    }

    public void setDisciplineMarks(Map<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String discipline, int mark){
        disciplineMarks.put(discipline, mark);
    }

    public Double calculateAverageDisciplinesScore(){
        double sum = 0.0;
        double size = disciplineMarks.size();

        for (int value : disciplineMarks.values()){
            sum += value;
        }
        double averageScore = sum / size;
        return averageScore;
    }

    /**
     * Sort and print student catalog list
     */
    public static void printStudentCatalog(){
        Collections.sort(studentCatalog);
        for (String name : studentCatalog){
            System.out.println(name);
        }
    }
}
