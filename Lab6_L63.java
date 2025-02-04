public class Lab6_L63 { 
        public static int biggestoddnum = 31;

public static void main(String[] args) {
    for (int i=1; i<biggestoddnum; i += 2)
    {
        for (int k=0; k < ((biggestoddnum / 2) - i / 2); k++)
        {
            System.out.print(" ");
        }
        for (int j=0; j<i; j++)
        {
            System.out.print("T");
        }
        System.out.println("");
    }
}
}

