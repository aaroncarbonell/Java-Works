// put the class CollegeInfo into its own file, then modify the methods getGPA(), numStudentsFromTown(), printHonorRole(), mathStudentWithHighestGPA() to give the correct results


public class CollegeInfo {

	College college = new College();
	Student[] students = college.getStudents();
	
	// use a loop to find the gpa of the student with name the same as the input arg
	public double getGPA(String name) {
        int count = 0;
        for (Student s : students) { 
            if (s.getname().equals(name)) {
                return s.getgpa();
            }
        }
		return 0.0;
	}
	
	// use a loop to count all the students whose hometown is the same as town
	public int numStudentsFromTown (String town) {
		int count = 0;
        
        for (Student s : students) { 
            if (s.gethometown().equals(town)){
                count++;
            }
        }
		return count;
	}
	
	// use a loop to print all the students whose gpa is bigger than minGPA
	public void printHonorRole(double minGPA) {
        for (Student s : students) {
            if (s.getgpa() > minGPA) {
                System.out.println(s.getname());
            }
        }
	}
	
	// use a loop to find the student who is majoring in math with the highest GPA
	public String mathStudentWithHighestGPA() {
        for (Student s : students) { 
            if (s.getmajor().equals("Math")) { 
                if (s.getgpa() > highGPA) { 
                    highGPA = s.getgpa();
                    highStudent = s.getname();
                }
            }
        }
		return highStudent + " has the high GPA of " + highGPA;
	}
	
	public static void main (String[] args) {
		CollegeInfo info = new CollegeInfo();
		System.out.println("Jayden's gpa is " + info.getGPA("JAYDEN"));
		System.out.println("The number of students from Bergenfield is " + info.numStudentsFromTown("Bergenfield"));
		System.out.println("The students with a GPA greater than 3.90 are:");
		info.printHonorRole(3.9);
		System.out.println("The math student with the highest GPA is " + info.mathStudentWithHighestGPA());
	}
}

