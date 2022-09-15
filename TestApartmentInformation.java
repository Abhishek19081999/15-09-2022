package com.aray.bll;

public class TestApartmentInformation {
	public static void main(String args[])
	{
		ApartmentInformation ap= new ApartmentInformation("Abhishek Kumar"); //making an object 
		//setting apartments with their slot
		ap.setApartment("Gulmohar Apartment,101",0);
		ap.setApartment("Vinandini Villa,207",1);
		ap.setApartment("Krishna Enclave,007",2);
		ap.setApartment("Anandi Heights,669",3);
		ap.setApartment("Ranchi Heights,089",4);
		//
		System.out.println(ap);//will show the toString output which was information of all the apartments
		
		System.out.println("********************");
		// getting the number of apartments the owner owns
		System.out.println(ap.getOwner()+" has " +ap.countApartments()+" apartments"); 
		//getting the information of apartment according to their slots
		System.out.println("Apartment 3 : " + ap.getApartment(2));
		
		System.out.println("*********************");
		ap.reorganizeApartments(); //reorganization of apartments
		
		System.out.println(ap); 
		
		
	}

}
