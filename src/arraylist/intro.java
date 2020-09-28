package arraylist;

import java.util.ArrayList;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.remove(0);
	}

}
