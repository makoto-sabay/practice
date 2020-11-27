package csv;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * 
 * 
 * @author Makoto
 */
public class TestCreateCSV {
	public static void main(String[] args) {
		File students = new File("C:\\Users\\Makoto\\eclipse-workspace\\sample\\students2.csv");
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		String newline = null;
		
		File result = new File("C:\\Users\\Makoto\\eclipse-workspace\\sample\\result.csv");
		FileWriter fw = null;
		BufferedWriter bw = null;
	
		try {
			fr = new FileReader(students);
			br = new BufferedReader(fr);
			
			if(!result.exists()) {
				result.createNewFile();
			}
			fw = new FileWriter(result.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			
			bw.write(br.readLine()+",Grade\n");		// Write Column Header
			
			while ((line = br.readLine()) != null) {
			   	newline = geCSVtNewLine(line);		// Create New CSV Line
			   	bw.write(newline);					// Write New CSV Line
			}
			
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/**
	 * Get CSV New Line
	 * 
	 * @param line
	 * @return
	 */
	private static String geCSVtNewLine(String line) {
		String[] array = line.split(",");
		int score = Integer.parseInt(array[2]);
		String grade = getGrade(score);
		String newline = createNewCSVLine(array, grade);
		return newline;
	}
	
	/**
	 * Get Student's Grade
	 * 
	 * @param score
	 * @return
	 */
	private static String getGrade(int score) {
		String grade = null;
		
		if (score >= 90) {
			grade = "A";
		}
		else if (score < 90 && score >= 75) {
			grade = "B";
		}
		else if (score < 75 && score >= 60) {
			grade = "C";
		}
		else if (score < 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		return grade;
	}
	
	/**
	 * Create New CSV Line
	 * 
	 * @param array
	 * @param grade
	 * @return
	 */
	private static String createNewCSVLine(String[] array, String grade) {
		String newline = "";
		
		for(String value: array) {
			newline += value + ",";
		}
		newline += grade;
		newline += "\n";
		
		return newline;
	}
}
