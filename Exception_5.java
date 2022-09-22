//Exception ArrayIndexOutOfBoundsException

public class Exception_5{
	public static void main(String args[]){
		try{
			int arr[]={1,2,3,4,5};
			System.out.println("arr is"+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("End Catch");
	}
}