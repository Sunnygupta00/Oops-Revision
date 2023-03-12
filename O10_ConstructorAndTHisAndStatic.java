package oops;
// this is used to refer current object
class temp{
	temp(){
		this(4);
	}
	temp(int x){
		this(4,5);
		System.out.println(x);
	}
	temp(int x, int y){
		System.out.println(x+" "+y);
	}
	
}

// Static Keyword
// static keyword is used to share Method or variable of a class
class employee{
	static private int salary;
	int getSalary() {
		return salary;
	}
	void setSalary(int newSalary) {
		salary = newSalary;
	}
}
public class O10_ConstructorAndTHisAndStatic {

	public static void main(String[] args) {
//		temp a = new temp();
		employee a = new employee();
		a.setSalary(4000); // through this all salary will be same
		employee b = new employee();
		System.out.println(b.getSalary());
   
	}

}
