package strings;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int num = 121; boolean flag = false; for (int i = 2; i <= num / 2; i++) { //
		 * condition for nonprime number if (num % i == 0) { flag = true; break; } }
		 * 
		 * if (!flag) System.out.println(num + " is a prime number."); else
		 * System.out.println(num + " is not a prime number."); 
		 */
		
		//System.out.println("This is prime number: "+ isPrimeNum(21));
		
		for(int i = 1; i<50; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i + " : is a prime number");
			} else {
				System.out.println(i + " : is not a prime number");
			}
		}
	}
	public static boolean isPrimeNum(Integer num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}


}
