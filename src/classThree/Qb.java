package classThree;

public class Qb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for(; n<Integer.MAX_VALUE; n++){
			if(((int)Math.pow(4, n)+ (int)Math.pow(7, n) + (int)Math.pow(20, n)) % 31 == 0){
				System.out.println(n);
			}
		}
	}

}
