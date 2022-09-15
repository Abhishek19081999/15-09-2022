//Sorting of numeric data
package com.aray.bll;

import java.util.Scanner;

public class NumSort {
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		int num[]=new int[5]; 		//declaration and instantiation of array
		
		System.out.println("Enter "+num.length + " numbers"); 
		for(int i=0;i<num.length;i++) {         //initialization using loop
			num[i]=scanner.nextInt();
		}
		
			
		int flag=0;
		
		for(int i=0;i<num.length;i++)    //traversing the array from start to end 
		{
			
			for(int j=i+1;j<num.length;j++) 	//traversing from i+1 position for comparing 2 elements
			{
				if(num[i]>num[j])      //comparing elements
				{    // swapping
					flag=num[i];
					num[i]=num[j];
					num[j]=flag;
			    }
	       	}
		System.out.println(num[i]); //printing sorted array
		}
		scanner.close();
	}

}
