package datatypes;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		short sh = 32767;
		int i = 1000000000;

		// this is done because literals have default value of int type
		long l = 10000000000L;

//		error because by default decimal literals are of type double
//		float f = 5.5;  and double cant be stored in float
		float f = 5.5f; // explicit conversion

		i = (int) f; // explicitly converting float type to int
//      i will store value before decimal

		boolean bol = true;

		char ch = 990;
		System.out.println(ch);

//		below gives error because ch +2 might get out of range of ch 
//		ch = ch + 2;
		ch = (char) (ch + 90000);
		System.out.println(ch);

		System.out.println(10 + 20 + "hello" + 10 + 20);
		System.out.println(10 + ' ' + 20);
		System.out.println("hello" + '\t' + "world");
		System.out.println("hello" + "\t" + "world");
	}

}
