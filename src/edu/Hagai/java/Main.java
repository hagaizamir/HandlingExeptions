package edu.Hagai.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String reddit = "https://www.reddit.com/.json";
        try {
            URL url = new URL(reddit);
            URLConnection con = url.openConnection();
                InputStream in = con.getInputStream();
        } catch (MalformedURLException e) {
            System.out.println("Bad url");
        } catch (IOException e) {
            System.out.println("Please connect to the internet");
        } catch (Exception e) {
            writeToFile();
        }


    }


    public static void writeToFile() {
        try {
            FileWriter writer = new FileWriter("1.txt");
            writer.write("Hello, Java");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            FileWriter writer = new FileWriter("1.txt");
//            writer.write("Hello, Hello");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        int x = getInt("Enter a number");
//        System.out.println(x);
//
//        }
//    public static  int getInt (String prompt) {
//        System.out.println(prompt);
//        Scanner scanner = new Scanner(System.in);
//
//        try{
//            int result = scanner.nextInt();
//            return result;
//
//        }
//        catch (Exception e){
//            System.out.println("Bad Input");
//            return getInt(prompt);
//        }
//
//    }
//    public static  int getInteger (String prompt) {
//
//        Scanner scanner = new Scanner(System.in);
//        while (true)
//
//        try{
//            System.out.println(prompt);
//            int result = scanner.nextInt();
//            return result;
//
//        }
//        catch (Exception e){
//            System.out.println("Bad Input, please try again, must be a number:");
//


//        try {
////
//            Circle c = new Circle(-1);
//
//            }
//
//        catch (Exception e){
//            System.out.println("Bad Radius");
//            System.out.println("Enter radius again");
//
//        }

//
//

    }
}

