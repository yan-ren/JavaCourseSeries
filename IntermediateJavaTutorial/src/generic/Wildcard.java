package generic;

import java.util.Arrays;
import java.util.List;

public class Wildcard {

	public static void main(String[] args) {

	}

	public static void exp1() {
		// Upper Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// printing the sum of elements in list
		System.out.println("Total sum is:" + sum(list1));

		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

		// printing the sum of elements in list
		System.out.print("Total sum is:" + sum(list2));
	}

	public static void exp2() {
		// Lower Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list1);

		// Number list
		List<Number> list2 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list2);
	}

	// upper bound
	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		// restriced from adding
		// list.add(2);

		return sum;
	}

//	private static <T> double sum1(List<T> list)  
//    { 
//        double sum=0.0; 
//        for (T i: list) 
//        { 	
//            sum += ((Number) i).doubleValue(); 
//        } 
//        // restriced from adding
//        //list.add(2);
//  
//        return sum; 
//    } 

	// lower bound
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
		list.add(2);
		System.out.println(list);
	}

	private static void printlist(List<?> list) {
		System.out.println(list);
	}
}

class GenericType<T> {

}
