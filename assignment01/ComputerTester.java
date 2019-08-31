package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
		Computer file1 = new Computer("Microsoft", "Spazor", 32, 500, true, 699.99);
        	System.out.println(file1); // T
		Computer file2 = new Computer("Apple", "Oog", 9, 1110, false, 509.99);
        	System.out.println(file2); // F
		Computer file3 = new Computer("Origin", "Chronos", 16, 2000, true, 1699.99);
        	System.out.println(file3); // T
		Computer file4 = new Computer("MSI", "GL63", 16, 300, false, 3999.99);
        	System.out.println(file4); // F

	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			Computer file12 = new Computer("Microsoft", "Spazor", 32, 500, true, 699.99);
        		output.println(file12); // T
			Computer file22 = new Computer("Apple", "Oog", 9, 1110, false, 509.99);
        		output.println(file22); // F
			Computer file32 = new Computer("Origin", "Chronos", 16, 2000, true, 1699.99);
        		output.println(file32); // T
			Computer file42 = new Computer("MSI", "GL63", 16, 300, false, 3999.99);
        		output.println(file42); // F
	
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
