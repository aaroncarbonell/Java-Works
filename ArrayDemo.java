class ArrayDemo {
   public static void main(String[] args) {
      final int NUM_NUMBERS = 5;
      int[] numbers = {10, 20, 30, 40, 50, 60};
      //int[] numbers = new numbers[10];
      numbers[2] = 99;
      System.out.println("Numbers[2]: " + numbers[2]);
      System.out.println("The number of items in numbers is : " + numbers);
      // for (int i = 0, i<5 , i++) {
      for (int i = 0, i<numbers.length , i++) {
      System.out.println("Numbers[" + i + "] = " + numbers[i]);
      }
      for ( int num : numbers) {
         System.out.println("*** " + num);
   }
}
