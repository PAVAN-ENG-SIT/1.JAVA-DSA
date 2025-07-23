
import java.util.Scanner;

public class fourth{
    public static void main(String[] args){
        String name;
        int age;
        double height; 



        System.out.println("enter your name age height:");
 

        Scanner obj  = new Scanner(System.in);
         

        name=obj.next();
            
      
        age=obj.nextInt();
            
        height=obj.nextDouble();
        System.out.println("Hello Mr."+name+"!");
        System.out.println("your age is "+age);
        System.out.print("Your height is "+height+" meters");
        
        obj.close();

    }
    
}
