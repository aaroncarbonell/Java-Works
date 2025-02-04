
// What is 1 + ½ + ¼ + 1/8 + 1/16 + … + 1/2048 ?

public class Q5
{
   public static void main(String[] args) {
   
   int dem = 1;
   double sum = 0;
   while (dem <= 2048)
   {
      double term = 1.0 / dem;
      sum = sum + term;
      dem *= 2;
      System.out.println(term);
   }
   System.out.println("The sum of 1 + 1/2 + 1/4 + ... is " + sum);
   }
}