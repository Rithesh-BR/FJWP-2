package rithesh;

public class UnaryOperators {

	public static void main(String[] args) {
		//Increament
		//Post
//		int x=5;
//		int y= x++;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		//Pre
//		int a=5;
//		int b=++a;
//		System.out.println("A: "+a);
//		System.out.println("B: "+b);
		
		
//		//Decreament
//		int c=5;
//		int d= c--;
//		System.out.println("C: "+c);
//		System.out.println("D: "+d);
//		//Pre
//		int e=5;
//		int f=--e;
//		System.out.println("E: "+e);
//		System.out.println("F: "+f);
		
		
//		int x = 5;
//		int y = x++ + ++x + ++x + x++;
//		System.out.println("x "+x);
//		System.out.println("y "+y);
		
		int x = 5;
		int y = x++ + --x + x-- + x++ + x-- - ++x;
		System.out.println("x "+x);
		System.out.println("y "+y);
	}

}
