package oops;

// CONSTRUCTOR IS BASICALLY A METHOD WHICH IS CALLED DURING THE CREATION OF OBJECT
// CONSTURCTOR ARE BASSICALLY OF THREE TYPES :
// 1. PARAMETERISED CONSTURCTOR
// 2. NON-PARAMETERISED CONSTRUCTOR
// 3. COPY- CONSTRUCTOR
public class O4_constructor {
	
  public static void main(String[] args) {
	cons a = new cons();
	cons b = new cons(5);
	cons c = new cons(b);
	b.arr[0]= 1;
	b.arr[1]= 2;
	b.arr[2] = 3;
	c.arr[2] = 4;
	for(int i:b.arr) {
		System.out.println(i);
	}

}

}

class cons{
	String value;
	int arr[];
	cons(){
//		System.out.println("parameterConstructor");
	}
	// NOTE : IF WE CREATE A NON-PARAMETER CONSTURCTOR THEN WE SHOULD CREATE THE DEFAULT ONE
	cons(int x){
		arr = new int[3];
		value = String.valueOf(x);
//		System.out.println(" non parameterisedConstructor");
	}
	// COPY constructor(shallow)
	cons(cons c){
		this.value = c.value;
	    arr = new int[5];
		this.arr = c.arr;
	}
	// COPY CONSTRUCTOR (deep)
//	cons(cons c){
//	    this.value = c.value;
//	    arr = new int[3];
//	     for(int i=0;i<3;i++) {
//	    	 this.arr[i] = c.arr[i];
//	     }
//	}

}


