import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args){
        int[] arr = {2,3,2,3,2,6,5,5,8,6,9,9};
        //int[] arr={2,2,2,3,4,5,5,6,6,8,9,9}

        int temp=0;
        int k=6;
        int[] sort= sorted(arr,temp);

        int var= search(arr,k);
        System.out.println(Arrays.toString(sort));
        System.out.println(var);

    }
    static int[] sorted(int arr[],int temp ){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        return arr;
    }

    static int search(int arr[] , int k ){
        int least=0,highest=arr.length-1; 
        // for(int i=0;i<arr.length;i++){
        while(least<=highest){ 
        int mid=(highest+least)/2;   
            if (arr[mid]== k){
                return mid;
            }
            else if(arr[mid]<k){
                least=mid+1;

            }
            else {
                highest=mid-1;
            }
            
        }
        return -1;
        }
            }

 static void reverse(int[] arr){
    //first we will initialize low,high 
    // first we write while loop
    //then we will use temp to 
    
    int span =0,low= 0,high=arr.length-1;
    int n=arr.length;
    // for (int i=0;i<=n;i++){
        while(low<=high-1){
            span=arr[high];
            arr[low]=arr[high];
            arr[high]=span;

        }
         
        
    }
 
    

    



//logic is :
/*
 * 1.first we write a function
 * 2.in that function we will initialize 3 vars they are least,highest,mid=(least+highest)/2;
 * 3.use conditinal statements
 * 4.arr[mid] == k  
 * 
 * 
 */
