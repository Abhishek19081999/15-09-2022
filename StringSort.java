//sorting of string
package com.aray.bll;

import java.util.Scanner;

public class StringSort {
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		String name[]=new String[5];  	//declaration and instantiation of array
		
		System.out.println("Enter "+name.length + " names");
		for(int i=0;i<name.length;i++) {		//initialization using loop
			name[i]=scanner.next();
		}
			
		for(int i=0;i<name.length;i++)	//traversing array from start to end		
			{
			for(int j=i+1;j<name.length;j++)  	//traversing array from i+1 element for comparing 2 string
			{
				if(name[i].compareTo(name[j])>0)	//comparison
				{	//swapping
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		
		for(int i=0;i<name.length;i++)
		{  	// printing the sorted array
			System.out.println(name[i]);
		}
		
	scanner.close();	
	}

}
