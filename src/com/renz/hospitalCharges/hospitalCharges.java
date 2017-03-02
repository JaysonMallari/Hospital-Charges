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
			 
		
			
			 	while(patient.equals("Yes")|| patient.equals("yes") || patient.equals("Y") || patient.equals("y")){
				 //add patient number by 1
				 ptNo+=1;
				 // Ask the user if he will stay overnight
				 System.out.print("Are you staying overnight?: [Yes/No]");
				 overnight = in.next();
				 System.out.println();
				 double overnightCharge, medicationCharge, labServiceCharge ;
				 	
				 	// If user's Answer is not Yes or No 
				 	while(!overnight.equals("yes") && !overnight.equals("Yes") && !overnight.equals("y") && !overnight.equals("Y") && !overnight.equals("No") && !overnight.equals("no") && !overnight.equals("N") &&!overnight.equals("n") ){
				 		System.out.print("Invalid choices ,Please type [Yes/No]");
				 		overnight = in.next();
				 		//add extra space if valid input
				 		if (overnight.equals("Yes")|| overnight.equals("yes") || overnight.equals("Y") || overnight.equals("y") || overnight.equals("No")||overnight.equals("no") ||overnight.equals("N") || overnight.equals("n")){
				 			System.out.println();
				 		}
				 	}
				 	
				 	//if the user Staying for overnight the ask the following input :
				 	if (overnight.equals("yes") || overnight.equals("Yes") || overnight.equals("Y") || overnight.equals("y")){
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
				 	while(!patient.equals("yes") && !patient.equals("Yes") && !patient.equals("y") && !patient.equals("Y") && !patient.equals("No") && !patient.equals("no") && !patient.equals("N") &&!patient.equals("n")){
				 		System.out.print("Invalid choices ,Please type [Yes/No]");
				 		patient = in.next();
				 		//add extra space if valid input
				 		if (patient.equals("Yes")|| patient.equals("yes") || patient.equals("Y") || patient.equals("y") || patient.equals("No")|| patient.equals("no") || patient.equals("N") || patient.equals("n")){
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
