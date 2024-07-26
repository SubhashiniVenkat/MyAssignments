package week1.day2;

import java.util.Arrays;

public class ArraysIntersection {

	public static void main(String[] args) 
	{
		  int[] a = {3,2,11,4,6,7}; //2,3,4,6,7,11
		 
          int[] b = {1,2,8,4,9,7}; //1,2,4,7,8,9 => 2,4,7
          
          int length1 = a.length;
          int length2 = b.length;
          
          System.out.println("The length of array a is:"+length1);

          System.out.println("The length of array b is:"+length2);
                     
    	  Arrays.sort(a);
    	  Arrays.sort(b);
    	  
          for(int i=0;i<length1; i++)
          {
        	  for(int j=0; j<length2; j++)
        	  {
        	if(a[i]==b[j])
        	{
        		System.out.println("Matching element found: " + "a=" + a[i]+" , "+"b=" + b[j]);
        	}
        		  
        	  }
          }

	}

}
