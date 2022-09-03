//Write a program Relaed Producer And Consumer

class Company{
	int n;
	boolean f=false;
	//f=false: chance: producer
	//f=true: chance : Consumer
	synchronized public void produce_item(int n){
		if(f){
			wait();
		}
		this.n=n;
		System.out.println("Produced: "+this.n);
		f=true;
		notify();
		
	}
 synchronized public int consume_item(){
	 if(!f){
		 wait();
	 }
		System.out.println("Consumed: "+this.n);
		f=false;
		notify();
		return this.n;
	}
}

class Producer extends Thread{
	Company c;
	Producer(Company c){
		this.c=c;
	}
	public void run(){
		int i=1;
		while(true){
			this.c.produce_item(i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
			i++;
		}
	}
}

class Consumer extends Thread{
	Company c;
	Consumer(Company c){
		this.c=c;
	}
	public void run(){
		while(true){
			this.c.consume_item();
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
			
		}
	}
}

class CompanyDriver{
	public static void main(String ags[]){
		Company c = new Company();
		Producer ps = new Producer(c);
		Consumer cs = new Consumer(c);
	}
}