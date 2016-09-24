package classThree;

public class Qb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 0;
		for(; n<Integer.MAX_VALUE; n++){
			if(((long)Math.pow(4, n)+ (long)Math.pow(7, n) + (long)Math.pow(20, n)) % 31 == 0){
				System.out.println(n);
			}
		}
	}

}
