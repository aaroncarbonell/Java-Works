// Aaron Carbonell
// Written on Dec 5 
// Lab 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FormattingHomework {
	private String region;
	private double sales2019;
	private double sales2020;
	private double sales2021;
	
	private static final String[] columnHeaders = {"Region", "2019", "2020", "2021"};
	private static List<FormattingHomework> data = new ArrayList<FormattingHomework>();

	public FormattingHomework(String region, double sales2019, double sales2020, double sales2021) {
		super();
		this.region = region;
		this.sales2019 = sales2019;
		this.sales2020 = sales2020;
		this.sales2021 = sales2021;
	}

	public String getRegion() {	return region; }
	public double getSales2019() { return sales2019; }
	public double getSales2020() { return sales2020; }
	public double getSales2021() { return sales2021; }
	
	public static void printData() {
		for (String header : columnHeaders) {
			System.out.print(String.format("%10s", header));
		}
		System.out.println();
		for (FormattingHomework line : data) {
			System.out.println(String.format("%10s %9.2f %9.2f %9.2f",line.getRegion(),line.getSales2019(),line.getSales2020(),line.getSales2021()));  
		}
	}
	
	public static void main(String[] args) {
		data.add(new FormattingHomework("Northeast", 34562.34, 45671.23, 56712.34));
		data.add(new FormattingHomework("Northwest", 43561.7822, 47345.9695, 52987.8427));
		data.add(new FormattingHomework("Southeast", 12454.00, 23651.73, 47312.99));
		data.add(new FormattingHomework("Southwest", 115798.27, 124597.43, 148361.54));
		printData();
		LocalDate today = LocalDate.now();
      DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE MMMM dd, YYYY");

      System.out.println("Produced on " + dateFormat.format(today));
	}

}
