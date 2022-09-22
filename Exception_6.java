import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Exception_6{
	public static void main(String args[]){
		PrintWriter pw;
		try{
			pw=new PrintWriter("Hello.txt");
			pw.println("saved");
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("End catch");
	}
}