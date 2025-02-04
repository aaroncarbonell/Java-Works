import java.text.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.*;
public class FormattingDemo { 
   public static void main(String[] args ) { 
      String[] labels = {"app" , "main", "dessert"};
      double[] prices = { 12.75 / 2.0, 30.25, 11.00 + 0.1 + 0.1 + 0.1};
      
      for (int i = 0 ; i < labels.length; i++) { 
         System.out.format("%-8s $%6.2f %n", labels[i], prices[i]);
      }
      long debt = 3678000000L;
      DecimalFormat decFormat = new DecimalFormat("#,###,###,###,###,###.00");
      String decString = decFormat.format(debt);
      System.out.println(decString);
      
      
      NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
      String currencyString =currency.format(debt);
      System.out.println(currencyString);
      
      
      LocalDate today = LocalDate.now();
      LocalDate bday = LocalDate.of(1995, 5, 13);
      
      System.out.println(today);
      
      LocalDate yesterday = today.minusDays(1);
            System.out.println(yesterday);

      long daysToday = today.toEpochDay();
      long daysBday = bday.toEpochDay();
      
      System.out.println("I am " + ( daysToday - daysBday) + " days old!");


      DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE MMMM dd, YYYY");
      String todayString = dateFormat.format(today);
      System.out.println(todayString);
      
   }
} 