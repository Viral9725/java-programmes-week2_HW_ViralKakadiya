package Java_Programmes_Week2;

/*
**Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner Declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);

        //closing the scanner object
        scanner.close();
    }

    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
                float c =((temp - 32) * 5 /9);
        System.out.println("The Temperature "+ temp+ " fahrenheit is equal to " + c + " degree celsius");
    }
}
