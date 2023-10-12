
package studentmarklist;
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Result=null;
        String grade = null;
        String name[] = new String[4];
        double average=0;
        int roll[] = new int[4];
        int marks[][] = new int[4][3];
        int totalmarks[]=new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter your rollNo:");
            roll[i] = in.nextInt();
            System.out.print("Enter your name:");
            name[i]= in.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter your mark " + (j+1) + ":");
                marks[i][j] = in.nextInt();
                
                totalmarks[i] += marks[i][j];
                average = totalmarks[i]/3;
            }
            System.out.print("The total is:" + totalmarks[i]);
            System.out.println("\n");
            if(average>=50) 
            {
            	Result="P";
            }
            else 
            {
            	Result="F";
            }
            
            
            if(average>=70 && average<=100) 
            {
            	grade = "A";
            }
            else if(average>=50 && average<70) 
            {
            	grade = "B";
            }
            else 
            {
            	grade = "C";
            }
        }
        System.out.println("................................................................................");
        System.out.println("\t\t\t\t\t STUDENT MARKLIST");
        System.out.println("................................................................................");
        System.out.println("ROLL NO\t NAME\t MARK1\t MARK2\t MARK3\t TOTAL\t Result\t Average\t GRADE");
        for(int i=0;i<4;i++)
        {
        	System.out.println(+roll[i]+"\t "+name[i]+"\t  "+marks[i][0]+"\t "+marks[i][1]+"\t "+marks[i][2]+"\t "+totalmarks[i]+"\t "+Result+ "\t "+average+"\t\t "+ grade);
        }

        
    }
}
