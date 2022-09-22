public class Exception_4{
	public static void main(String args[]){
		int i=50;
		int j=0;
		int data;
		try{
			data=i/j;
		}
		catch(ArithmeticException e){
			System.out.print(i/(j+2));
		}
		
	}
}