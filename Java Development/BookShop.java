/*
Student ID: 22065462
Name: Bora Durdag
Campus: Sydney City
Tutor Name: Christopher Stanton
Class Day: Thursday
Class Time: 10:30AM - 12:30PM
*/

import java.util.Scanner;

public class BookShop {

  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    
    byte numBooks = 0; // number of books
    float bookPrice = 0; // price of books
    float bookTotal = 0; // price of all books
    float cashPay; // cash payment
    String choseBook; // a true/false statement asking the user are they finished picking the books
    String chosePay; // chosen payment method
    
    System.out.println("To start shopping, type 'Continue'. If you want to stop shopping, enter 'Stop'");
    choseBook = kb.next();
    while (choseBook.equalsIgnoreCase("Continue")) {
      
      System.out.println("Continuing with shopping");
      
      System.out.println("Enter the amount of books you are buying");
      numBooks = kb.nextByte(); // asking the user how many books they are buying
      
      while (numBooks < 1) {
        System.out.println("Number of books must be greater than 0");
        numBooks = kb.nextByte(); // if the number of books is less than 0 the user needs to re enter a number
      }
      
      System.out.println("Enter price of book: ");
      bookPrice = kb.nextFloat(); // asking sales how much the books cost per book
      bookTotal = (bookPrice * numBooks) + bookTotal;
      
      while (bookPrice <= 0) {
        System.out.println("Price of books cannot be less than 1");
        bookPrice = kb.nextByte(); // if the price of books is less than or equal to 0 the user needs to re enter a number
      }
      System.out.println("To continue shopping, type 'Continue'. If you want to stop shopping, enter 'Stop'");
      choseBook = kb.next();
    }  
    
    kb.nextLine();
    
    while (choseBook.equalsIgnoreCase("Stop")) {
      System.out.println("Choose prefered payment method");
      chosePay = kb.nextLine();
    
    if (chosePay.equalsIgnoreCase("Card")) { // Case where if user chooses card it pays with no extra user input
      System.out.println("All books paid in full by card");
      System.out.println("Purchase Summary");
      System.out.println("=====================================");
      System.out.println("Total Due:                     " + bookTotal);
      System.out.println("-------------------------------------");
      System.out.println("Credit Card Payment:           " + bookTotal);
      System.out.println("Owing:                       $   0.00");
      System.out.println("=====================================");
    }
    
    if (chosePay.equalsIgnoreCase("Cash")) { // Case where if user chooses cash they have to input how much and depending on the amount their card may be charged
      System.out.println("Enter Cash amount");
      cashPay = kb.nextFloat();
      
      while (cashPay > 0) {
      
        if (cashPay >= bookTotal) { // if the cash inputed by the user is greater than the total cost of the books their card wont be charged and they'll be given change depending on how much extra they've payed
          System.out.println("All books paid in full by cash");
          System.out.println("Purchase Summary");
          System.out.println("=====================================");
          System.out.println("Total Due:                   $  " + bookTotal);
          System.out.println("-------------------------------------");
          System.out.println("Cash Payment:                $  " + cashPay);
          System.out.println("Change:                      $   " + (cashPay - bookTotal));
          System.out.println("Owing:                       $   0.00");
          System.out.println("=====================================");
        }
      
      if (cashPay < bookTotal) { // if the cash inputed by the user is less than the amount of the total cost of the books their card is charged with the required amount.
         System.out.println("All books paid via cash & card");
         System.out.println("Purchase Summary");
         System.out.println("=====================================");
         System.out.println("Total Due:                     " + bookTotal);
         System.out.println("-------------------------------------");
         System.out.println("Cash Payment:                $   " + cashPay);
         System.out.println("Credit Card Payment:         $  " + (bookTotal - cashPay));
         System.out.println("Change:                      $   0.00");
         System.out.println("Owing:                       $   0.00");
         System.out.println("=====================================");
       }
      break;
     }
    }
    choseBook = ""; // set this here so it doesn't loop back as "choseBook" is still saved as "Stop" causing an infinite loop
    }
    kb.close();
  }

}