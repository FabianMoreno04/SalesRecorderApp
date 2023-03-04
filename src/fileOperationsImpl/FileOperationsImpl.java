package fileOperationsImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationsImpl {
	
	public void write(String path, Object object) {
		File file = new File(path);
		
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.append(object.toString()).append("\n");
			printWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
