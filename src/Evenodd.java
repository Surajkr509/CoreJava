import java.util.Scanner;

//import java.util.Scanner;
//
//public class Evenodd {
//
//	public  int product(int a,int b) {
//		return a*b;
//	}
//	
//	public  int sum(int a,int b) {
//		return 2*(a*b);
//	}
//	public  int sum(int a) {
//		return 3*(a+1);
//	}
//	
//	public static void main(String[] args) {
//	System.out.print("Enter the number");
//		Scanner s=new Scanner(System.in);
//	int i=s.nextInt();
//	int j=s.nextInt();
//	Evenodd task = new Evenodd();
//	
//	if (i>j) 
//		System.out.println(task.product(i,j));
//	else if (i<j)
//			System.out.println(task.sum(i,j));
//	else 
//	       System.out.println(task.sum(i));
//	}
//
//  }
public class Evenodd {

	
	public  String product(int a , String b) {
		return b;
	}
	public static void main(String[] args) {
	System.out.print("Enter the number");
		Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	Evenodd task = new Evenodd();
	
	if (i%2==0) 
		System.out.println(task.product(i,"Suraj"));
		else
			System.out.println(task.product(i,"Akash"));
			
	
	}

  }
