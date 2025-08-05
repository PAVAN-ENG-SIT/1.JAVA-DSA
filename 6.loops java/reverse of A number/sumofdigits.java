import java.util.*;
public class sumofdigits{
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);

            //sum of digits in a string "12345"
            //we divide t=n%10
            //q=q+t
        
        int p=0;
        int t= 0 ,numb;
        System.out.println("enter number of digits of numb:");
        numb=obj.nextInt();
        

        for (;numb!=0;numb/=0){
            t = numb % 10 ;
            p += t ;
        }
        System.out.println("the sum of digits of n is "+p);
    
    
    }
}