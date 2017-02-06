package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] list = new int[]{
				3,2,1,4,10,6
		};
		System.out.println(Arrays.toString(list));
		Sorting s = new Sorting();
		s.quickSort2(list, 0, list.length-1);
		System.out.println(Arrays.toString(list));
	}

}
