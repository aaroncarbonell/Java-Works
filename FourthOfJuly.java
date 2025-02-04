import java.text.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.*;

public class FourthOfJuly { 
   public static void main(String[] args ) { 
            
      LocalDate today = LocalDate.now();
      LocalDate next4th = LocalDate.of(2022, 7, 4);
      
      long daysToday = today.toEpochDay();
      long days4 = next4th.toEpochDay();
      
      System.out.println(( days4 - daysToday) + " until the 4th of July!");
      
      
   }
}