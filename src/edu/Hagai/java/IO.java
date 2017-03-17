package edu.Hagai.java;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tomer on 14/03/2017.
 */
public class IO {

    public static boolean write(String path, String data){
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(data);//Security problem -> IO Fails.
            return true;
        }
        catch (IOException e){
            e.printStackTrace();
            //show animation for unknown error.
        }
        finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return false;
    }

    public static List<String> read(String path){
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean write7(String path, String data){
        try (FileWriter writer = new FileWriter(path, true)){
            writer.write(data);//Security problem -> IO Fails.
            return true;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    public static int getInteger(String prompt){
        Scanner scanner = new Scanner(System.in);

        while (true)
            try {
                System.out.println(prompt);
                String input = scanner.nextLine();
                return Integer.valueOf(input);
            }
            catch (NumberFormatException e){
                System.out.println("Bad input, Please try again. Must be a number:");
            }

    }

    public static int getIntRecursive(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        try {
            int result = scanner.nextInt();
            return result;
        }
        catch (Exception e){
            System.out.println("Bad input:");
            return getIntRecursive(prompt);
        }
    }
}