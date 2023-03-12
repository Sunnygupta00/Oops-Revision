package oops;
// HIDING UNECCESARY INFORMATION AND SHOWING ONLY IMP PARTS is called as abstraction
// we implement this using abstract class and interference

//ABSRACT CLASS
// 1) we can't create the instance of abstract class
// 2) can create constructors
// 3) it can contain abstract/ non abstract- methods

 abstract class Abstract{
	 Abstract(){
		 System.out.println("constructor..");
	 }
	 
	 // abstract method
	 abstract void laugh();
	 // non-abstract method
	 void hello() {
		 System.out.println("hll");
	 }
 }
 class D extends Abstract{
	 void laugh() {
		 System.out.println("lol");
	 }
	 @Override
	 void hello() {
		 System.out.println("wtf");
	 }
 }


public class O7_Abstraction {

	public static void main(String[] args) {
		///  Abstract a = new Abstract();  --> we can't create it

	}

}
