public class ThreeStudents {

   public static boolean isHonorRoll (double gpa) {
      if (gpa >= 3.5) {
         return true;
      } else { 
         return false;
      }
   }
   
   public static void main(String[] args) {
      String sarahsName = "Sarah";
      String sarahsMajor = "Math";
      String sarahsTown = "Englewood";
      double sarahsGPA = 3.2;
      int sarahsCredits = 47;
      
      if (isHonorRoll(sarahsGPA)) {
         System.out.println("Sarah made the honor roll with a GPA of " + sarahsGPA);
      } else {
         System.out.println("Sarah did not make the honor roll");
      }
   }
   
}