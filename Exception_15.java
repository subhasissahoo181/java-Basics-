class Exception_15{
	void m(){
		int data = 50/0;
	}
	void n(){
	m();
	}
	void p(){
	try{
		n();
		}
	catch(Exception e){
		System.out.println("Exception handeled.");
	}
	}
	public static void main(){
	Exception_15 ob = new Exception_15();
	ob.p();
	System.out.println("Exception end.");
	}
	
}	

	
	




