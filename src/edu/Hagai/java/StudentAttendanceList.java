package edu.Hagai.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 16-Mar-17.
 */
public class StudentAttendanceList
{
    private ArrayList<Student> studentList = null;

    public StudentAttendanceList()
    {
        studentList = new ArrayList<>();
    }

    public void addNewStudent(){
        Student s = new Student();//IO!!!
        studentList.add(s);
    }

    void printAllStudents()
    {
        int studentListSize = studentList.size();
        if(studentListSize == 0)
        {
            System.out.println("Students Attendance List is Empty");
            return;
        }
        else
        {
            for (Student s : studentList) {
                s.printDetails();
            }
        }
    }

    void saveToFile()
    {
        for (Student student : studentList)
        {
            IO.write7("1.txt", student.getFirstName());
            IO.write7("1.txt", "\n");
            IO.write7("1.txt", student.getLastName());
            IO.write7("1.txt", "\n");
            IO.write7("1.txt", student.getSocialID());
            IO.write7("1.txt", "\n");
        }
    }

    void restoreFromFile()
    {
        List<String> readLines = IO.read("1.txt");
        if(readLines != null)
        {
            for (int i = 0; i < readLines.size(); i += 3) {
                String firstName = readLines.get(i);
                String lastName = readLines.get(i + 1);
                String socialID = readLines.get(i + 2);
                studentList.add(new Student(firstName, lastName,  socialID));
            }
        }
    }

}