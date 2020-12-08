import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class SampleBufferedWriter {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Makoto\\eclipse-workspace\\sample\\test.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
	        
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
	    		bw.write(file.getName());
	    		bw.close();
	    		fw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
