// Filename: Exam Question 3
// Wirtten by Aaron Carbonell
// Written on Dec 15 2021
public class Names {
	
	// write a method here called isName, which when used in the main method of this class, produces the output in the comment before the main method
   public class isName(String word) {
      Scanner sc = new Scanner(System.in);
      String word = sc.nextLine; 
      
      if (word = "crazy") { 
         System.out.println("crazy is not a name");
      }else{
         return word;
      }
   }

	// the output of main() should be "crazy is not a name"
	// do not modify the main() method!
	public static void main(String[] args) {
		String word = "crazy";
		boolean goodName = isName(word);
		if (goodName) {
			System.out.println(word + " is a name");
		} else {
			System.out.println(word + " is not a name");		
		}	
	}

}
