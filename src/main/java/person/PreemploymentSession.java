package person;

import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {
    private int year;
    private String community;
    private String type;
    private List<Student> students = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();

    public PreemploymentSession(int year, String community, String type) throws Exception {
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

    public void setType(String type) throws Exception {
        if (type.equals("Auto") || type.equals("Manual")){
            this.type = type;
        } else throw new Exception("Please enter a valid type!");
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
     * Print the students list
     */
    public  void printStudentList(){
        System.out.println("This is a students list:");
        for (Student student1 : students){
            System.out.println(student1.getFirstName() + " " + student1.getLastName());
        }
    }

    /**
     * add trainer to trainers list
     * @param trainer
     */
    public void addTrainerToList(Trainer trainer){
        trainers.add(trainer);
    }

    /**
     * Print the trainers list
     */
    public void printTrainerList(){
        System.out.println("This is a trainers list:");
        for (Trainer trainer1: trainers) {
            System.out.println(trainer1.getFirstName() + " " + trainer1.getLastName());
        }
    }
}
