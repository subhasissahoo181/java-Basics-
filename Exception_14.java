//Throw User-defind  Exception...
class UserDefinedException extends Exception{
		
		public UserDefinedException(String str){
			//Calling constructor of parent Exception
			super(str);
		}
		
	}
class Exception_14{
	public static void main(String args[]){
		try{
			//throw an object of user defined exception
			throw new UserDefinedException("This is user-defined exception.");
		}
		catch(UserDefinedException ude){
			System.out.println("Caugh the exception.");
			//Print the message from MyException object.
			System.out.println(ude.getMessage());
		}
	}
	
}