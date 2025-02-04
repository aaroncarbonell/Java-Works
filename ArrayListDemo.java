import java.util.ArrayList;

class ArrayListDemo { 
   public static void main(String arg[]) { 
      ArrayList<String> names = new ArrayList<String>();
      names.add("Beatrix");
      names.add("Xavier");
      names.add("Ulysses");
      System.out.println("names has " + names.size() + " elements in it");
      names.add("Fiona");
      System.out.println("names has " + names.size() + " elements in it");
      
      for(String name : names) {
         if (name.startsWith("X")) { 
         System.out.println(name);
         }
      }
      ArrayList<String> 
   }
}