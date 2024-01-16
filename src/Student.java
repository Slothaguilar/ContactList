public class Student extends Person{
    private int grade;

    //○ Constructor that takes in firstName, lastName, phoneNumber, and grade in that
    //order
    public Student(String first, String last, String phone, int grade){
        super(first, last, phone);
        this.grade = grade;
    }
    //○ Getter (Accessor) functions for each attribute

    public int getGrade() {
        return grade;
    }

    //○ toString method formatted as follows:
    //FirstName LastName - #PhoneNumber Grade: grade
    //You MUST use Person’s toString() method here.
    public String toString(){
        return super.toString() + " Grade:" + grade;
    }
}
