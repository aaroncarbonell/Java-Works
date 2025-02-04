class Classroom {
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

      System.out.println(teachers[2]);
      
      // gpa > 2.5 
      for ( Student stu : pupils) { 
         if (stu.getGPA() > 2.5){
         System.out.println(stu.getName());
         }
      }
      // majors == English 
      int numberOfEnglishMajors = 0;
      for (Student stu: pupils) { 
         if(stu.getMajor() == "English") {
         numberOfEnglishMajors++;
        }
      }
      System.out.println("Num of english majors: " + numberOfEnglishMajors);
      
      // avg  of all Business majors 
      
      int numOfBusinessMajors = 0;
      double sumofGPA = 0.0;
      for (Student stu : pupils) { 
         if(stu.getMajor() == "Business") {
         numOfBusinessMajors++;
         sumofGPA += stu.getGPA();
         
      }
      }                    
      System.out.println("the Avg gpa of all business majors is " + (sumofGPA / numOfBusinessMajors));
      
      // highest gpa & what town
      
      double highGPA = 0.0;
      Student highStudent = null;
      for (Student stu : pupils) { 
         if (stu.getGPA() > highGPA) {
         highGPA = stu.getGPA();
         highStudent = stu;
         }
      }
      
      System.out.println(highStudent.getName() + " has the highest GPA of " + highGPA + " and lives in " + highStudent.getHome());

   }  
}