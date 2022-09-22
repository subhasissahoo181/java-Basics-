//Abstract Class in java....
abstract class Bank{
	abstract int getRateOfIntrest();
}
class SBI extends Bank{
	int getRateOfIntrest(){
		return 10;
	}
}

class HDFC extends Bank{
	int getRateOfIntrest(){
		return 15;
	}
}

class Abstraction_1{
	public static void main (String args[]){
		Bank ob1 =new SBI();
		Bank ob2 = new HDFC();
		//int data = ob.getRateOfIntrest();
		System.out.println(ob1.getRateOfIntrest());
		System.out.println(ob2.getRateOfIntrest());
	}
}