package person;

import person.Person;

public class ManagePerson {
    public static void main(String[] args) {
        Person larisaPerson = new Person("Larisa", "Alexa", 31, "Female", "larisa.alexa@softvision.com");
        System.out.println(larisaPerson.getFirstName() + " " + larisaPerson.getLastName());

        Student maryStudent = new Student("Mary", "Smith", true, 10, "&codeFromMaryStudent ");
        maryStudent.addDisciplineMark("Math", 9);
        maryStudent.addDisciplineMark("English", 10);
        maryStudent.addDisciplineMark("Computer Science", 8);
        maryStudent.addDisciplineMark("Physics", 7);
        maryStudent.addDisciplineMark("Biology", 10);
        System.out.println(maryStudent.getDisciplineMarks());

        System.out.println(maryStudent.calculateAverageDisciplinesScore());

        Student johnStudent = new Student("John", "Smith", true, 9, "&codeFromJohnStudent ");
        Student benStudent = new Student("Ben", "Smith", false, 4, "&codeFromBenStudent ");
        Student lauraStudent = new Student("Laura", "Smith", true, 8, "&codeFromLauraStudent ");
        System.out.println("Repository contains code from: " + Student.getCode());
    }
}
