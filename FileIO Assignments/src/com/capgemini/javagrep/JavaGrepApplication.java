package com.capgemini.javagrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaGrepApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Enter the name of the file (Hint: Enter TestFile.txt to test the text file present in the project)");

		String path = br.readLine();
//		String path = "TestFile.txt";
		int occurenceCount = 0;
		int lineCount = 0;
		String line = null;
		// creating a file object with the file path specified
		File file = new File(path);

		// checking whether the file exists or the path is a directory
		if (!file.exists() || !file.isFile()) {
			System.out.println("File not found, or the file may be a directory");
			System.exit(1);
		}

		System.out.println("Enter the word to be searched");
		String element = br.readLine();

		// file reader object with the file object
		FileReader fr = new FileReader(file);

		// Buffered Reader to read the lines of the files
		BufferedReader reader = new BufferedReader(fr);

		//logic to find the word by iterating through every line of the document
		do {
			line = reader.readLine();
			if (line == null)
				break;
			lineCount++;

			if (line.contains(element)) {
				System.out.println("Found At Line Number " + lineCount + "\nThe line is :- " + line);
				occurenceCount++;
			}
		} while (line != null);
		if (occurenceCount == 0)
				System.out.println("The word was not found in the document");
			reader.close();

	}

}
