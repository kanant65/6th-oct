package com.file_handling_test.com;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	
    public static void main(String [ ] args) throws FileNotFoundException {
        new LongestWord().findLongestWords();
   }
    	
    	//method to find longest word
		public String findLongestWords() throws FileNotFoundException {
		 
		 String longest_word = "";
		 String current;
		 Scanner sc = new Scanner(new File("D:\\words.txt")); //importing file
		
		
		 while (sc.hasNext()) {
		    current = sc.next();
		     if (current.length() > longest_word.length()) {
		       longest_word = current;
		     }
		
		 }
		   System.out.println("\n"+longest_word+"\n");		//printing longest word
		      return longest_word;
		      }
	

}