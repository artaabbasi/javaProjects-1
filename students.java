import java.util.Scanner;


abstract class Student{
    public abstract void takeExam();

    public Scanner takenExam = new Scanner(System.in);
}

class PhdStudent extends Student{
    public void takeExam(){
        System.out.println("please give your final defense presentation: ");

        String exam = takenExam.nextLine();
        System.out.println(exam);

    }


}

class GradStudent extends Student{
    public void takeExam(){
        System.out.println("please give your written paper: ");
        
        String exam = takenExam.nextLine();
        System.out.println(exam);

    }
}
