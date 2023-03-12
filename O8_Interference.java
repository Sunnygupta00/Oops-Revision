package oops;
// INTERFERENCE IS BASICALLY A BLUE PRINT OF CLASS
// 1) IT IS USED TO ACHIVE TOTAL ABSTRACTION
// 2) ALL METHODS ARE PUBLIC & ABSTRACT
// 3) variable are static public $ final

interface a{
	public void hello();
}
class E implements a{
	public void hello() {
		System.out.println("i am in E");
	}
}

public class O8_Interference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        E a = new E();
        a.hello();
	}

}

