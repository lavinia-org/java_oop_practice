package person;

import person.Person;

public class ManagePerson {
    public static void main(String[] args){
        Person larisaPerson = new Person("Larisa", "Alexa", 31, "Female", "larisa.alexa@softvision.com");
        System.out.println(larisaPerson.getFirstName() + " " + larisaPerson.getLastName());

        Student maryStudent = new Student("Mary", "Smith", true, 10);
        maryStudent.addDisciplineMark("Math", 9);
        maryStudent.addDisciplineMark("English", 10);
        maryStudent.addDisciplineMark("Computer Science", 8);
        maryStudent.addDisciplineMark("Physics", 7);
        maryStudent.addDisciplineMark("Biology", 10);
        System.out.println(maryStudent.getDisciplineMarks());
    }
}
