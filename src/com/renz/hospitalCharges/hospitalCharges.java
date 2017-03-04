package com.renz.hospitalCharges;
import java.util.Scanner;
public class hospitalCharges {
	
	public static void main(String[] args){

		System.out.println("Welcome to Let's Calculate your Charges .");
		
		calculateCharges();
	}
	
		 public static void calculateCharges(){
			 Scanner in = new Scanner(System.in);
			 String overnight , patient = "Yes"; 
			 int ptNo = 0;
			 
		
			
			 	while(patient.equalsIgnoreCase("yes")|| patient.equalsIgnoreCase("y")){
				 //add patient number by 1
				 ptNo+=1;
				 // Ask the user if he will stay overnight
				 System.out.print("Are you staying overnight?: [Yes/No]");
				 overnight = in.next();
				 System.out.println();
				 double overnightCharge, medicationCharge, labServiceCharge ;
				 	
				 	// If user's Answer is not Yes or No 
				 	while(!overnight.equalsIgnoreCase("yes") && !overnight.equalsIgnoreCase("y") && 
				 			!overnight.equalsIgnoreCase("no") && !overnight.equalsIgnoreCase("n") ){
				 		System.out.print("Invalid choices ,Please type [Yes/No]");
				 		overnight = in.next();
				 		//add extra space if valid input
				 		if (overnight.equalsIgnoreCase("yes")|| overnight.equalsIgnoreCase("y")  || 
				 				overnight.equalsIgnoreCase("no") ||overnight.equalsIgnoreCase("n") ){
				 			System.out.println();
				 		}
				 	}
				 	
				 	//if the user Staying for overnight the ask the following input :
				 	if (overnight.equalsIgnoreCase("yes") ||  overnight.equalsIgnoreCase("y")){
				 		System.out.println("Enter the following Charges for Patient "+ptNo);
				 		System.out.print("Overnight:");
				 		overnightCharge = in.nextDouble();
				 		System.out.print("Medication:");
				 		medicationCharge = in.nextDouble();
				 		System.out.print("Lab Service Charge:");
				 		labServiceCharge = in.nextDouble();
				 		//call the calculate and display function
				 		calculateAndDisplay(overnightCharge, medicationCharge ,labServiceCharge);
				 	}
				 	//Else if the patient is not staying overnight the only ask for the following :
				 	else{
				 		System.out.println("Enter the following Charges for Patient "+ptNo);
				 		System.out.print("Medication:");
				 		medicationCharge = in.nextDouble();
				 		System.out.print("Lab Service Charge:");
				 		labServiceCharge = in.nextDouble();
				 		//call the calculate and display function
				 		calculateAndDisplay(0, medicationCharge ,labServiceCharge);
				 	}
				 	//ask the user if he/she wants to calculate another patient total charges .
				 	System.out.println();
				 	System.out.println("Do you want to calculate for the other patient?");
				 	patient = in.next();
				 	System.out.println();
				 	
					// If user's Answer is not Yes or No 
				 	while(!patient.equalsIgnoreCase("yes") && !patient.equalsIgnoreCase("y")  &&
				 			 !patient.equalsIgnoreCase("no") &&!patient.equalsIgnoreCase("n")){
				 		System.out.print("Invalid choices ,Please type [Yes/No]");
				 		patient = in.next();
				 		//add extra space if valid input
				 		if ( patient.equalsIgnoreCase("yes") ||  patient.equalsIgnoreCase("y") || 
				 				 patient.equalsIgnoreCase("no") ||  patient.equalsIgnoreCase("n")){
				 			System.out.println();
				 		}
				 	}
			 }
		 }
		 
		 public static void calculateAndDisplay(double a, double b, double c){
			 double total = a + b + c;
			 System.out.println("The total charges is :"+ total);
		 }
		 

}
