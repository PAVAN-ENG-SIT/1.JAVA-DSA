import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j);

                }
                System.out.println("");

        }


    }
}

/*
nums=1   no.=1
nums=2   no.=2
nums=3   no.=3
nums=4   no.=4 
nums=5   no.=5
 */



