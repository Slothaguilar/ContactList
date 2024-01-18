import java.util.ArrayList;
import java.util.Scanner;



public class ContactList {
    // Attributes
    //○ An ArrayList named contacts that can hold both Student objects and objects
    //of your new class
    private ArrayList<Person> contacts;

    //○ Constructor

    public ContactList() {
    }

    //○ getContacts()
    public ArrayList<Person> getContacts() {
        return contacts;
    }
    //Modify the return type of this method so that it properly returns your contacts
    //instance variable.
    //○ addContact()
    //Write a function to add a contact to your list. The user should be able to add either
    //a Student object or an object of your new class to the list
    public void addContact(Person other){
        contacts.add(other);
    }
    // printContacts()
    //Write a function that loops through and prints out all of the contacts in the list.
    public void printContacts(){
        for (int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    public void sortBy(ArrayList<Person> contacts, int sortBy){
        //Write a function to sort our array contacts by our Person’s firstName
        int n = contacts.size();
        for(int pass = 0; pass < n-1; pass++) {
            for (int comp = 0; comp < n - 1 - pass; comp++) {
                String s1 = "";
                String s2 = "";
                if (sortBy == 0) {
                    s1 = contacts.get(comp).getFirstName();
                    s2 = contacts.get(comp + 1).getFirstName();
                } else if (sortBy == 1) {
                    s1 = contacts.get(comp).getLastName();
                    s2 = contacts.get(comp + 1).getLastName();
                } else if (sortBy == 2) {
                    s1 = contacts.get(comp).getPhoneNumber();
                    s2 = contacts.get(comp + 1).getPhoneNumber();
                }
                if (s1.compareTo(s2) > 0) {
                        Person temp = contacts.get(comp);
                        contacts.set(comp, contacts.get(comp + 1));
                        contacts.set(comp + 1, temp);
                }
            }
        }
    }

    public Person searchByFirstName(String firstName){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getFirstName().compareTo(firstName) == 0){
                return contacts.get(i);
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getLastName().compareTo(lastName) == 0){
                return contacts.get(i);
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getPhoneNumber().compareTo(phoneNumber) == 0){
                return contacts.get(i);
            }
        }
        return null;
    }

    // listStudents()
    //Write a function that lists all the Students in the array contacts. Remember
    //there is a keyword instanceof that checks if an object is an instance of a class.
    public void listStudents(){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i) instanceof Student){
                // printing
                System.out.println(contacts.get(i).toString());
            }
        }
    }
    // run()
    //Write a function that prints the menu options and asks the user what they would
    //like to do. The function should continuously ask for input until the user exits by
    //typing in option 0.

    public void run() {
        // abtraction CUT CODE
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. List All Contacts By First Name");
            System.out.println("3. List All Contacts By Last Name");
            System.out.println("4. List All Contacts By Phone Number");
            System.out.println("5. List All Students");
            System.out.println("6. Search By First Name");
            System.out.println("7. Search By Last Name");
            System.out.println("8. Search By Phone Name");
            System.out.println("0. Exit");
            // ask user input until user types 0.
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput == 1){
                // add contacts
                System.out.println("Select a type of contact to add" + "\n" +
                        "1. Student" + "\n"
                        + "2. Athlete");
                int typePerson = scanner.nextInt();
                // ask for first name
                scanner.nextLine();
                System.out.println("Please Enter the following information:");
                System.out.println("First Name:");
                String nameFirst = scanner.nextLine();
                // ask for last
                System.out.println("Last Name:");
                String nameLast = scanner.nextLine();
                // phone number
                System.out.println("Phone Number:");
                String numberPhone = scanner.nextLine();
                if (typePerson == 1){
                     // ask for grade
                    System.out.println("Grade: ");
                    int grade = scanner.nextInt();
                    Student student = new Student(nameFirst, nameLast, numberPhone, grade);
                    addContact(student);
                }
                else if (typePerson == 2){
                    // ask for club team
                    System.out.println("Club team:");
                    String nameTeam = scanner.nextLine();
                    Athlete athlete = new Athlete(nameFirst, nameLast, numberPhone, nameTeam);
                    addContact(athlete);
                }

            }
            else if (userInput == 2){
                // list the contacts by first name
                for (int i = 0; i <contacts.size(); i++){
                    System.out.println(contacts.get(i).getFirstName());
                }
            }
            else if (userInput == 3){
                // list the contacts by last name
                for (int i = 0; i <contacts.size(); i++){
                    System.out.println(contacts.get(i).getLastName());
                }
            }
            else if (userInput == 4){
                // list the contacts by phone name
                for (int i = 0; i <contacts.size(); i++){
                    System.out.println(contacts.get(i).getPhoneNumber());
                }
            }
            else if (userInput == 5){
                // list the contacts by first name
                listStudents();
            }
            else if (userInput == 6) {
                System.out.println("Enter a name");
                String firstName = scanner.nextLine();

                // if null then say somethinbg else
                if (searchByFirstName(firstName) == null) {
                    System.out.println(firstName + " is not in the list");
                } else {
                    System.out.println(searchByFirstName(firstName));
                }
            } else if (userInput == 7) {
                System.out.println("Enter a last name:");
                String lastName = scanner.nextLine();
                // if null then say somethinbg else
                if (searchByFirstName(lastName) == null) {
                    System.out.println(lastName + " is not in the list");
                } else {
                    System.out.println(searchByFirstName(lastName));
                }
            } else if (userInput == 8) {
                System.out.println("Enter a phone number:");
                String phoneNumber = scanner.nextLine();

                // if null then say somethinbg else
                if (searchByFirstName(phoneNumber) == null) {
                    System.out.println(phoneNumber + " is not in the list");
                } else {
                    System.out.println(searchByFirstName(phoneNumber));
                }
            }
            else if (userInput == 0){
                break;
            }

        }
    }
}
