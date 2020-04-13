package com.codewithisi;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        /**
         * First version. Always thinking of one letter
         * Finite number of tries (5)
         */
//
//        char answer = 'm';
//        char control = 'e';
//        int i = 5;
//        System.out.println("I'm thinking of a letter between A and Z");
//        while ((i>=1) && (control!=answer)) {
//            Scanner cha = new Scanner(System.in);
//            System.out.println("You have " + i + " chances to guess the character: ");
//            char ch = cha.next().charAt(0);
//            if (ch == answer) {
//                System.out.println("Yep");
//                control = ch;
//            }
//            else if (ch < answer) {
//                System.out.println("Nope, too low");
//            }
//            else {
//                System.out.println("Nope too High");
//
//            }
//            i--;
//
//        }
//        if(control=='e'){
//            System.out.println("Sorry, you failed");
//        }
//    }


        /**
         * Second version. Letters are random
         * Tells you how many tries it took you (Infinite number of tries)
         */
        Random rnd = new Random();
        char answer = (char) (rnd.nextInt(26) + 'a'); // gets a random letter between A and Z
        char control = '0';
        int i = 0;
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.println();
        Scanner cha = new Scanner(System.in);// ask for input
        while (control!=answer) {
            System.out.println("Guess the character: ");
            char ch = cha.next().charAt(0);// Convert input to 'char'
            if (ch == answer) {
                System.out.println("Yep");
                control = ch;// checks to see if input matches answer
            }
            else if (ch < answer)
                System.out.println("Nope, too low");

            else
                System.out.println("Nope too High");


            i++;
            System.out.println();
            System.out.println();
            System.out.println();

        }
        if(i==1)
            System.out.println("Wow you got it with your first try. YOU A BEAST!!!");
        else
            System.out.println("It took you " + i + " tries");
    }
}