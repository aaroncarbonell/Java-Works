public class IntegerDemo
{
   public static void main (String[] args)
   {
   int anInt = 1234;
   byte aByte = 12;
   short aShort = 12345;
   long aLong = 1234567890987654321L;
   
   int anotherInt = anInt *10000000;
   
   System.out.println("This int is" + anInt);
   System.out.println("This byte is " + aByte);
   System.out.println("This short is " + aShort);
   System.out.println("This long is " + aLong);
   
   System.out.println("Another int is " + anotherInt);


   }
}