package person;

import person.Person;

public class ManagePerson {
    public static void main(String[] args) throws Exception {
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

        //adding details & feedback for first Trainer
        Trainer englishTrainer = new Trainer("Jack", "Miller", "English", 5);
        englishTrainer.addFeedback("Laura Smith", 9);
        englishTrainer.addFeedback(8);
        englishTrainer.addFeedback(7);
        //print feedback for first trainer
        System.out.println(englishTrainer.getFeedback());

        //adding details & feedback for second Trainer
        Trainer mathTrainer = new Trainer("Anna", "Miller", "Math", 9);
        mathTrainer.addFeedback("Ben Smith", 9);
        mathTrainer.addFeedback(11);
        mathTrainer.addFeedback(8);
        mathTrainer.addFeedback(3);
        //print feedback for second trainer
        System.out.println(mathTrainer.getFeedback());

        //print details for both trainers
        englishTrainer.printPersonDetails();
        mathTrainer.printPersonDetails();

        //see average score feedback for both trainers
        System.out.println(englishTrainer.averageScoreFeedback());
        System.out.println(mathTrainer.averageScoreFeedback());
    }
}
