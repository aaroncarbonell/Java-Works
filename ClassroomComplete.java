class ClassroomComplete {
   public static void main(String[] args) {

      int[] evens = { 2, 4, 6, 8 } ;
      String[] teachers = { "Venus", "Jupiter", "Fiona", "Nero" } ;
   
      Student[] pupils = {new Student("OLIVER",8117411,"English",2.09,"Montvale"),
                         new Student("OLIVIA",6478288,"Law",3.11,"Woodcliff Lake"),
                         new Student("HARRY",5520946,"English",1.88,"Hillsdale"),
                         new Student("AMELIA",2440501,"French",2.93,"Englewood Cliffs"),
                         new Student("JACK",2351593,"Nursing",2.21,"Washington Township"),
                         new Student("ISLA",3704862,"Math",2.25,"Hasbrouck Heights"),
                         new Student("GEORGE",4647685,"Chemistry",2.76,"Old Tappan"),
                         new Student("EMILY",8420189,"Business",3.75,"Elmwood Park"),
                         new Student("AVA",1550668,"Business",1.74,"Hackensack")  };

      // get all the student names that have a gpa > 2.5
      for (Student s : pupils) {
         if (s.getGPA() > 2.5) {
            System.out.println(s.getName());
         }
      }
      
      // how many english majors are there?
      int numberOfEnglishMajors = 0;
      for (Student s : pupils) {
         if (s.getMajor().equals("English")) {
            numberOfEnglishMajors++;
         }
      }
      System.out.println("The number of English majors is " + numberOfEnglishMajors);  
      
      // what is the average gpa of all the Business majors?
      int numberOfBusinessMajor = 0;
      double sumOfGPAs = 0.0;
      for (Student s : pupils) {
         if (s.getMajor().equals("Business")) {
            numberOfBusinessMajor++;
            sumOfGPAs = sumOfGPAs + s.getGPA();
         }                    
      }
      System.out.println("The average GPA of the business majors is " + (sumOfGPAs / numberOfBusinessMajor));
      
      // who has the highest GPA, and what town are they from?
      double highGPA = 0.0;
      Student studentWithHighGPA = null;
      for (Student s : pupils) {
         if (s.getGPA() > highGPA) {
            highGPA = s.getGPA();
            studentWithHighGPA = s;
         }
      }
      System.out.println("The student with the highest GPA is " + studentWithHighGPA.getName() 
                         + " with a GPA of " + highGPA
                         + " whose hometown is " + studentWithHighGPA.getHome());
                         
   }
}