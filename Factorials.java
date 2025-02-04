public class Factorials
{
/*
public static void main(String[] args) {
  int number;
  System.out.println("Enter the number to which you want the find the factorial: ");
  Scanner sc = new Scanner(System.in);
  number = sc.nextInt();

  for(int i = 1; i <= number; ++i) {
      factorial = factorial * i;
      System.out.println("Factorial of " + number + " is " + factorial);
    }
  }*/
public static void main(String[] args) {
  int result = 1;
  for(int i = 1; i <= 10; ++i) {
      result = result * i;
      System.out.println("Factorial of " + i + " is " + result);
  }
}
}
