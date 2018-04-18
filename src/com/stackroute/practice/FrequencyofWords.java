package com.stackroute.practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FrequencyofWords {

public static boolean readFile(String path) throws IOException{
		
		String str = "";
	    try {
	    	Path wiki_path = Paths.get( path,"test.txt" );
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
return false;
}

static boolean letterFrequency(String str) {
	
	char [] c = str.toCharArray();
    

return false;
}


}
