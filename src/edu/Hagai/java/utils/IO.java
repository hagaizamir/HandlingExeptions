package edu.Hagai.java.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Alex on 15-Mar-17.
 */
public class IO
{
    static Scanner scan = new Scanner(System.in);

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

//__________________________________________________________________________________
    public static String getNextString()
    {
        return scan.next();
    }

    public static int getInteger(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        while (true)
        {
            try
            {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Integer.valueOf(input);
            }
            catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be an integer number");
            }
            catch (NumberFormatException e)//from Integer.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be an integer number");
            }
            catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }
        }
    }

    public static int getInteger(String prompt, int from, int to){
        int result;
        do
        {
            result = getInteger(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static int getInteger(String prompt, int from)
    {
        return getInteger(prompt, from, Integer.MAX_VALUE);
    }

    public static double getDouble(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": ")) {
            prompt += ": ";
        }

        while (true)
        {
            try
            {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Double.valueOf(input);
            }
            catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be a double number");
            }
            catch (NumberFormatException e)//from Double.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be a double number");
            }
            catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }
        }
    }

    public static double getDouble(String prompt, double from, double to)
    {
        double result;
        do
        {
            result = getDouble(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static Double getDouble(String prompt, double from)
    {
        return getDouble(prompt, from, Double.MAX_VALUE);
    }

    public static float getFloat(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": ")) {
            prompt += ": ";
        }

        while (true)
        {
            try {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Float.valueOf(input);
            }
            catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be a float number");
            }
            catch (NumberFormatException e)//from Float.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be a float number");
            }
            catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }
        }
    }

    public static float getFloat(String prompt, float from, float to){
        float result;
        do {
            result = getFloat(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static Float getFloat(String prompt, float from)
    {
        return getFloat(prompt, from, Float.MAX_VALUE);
    }

    public static int getIntegerRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.print(prompt);
        try {
            int result = scanner.nextInt();
            return result;
        }
        catch (InputMismatchException e){
            System.out.println("Bad input, Please try again. Must be an integer number");
            return getIntegerRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be an integer number");
            return getIntegerRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
    }

    public static int getIntegerRecursive(String prompt, int from, int to){
        int result;
        do
        {
            result = getIntegerRecursive(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static int getIntegerRecursive(String prompt, int from)
    {
        return getIntegerRecursive(prompt, from, Integer.MAX_VALUE);
    }

    public static double getDoubleRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.print(prompt);
        try
        {
            double result = scanner.nextDouble();
            return result;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Bad input, Please try again. Must be a double number");
            return getDoubleRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be a double number");
            return getDoubleRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
        catch (Exception e)
        {
            System.out.println("Bad input, Please try again. Must be a double number");
            return getDoubleRecursive(prompt);
        }
    }

    public static double getDoubleRecursive(String prompt, double from, double to)
    {
        double result;
        do
        {
            result = getDoubleRecursive(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static Double getDoubleRecursive(String prompt, double from)
    {
        return getDoubleRecursive(prompt, from, Double.MAX_VALUE);
    }

    public static float getFloatRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.print(prompt);
        try
        {
            float result = scanner.nextFloat();
            return result;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Bad input, Please try again. Must be a float number");
            return getFloatRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be a float number");
            return getFloatRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
    }

    public static float getFloatRecursive(String prompt, float from, float to){
        float result;
        do {
            result = getFloatRecursive(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static Float getFloatRecursive(String prompt, float from)
    {
        return getFloatRecursive(prompt, from, Float.MAX_VALUE);
    }

//___________________________________________________________________________________________________________________________________________________

    /**
     * This method prints an array of integers
     * @param arr an integer array that we want to print
     */
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }


    public static void printPretty(int[][] arr){
        System.out.printf("%4s", "");

        for (int i = 0; i < arr[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d|", i);
            //print the columns
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s", arr[i]);
        }
        System.out.println();
    }
    public static void print(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }

    public static void printBoard(String[] arr){
        System.out.printf("|");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s|", arr[i]);
        }
        System.out.printf("\n________________\n");
    }
    public static void printBoard(String[][] arr){
        System.out.printf("\n________________\n");
        for (int i = 0; i < arr.length; i++) {
            printBoard(arr[i]);
        }
    }

    public static String getString(String prompt){
        if (!prompt.endsWith(":") && !prompt.endsWith(": ")) {
            prompt += ": ";
        }
        //System.out.println(message);
        System.out.print(prompt);
        return scan.next();
    }

    public static String getSentence(String prompt){
        System.out.println(prompt);
        return scan.nextLine();
    }

    public static int[] getIntArray(String prompt){
        //ask the user for the size:
        int n = getInteger("Enter the array size");
        //init an array of the requested size:
        int[] result = new int[n];
        //loop through the array and fill it:
        for (int i = 0; i < n; i++) {
            result[i] = getInteger(prompt);
        }
        return result;
    }

    public static String[] getStringArray(String message, int size){
        String[] result = new String[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println(message);
            result[i] = scan.next();
        }
        return result;
    }

    public static int[][] getIntArraydbl() {
        int size = IO.getInteger("Enter the array size", 0);
        int[][] arr = new int[size][size];

        for (int row = 0; row< arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                String s = String.format("Enter value for %d, %d", row, col);
                arr[row][col] = IO.getInteger(s);
            }
        }
        return arr;
    }

    //input a date:
    public static LocalDateTime getDate(String prompt){
        int year = IO.getInteger("Enter the year", 1900, 2200);
        int month = IO.getInteger("Enter the month", 1, 12);
        int day = IO.getInteger("Enter the day", 1, 31);
        return LocalDateTime.of(year, month, day, 0, 0);
    }

    public static void printLineSep(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("_");
        }
        System.out.println();
    }

}