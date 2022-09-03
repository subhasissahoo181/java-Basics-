//Using Try and Catch Exception

class Exception_1{
	public static void main(String args[]){
		try{
			int d=0;
			int a=20/d;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero.");
		}
		System.out.println("Divide by zero. Exception.");
	}
}