import java.util.Scanner;
public class Lab6_L64 { 
        public static void main (String[] args) {
	//  --- simple example of while 	
	//int number = 1;
        //while (number < 5 ) {
        //  System.out.println(number);
	//  number = number + 1;

	// -- Hello Lab Exercise using while loop
	//int number = 1;
	//while ( number < 45 ) {
	//  System.out.println("Hello");
	//  number++;

	// --- Sum of numbers from 1 to 1000 using while 
	//int sum = 0;
	//int number =1; 
	//while (number <= 1000) { 
	//sum += number;
	//number++;
	//}
	//System.out.println("The sum of the numbers from 1 to 1000 is " + sum);
	
	// --- Tickets Lab pre code --> Dairy Barn  
/*
	Scanner input = new Scanner(System.in);
	int flavor = 0;
	while ( flavor != 1 && flavor != 2) {
	System.out.println("Welcome to the Dairy Barn");
	System.out.println("1 - Vanilla ");
	System.out.println("2 - Chocolate ");
	flavor = input.nextInt();

	if (flavor == 1) {
		System.out.println("Your Vanilla cone will be right out");
	} else if ( flavor == 2) {
		System.out.println("Your Chocolate cone will be right out");
	} else {
		System.out.println("We only offer vanilla or chocolate");
	    }	
	}
    }
}
*/
    	// --- Tickets Lab part 4 
	Scanner input = new Scanner(System.in);
	int ticket = 0;
	while ( ticket != 1 && ticket != 2 && ticket != 3) {
	System.out.println("Movie tickets");
	System.out.println("1) Adult - $10 ");
	System.out.println("2) Child - $5");
	System.out.println("3) Senior - $6 ");
	ticket = input.nextInt();

	if (ticket == 1) {
		System.out.println("Ticket for Adult is $10");
	} else if ( ticket == 2) {
		System.out.println("Ticket for Child is $5");
	} else if ( ticket == 3) {
		System.out.println("Ticket for Senior is $6");
	} else {
		System.out.println("Tickets only sell for Adult - $10, Child - $5, Senior - $6");
	    }	
	}
    }
}
