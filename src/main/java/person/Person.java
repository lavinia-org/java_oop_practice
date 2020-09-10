package person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;

    public Person(String firstName, String lastName, int age, String gender, String emailAddress){
        this.firstName = firstName;
        this.lastName= lastName;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female") || gender.equals("Other")){
            this.gender = gender;
        } else{
            System.out.println("Error! Please enter a valid gender!");
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }





}
