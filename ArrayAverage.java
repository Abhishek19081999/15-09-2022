//Compute the average value of an array of integers except the largest and smallest values. 

package com.aray.bll;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		int num[]=new int[5];		//declaration and instantiation of array
		
		System.out.println("Enter "+num.length + " numbers");
		for(int i=0;i<num.length;i++) {		//initialization using loop
			num[i]=scanner.nextInt();
		}
		
			
		int flag=0;
		
		for(int i=0;i<num.length;i++)	//traversing array from start to end
		{
			
			for(int j=i+1;j<num.length;j++) 		//traversing array from i+1 element for comparing 2 string
			{
				if(num[i]>num[j]) 	//comparison
				{	//swapping
					flag=num[i];
					num[i]=num[j];
					num[j]=flag;
			    }
	       	}
		}
		int sum=0;
		double average=0;
		for(int i=0;i<num.length;i++) //traversing the array from start to end
		{
			sum+=num[i];	//sum of all the elements of array
		}
		
		/*computing average by removal of 1st and last element of the array
		as we have already sorted the array
		*/
		
		average=(double)((sum-num[0])-num[num.length-1])/(num.length-2);
		System.out.println("Average except the largest and smallest values : "+average);
		scanner.close();
	}
}
