package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

	Person Guy1 = new Person("Jack", "Bridges", "839203745", new DateAndPlaceOfBirth(1980, 8, 7, "Seattle", "Washington", "United States"), new StreetUSAddress("55-32 Collar Street", "", "Seattle", "WA", "65749"));
	Person Guy2 = new Person("Jose", "Hernandez", "647384902", new DateAndPlaceOfBirth(1989, 2, 1, "Dallas", "Texas", "United States"), new StreetUSAddress("24-42 Jackson Avenue", "", "Dallas", "TX", "45385"));
	Person Guy3 = new Person("Elvis", "Alien", "746583902", new DateAndPlaceOfBirth(2018, 2, 6, "New York City", "New York", "United States"), new StreetUSAddress("30-28 Main Street", "", "New York City", "NY", "90237"));
	Person Guy4 = new Person("Jess", "Rex", "454637281", new DateAndPlaceOfBirth(1999, 1, 7, "Rochester", "New York", "United States"), new StreetUSAddress("45-45 Hydian Way", "", "Rochester", "NY", "96057"));
	System.out.println(Guy1);
	System.out.println(Guy2);
	System.out.println(Guy3);
	System.out.println(Guy4);
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
	DateAndPlaceOfBirth[] DOB2 = new DateAndPlaceOfBirth[6];
	DOB2[1] = new DateAndPlaceOfBirth(1980, 8, 7, "Seattle", "Washington", "United States");
	DOB2[2] = new DateAndPlaceOfBirth(1989, 2, 1, "Dallas", "Texas", "United States");
	DOB2[3] = new DateAndPlaceOfBirth(2018, 2, 6, "New York City", "New York", "United States");
	DOB2[4] = new DateAndPlaceOfBirth(1999, 1, 7, "Rochester", "New York", "United States");
	StreetUSAddress[] Add2 = new StreetUSAddress[5];
	Add2[1] = new StreetUSAddress("55-32 Collar Street", "", "Seattle", "WA", "65749");
	Add2[2] = new StreetUSAddress("24-42 Jackson Avenue", "", "Dallas", "TX", "45385");
	Add2[3] = new StreetUSAddress("30-28 Main Street", "", "New York City", "NY", "90237");
	Add2[4] = new StreetUSAddress("45-45 Hydian Way", "", "Rochester", "NY", "96057");
	Person Guy12 = new Person("Jack", "Bridges", "839203745", DOB2[1], Add2[1]);
	Person Guy22 = new Person("Jose", "Hernandez", "647384902", DOB2[2], Add2[2]);
	Person Guy32 = new Person("Elvis", "Alien", "746583902", DOB2[3], Add2[3]);
	Person Guy42 = new Person("Jess", "Rex", "454637281", DOB2[4], Add2[4]);
	output.println(Guy12);
	output.println(Guy22);
	output.println(Guy32);
	output.println(Guy42);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

