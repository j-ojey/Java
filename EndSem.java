package results;
import java.util.Scanner;


public class EndSem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Enter the number of units: ");
        int numUnits = in.nextInt();
        float average;
        int[] unitmarks = new int[numUnits];

        String[] unitcode = new String[numUnits];
        
        String[] unitname = new String[numUnits];
        
        
        
        for (int i = 0; i < numUnits; i++) {
           
            System.out.println("Enter the unit code: ");
            unitcode[i] = in.next();
            
            System.out.println("Enter the unit name: ");
            unitname[i] = in.next();
            System.out.println("Enter the unit score: ");
            unitmarks[i] = in.nextInt();
       
        }
        int total=0;
        for (int i=0; i<numUnits; i++) {
        	
        	total=total+unitmarks[i];


        }
 
        System.out.println("");
            average=total/numUnits;
            char grade;
            if(average >= 70 && average <= 100)
                grade='A';
            else if(average >= 60)
                grade ='B';
            else if(average >= 50)
                grade='C';
            else if(average >=40)
                grade = 'D';
            else if(average >=0)
                grade = 'F';
            else
                grade = 'E';    
            
            System.out.println("\t\t\t Department of Computer Science");
    		System.out.println("\t\t\t    End of Semester Results");
    		System.out.println("---------------------------------------------------------------------------------");
    		System.out.print("|Name:WAINAINA GEORGE KIHORO      |Roll_No:C026-01-0930/2022      |Semester:2nd");
            System.out.println("");
            System.out.println("____________________________________________________________________________________");
            System.out.println("|Unit Code \t\t |Unit Name: \t\t Score");
            System.out.println("------------------------------------------------------------------------------------");
            for(int i=0;i<unitmarks.length;i++)
            {
                System.out.println("|"+unitcode[i]+"\t\t\t|"+unitname[i]+"\t\t\t\t|"+unitmarks[i]+"\n");
            }

            //printing the total.
            System.out.println("|Total\t\t\t\t\t\t\t|"+((int)total));
            System.out.println("------------------------------------------------------------------------------");
           
            //printing the Average
            System.out.println("|Average\t\t\t\t\t\t|"+average);
            System.out.println("------------------------------------------------------------------------------");
           
            //printing the Grade
            System.out.println("|Grade\t\t\t\t\t\t\t|"+grade);
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("\t\t\t\t\tRecommendation  |");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Grading Creiteria\t\tOverall Grade(A-D)\t Recommend Pass");
            System.out.println("70-100\t\tA");
            System.out.println("60-70\t\tB");
            System.out.println("50-60\t\tC");
            System.out.println("40-50\t\tD");
            System.out.println("Below 40 \tF");
            System.out.println("------------------------------------------------------------------------------");
	}

}
