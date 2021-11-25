package com.lab3.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class FileReader{
	public void displayFileData(String path) {
		try {
		File file = new File(path);						//C:\\Users\\jeffe\\Documents\\work\\sampleDemo.txt
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String line;
		int wordCount=0;
		int characterCount=0;
		int lineCount=0;
		
		while((line = br.readLine()) != null) {
			if(line.equals("")) {
				
			}else {
				characterCount += line.length();
				String words[] = line.split("\\s+");
				wordCount += words.length;
				String sentence[] = line.split("[!?.:]");
				lineCount += sentence.length;
			}
		}
		if(lineCount>=1) {
			
		}
		System.out.println("Total word count: " +wordCount);
		System.out.println("Total no of lines: " +lineCount);
		System.out.println("Total no of characters: " +characterCount); 	
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Unable to read");
		}
	}
}

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader();
		System.out.println("Enter the file path: ");
		String path = sc.nextLine();
		fr.displayFileData(path);
	}

}
