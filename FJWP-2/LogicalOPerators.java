package rithesh;

public class LOgicalOPerators {

	public static void main(String[] args) {
		int a = 1;
        int b = 2;

        boolean result = a < b && a == 1; // true
        System.out.println(a <= 4 && a == b); // false
        System.out.println(result);

        System.out.println(a < 5 || b == 5); // true
        System.out.println(a == b || b != 2); // false

        System.out.println(!true); // false
        System.out.println(!(1 < 2)); // false
	}

}
