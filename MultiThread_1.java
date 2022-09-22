//Java Thread Example by extending Thread class...
class MultiThread_1 extends Thread{
	public void run(){
		System.out.println("Thread is running...");
	}
	public static void main(String args[]){
		MultiThread_1 ob = new MultiThread_1();
		ob.start();
	}
}