//Thread_1.java

class MyThread implements Runnable{
	public void run(){
		//The code..
		for(int i=0; i<=10; i++){
			System.out.println("The value of i is"+i);
		}
	}
	public static void main(String args[]){
		MyThread t = new MyThread();
		Thread th = new Thread(t);
		th.start();
	}
}