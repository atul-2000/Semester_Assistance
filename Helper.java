import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Helper {
	   
	public static Scanner sc = new Scanner(System.in);
    public static Course course = null;
    
    
    public static void algo2(){
        course = new Course(3, 2, 2);
        int key2 = sc.nextInt();
        course.Algo2(key2);
    }

    public static void ml(){
        course = new Course(3, 2, 2);
        int key2 = sc.nextInt();
        course.ML(key2);
    }

    public static void terminate(){
		System.out.println("--- BYE BYE ---");
		System.exit(0);
	   }
       
	public static void main(String[] args) throws IOException {

        Map<Integer, Runnable> commands = new HashMap<>();
		commands.put(1, () -> algo2());
        commands.put(2, () -> ml());
        commands.put(3, () -> terminate());
		
		while(true)
		{
            System.out.println("Welcome this is your semester assistant, now select desired course :");
		    System.out.println("1. Algo2");
            System.out.println("2. ML");
            System.out.println("3. Exit");
		    System.out.print("enter an option: ");

		    int key1 = sc.nextInt();

            System.out.println("Now, slect one of the following :");
            System.out.println("1. Assignment");
            System.out.println("2. Quiz");
            System.out.println("3. Exam");
            System.out.println("4. Exit");
            System.out.print("enter an option: ");

            //int key2 = sc.nextInt();


            // Run selected command
            if (commands.containsKey(key1))
				commands.get(key1).run();
				
		}//while
	}
}

