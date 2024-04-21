import java.util.Scanner;

public class Caloriewatcber {

  public static void main(String[] args) {
    byte bagCookies = 40;
    byte bagServing = 10;
    short bagCalories = 300;

    byte cookiesEaten;
    float servingsEaten;
    float caloriesEaten;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("How many cookies have you eaten?");
    cookiesEaten = keyboard.nextByte();
    if (cookiesEaten < 0) {
      System.out.println("Invalid Amount of Cookies");
    }
    else {
      servingsEaten = (float)cookiesEaten/bagCookies * bagServing;
      System.out.println("Servings ate = " + servingsEaten);
    
      caloriesEaten = servingsEaten * bagCalories;
      System.out.println("Calories consumed = " + caloriesEaten + " When you ate " + cookiesEaten + " cookies.");
    }
    
    keyboard.close();
  }
}
