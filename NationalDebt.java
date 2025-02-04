import java.text.*;
import java.util.*;
public class NationalDebt {
   public static void main(String[] args) {
      double nationalDebt = 22233344455.34 / 7.0;
      //System.out.println("The national debt is: " + nationalDebt);
      
      
      NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
      String currencyString = currency.format(nationalDebt);
      System.out.println(currencyString);

   }
}