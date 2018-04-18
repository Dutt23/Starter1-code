package com.stackroute.practice;

import java.util.Scanner;

public class ReverseandPalindrome {

public static String reserveInput(Object obj) {
	String str4 = " ";
	if(obj == null)
	{
		System.out.println("Object is null");
	}
	
	
String str1 = obj.toString();
String str2 = reverse(str1);
System.out.println(str2);
checkPalindrome(str2,str1);
return str2;
}


	
public static void checkPalindrome(String a,String b) {
	if(a.equals(b)) {
		System.out.println("Is a plaindrome");
	} 	
	
	else
	System.out.println("Not a palindrome");
	
	
}

public static String reverse(String str) {
	String s ;
	char[] str1 = str.toCharArray();
	char[] str2 = new char[str.length()];
	int i,j=0;
	for(i=str.length()-1;i>=0;i--) {
		str2[j] = str1[i];
		j++;
	}
    s = new String(str2);
	return s;
}

}
