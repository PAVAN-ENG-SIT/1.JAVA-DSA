import java.util.*;
public class oddoreven {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numb1");
    int n;
    n=sc.nextInt();
    if(n %2==0){
        System.out.println(n+" is even number");
    }
    else{
        System.out.println(n+" is an odd number");
    }
    }
}
