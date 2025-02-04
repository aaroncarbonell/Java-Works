// Written by Aaron Carbonell
// Written on 15 Sept 2021
// Filename: QuartsToGallons.java
import java.util.Scanner;
public class QuartsToGallons 
{
    public static void main(String[] args) 
    {
        //constant
        final int QUARTS_IN_GALLON = 4;

        //variables
        int quartsNeeded = 18;
        int gallonsNeeded;
        int leftoverQuarts;
        
        //Scanner input
        Scanner input = new Scanner(System.in);

        //Scanner output - User suggested input = 18
        System.out.println("Enter number of quarts needed:");
        quartsNeeded = input.nextInt();
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        leftoverQuarts = quartsNeeded % QUARTS_IN_GALLON;
        
        //Display output 
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + leftoverQuarts + " quarts.");
    }
}
