package Java_Programmes_Week2;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double x = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double y = scanner.nextDouble();
        System.out.println("Enter the Third Number");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, x);

        // closing the scanner object
        scanner.close();
    }

    // Calculation the average of three Numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println("The Average of" + a + " , " + b + " and " + c + " is : " + average);
    }
}

