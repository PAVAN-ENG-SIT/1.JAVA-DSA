import java.util.*;
//using for loop calculating the sum of first n natural numbers.

public class sumofNnumbers {
    public static void main(String[] args) {
        //sum of n natural numbers
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=obj.nextInt();
 //       int i=0;
        int sum=0;
/*       while loop
 *         while(i<=n){
            sum=sum+i;
            i++;
        }
 */
// for loop
        for (int i=0;i<=n;i++){
            sum+=i;

        }
        
        System.out.println("the sum of first "+n+" natural numbers is "+sum);
        

    
    }
}
