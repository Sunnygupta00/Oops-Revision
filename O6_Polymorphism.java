package oops;
// POLYMORPHISM MEANS HAVING MANY FORMS
// POLYMORPHISM IS OF TWO TYPES
// 1) RUNTIME POLYMORPHISM (METHOD OVERRIDING..)
// -> same function but different definition
// 2) COMPILE TIME POLYMORPHISM  (METHOD OVERLOADING..)
// -> same name but different parameter
public class O6_Polymorphism {

	public static void main(String[] args) {
		Parent a = new Parent();
		a.call();
		child c = new child();
		c.call();

	}

}

// COMPILE TIME
class Parent{
	void call() {
		System.out.println("I am in parent");
		
	}
	int sum(int a, int b) {
		return a+b;
	}
	double sum (double a, int b) {
		return a+b;
	}
}
// RUN TIME
class child extends Parent{
	@Override
	void call() {
		System.out.println("I am in child");
	}
}
