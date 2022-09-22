class Exception_8{
	public static void main(String args[]){
		try{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException e");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		catch(Exception e){
			System.out.println("Exception e");
		}
		System.out.println("End code");
	}
}