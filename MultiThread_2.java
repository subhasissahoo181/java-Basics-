//java Thread Example by implementing Runnable interrface...

class MultiThread_2 implements Runnable{
	public void run(){
		System.out.println("Thread is Running...");
	}
	public static void main(String args[]){
		MultiThread_2 ob = new MultiThread_2();
		Thread t1 = new Thread(ob);
		t1.start();
	}
}