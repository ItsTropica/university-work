/*
Student ID: 22065462
Name: Bora Durdag
Campus: Sydney City
Tutor Name: Christopher Stanton
Class Day: Thursday
Class Time: 10:30AM - 12:30PM
*/

import java.util.Scanner;

public class Rodents {
  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in); // enabling keyboard input
    
    float initiPop; // initial population
    float percInc; // percentage increase
    byte numYears;  // number of years 
    
    System.out.println("Please enter initial population value");
    initiPop = kb.nextShort(); // asking user for initial population
    
    while (initiPop < 300) {
      System.out.println("Initial population value too small");
      initiPop = kb.nextShort(); // if the initial population is too small user re-enters value
    }
    
    System.out.println("Please enter the population percentage increase");
    percInc = kb.nextFloat(); // asking user for percentage of population increase
    
    while (percInc < 0) {
      System.out.println("Population Percentage increase must be a positive number");
      percInc = kb.nextFloat(); // if value of percentage of population increase is too small the user re-enters value
    }
    
    System.out.println("Please enter number of years to estimate population");
    numYears = kb.nextByte(); // user enters estimate number of years of population
    
    while (numYears < 10) {
      System.out.println("Estimate value is too small");
      numYears = kb.nextByte(); // if estimate is too small user re-enters value
    }
    
    for (int i = 0, j = numYears; i < numYears; i++, j--) { // calculates the population after each year and prints out values
        System.out.println("Years left: " + j);
        System.out.println("Rat Population: " + initiPop);
        initiPop = initiPop + initiPop * percInc/100;
    }
    kb.close();
  }
}
