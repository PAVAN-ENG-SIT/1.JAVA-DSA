import java.util.*;

public class PassORFail {
    public static void main(String args[]){
        
        int marks;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter marks:");
        marks=sc.nextInt();
        //ternary operators
        //condition ? (output 1) : (output 2)
        
        System.out.println((marks>=90)? "o grade":
        (marks>=80)? " A+ grade": 
        (marks>=70)? "A grade":
         (marks>=60)? "B+ grade ":
         (marks>=50)? "B grade":"Didn't pass" );


    }    
}
