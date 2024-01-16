import java.util.ArrayList;

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
    //○ sort(int sortBy)
    //Write a function to sort our array contacts by our Person’s firstName
    //(sortBy = 0), lastName (sortBy = 1), or phoneNumber (sortBy = 2).
    //Take advantage of the Bubble sort method you have written previously. You will
    //need to modify your sorting algorithm as it currently works to sort integers and
    //we will be sorting Person objects
}
