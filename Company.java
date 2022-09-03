//Write a program Relaed Producer And Consumer

class Company{
	int n;
	synchronized public void produce_item(int n){
		this.n=n;
		System.out.println("Produced: "+this.n);
		
	}
 synchronized public int consume_item(){
		System.out.println("Consumed: "+this.n);
		return this.n;
	}
}

class Producer extends Thread{
	Company c;
	Produced(Company c){
		this.c=c;
	}
	public void run(){
		int i=1;
		while(true){
			this.c.produce_item(i);
			try{
				Thread.sleep(1000);
			}
			cache(Exception e){
				
			}
			i++;
		}
	}
}

class Consumer extends Thread{
	Company=c;
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