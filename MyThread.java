//Thread_1.java
// Creating our thread using Runnable Interface.
class MyThread implements Runnable{
	public void run(){
		//The task code..
		for(int i=0; i<=10; i++){
			System.out.println("The value of i is"+i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		}
	}
	public static void main(String args[]){
		MyThread t = new MyThread();
		Thread th = new Thread(t);
		th.start();
		MyThread_2 t2 = new MyThread_2();
		t2.start();
	}
}