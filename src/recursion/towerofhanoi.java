package recursion;

public class towerofhanoi {

	public static void toh(int n, String src, String dest, String help) {
		if (n == 0) {
			return;
		}
		toh(n - 1, src, help, dest);
		System.out.println("move " + n + " st disk from " + src + " to " + dest);
		toh(n - 1, help, dest, src);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		toh(n, "src", "dest", "helper");

	}

}
