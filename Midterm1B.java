// Filename: Exam Question 6
// Wirtten by Aaron Carbonell
// Written on Oct 20 2021
public class Midterm1B {
public static void printPizzaMenu() {
/* print a menu that looks like:
 * 1) Small pie - $11.00
 * 2) Medium pie - $15.00
 * 3) Large pie - $18.00
 */
 
   System.out.println("1) Small pie   - $11.00");
   System.out.println("2) Medium pie - $15.00");
   System.out.println("3) Lagre pie  - $18.00");
}
 
}
public static int getPizzaSelection() {
   Scanner sc = new Scanner(System.in);
   int pieSize = 0;
   while (pieSize == 0) {
      
      System.out.print("select a size (either 1, 2, or 3) ... ");
      pieSize = sc.nextInt();
      if (pieSize < 1 || pieSize > 3) { 
         System.out.println("Size must be 1, 2, or 3 !!!\n\n");
         printTrainFares();
         pieSize = 0;
         
// Ask the user to select a small, medium, or large pie (1, 2, or 3)
// return the selection to the calling program
// You do NOT have to validate the user selection
// this line must be modified!
}
public static void printToppingsMenu() {
   System.out.println("1) Small pie   - $11.00");
   System.out.println("2) Medium pie - $15.00");
   System.out.println("3) Lagre pie  - $18.00");


/* print a menu that looks like:
 * 0) Plain - Free
 * 1) Anchovies - $1.00
 * 2) Garlic - $0.75
 * 3) Mushrooms - $0.60
 */

public static int getToppingsSelection() {
// Ask the user to select one of plain, anchovies, garlic, or mushrooms (0, 1, 2, or 3)
// return the selection to the calling program
// You do NOT have to validate the user selection
 // this line must be modified!
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the toppings > ");
   selection = sc.NextInt();
   
   double toppings = 0.0;
   if (selection == 0) { 
      toppings = 0;
   } else if (selection == 1) { 
      toppings = 1.00;
   } else if (selection == 2) { 
      toppings = 0.75;
   } else if (selection == 3) { 
      toppings = 0.60;
 
}

return toppings;
}

public static void printBill(int pizzaSelection, int toppings) {
// find the cost of the pie with the toppings
// print the cost of the pie
// print the cost of the toppings
// print the cost of the pie with the toppings
}
public static void main(String[] args) {
printPizzaMenu();
int pizza = getPizzaSelection();
printToppingsMenu();
int toppings = getToppingsSelection();
printBill(pizza, toppings);
}
}