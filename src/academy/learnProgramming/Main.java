package academy.learnProgramming;

//All code should have comments for every method and variable. It may seem obvious to you what you were writing, but when you’re working on a team, it will save a lot of time and questions from your teammates who it may not be so obvious to.

//        All programs should be put into a single folder with a readme file explaining how the program should be run and a UML diagram for the program. Then zip the folder (7zip is free and simple) and submit the zip file.
//
//        Fibonacci Sums
//        For this program, prompt the user for an integer. Then, recursively compute the Fibonacci number at that index, and the sum of all Fibonacci numbers up to and including that one. The output should display both.

//********************************************
// * Name: Ronald Rajski
// * Class: COSC 1174
// * Assignment: Fibonnaci Sums
// * Date: 10/10/2021
// ********************************************

import java.util.Scanner;
//import scanner class


public class Main {
    static Scanner input = new Scanner((System.in));
//    need array for the sums
    static long[] fibsum;


    public static void main(String[] args) throws Exception{
        System.out.println("Fibonnaci Calculator");
        long fibMax = getNumber();

        fibsum= new long[(int)fibMax + 1];

        System.out.printf("%nThe Fibonnaci sum at index %d is %d", (int)fibMax, fib(fibMax));

        System.out.println("The full sequence: ");
        for (long fibNum: fibsum){
            System.out.print(fibNum + " ");
        }

//        spacing
        System.out.println("\n\n");

    }
//    Calculates the Fibonnaci value at a given index
    static long fib(long n){
//        n index value to calculate the Fibbonci value
//            return int - the fibonnaci value at given index
        static long fib(long n){
            // base case
            if(n <= 1) {
                // add the value of n to the fibs array to print later
                fibsum[(int)n] = n;
                // return the value
                return n;
            } else {
                // use recurssion to calculate the value & add it to the array
                fibsum[(int)n] = fib(n - 1) + fib(n - 2);
                // return the value @index n
                return fibs[(int)n];
            }
        }


}
