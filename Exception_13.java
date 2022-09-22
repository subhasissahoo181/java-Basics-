//Throwing Checked Exception...

import java.io.*;
public class Exception_13{
	//function to check if person is eligible to vote or not
	public static void method() throws FileNotFoundException{
		
		FileReader file = new FileReader("C:\\users\\subha\\OneDrive\\Desktop\\internship\\JAVA(Assignment)\\hello.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		throw new FileNotFoundException();
	}
	public static void main(String args[]){
		try{
			method();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}