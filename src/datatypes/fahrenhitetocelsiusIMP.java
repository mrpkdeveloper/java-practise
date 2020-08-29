package datatypes;

public class fahrenhitetocelsiusIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, f;
		for (f = 0; f <= 300; f += 20) {
			c = (int) (5 / 9f * (f - 32));
			System.out.println(f + "\t" + c);
		}
	}

}
