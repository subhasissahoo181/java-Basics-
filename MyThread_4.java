//getName(), setName(String) and getId() method

class MyThread extends Thread{
	public void run(){
		System.out.println("Inside Thread:"+this.getName());
		System.out.println("Inside Thread:"+this.getId());
	}
}
class MyThread_4{
	public static void main(String args[]){
		MyThread t1=new MyThread();
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Id of Thread:"+t1.getId());
		t1.setName("Subhasis");
		t1.start();
		System.out.println("After setting the name of t1:"+t1.getName());
		
	}
	
}