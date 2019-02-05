/*  COIS 2240 - ASSIGNMENT 1
 *  NAME: ANECIA JOHNSON
 *  PROGRAM: FIBONACCI SEQUENCE GENERATOR: THE PURPOSE OF THIS PROGRAM IS TO PRINT A FIBONACCI
 *  SEQUENCE TO THE NTH NUMBER SPECIFIED BY THE USER. THE PROGRAM WILL PRINT THE SEQUENCE USING
 *  A RECURSIVE AND ITERATIVE METHOD. BOTH METHODS WILL BE TIME.
 *
 *  CODE SOURCE: THE TIMING CALCULATIONS ARE FROM JONATHAN VAN DAM
 *  https://stackoverflow.com/questions/48604755/java-fibonacci-numbers-timer
 *  ITERATIVE FIBONACCI CALCULATION ARE FROM VISHAL NAIK'S POST ON JAVA-FRIES
 * (http://www.java-fries.com/2014/11/nth-fibonacci-number-java/).
 */


//Scanner is used to get the users input
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        // Welcomes the user and introduce the program
        System.out.println("Hello! Welcome to the Fibonacci Sequence program.");

        // Ask user how many Fibonacci numbers to calculate
        System.out.println("Enter number of sequence you would like to generate: ");

        // Initiate scanner for taking user input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close(); //Close scanner

        // Output blank line
        System.out.println(" ");




        // Displace Recursive Fibonacci Results
        // Inform user of calculation method
        System.out.println("Recursive Fibonacci number generated: ");

        // Calculation start time
        long startTimeRec = System.nanoTime();

        for (int i = 0; i < input; ++i) {

            System.out.print(fibSeriesRec(i) + " ");
        }

        //Calculation end time
        long endTimeRec = System.nanoTime();

        long timeElapsedRec = endTimeRec - startTimeRec;

        // Output blank line
        System.out.println(" ");

        // Display time taken to calculate list of numbers using Recursion
        System.out.println(" Total time: " + timeElapsedRec + " nanoseconds");

        // Output blank line
        System.out.println(" ");




        // Display Iterative Fibonacci Results
        // Inform user of calculation method
        System.out.println("Iterative Fibonacci number generated: ");


        //Calculation start time
        long startTimeIte = System.nanoTime();

        for (int i = 0; i < input; i++) {
            System.out.print(fibSeriesIte(i) + " ");
        }

        // Calculation end time
        long endTimeIte = System.nanoTime();

        // Calculate time taken to display results using iterative method
        long timeElapsedIte = endTimeIte - startTimeIte;
        System.out.println(" ");

        // Display time taken to calculate list of numbers using iteration
        System.out.println("Total time: " + timeElapsedIte + " nanoseconds");

    }


    // Recursive Fibonacci number calculation
    public static long fibSeriesRec(long num) {


        if (num == 0 || num == 1) {

            return 1;
        }

        return fibSeriesRec(num - 1) + fibSeriesRec(num -2);
    }

    // Iterative Fibonacci number calculation
    public static long fibSeriesIte(long num) {

        // Initiating variables
        long fib1 = 0, fib2 = 1, fibVal = 0;


        for (int count = 0; count <= num; count++) {

            fibVal = fib1;
            fib1 = fib1 + fib2;
            fib2 = fibVal;

        }
        return fibVal;

    }
}






