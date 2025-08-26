// import java.util.Arrays;
public class reversearray {
    public static void main(String[] args){
        int[] arr={5,2,7,4,8};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
        
    }
    static void reverse(int[] array){
        int low=0,high=array.length-1;
        while(low <= high){
            int temp=array[low];
            array[low]=array[high];
            array[high]=temp;
            low++;
            high--;
        }

    }
}
