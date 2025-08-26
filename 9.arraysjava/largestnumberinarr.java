import java.util.Arrays;
import java.util.Scanner;
public class largestnumberinarr {
    public static void main(String[] args){
        //first we have to initialize an array 
        //put if condition for that array
        //print the largest number assuming one number is largest
        Scanner obj = new Scanner(System.in); 
        System.out.println("enter n value:");
        int n=obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //first we will assign a variable to temp 
        int temp = arr[0];

        for (int i=1;i<n;i++){
            if(arr[0]<arr[i]){
                temp=arr[i];
                //here we are storing the greatest numb every time when we compare it to the arr[0].
                //so thats why in temp value the greatest number is stored.
                
            }
            
        }
        System.out.println(temp);
                    
                }
            }
   
