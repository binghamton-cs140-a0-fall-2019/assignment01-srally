package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person Guy1 = new Person("Kyle", "Burger", "647329843", new DateAndPlaceOfBirth(2000, 3, 5, "Miami", "Florida", "United States"), new StreetUSAddress("40-13 Merry Lane", "", "Miami", "FL", "96054"));
		
		ComputerOwner compOwner = new ComputerOwner(Guy1);
		Computer file1 = new Computer("Microsoft", "Spazor", 32, 500, true, 699.99);
		Computer file2 = new Computer("Apple", "Oog", 9, 1110, false, 509.99);
		Computer file3 = new Computer("Origin", "Chronos", 16, 2000, true, 1699.99);
		Computer file4 = new Computer("MSI", "GL63", 16, 300, false, 3999.99);

		compOwner.addComputer(file1);
		compOwner.addComputer(file2);
		compOwner.addComputer(file3);
		compOwner.addComputer(file4);
		System.out.println(compOwner);
		
		compOwner.removeComputer(2);
		compOwner.removeComputer(2);
		System.out.println(compOwner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		
		Person Guy12 = new Person("Kyle", "Burger", "647329843", new DateAndPlaceOfBirth(2000, 3, 5, "Miami", "Florida", "United States"), new StreetUSAddress("40-13 Merry Lane", "", "Miami", "FL", "96054"));
		
		ComputerOwner compOwner2 = new ComputerOwner(Guy1);
		Computer file12 = new Computer("Microsoft", "Spazor", 32, 500, true, 699.99);
		Computer file22 = new Computer("Apple", "Oog", 9, 1110, false, 509.99);
		Computer file32 = new Computer("Origin", "Chronos", 16, 2000, true, 1699.99);
		Computer file42 = new Computer("MSI", "GL63", 16, 300, false, 3999.99);

		compOwner2.addComputer(file12);
		compOwner2.addComputer(file22);
		compOwner2.addComputer(file32);
		compOwner2.addComputer(file42);
		System.out.println(compOwner2);
		
		compOwner2.removeComputer(2);
		compOwner2.removeComputer(2);
		System.out.println(compOwner2);





		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

