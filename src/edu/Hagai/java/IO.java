package edu.Hagai.java;

import java.util.Scanner;

/**
 * Created by Tomer on 14/03/2017.
 */
public class IO {
    public static int getInteger(String prompt){
        Scanner scanner = new Scanner(System.in);

        while (true)
            try {
                System.out.println(prompt);
                String input = scanner.nextLine();


                int i = Integer.parseInt("123");
                Integer integer = Integer.valueOf("33");


                return Integer.valueOf(input);
            }
            catch (Exception e){
                System.out.println("Bad input, Please try again. Must be a number:");
            }
    }
}