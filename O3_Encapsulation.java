package oops;
public class O3_Encapsulation {
   public static void main(String[] args) {
	Square sq = new Square(5);
	System.out.println(sq.area());
	System.out.println(sq.perameter());
}
}
//wrapping up of data in a single unit

class Square{
	 int side;
	 
	 Square(int x){
		 side = x;
	 }
	 public int area() {
		 return side*side;
	 }
	 public int perameter() {
		 return 4*side;
	 }
}
