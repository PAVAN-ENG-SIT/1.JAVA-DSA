import java.util.Scanner;

public class product {
    public static void main (String[] args){
        int a,b;
        int c;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter  a,b values:");
        
        a=obj.nextInt();
        b=obj.nextInt();
        c=a*b;

        System.out.println("the product of a &b is "+c);
        obj.close();
    }
    
}
