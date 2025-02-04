// Filename: Exam Question 5
// Wirtten by Aaron Carbonell
// Written on Dec 15 2021
public UnitedStates() {	}

	public static State[] getStates() {	return states; }
	
	// you must use a loop and an if block to receive credit for this answer
	// return the name of the capital city in the state whose code is stateCode
	public static String getCapital (String stateCode) {
		return "Trenton"; // not correct!
	}
	
	// you must use a loop and an if block to receive credit for this answer
	// return the state with the biggest population
	public static String mostPopulousState() {
		return "NJ"; // not correct!
	}
	
	// you must use a loop to receive credit for this answer
	// return the average population of all the 50 states
	public static double averagePopulation() {
      for (states s : State) { 
         average(getPopulation());
      } 
		return 0.0;
	}
	
	// do not modify the main() method!
	public static void main(String[] args) {
		System.out.println("The capital of Texas is " + getCapital("TX"));
		System.out.println("The state with the most people is " + mostPopulousState());
		System.out.println("The average population of all the states in the US is " + averagePopulation());
	}
}
