//Throw keyword...
public class Exception_12{
	//function to check if person is eligible to vote or not
	public static void validate(int age){
		if(age<18){
			//throw ArithmeticException
			throw new ArithmeticException("Person is not eligiable for vote");
		}
		else{
			System.out.println("Person is eligible to vote.");
		}
		//
	}
	public static void main(String args[]){
		validate(12);;
	}
}