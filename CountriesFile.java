// Aaron Carbonell
// 22 - 11 - 2021
import java.io.*;                                           // a program that will continuously ask the user for a country code
import java.util.ArrayList;                                 // and then show the country name for that code
import javax.swing.JOptionPane;                             // will stop once the user types in the value of STOP as the code
import java.util.Scanner;

public class CountriesFile {
	private static final String STOP = "EXIT";
	
	public static void main(String[] args ) throws FileNotFoundException, IOException {
		ArrayList<Country> countries = getCountriesListFromFile("Countries.csv");
		String code = "";
		while (!code.equals(STOP)) {
			code = getCountryCode();
			String name = findCountryName(countries, code);
			if (!code.equals(STOP)) showCountryName(name);			
		}
	}

	private static void showCountryName(String name) {
                                                      // JOptionPane.showMessageDialog() to show the country name
      System.out.println(name);
                                                      //  JOptionPane.showMessageDialog(null, name);
	}

	private static String getCountryCode() {                                                             // prompt the user to enter the 2 character country code from the keyboard
                                                                                                        // use can use either Scanner Or JOptionPane.showInputDialog() to get input
      Scanner input = new Scanner(System.in);
 		System.out.println("Enter 2 capitalized character Country code: ");                               // String code = JOptionPane.showInputDialog("Enter 2 capitalized character country code(EXIT to stop)");
      String code = input.nextLine(); 
      return code; 
	}

	private static String findCountryName(ArrayList<Country> countries, String code) {
             for(int i=0;i<countries.size();i++) {                                       // find the Country object in the list of countries (the 1st arg)
                  Country country=countries.get(i);                                      // whose code property has the same value as code (the 2nd arg)
                  if(country.getCode().equals(code)) {                                   // and return the name property of that object
                      return country.getName();                                          // if no object found for the code, return "Code not found"
		            }
             }
      return "Code not found";
	}

	private static ArrayList<Country> getCountriesListFromFile(String filename) throws FileNotFoundException, IOException {
       ArrayList<Country> countries = new ArrayList<>();                                                                   // open the file with the name filename
       BufferedReader br = new BufferedReader(new FileReader(filename));                                                   // read each line of the file 
       String line = "";                                                                                                   // each line has two items separated by a comma - a code, and a name
       String splitBy = ",";                                                                                               // split the line up into the code and name
       while ((line = br.readLine()) != null) {                                                                            // construct a Country object from the code and name
            String[] data = line.split(splitBy);                                                                           // put the Country object into an ArrayList<Country>
            Country country = new Country(data[0], data[1]);                                                               // return the ArrayList
		      countries.add(country);
       }
      return countries;
	}
}