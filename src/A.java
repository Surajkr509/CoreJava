import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		  int i=1;
		  System.out.println("Enter the number");
		  Scanner s = new Scanner (System.in);
		  int n1 = s.nextInt();
		 
		   for(i=1;i<=n1;i++) 
			{
			   //System.out.println();
		    if (i%3==0)
		   System.out.println("Hello");
		    else
		    	System.out.println(" " +i);
		     if (i%5==0)
				System.out.println("World");
		     if (i%3==0 && i%5==0)
					System.out.println("Suraj");
			}	
	}
	

}