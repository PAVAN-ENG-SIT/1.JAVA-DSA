// import java.util.Scanner;

// public class asciipattern {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);
        
//         int n=obj.nextInt(); 
//         for(int i=1;i<=n;i++){
//                 for(int j=0;j<i;j++){            

//     System.out.print((char)(65+j));
//             }
//             System.out.println();
//         }
//     }
// }


/*
 * a
 * ab
 * abc
 * abcd
 * abcde
 * 
 * n=5 
 * 
 *  rows=1  i=1  no.=1
 *  rows=2  i=2  no.=2
 *  rows=3  i=3  no.=3
 *  rows=4  i=4  no.=4
 *  rows=5  i=5  no.=5
 *
 */



 /*
  * 
import java.util.Scanner;

public class asciipattern {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){            

    System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}


  */
public class asciipattern{
    public static void main(String[] args){
        int a =65;
        // char b='C';
        // System.out.println((int)(b));
        for(int i=0;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print((char)(a+j));
            }
            System.out.print("\n");
        }
    }
}







