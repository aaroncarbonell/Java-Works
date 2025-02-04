import java.util.Scanner;
public class HappyBirthday
{
   public static void hb2u() {
         System.out.println("Happy Bithday to you!");
         }
         
   public static void hbdn(String name) {
         System.out.println("Happy Birthday dear " + name + "!!!");
         }
   public static void main (String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the person you want to say Happy Birthday to: ");
            
            String person = sc.nextLine();
            hb2u();
            hb2u();
            hbdn(person);
            hb2u();
            }

}