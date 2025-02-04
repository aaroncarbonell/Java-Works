import java.util.ArrayList;

class ArrayListDemo2 { 
   public static void main(String arg[]) { 
      int num  = 5;
      int num2 = 8;  
      int[] intArray = {num, num2};
      System.out.println(intArray[1] + " ");
      
      ArrayList<Integer> listOfInts = new ArrayList<Integer>();
      listOfInts.add(num);
      listOfInts.add(num2);
      listOfInts.add(15);
      listOfInts.add(10);
      listOfInts.add(12);
      
      int sum = 0;
      for(int x : listOfInts) {
         //System.out.println(x);
         sum += x;
         System.out.println(sum);
      }
      
  }
}