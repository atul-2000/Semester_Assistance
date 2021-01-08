import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Helper {
	   
	public static Scanner sc = new Scanner(System.in);
    public static Course course = null;
       
	public static void main(String[] args) throws IOException {

		while(true)
		{
            System.out.println("Slect one of the following :");
            System.out.println("1. Creating new course");
            System.out.println("2. Updating marks obtained");
            System.out.println("3. Statastics of prevoious courses");
            System.out.println("4. Exit");
            System.out.print("enter an option: ");
 
            int key1 = sc.nextInt();

            if(key1 == 4){
                System.out.println("--- BYE BYE ---");
		        System.exit(0);
            }

            System.out.println("Enter the course name :");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter number of assignments :");
            int no_of_assi = sc.nextInt();

            System.out.println("Enter number of quizzes :");
            int no_of_quiz = sc.nextInt();

            course = new Course(name, no_of_assi, no_of_quiz);

            System.out.println("Now, slect one of the following :");
            System.out.println("1. Assignment");
            System.out.println("2. Quiz");
            System.out.println("3. Midsem");
            System.out.println("4. Endsem");
            System.out.println("5. Exit");
            System.out.print("enter an option: ");

            int key = sc.nextInt();

            if(key==1){
                System.out.println("Enter assignment number :");
                int assi_no = sc.nextInt();

                System.out.println("Enter weight of assignment :");
                int weight = sc.nextInt();

                System.out.println("Enter deadline of assignment :");
                sc.nextLine();
                String date = sc.nextLine();
        
                System.out.println("Enter total marks for this assignment :");
                int total_marks = sc.nextInt();

                course.Assignment_add_values(assi_no, weight, date, total_marks);
            }
            if(key==5){
                System.out.println("--- BYE BYE ---");
		        System.exit(0);
            }
				
		}//while
	}
}

