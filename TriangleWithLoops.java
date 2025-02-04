
public class TrianglesWithLoops {
	public static void main (String[] args) {
// This logic will generate the triangle for given dimension
        int dim = 10;
        for (int i = 0; i < dim; i++) {
            for (int k = i; k < dim; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                //if (i != dim - 1)
                //  if (j == 0 || j == i)
                //      System.out.print("*");
                //  else
                //      System.out.print(" ");
                //else
                    System.out.print("T");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

