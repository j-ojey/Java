package okoa;
import java.util.Scanner;

public class Safa {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int option=0;
int suboptiona=2;
int suboptionb=2;
int suboptionc=2;
int suboptiond=2;
int suboptione=2;
int suboptionf=2;
int suboptiong=2;
int suboptionh=2;
System.out.println("WAINAINA GEORGE KIHORO");
System.out.println("C026-01-0930/2022");

do{
System.out.println("\tCarrier info");
System.out.println("0:Sh20(30min,3hrs)");
System.out.println("1:Sh100 (90Mins+50SMS,24hrs");
System.out.println("2:Okoa Easy Sh200(200Mins,7days)");
System.out.println("3:Okoa 100");
System.out.println("4:Okoa 50");
System.out.println("5;Okoa 20");
System.out.println("6:Okoa 10");
System.out.println("7:Okoa 5");
System.out.println("Select an Option:");
option=input.nextInt();
if (option>12||option<0) {
	System.out.println("invalid choice.");	
}
else {
switch(option) {
case 0:

    System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:20");
	System.out.println("TOTAL DEBT will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	suboptiona=input.nextInt();
	if(suboptiona==0) {
suboptiona=0;
		continue;
			}

	else if(suboptiona==2) { 
		System.out.println("Your request has been cancelled");
		break;
	}
	else if (suboptiona==1) {
		System.out.println("You have succesfully subscibed to Okoa 20");
		break;
	}
	else {
		System.out.println("invalid choice");
		break;
	}

case 1:
	 System.out.println("Existing unpaid Okoa:0");
		System.out.println("New Okoa request:50");
		System.out.println("TOTAL DEBT will be:50");
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:Back"); 
		System.out.println("Select option:");
		suboptionb=input.nextInt();

		if (suboptionb==1) {
			System.out.println("You have succesfully subscibed to Okoa 50");
			break;
		}
		else if(suboptionb==2) { 
			System.out.println("Your request has been cancelled");
			break;
		}
		else if(suboptionb==0) {
			continue;
		}
		else {
			System.out.println("invalid choice");
			break;
		}


case 2:
	 System.out.println("Existing unpaid Okoa:0");
		System.out.println("New Okoa request:500");
		System.out.println("TOTAL DEBT will be:500");
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:Back"); 
		System.out.println("Select option:");
		suboptionc=input.nextInt();
		if (suboptionc==1) {
			System.out.println("You have succesfully subscibed to Okoa 500");
			break;
		}
		else if(suboptionc==2) { 
			System.out.println("Your request has been cancelled");
			break;
		}

      else if(suboptionc==0) {

	         continue;
        }
        else {
        	System.out.println("invalid choice");
	         break;
        }

case 3:
System.out.println("unpaid Okoa:0");
System.out.println("New Okoa:100");
System.out.println("TOTAL okoa due will be:100");
System.out.println("1:Accept");
System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
System.out.println("0:Back"); 
System.out.println("Select option:");
suboptiond=input.nextInt();
if (suboptiond==1) {
	System.out.println("You have succesfully subscibed to Okoa 100");
	break;
}
else if(suboptiond==2) { 
	System.out.println("You have subscribed to 170 bob kredo for call and SMS valid midnight");
	break;
}

else if(suboptiond==0) {

     continue;
}
else {
	System.out.println("invalid choice");
     break;
}
case 4:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:50");
	System.out.println("TOTAL okoa due will be:50");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 150 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	suboptione=input.nextInt();
	if (suboptione==1) {
		System.out.println("You have succesfully subscibed to Okoa 50");
		break;
	}
	else if(suboptione==2) { 
		System.out.println("Your have subscibed to 150 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(suboptione==0) {

	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}
case 5:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:20");
	System.out.println("TOTAL okoa due will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 50 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	suboptionf=input.nextInt();
	if (suboptionf==1) {
		System.out.println("You have succesfully subscibed to Okoa 20");
		break;
	}
	else if(suboptionf==2) { 
		System.out.println("Your have subscibed to 50 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(suboptionf==0) {

	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}

case 6:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:10");
	System.out.println("TOTAL okoa due will be:10");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 17 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	suboptiong=input.nextInt();
	if (suboptiong==1) {
		System.out.println("You have succesfully subscibed to Okoa 10");
		break;
	}
	else if(suboptiong==2) { 
		System.out.println("Your have subscibed to 17 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(suboptiong==0) {

	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}

case 7:
	System.out.println("Exusting unpaid Okoa:0");
	System.out.println("New Okoa request:5");
	System.out.println("TOTAL DEBT will be:5");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	suboptionh=input.nextInt();
	if (suboptionh==1) {
		System.out.println("You have succesfully subscibed to Okoa 100");
		break;
	}
	else if(suboptionh==2) { 
		System.out.println("Your have subscibed to 170 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(suboptionh==0) {

	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}




}
}
 }while (suboptiona==0||suboptionb==0||suboptionc==0||suboptiond==0||suboptione==0||suboptionf==0||suboptiong==0||suboptionh==0);
	}
}

