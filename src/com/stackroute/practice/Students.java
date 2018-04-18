package com.stackroute.practice;

import java.util.Scanner;

public class Students {


static boolean checkInput(int n ) {
	return false;
}

static boolean enterStudentDetails(int n ) {
	int [] num = new int[n];
	for(int i = 0;i<n;i++) {
		System.out.println("Enter grade for student"+(+i+1));
	    num[i] = i;
	    
	}
	if(num != null) {
		return false;
	}
return false;	
}
static boolean checkGrades(int[] n ) {
	return false;
}
static int findAverage(int[] a) {

	int n = a.length;
	float sum = 0;
	for(int i = 0;i<n;i++)
	{
		sum = sum + a[i];
	}
	
return (int)sum;	
}
static int findMax(int[] n ) {
	int tempValue=n[0];
	
	for(int i=0;i<n.length;i++){
        if(n[i]>tempValue){
            tempValue=n[i];
        }
	
	
}
	return tempValue;
}
static int findMin(int[] n ) {
	int tempValue=n[0];
	
	for(int i=0;i<n.length;i++){
        if(n[i]<tempValue){
            tempValue=n[i];
        }
	
	
}
	return tempValue;
}

}
