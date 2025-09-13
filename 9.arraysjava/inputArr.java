import java.util.Arrays;
import java.util.Scanner;
public class inputArr {
    public static void main(String[] args) {
    
        int[] arr;
        arr = new int[10];
        for (int i=0;i<=9;i++){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the inputs:");
        arr[i]=obj.nextInt();
    
    }
System.out.println(Arrays.toString(arr));
    }
}
