package edu.Hagai.java;

import edu.Hagai.java.utils.IO;

public class Main {

    public static void main(String[] args) {
        // write your code here


        StudentAttendanceList studentAttendanceList = new StudentAttendanceList();
        studentAttendanceList.restoreFromFile();

        boolean isExit = false;
        do {
            System.out.println();
            System.out.println("Press '1' - to add student");
            System.out.println("Press '2' - to print details of all students");
            System.out.println("Press '3' - to exit");

            int option = IO.getIntegerRecursive("Enter your option: ", 1, 3);
            switch (option) {
                case 1:
                    System.out.println();
                    studentAttendanceList.addNewStudent();
                    break;
                case 2:
                    studentAttendanceList.printAllStudents();
                    break;
                case 3:
                    studentAttendanceList.saveToFile();
                    isExit = true;
                    break;
                default:
                    throw new RuntimeException("Impossible main menu option");
            }
        } while (!isExit);
    }
}












//        List<String> read = IO.read("1.txt");
//        System.out.println(read);
//
//        String reddit = "https://www.reddit.com/.json";
//        try {
//            URL url = new URL(reddit);
//            URLConnection con = url.openConnection();
//            InputStream in = con.getInputStream();
//        } catch (MalformedURLException e) {
//            System.out.println("Bad url");
//        }catch (IOException e){
//            System.out.println("Please connect to the internet");
//        }catch (Exception e){
//            writeToFile();
//        }
//
//
//    }
//
//
//    public static void writeToFile(){
//        try {
//            FileWriter writer = new FileWriter("1.txt");
//            writer.write("Hello, Java");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//        FileWriter writer = null;
//        try{
//            writer = new FileWriter("1.txt",true);
//            writer.write("Hello , Java");//security problem -> IO fails
//            writer.flush();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//            //show animation for unknown error
//        }
//        finally {
//            if (writer!=null){
//                try {
//                    writer.close();
//                }
//                catch (IOException el){
//                    el.printStackTrace();
//                }
//
            

        //code that tries to read the file.....





//        String reddit = "https://www.reddit.com/.json";
//        try {
//            URL url = new URL(reddit);
//            URLConnection con = url.openConnection();
//                InputStream in = con.getInputStream();
//        } catch (MalformedURLException e) {
//            System.out.println("Bad url");
//        } catch (IOException e) {
//            System.out.println("Please connect to the internet");
//        } catch (Exception e) {
//            writeToFile();
//        }




//    public static void writeToFile() {
//        try {
//            FileWriter writer = new FileWriter("1.txt");
//            writer.write("Hello, Java");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


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
//
//    }
//}

