public class Student2 {
   private String name;
   private String major;
   private String town;
   private double gpa;
   private int credits;
   
   public Student2 () { }
   
   public Student2 (String n, String m, String t, double gradePointAvg, int c) {
      name = n;
      major = m;
      town = t;
      gpa = gradePointAvg;
      credits = c;
   }
         
   public boolean isHonorRoll () {
      return (gpa >= 3.5);
   }
   
   public static void main (String args[]) {
      Student2 sarah = new Student2("Sarah", "Math", "Englewood", 3.2, 47);
      if (sarah.isHonorRoll()) {
         System.out.println("Sarah made the honor roll with a GPA of " + sarah.gpa);
      } else {
         System.out.println("Sarah did not make the honor roll");
      }
   }
}