public class Groceries {
	
	public static void main(String[] args) {
		final double taxRate = 0.07;
		String items[] = {"Broccoli", "Kale", "Durritos"};
		double[] prices = {3.485, 5.4, 4.05};
		double subtotal = 0.0;
		for (int i=0; i < items.length; i++) {
			System.out.println(items[i] + " " + prices[i]);
			subtotal += prices[i];
		}
		System.out.println("-------- -------- " );
		System.out.println("Subtotal " + subtotal );
		double tax = subtotal * taxRate;
		double grandTotal = subtotal + tax;
		System.out.println("Tax      " + tax);
		System.out.println("Total    " + grandTotal);
	}
}