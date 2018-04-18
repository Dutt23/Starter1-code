package com.stackroute.practice;

public class Factorial {



	static boolean findFactorial32bit(int limit){
		int i,fact=1;  
	  //It is the number to calculate factorial    
	  for(i=1;i<=limit;i++){    
	      fact=fact*i;    
	      if (fact < Integer.MAX_VALUE && fact > Integer.MIN_VALUE&&fact>0)
	      {}
	      else {
	    	  //System.out.println("Number is out of range");
	          //findFactorial64bit(i,fact,limit);
	    	  break;
	      
	      }
	      
	  }    
	   return false;
	} 

static boolean findFactorial64bit(int limit) {
	
	long k = Long.MAX_VALUE;
	long fact1 = 1;
	for(int i=1;i<=limit;i++){    
	      fact1=fact1*i;    
	      if (fact1 < k && fact1>0)
	      
	    	  System.out.println("Factorial of "+i+" is: "+fact1);   
	      
	      else {
	    	  System.out.println("Number is out of range");
	          break;}
	      
	  }
	return true;
}
}
