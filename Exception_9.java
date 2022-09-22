//java Nested try block...
class Exception_9{
	public static void main(String args[]){
		System.out.println("Try block-1");
		try{
			//inside of try block-1
			//System.out.println("Try block-2");
			try{
				int a=100/0;
				System.out.println("Inside the tryblock-2");
			}
			//System.out.println("Catch block-2");
			catch(ArithmeticException e){
				System.out.println("ArithmeticException");
			}
			//System.out.println("Tryblock-3");
			try{
				int a[]=new int [100];
				//System.out.println("Inside the tryblock-2"+a[10]=20);
				a[100]=20;
			}
			//System.out.println("Catch block-3");
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException");
			}
		}
		//System.out.println("Catch Block 1");
		catch(Exception e){
			System.out.println("ParentNode");
		}
	}
}