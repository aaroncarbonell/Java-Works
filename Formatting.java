
public class Formatting {

	public static double starterPrice = 7.49;
	public static double mainPrice = 18.30;
	public static double desertPrice = 4.;
	public static double taxRate = 0.07;
	public static double tipRate = 0.15;
	
	public static void printItemAndPrice(String item, double price) {
		System.out.format("%8s %7.2f %n",item, price);
	}
	
	public static void main(String[] args) {
		System.out.println("BCC restaurant lunch bill");
		System.out.println("-------------------------");
		
		printItemAndPrice("Starter", starterPrice);
		printItemAndPrice("Main", mainPrice);
		printItemAndPrice("Desert", desertPrice);
		System.out.println("-------------------------");
		
		double mealPrice = starterPrice + mainPrice + desertPrice;
		printItemAndPrice("Food", mealPrice);
		
		double tax = taxRate * mealPrice;
		printItemAndPrice("Tax", tax);
		
		double subtotal = mealPrice + tax;
		printItemAndPrice("Subtotal", subtotal);
		
		double tip = subtotal * tipRate;
		printItemAndPrice("Tip", tip);
		
		double total = subtotal + tip;
		printItemAndPrice("Total", total);
	}

}