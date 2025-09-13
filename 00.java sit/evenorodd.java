import java.util.*;


public class evenorodd {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=obj.nextInt();
        if ((n & 1)==0) {
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    
    }
}
