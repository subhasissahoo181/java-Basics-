//Thread 
class Mythread extends Thread{
	public void run(){
		for(int i=1; i<4; i++){
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Mythread:"+i);
		}
	}
}
class MyThread_3{
	public static void main(String args[]){
		Mythread th1 = new Mythread();
		th1.start();
		try{
			th1.join();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}