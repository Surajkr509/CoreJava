import java.util.Scanner;

public class TaskI {

	public int product(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		TaskI task = new TaskI();
		
		if(num % 2 == 0)
			System.out.println(task.product(num, 10));
		else
			System.out.println(task.product(num, num));
	}
	
}
