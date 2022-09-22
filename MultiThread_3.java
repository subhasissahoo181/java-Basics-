//Using the thread class: 

public class MultiThread_3{
	//main method
	public static void main(String args[]){
		//creating an object of the Thread class using the constructor Thread (String name)
		Thread t=new Thread("My Thread...");
		//the start() method moves the thread to the active state.
		t.start()
	}
}