/*
Student ID: 22065462
Name: Bora Durdag
Campus: Sydney City
Tutor Name: Christopher Stanton
Class Day: Thursday
Class Time: 10:30AM - 12:30PM
*/

import java.util.Scanner;

public class PowerTest {
  
  static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {
    int base; // Initializing the base
    int exponent; // Initializing the exponent
    int min = 0; // Initializing the minimum number they can choose

    System.out.print("Enter a positive base: ");
    base = validate(kb.nextInt(), min);

    System.out.print("Enter a positive exponent: ");
    exponent = validate(kb.nextInt(), min);

    int powerAns = power(base, exponent); // Initializing "powerAns" after they input the base & exponent
    
    System.out.println("My power method result: " + base + " raised to the power of " + exponent + " = " + powerAns);

    System.out.println("Math.pow method result: " + base + " raised to the power of " + exponent + " = " + Math.pow(base, exponent));

    if (powerAns == Math.pow(base, exponent)) {
    System.out.println("SUCCESS – it looks like you wrote the power method correctly.");
    } 

    else {
    System.out.println("Try again with smaller values of the base and exponent or something appears to be wrong with your power method.");
    }
  }

  public static int power(int base, int exponent) {
    int value = 1; // initializing value
    for (int i = 0; i < exponent; i++) { // depending on user input the loop continues for x amount of time
      value *= base; 
    }
    return value;
  }

  public static int validate(int value, int min) { // if the user input is less than the desired, it asks them to enter a larger input
    while (value < min) {
      System.out.println("Enter a number greater than " + min);
      value = kb.nextInt();
    }
    return value;
  }


}
