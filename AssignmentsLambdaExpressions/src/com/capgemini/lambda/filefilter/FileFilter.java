package com.capgemini.lambda.filefilter;

import java.io.File;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FileFilter {

	public static void main(String[] args) {
		
		File file=new File("MyFolder");
		
		File listOfFolder[]=file.listFiles((fileElement)->{return fileElement.isDirectory();});
		
		for(File eachFile: listOfFolder)
		{
			System.out.println(eachFile.getName());
		}
		
//		File file=new File("MyFolder");
//		
//		Predicate<File> filter = (fileElement)->fileElement.isDirectory();
//		ArrayList<File> listOfFolder = null;
//		
//		listOfFolder.stream().filter(filter).forEach(System.out::println);
	}

}
