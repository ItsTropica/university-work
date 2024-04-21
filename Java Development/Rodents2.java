import java.util.Scanner;

public class Rodents2 {

  static Scanner kb = new Scanner(System.in); // enabling keyboard input
  
  public static void main(String[] args) {
    
    float initiPop; // initial population
    float percInc; // percentage increase
    float numYears;  // number of years 
    
    System.out.println("Please enter initial population value");
    initiPop = validateInt(kb.nextShort(), 300, "Initial Population value is too small"); // asking user for initial population
    
    System.out.println("Please enter the population percentage increase");
    percInc = validateFloat(kb.nextFloat(), 0, "Population Percentage increase must be a positive number"); // asking user for percentage of population increase
    
    System.out.println("Please enter number of years to estimate population");
    numYears = validateInt(kb.nextByte(), 10, "Estimate value is too small"); // user enters estimate number of years of population

    for (int i = 0, j = (int) numYears; i < numYears; i++, j--) { // calculates the population after each year and prints out values
        System.out.println("Years left: " + j);
        System.out.println("Rat Population: " + initiPop);
        initiPop = initiPop + initiPop * percInc/100;
    }
  }
  
  public static float validateInt(float numVal, float minVal, String invalidInput) { // this method validates whether the users input of an integer is valid and/or needs to be changed depending on the requirements
    while (numVal < minVal) {
      System.out.println(invalidInput);
      numVal = kb.nextShort();
    }
    return numVal;
  }
  
  public static float validateFloat(float numVal, float minVal, String invalidInput) { // this method validates whether the users input of an float is valid and/or needs to be changed depending on the requirements
    while (numVal < minVal) {
      System.out.println(invalidInput);
      numVal = kb.nextShort();
    }
    return numVal;
  }
  
}
