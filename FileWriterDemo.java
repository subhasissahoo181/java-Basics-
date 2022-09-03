import java.io.File;
import java.io.FileWriter;
import java.io.IoException;

public class FileWriterDemo{
	
	public static void main(String args[]){
		FileWriterDemo fileWriterDemo = new FileWriterDemo();
		File bikeInfoFile = new File(pathname:);
	}
	
	private void writeToFile(File fileToWriteTo) throws IoException{
		FileWriter bikeInfoWriter = new FileWriter(fileToWriteTo);
		bikeInfoWriter.write(str: "Ducati");
		bikeInfoWriter.flush();
		bikeInfoWriter.close();
	}
}