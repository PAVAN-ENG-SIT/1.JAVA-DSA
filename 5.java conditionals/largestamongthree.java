import java.util.*;
public class largestamongthree {
    public static void main(String args[]){
    int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("enter c:");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if (b>c &&b>a) {
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else{
            System.out.println(c+"is greater than "+b+" and "+a);
        }




    
    }
}
