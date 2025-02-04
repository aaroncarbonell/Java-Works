// put the class Student in its own file, and then don't touch it

class Student {
   private String name;
   private int id;
   private String major;
   private double gpa;
   private String hometown;
   
   public Student(String name, int id, String major, double gpa, String hometown) {
       this.name = name;
       this.id =id;
       this.major = major;
       this.gpa = gpa;
       this.hometown = hometown;
   }
  
   public String getname()  { return name; }
   public int    getid()    { return id; }
   public String getmajor() { return major; }
   public double getgpa()   { return gpa; }
   public String gethometown() { return hometown; }
}