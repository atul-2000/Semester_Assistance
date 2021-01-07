public class Course {
    int assignment;
    int quiz;
    int exam;

    /*constructors*/
	  public Course(){}

	  public Course(int assignment, int quiz, int exam) {	
		this.assignment = assignment;
		this.quiz = quiz;
		this.exam = exam;
	  }
	  
	  //method
	  void Algo2(int n) {
		  if(n==1){
              System.out.println("Assignment 1 :- 5%");
              System.out.println("Assignment 2 :- 5%");
              System.out.println("Assignment 3 :- 10%");
              System.out.println("Assignment 4 :- 20%");
          }
		  else if(n==2){
              System.out.println("Quiz 1 :- 7.5%");
              System.out.println("Quiz 2 :- 7.5%");
          }
          else if(n==3){
              System.out.println("Mid-sem :- 20%");
              System.out.println("End-sem :- 25%");
          }
          else{
              System.out.println("--- BYE BYE ---");
              System.exit(0);
          }
	  }

      void ML(int n) {
		  if(n==1){
              System.out.println("Assignment 1 :- 5%");
              System.out.println("Assignment 2 :- 5%");
              System.out.println("Assignment 3 :- 10%");
              System.out.println("Assignment 4 :- 20%");
          }
		  else if(n==2){
              System.out.println("Quiz 1 :- 7.5%");
              System.out.println("Quiz 2 :- 7.5%");
          }
          else if(n==3){
              System.out.println("Mid-sem :- 20%");
              System.out.println("End-sem :- 25%");
          }
          else{
              System.out.println("--- BYE BYE ---");
              System.exit(0);
          }
	  }
}