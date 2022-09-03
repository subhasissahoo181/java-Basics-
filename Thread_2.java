//Set method & Get method using java
class Thread_2{
	public static void main(String args[]){
		System.out.println("Start Thread");
		//Object 
		Thread t = Thread.currentThread();
		//getName()
		String GetTh = t.getName();
		System.out.println("Current Running method is "+GetTh);
		//SetName()
		String SetTh = t.getName();
		t.setName("Set Method Hear.");
		System.out.println("After Setname() the String is: "+t.getName());
		
		System.out.println("End Thread.");
	}
}