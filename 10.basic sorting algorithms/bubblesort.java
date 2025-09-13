import java.util.*;
public class bubblesort {
    
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        
        int[] arr =new int[10];
        int n=10;
        for (int i=0;i<n;i++){
            System.out.print("enter num"+i+":");
            arr[i]=obj.nextInt();    
            
        }
        
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                 arr[j+1]=arr[j];
                arr[j]=temp;

                }
            }
        
        }
        System.out.println(Arrays.toString(arr));


    
    }
}
