public class Fullname
{
   public static void main(String[] args) {
   
      String myName = fullName("Thomas", "Jefferson");
      System.out.println("Hello " + myName);
   }
   
   public static String fullName (String first, String last) {
   
      String full = first + " " + last;
      return full;
   
   }
}
