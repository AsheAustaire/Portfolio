 pgit checkout ~filename~ : Reverts a locally saved file to the last committed version of it. hjk   `ackage com.asheaustaire.javareview;
//
import com.asheaustaire.javareview.*;
import com.asheaustaire.javareview.Util;
import java.io.*;
import java.util.Scanner;
//
public class Main {

    public static void main(String[] args) throws IOException {
        // Basic Introduction
        System.out.println("");
        System.out.println("Welcome to my first Java program. Use the enter key to move forward in the program!!!");
        pressEnter();
        System.out.println("I've written this program to demonstrate my fundamental understanding of the java language.");
        pressEnter();
        System.out.println("Let's Begin . . .");
        pressEnter();
        System.out.println("I'll start by telling you some bits about myself.");
        pressEnter();
        // Declaring Attributes
        String name = "Ashe Austaire";
        float favNum = 1248.16f;
        String[] naturaLanguages = new String[]{"English (Native)", "Spanish (Native)", "Mandarin (Basic)"};
        String[] programmingLanguages = new String[]{"Python (Basic)", "Java (Basic)", "HTML (Basic)", "CSS (Basic)", "Javascript (Basic)"};
        String[] items = new String[3];
            items[0] = "Sweet Potatoes";
            items[1] = "Oolong tea";
            items[2] = "Fuji Apples";
        String school = "NYU Student";
        // Personal Output Experience
        System.out.println("My name is " + name + '.');
        pressEnter();
        System.out.println("My favorite number is : " + favNum);
        pressEnter();
        System.out.println("Would you like to know a bit more about me? (y) or (n)");


        try {
            Scanner sc = new Scanner(System.in);
            String decision = sc.nextLine().trim();
            if ("y".equals(decision)) {
                System.out.println("I will tell you what (l)anguages I speak or I will tell you what(f)oods I like.");
                String next = sc.nextLine().trim();
                if ("l".equals(next)) {
                    System.out.println(" ");
                    System.out.println("The natural languages are . . . ");
                    for (String ele : naturaLanguages){
                        pressEnter();
                        System.out.println(ele);
                    }
                    System.out.println(" ");
                    System.out.println("The programming languages are . . . ");
                    for (String ele : programmingLanguages){
                        pressEnter();
                        System.out.println(ele);
                    }
                    pressEnter();
                } else if ("f".equals(next)){
                System.out.println("My favorite foods are . . . ");
                for (int i = 0; i < items.length; i++){
                    pressEnter();
                    System.out.println("");
                    System.out.println(items[i]);
                    }
                }
            } else {
                System.out.println("");
                System.out.println("That's alright, I'm not that interesting anyway!!!");

            }
        } catch(Exception e){
            pressEnter();
            System.out.println("Guess you didn't understand my instructions, my apologies! Moving On!");
        }


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println(userName  + " , I'm so glad you took the time to get to know me!");
        pressEnter();
        System.out.println("Now I would like to do a few simple java tasks, nothing fancy, just functional.");
        pressEnter();
        Main x = new Main();
        pressEnter();
        Main.myFunction("First, I'm calling a function.This text has been displayed to the screen using a static function, called using the classname.functioname.");
        pressEnter();
        x.myFunctionTwo("Second, I'm calling another function! This text is been displayed using an instanced method, called on an instance of a Main type object . . .(I know, I know).");
        pressEnter();
        CoClass y = new CoClass();
        System.out.println(y.classFunction());
        pressEnter();
        System.out.println(y.test);
        // Math Functions
        pressEnter();
        System.out.println("--------------------------------------------------------------------------------");
        pressEnter();
        System.out.println("Please give me two numbers to insert into our equations . . .");
        int num1;
        int num2;
        try {
            num1 = sc.nextInt();
            System.out.println("");
            num2 = sc.nextInt();
        } catch(Exception e) {
            System.out.println("");
            System.out.println("Last Chance Before We Crash!!! Please give me two integers.");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        System.out.println("");
        System.out.println("The solution to an addition problem : " + Util.add(num1,num2));
        pressEnter();
        System.out.println("The solution to a substract problem : " + Util.sub(num1,num2));
        pressEnter();
        System.out.println("The solution to a division problem : " + Util.dev(num1,num2));
        pressEnter();
        System.out.println("The solution to a multiplication problem : " + Util.mult(num1,num2));
        pressEnter();
        Util.question(num1, num2);
        throwException();
        }


    // METHODS

    public Main(){
        System.out.println("I've Constructed a Main Object");
    }

    public static void throwException(){
        try {
            FileReader file = new FileReader("txt.txt");
            BufferedReader reader = new BufferedReader(file);
            String data;
            while ((data = reader.readLine()) != null){
            System.out.println(data);
            }
        } catch(IOException error){
            System.out.println("So now I am about to use File Reader and Buffer Reader");
            pressEnter();
            System.out.println("There is no txt file, perhaps this is on purpose? Perhaps I am simply showing how to use a Try/Catch block. You may never know, as the program, is now ending.");
        }
        pressEnter();
        System.out.println("Farewell my friend, thank you for following me on GIT, before it is a cool thing to do.");
    }

    public static void myFunction(String myString){

        System.out.println(myString);

    }

    public void myFunctionTwo(String myString){

        System.out.println(myString);

    }

    public static void pressEnter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        sc.nextLine();
    }
}
