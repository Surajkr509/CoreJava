/**
 * External class
 * */
public class Feb0422 {
	
	public static void main(String[] args) {
		Feb0422 feb422 = new Feb0422();
		Feb0422.Feb0422a feb422a = feb422.new Feb0422a();
		feb422a.printHere();
		feb422.printHere();
	}

	public void printHere() {
		System.out.println("Printing from the external method");
	}
	
	/**
	 * Internal or Nested class
	 * */
	class Feb0422a{
		
		public void printHere() {
			System.out.println("Printing from the internal method");
		}
		
	}
	
}