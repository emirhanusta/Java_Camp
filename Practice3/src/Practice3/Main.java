package Practice3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
//		System.out.println("fwefew");

		try {

		    BufferedReader file = new BufferedReader(new FileReader("dist/deneme.java"));
		    String line;
		    String input = ""; // will be equal to the text content of the file

		    while ((line = file.readLine()) != null) 
		        input += line + '\n';

		    System.out.print(input); // print out the content of the file to the console
		    System.out.println(input.length());
		} catch (Exception e) {System.out.print("Problem reading the file.");}
	}
	
}
