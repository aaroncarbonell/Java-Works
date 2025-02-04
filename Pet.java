public class Pet {
    String name;
    String animal;
    String breed;
    String color;
    double age;
   
   public Pet (String n, String a, String b, String c, double g) {
      name = n;
      animal = a;
      breed = b;
      color = c;
      age = g;
      ;
   }
   
   //public double getAge() {
  //   return age }
   
   //public void 
 
   public boolean isGrownUp () {
      if (age <= 1) {
         return true;
      } else { 
         return false;
      }
 }
}