import java.util.Scanner;

public class nestedloops{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        //int n=obj.nextInt();
        int i,j;
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
                
            }        
            System.out.println();
        }

    }
}