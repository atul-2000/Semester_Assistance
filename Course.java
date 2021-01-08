public class Course {
    String name;
    Info[] Assignment;
    Info[] Quiz;
    Info Midsem;
    Info Endsem;

    /*constructors*/
	  public Course(){}

	  public Course(String name, int no_of_assi, int no_of_quiz) {	
		this.name = name;
		this.Assignment = new Info[no_of_assi];
        this.Quiz = new Info[no_of_quiz];
        this.Midsem = new Info();
        this.Endsem = new Info();
	  }
	  
	  //method
	  void Assignment_add_values(int assi_no, int weight, String date, int total_mark) {
          Info info = new Info();
          info.number = assi_no;
          info.weight = weight;
          info.date = date;
          info.totalmarks = total_mark;
          info.obtainedmarks = 0;
          this.Assignment[assi_no -1]=info;
          System.out.println("Assignment "+assi_no+" | weight : "+info.weight+" % | total marks : "+info.totalmarks+"| deadline : "+date+" | obtained marks : "+info.obtainedmarks);
	  }

      void quiz_add_value(int quiz_no, int weight, String date, int total_mark) {
        Info info = new Info();
        info.number = quiz_no;
        info.weight = weight;
        info.totalmarks = total_mark;
        info.obtainedmarks = 0;
        this.Quiz[quiz_no -1]=info;
      }

      void midsem_add_value(int weight,String date, int total_mark) {
        Info info = new Info();
        info.number = 1;
        info.weight = weight;
        info.totalmarks = total_mark;
        info.obtainedmarks = 0;
      }
      
      void endsem_add_value(int weight,String date, int total_mark) {
        Info info = new Info();
        info.number = 1;
        info.weight = weight;
        info.totalmarks = total_mark;
        info.obtainedmarks = 0;
	  }
}