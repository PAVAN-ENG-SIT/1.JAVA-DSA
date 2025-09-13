import java.util.*;

public class selectionsort {
    public static void main(){
        Scanner obj = new Scanner(System.in);
        int[] arr ={56,49,23,32,12};
        selectionsort(arr);
        for (Integer i:arr){
            System.out.println(i);
        }
 

    }
    static void selectionsort(int[] arr){
        //what you should do now 
        for (int i=0;i<arr.length;i++){
            int minindex=i;
            for (int j=0;j<arr.length;j++){
                    if(arr[j]<arr[minindex]){
                        minindex=j;
                    }
                    
                }
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
    

        }


    }
}





        /*
         * // int input
                int n = sc.nextInt();

            // string input (single word)
                String line=next();  
            // string input (whole line)
                String line = sc.nextLine();

            // double input
                double d = sc.nextDouble();

         */