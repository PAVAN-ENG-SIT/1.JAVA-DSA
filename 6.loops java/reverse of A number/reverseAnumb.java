import java.util.*;

public class reverseAnumb {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.println("enter numb value:");
        int numb=object.nextInt();
        int p ,t=0 ;

        for(;numb!=0;numb/= 10){
            p=numb%10;
            t=(t*10)+(p);
            }

        System.out.println("the reverse of "+numb+" is "+t);
    }
    
}


      
        //reverse a number
        //input a number
        //take another empty numb 
        //adding strings

        /*
         *System.out.println("enter n value:");
        int n=object.nextInt();
        */
/* 
    while(numb!=0){
        p=numb%10;
        t=(t*10)+(p);
        numb=numb/10;
    }
*/