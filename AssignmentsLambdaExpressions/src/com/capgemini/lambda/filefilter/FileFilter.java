package com.capgemini.lambda.filefilter;

import java.io.File;

public class FileFilter {

	public static void main(String[] args) {
		
		File file=new File("MyFolder");
		
		File listOfFolder[]=file.listFiles((fileElement)->{return fileElement.isDirectory();});
		
		for(File eachFile: listOfFolder)
		{
			System.out.println(eachFile.getName());
		}
		
	}

}
