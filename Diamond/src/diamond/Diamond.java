package diamond;

public class Diamond {

    public static void main(String[] args) {
        new Diamond().diamond_Print();
    }
    /**
     * print a diamond pattern in screen
     * pretty dividing line123
     */
    public void diamond_Print() {
        int i; // rows
        int j; // cols        

	for (j=1; j<=5; j++)
	{
            for (i=1; i<=8-j; i++)
                System.out.print(" ");

            for (i=1; i<=2*j-1; i++)
               System.out.print("*");

               System.out.print("\n");
	}

	for (j=6; j>=1; j--)
	{
	    for (i=1; i<=8-j; i++)
		System.out.print(" ");

            for (i=1; i<=2*j-1; i++)
                System.out.print("*");

                System.out.print("\n");
	}
    }
    
}
