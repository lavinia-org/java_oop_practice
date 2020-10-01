package person;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {
    private int year;
    private String community;
    private String type;
    private List<Student> students = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();

    public PreemploymentSession(int year, String community, String type){
        this.year = year;
        this.community = community;
        this.setType(type);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws IllegalArgumentException {
        if (type.equals("Auto") || type.equals("Manual")){
            this.type = type;
        } else throw new IllegalArgumentException ("Please enter a valid type!");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    /**
     * add student to students list
     * @param student
     */
    public void addStudentToList(Student student){
        students.add(student);
    }

    /**
     *
     * @return
     */
    public List<String> returnStudentList(){
       List<String> studentName = new ArrayList<>();
        for (Student student1 : students){
            studentName.add(student1.getFirstName() + " " + student1.getLastName());
        }
         return studentName;
    }

    /**
     * add trainer to trainers list
     * @param trainer
     */
    public void addTrainerToList(Trainer trainer){
        trainers.add(trainer);
    }

    /**
     *
     * @return
     */
    public List<String> returnTrainerList(){
        List<String> trainerName = new ArrayList<>();
        for (Trainer trainer1: trainers) {
            trainerName.add(trainer1.getFirstName() + " " + trainer1.getLastName());
        }
        return trainerName;
    }

    /**
     * Check the highest average score for a student
     * @return
     */
    public double highestAverageScore(){
        double maxScore= 0.0;
        for (int i = 0; i < students.size(); i++){
            double averageScore = students.get(i).calculateAverageDisciplinesScore();
            if(maxScore < averageScore){
                maxScore = averageScore;
            }
        }
        return maxScore;
    }

    /**
     * Check the highest average feedback score for a trainer
     * @return
     */
    public double highestFeedbackScore(){
        double maxScore = 0.0;
        for (int i = 0; i < trainers.size(); i++){
            double averageScore = trainers.get(i).averageScoreFeedback();
            if(maxScore < averageScore){
                maxScore = averageScore;
            }
        }
        return maxScore;
    }

    /**
     * Print all preemployment details
     */
    public void printPreemploymentDetails(){
        System.out.println("This is the Pre-employment session: " + community + " " + type + " " + year + "\n" +
                "These are the students who participated: " + returnStudentList() + "\n" +
                "Highest average score of a student was: " + highestAverageScore() + "\n" +
                "These were the trainers: " + returnTrainerList() + "\n" +
                "Highest feedback score of a trainer was: " + highestFeedbackScore());
    }
}
