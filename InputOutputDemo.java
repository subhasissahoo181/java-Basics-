
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutputDemo{
	public static void main(String args[]){
		File employeeInfoFile = new File( "C:\\Users\\subha\\OneDrive\\Desktop\\employeeInfoFile.txt");
		InputOutputDemo demo=new InputOutputDemo();
		demo.writeToFile(employeeInfoFile);
	}
	public void writeToFile(File fileToWrite){
		PrintWriter employeeInfoWriter=null;
		try{
			employeeInfoWriter=new PrintWriter(fileToWrite);
			employeeInfoWriter.println("Subhasis");
			employeeInfoWriter.println("100");
		}
		catch(FileNotFoundException e){
			System.out.println("Given file was not found on the local disk"+fileToWrite.getName());
			throw new RuntimeException(e);
		}
		finally{
			employeeInfoWriter.close();
		}
	}
}