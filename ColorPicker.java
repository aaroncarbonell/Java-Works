// Filename: Exam Question 2
// Wirtten by Aaron Carbonell
// Written on Dec 15 2021
public class ColorPicker {
	public static void main (String[] args) {
		String[] colors = {"Red", "White", "Blue", "Black", "Green", "Cyan", "Yellow", "Magenta"};
		
		// print out the number of colors in the array called colors
		// do not use any digits in your code
      
      System.out.println("the number of colors in the array are " + colors.length);

		
		// print out the fifth element of the array
		// you must use array indexing in your code
		
      System.out.println("the fifth element of the arra is " + colors[4]);


		// print out all the elements of the array, one per line
		// you must use a loop in your code
      
      for (int i = 0; i < colors.length; i++) {
      
      System.out.println(colors[i]);
      
		}
		// print out all the elements of the array that begin with the letter 'B'
		// you must use a loop in your code
      
      
      for (String color : colors) { 
          if(color.startsWith("S")) { 
            System.out.println(colors);
          }
      }
	}
	
}