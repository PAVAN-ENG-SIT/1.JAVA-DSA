import java.util.*;

public class elseifst {
    public static void main(String args[]){
        System.out.println("enter the marks:");
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if (marks>=90){
            System.out.println("Student got O grade");
        }
        else if(marks>=80 && marks<90){
                System.out.println("the student got A+ grade");
        }
        else if (marks>=70 && marks<80) {
            System.out.println("Student got A grade");
        }
        else if(marks>=60 && marks<70) {
            System.out.println("Student got B+ grade");
        }
              else if(marks>=50 && marks<60){
                System.out.println("studenrt got B grade");
        }
    
        else{
            System.out.println("The student didn't pass");
        }
    }
    }

