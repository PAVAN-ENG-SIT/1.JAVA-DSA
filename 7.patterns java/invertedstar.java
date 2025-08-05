import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        int i,j,k;
        Scanner obj = new Scanner(System.in); 
        int n=obj.nextInt();
        for (i=1;i<=n;i++) {
            for(k=0;k<i;k++){
                    System.out.print(" ");
                }
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}


/*
i=1   n=5  sp=0
i=2   n=4  sp=1
i=3   n=3  sp=2
i=4   n=2  sp=3
i=5   n=1  sp=4



*/


