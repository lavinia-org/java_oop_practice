package person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private boolean isEmailRestricted;

    public Person(String firstName, String lastName, int age, String gender, String emailAddress){
        this.firstName = firstName;
        this.lastName= lastName;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person(String firstName, String lastName) {
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
        if(!isEmailRestricted){
            return emailAddress;
        } else {
           return "Email information is restricted for this customer";
        }
    }

    public void setEmailAddress(String emailAddress) {
        String emailStructure = "(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:\t[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        if(emailAddress.matches(emailStructure)){
            this.emailAddress = emailAddress;
        } else{
            System.out.println("Error! Please enter a valid email address!");
        }
    }

    public boolean isEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public void printPersonDetails(){
        System.out.println(firstName + ", " + lastName + ", " + age + ", " + gender + ", " + emailAddress);
    }

}
