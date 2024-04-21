import java.util.Scanner;
public class StockCommission {
 public static void main(String[] args) {
  
   double rateCommission = 0.0425;
   double Commission;
   double sharePrice;
   double total;
   double stockCost;
   int numShares;
  
   Scanner keyboard = new Scanner(System.in);
  
   System.out.println("Enter the share price");
   sharePrice = keyboard.nextDouble();
  
   while(sharePrice < 1 || sharePrice > 500) {
     System.out.println("Invalid Share Price");
     sharePrice = keyboard.nextDouble();
   }
   
   System.out.println("Enter number of shares");
   numShares = keyboard.nextInt();
  
   while(numShares < 100 || numShares > 10000) {
     System.out.println("Invalid Number of Shares");
     numShares = keyboard.nextInt();
   }
  
     stockCost = numShares / sharePrice;
     Commission = sharePrice * rateCommission;
  
     total = stockCost + Commission;
  
     System.out.println("Stock Cost: " + stockCost);
     System.out.println("Commission =  " + Commission);
     System.out.println("Total =  " + total);

   keyboard.close();
 }
}
