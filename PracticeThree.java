public class PracticeThree {
         public static void printTrainFares() {
         /* print a schedule of train fares to the following NJ destinations
         * 1) Newark - $7.50
         * 2) Paterson - $3.50
         * 3) Hoboken - $5.00
         */
         
         System.out.println(" Welcome to NJ Transit !!!");
         System.out.println(" 3) Newark - $7.50");
         System.out.println(" 3) Paterson - $3.50");
         System.out.println(" 3) Hoboken - $5.00");
         
         }
         public static int getDestination() {
         // ask the user to select a destination (either 1, 2, or 3)
         // and return the destination number of a ticket
         // if the selection is invalid, inform the user,
         // then print the train schedule again, and
         // ask for the destination again
         // repeat as necessary
         return 0; // must modify this line!
         }
         public static double getFare(int destination) {
         // return the fare for the selected destination
         // you cannot use System.out.println here
         double fare = 0.0;
         if (destination == 1) {
         
            fare = 7.50;
         
         } else if (destination == 2) {
         
            fare = 3.50;
            
         } else if (destination == 3) { 
         
            fare = 5.00;
         }
         return fare; // must modify this line!
         }
   public static void main(String args[]) {
   // print the train fares
   printTrainFares();
   // ask the user for a destination
   int dest = getDestination();
  
   // get and print the fare for the destination
   System.out.println("Your fare is " + getFare(getDestination()));
   }
   }