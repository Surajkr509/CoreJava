//Constructor->it is block of code similar to method.It is called when instance of class or object is created.
//When an object is create using new keyword at least one constructor is called.
//It calls a default constructor if there is no constructor available in the class.
//Constructor name must be same as its class name
//It must have no direct return type.
public class Bike {
	int id;
	String name;
	Bike (){
//		id=i;
//		name=n;
		System.out.println("Bike");
		
	}
	public void disp() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Bike b=new Bike();
		b.disp();
	}
	
}
