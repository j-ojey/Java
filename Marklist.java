package grading;
import java.util.Scanner;

class Student// Initializing the components of the class
{
	int marks[]= new int [3];
	int roll;
	String Name;
	int total=0;
	char result;
	double average;
	String grade;
	
	public void jojey()//Creating a Function
	{
		Scanner in = new Scanner(System.in);//Refference variable
		System.out.print("Enter your roll no:");
		roll=in.nextInt();
		System.out.print("Enter your name:");
		Name=in.next();
		for(int i=0;i<3;i++) 
		//Enteringb the marks of a student
			{
			System.out.println("Enter your mark"+(i+1));
			marks[i]=in.nextInt();
		}
		
	}
	public void calculation() {
		for(int i=0;i<3;i++) 
		{
			total=total+marks[i];
		}
		  average= total/3;
		  if(average>80 && average<100 ){
			  grade="A";
			}
			else 
				if(average>75 && average<79.9) {
					grade="B+";
					
			}
				else
					if(average>65 && average<74.9) {
						grade="B";
					
			}
					else 
						if(average>55 && average<64.9) {
							grade="C+";
						}
						else 
							if(average>50 && average<54.9) {
								grade="C";
							}
							else 
								if(average>40 && average<49.9) {
									grade="D";
								}
								else 
						
								{
										grade="F";
									}
		  if(average>=40) {
			  result='P';
		  }
		  else   
			  result='F';
		  
	}
		
}
public class Marklist {

	public static void main(String[] args) {
	Student george = new Student();
	george.jojey();
	george.calculation();
	
	Student lokesh = new Student();
	lokesh.jojey();
	lokesh.calculation();
	
	Student peter = new Student();
	peter.jojey();
	peter.calculation();
	
	Student alvin = new Student();
	alvin.jojey();
	alvin.calculation();
	
	Student well[] = new Student[4];
	well[0]=george;
	well[1]=lokesh;
	well[2]=peter;
	well[3]=alvin;
	 // Printing
	System.out.println("*********************************************************************************************************************************");
	System.out.println("\t\t\t STUDENT MARKLIST");
	System.out.println("*********************************************************************************************************************************");
	System.out.println("ROLL \t\t NAME \t\t MARK1 \t\t MARK2 \t\t MARK3 \t\t TOTAL \t\t RESULT \t\t Average \t\t GRADE");
	for(int i=0;i<3;i++) {
		System.out.println(+well[i].roll+"\t\t"+well[i].Name+"\t\t"+well[i].marks[0]+"\t\t"+well[i].marks[1]+"\t\t"+well[i].marks[2]+"\t\t"+well[i].total+"\t\t"+well[i].result+"\t\t"+well[i].average+"\t\t"+well[i].grade);
		
	}
	}
	}
	
^X

