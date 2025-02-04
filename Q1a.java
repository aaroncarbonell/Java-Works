import javax.swing.JOptionPane;
public class Q1a
{
   public static void main(String[] args) {
      String input = JOptionPane.showInputDialog(null, "Enter a number: ");
      int number = Integer.parseInt(input);
      int plus2 = number + 2;
      JOptionPane.showMessageDialog(null, (number + "plus 2 is " + plus2));
   }
}