public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor that takes in firstName, lastName, and phoneNumber in that order
    public Person (String first, String last, String phone){
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = phone;
    }
    //○ Getter (Accessor) functions for each attribute

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //○ toString method formatted as follows:
    public String toString(){
        return firstName + lastName + "- #" + phoneNumber;
    }
}
