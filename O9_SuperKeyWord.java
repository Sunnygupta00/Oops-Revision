package oops;



class x{
    String name;
    x(String name){
    	this.name = name;
    }
    void sayHello() {
    	System.out.println("hii");
    }
}
class y extends x{
	String Address;
	y(String Address, String name){
		super(name);
//		super.sayHello();
//		super.name = "hero";  --> accessing the parent variable
		this.Address= Address;
	}
	void details() {
		System.out.println(Address+" "+ name);
	}
}


public class O9_SuperKeyWord {

	public static void main(String[] args) {

		y a = new y("kanchan bagh", "ragahv");
		a.details();
	}

}
