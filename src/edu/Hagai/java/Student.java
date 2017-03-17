package edu.Hagai.java;
import edu.Hagai.java.utils.IO;


public class Student {
    //properties:
    private String firstName;
    private String lastName;
    private String socialID;

    public Student() {
        System.out.println("Let's create a new Student: ");
        this.firstName = IO.getString("Enter Name: ");
        this.lastName = IO.getString("Enter Last Name: ");
        this.socialID = IO.getString("Enter Social ID: ");
    }

    public Student(String firstName, String lastName, String socialID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
    }


    public void printDetails()
    {
        System.out.println();
        System.out.println(toString());
    }

    public String toString() {
        return
                "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Social ID: " + socialID;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialID() {
        return socialID;
    }








}