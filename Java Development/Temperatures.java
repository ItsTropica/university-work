import java.util.Scanner;
public class Temperatures {

  static Scanner kb = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    float Temp = 0;
    int Day = 1;
    int freezeDay = 0; // variable to keep track of days that is freezing temp
    int coldDay = 0; // variable to keep track of days that is cold temp
    int mildDay = 0; // variable to keep track of days that is mild temp
    int warmDay = 0; // variable to keep track of days that is warm temp
    int hotDay = 0; // variable to keep track of days that is hot temp
    int extremeDay = 0; // variable to keep track of days that is extreme temp
    float freeze = 0; // variable to keep track of temp that is under the freezing temp values
    float cold = 0; // variable to keep track of temp that is under the cold temp values
    float mild = 0; // variable to keep track of temp that is under the mild temp values
    float warm = 0; // variable to keep track of temp that is under the warm temp values
    float hot = 0; // variable to keep track of temp that is under the hot temp values
    float extreme = 0; // variable to keep track of temp that is under the extreme temp values
    int endTemp = -999; // variable to trigger end of input process of temperatures
   
   System.out.println("Welcome to the Sydney Daily Maximum Temperature Analyser!");
   System.out.println("Enter the daily maximum temperatures for Sydney. Enter -999 to finish.");
   kb.nextLine();
   
   while (Temp != endTemp) {

     System.out.print("Enter temeprature for day " + Day + ": ");
     Temp = validateInt(kb.nextFloat(), -9, 49, -999, "Please enter a temperature within the range of -9 to 49"); // validating that the inputed temp is between -10 and 50
     Day++;
     
     if (Temp < 0) { // checking to see if the temp is less than 0
       freeze = freeze + Temp;
       freezeDay++;
     }
     if (Temp < 10 && Temp > 0) { // checking to see if the temp is less than 10 and greater than 0
       cold = cold + Temp;
       coldDay++;
     }
     if (Temp < 20 && Temp > 10) { // checking to see if the temp is less than 20 and greater than 10
       mild = mild + Temp;
       mildDay++;
     }
     if (Temp < 30 && Temp > 20) { // checking to see if the temp is less than 30 and greater than 20
       warm = warm + Temp;
       warmDay++;
     }
     if (Temp < 40 && Temp > 30) { // checking to see if the temp is less than 40 and greater than 30
       hot = hot + Temp;
       hotDay++;
     }
     if (Temp > 40) { // checking to see if the temp is less than 40
       extreme = extreme + Temp;
       extremeDay++;
     }
   }
   
   // didn't know how to make a table properly without hard coding it, used an online source to assist me:
   // https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-print-table-format-printf-chart-console-scanner-println-line
   if (Temp == endTemp) {
     System.out.printf("===== Temperature Analysis =====%n");
     if (freezeDay == 0) { // checking to see if freeze day count is 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Freezing:", freezeDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (freezeDay > 0) { // checking to see if freeze day count is greater than 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Freezing:", freezeDay,  "day(s),", "average temperature: ", freeze/freezeDay, "°C");
     }
     if (coldDay == 0) { // checking to see if cold day count is 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Cold:", coldDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (coldDay > 0) { // checking to see if cold day count is greater than 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Cold:", coldDay,  "day(s),", "average temperature: ", cold/coldDay, "°C");
     }
     if (mildDay == 0) { // checking to see if mild day count is 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Mild:", mildDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (mildDay > 0) { // checking to see if mild day count is greater than 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Mild:", mildDay,  "day(s),", "average temperature: ", mild/mildDay, "°C");
     }
     if (warmDay == 0) { // checking to see if warm day count is 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Warm:", warmDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (warmDay > 0) { // checking to see if warm day count is greater than 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Warm:", warmDay,  "day(s),", "average temperature: ", warm/warmDay, "°C");
     }
     if (hotDay == 0) { // checking to see if hot day count is greater 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Hot:", hotDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (hotDay > 0) { // checking to see if hot day count is greater 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Hot:", hotDay,  "day(s),", "average temperature: ", hot/hotDay, "°C");
     }
     if (extremeDay == 0) { // checking to see if extreme day count is 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %1s |%n", "Extreme:", extremeDay,  "day(s),", "average temperature: ", "N/A");
     }
     if (extremeDay > 0) { // checking to see if extreme day count is greater than 0
       System.out.printf("| %-10s | %-1s %4s | %2s | %-1.1f %1s |%n", "Extreme:", extremeDay,  "day(s),", "average temperature: ", extreme/extremeDay, "°C");
     }
   }
  } 
  
  //
  
  // validation method -- to make sure that user input is valid
  public static float validateInt(float numVal, float minVal, float maxVal, float finVal, String invalidInput) {
    while (numVal < minVal || numVal > maxVal || numVal == finVal) {
      if (numVal == finVal) { // checking to see if the inputed value is equal to the final value, if it is, it breaks the loop
        break;
      }
      else { // if the inputed value does not equal the final value and is both less than the minimum value and/or greater than the maximum value
      System.out.println(invalidInput);
      numVal = kb.nextShort();
      }
    }
    return numVal;
  }
}
