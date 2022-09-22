//Nested Try catch Exception...
public class Exception_10{
	public static void main(String args[]){
		//First Try blok
		try{
			//Second try block
			try{
				//third try block
				try{
					int a[]={1,2,3,4};
					System.out.println(a[10]);
				}
				//third catch block
				catch(ArithmeticException e){
					System.out.println("ArithmeticException");
				}
			}
			//Second catch block
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			
		}
		//First Catch block
		catch(Exception e){
			System.out.println("Exception e");
		}
	}
}