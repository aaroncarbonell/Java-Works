public class DemoArray { 
   public static void main (String[] args) { 
      double[] salaries = new double [4];
      
      salaries[0] = 12.25;
      salaries[1] = 13.55;
      salaries[2] = 14.25;
      salaries[3] = 16.85;
      
      System.out.println(salaries[3]); // works with [3] not [4]
   }
}