package excption;


public class TryCatchFinl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test());
	

	}

	private static String test() {
		
		try {
			//String str = "hi hi";
			String str = null;
			System.out.println(str.split(" "));
			return "try";
			
		} catch (NullPointerException e) {
			System.out.println("cattchhhh");
			System.out.println(e.getMessage());
			return "catchhhh";
		}
		finally {
			return "finaly";
			//System.out.println("finallyyy");
		}
		
		// TODO Auto-generated method stub
		
	}

}
