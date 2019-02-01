import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile {
	public static void main(String[] args) {
		File file = new File("input.csv");
		try {
			Scanner s = new Scanner(file);

			int n = Integer.parseInt(s.next());
			while(s.hasNext()) {
				String line = s.next();
				problem(line);
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void problem(String line) {
		//TODO: Fill this out
	}

	public static String[] separate(String stringToSeparate) {
		return stringToSeparate.split(",");
	}
}
