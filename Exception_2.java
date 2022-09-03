//Function throw an exception 

class ThrowException{
	void fun(){
		try{
			System.out.println("Inside Function");
			throw new RuntimeException("Divide by Zero");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
	}
	
}
class Exception_2{
	//Nesting of try block.....
	public static void main(String args[]){
		try{
			ThrowException ob = new ThrowException();
			ob.fun();
		}
		catch(RuntimeException e){
			System.out.println("Divide by Zero........."+e);
		}
	}
}