// Filename: Exam Question 4
// Wirtten by Aaron Carbonell
// Written on Dec 15 2021
public class DinnerOut {

	// put DinnerOut properties here - appetizer, main, dessert, cost
	private static String appetizer;
   private static String main;
   private static String dessert; 
   private static String cost;
	// put a constructor for DinnerOut here
   public DinnerOut (String appetizer, String main, String dessert, String cost) {
      this.appetizer = appetizer;
      this.main = main;
      this.dessert = dessert;
      this.cost = cost;
	}
	// put getter methods here
   public String getAppetizer() { return appetizer; }
   public String getMain() { return main; }
   public String getDessert() { return dessert; }
   public String getCost() { return cost; }
	
	// do not modify the main() method!
	public static void main(String[] args) {
		DinnerOut diner       = new DinnerOut("Soup", "Gyro platter", "Cheesecake", 35.50);
		DinnerOut fireplace   = new DinnerOut("Onion rings", "Cheeseburger", "Twinkie", 14.55);
		
		System.out.println(diner.getAppetizer());
		System.out.println(fireplace.getMain());
		System.out.println(diner.getDessert());
		System.out.println(fireplace.getCost());
	}	

}