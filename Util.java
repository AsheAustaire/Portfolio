package com.asheaustaire.javareview;
//
import java.util.Scanner;
//
public class Util {


    public static void question(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        String quit = "r";
        while (quit != "q") {
            System.out.println("Do you want to (a)dd, (s)ubtract, (m)ultiply, (d)ivide, or (q)uit");
            quit = sc.nextLine();
            switch (quit) {
                case "a" :
                    System.out.println("Your answer is : " + add(num1, num2));
                    break;
                case "s" :
                    System.out.println("Your answer is : " + sub(num1, num2));
                    break;
                case "m" :
                    System.out.println("Your answer is : " + sub(num1, num2));
                    break;
                case "d" :
                    System.out.println("Your answer is : " + dev(num1, num2));
                    break;
                case "q" :
                    quit = "q";
            }
        }
    }

    public static String getName(){
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        return ("Your name is " + userName);
    }


    public static int add(int num1, int num2) {

        return (num1 + num2);
    }

    public static int sub(int num1, int num2) {

        return (num1 - num2);
    }

    public static int dev(int num1, int num2) {

        return (num1 / num2);
    }

    public static int mult(int num1, int num2) {

        return (num1 * num2);
    }
}
