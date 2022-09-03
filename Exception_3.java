//Throws Exception Example...........

import java.io.*;
class ThrowsException{
	void fun()throws IOException{
		throw new IOException();
	}
	
}
class Exception_3{
	public static void main(String args[]){
		ThrowsException ob = new ThrowsException();
		try{
			ob.fun();
		}
		catch(IOException e){
			System.out.println("Handle IOException");
		}
		System.out.println("Smooth execution");
	}
}