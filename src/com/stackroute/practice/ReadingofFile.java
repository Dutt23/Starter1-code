package com.stackroute.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingofFile  {
	
	

	 public static boolean readFile() throws IOException{
		
		String str = "";
	    try {
	    	Path wiki_path = Paths.get( "/home/shatayki/javaworkspace/Agile/src/com/stackroute/practice","test.txt" );
	        Charset charset = Charset.forName("ISO-8859-1");
	      List<String> lines = Files.readAllLines(wiki_path, charset);

	      for (String line : lines) {
	         str = str + line+"\n";
	      }
	    } 
	    
	    catch (IOException e) {
	      System.out.println(e);
	    }
	    catch (NullPointerException e) {
	    	System.out.println("Null String");
	    }
System.out.println(str);
String str1 = convertUppercase(str);
int a =length(str);
System.out.println("String is "+str1+"length is " +a);
return false;
	}
		     
  
	public static String convertUppercase(String s) {
		
		String string2 = s.toUpperCase();
	    return string2;
  }
public static int length(String s) {
		if(s == null) {
			System.out.println("Null string");
		}
		int a = s.length();
        return a ;   
}
}
