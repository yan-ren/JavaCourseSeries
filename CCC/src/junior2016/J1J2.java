package junior2016;

import java.util.Scanner;

public class J1J2 {
	public static void main(String[] args){
		System.out.println(q1());
		int[][] input = new int[][]{
			{16, 3, 2, 13},
			{5, 10, 11, 8},
			{9, 6, 7, 12},
			{4, 15, 14, 1}
		};
		
		q2(input);
	}
	
	public static String q2(int[][] input){
		int compare = 0;
		for(int i = 0; i < input.length; i++){
			int sum = 0;
			for(int j = 0; j<input[i].length; j++){
				sum = input[i][j] + sum;
			}
			if(i == 0){
				compare = sum;
			}
			if(compare != sum){
				return "not magic";
			}
		}
		return "magic";
	}

	public static int q1(){
		Scanner sc = new Scanner(System.in);
		int counter = 6;
		int win = 0;
		while(counter >=1 ){
			String input = sc.nextLine().toUpperCase();
			if(input.contains("W")){
				win++;
			}
			counter--;
		}
		if(win >= 5){
			return 1;
		}
		if(win >= 3){
			return 2;
		}
		if(win >= 1){
			return 3;
		}
		return -1;	
	}
}
