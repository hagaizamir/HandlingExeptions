package edu.Hagai.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tomer on 14/03/2017.
 */
public class IO {
    public  static  boolean write7 (String path , String data){
        try(FileWriter writer = new FileWriter(path,true)){
            writer.write(data);//security problem -> IO fails
            return  true;

        }
        catch (IOException e){
            e.printStackTrace();
        }
        return  false;
    }


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