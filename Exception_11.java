//Finally block in java...
public class Exception_11{
	public static void main(String args[]){
		System.out.println("Try block");
		try{
			System.out.println("Inside the try block");
			int a=20/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("Finally block");
		}
	}
}