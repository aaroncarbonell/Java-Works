import java.util.Scanner;
public class ParadiseInfo
{
      
   public static void main (String[] args) {
            double price;
            double discount;
            double savings;
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Enter cutoff price for discount: ");
            price = keyboard.nextDouble();
            
            System.out.println("Enter discount rate as a whole number: ");
            discount = keyboard.nextDouble();
            
            displayinfo();
            savings = computeDiscountInfo(price, discount);
            
            System.out.println("Special this week on any service over " + price);
            System.out.println("Discount of " + discount + " percent");
            System.out.println("That's a saving of at least $" + savings);
            
            }
            public static void displayinfo() {
              
                     System.out.println("Paridise Day Spa wants to pamper you.");
                     System.out.println("We will make you look good.");
            }
            
            public static double computeDiscountInfo (double price, double discountRate) {
            
                     double savings;
                     savings = price * discountRate / 100;
                     return savings;
            }
            /*
            public class TestInfo 
            {
               System.out.println("Calling method from class:");
               PardiseInfo.displayInfo();
            }
            */
}