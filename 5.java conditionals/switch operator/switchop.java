import java.util.*;

public class switchop {
    public static void main(String[] args){
        System.out.println("enter a nuber from 1-7:");
        Scanner ob= new Scanner(System.in);
        int day=ob.nextInt();
        
        switch (day){
            case 1:
                System.out.println("monday is a weekday");
                break;
            case 2:
                System.out.println("tuesday is a weekday");
                break;
            case 3:
                System.out.println("wednesday is a weekday");
                break;
            case 4:
                System.out.println("thursday is a weekday");
                break;
            case 5:
                System.out.println("friday is a weekday");
                break;
                        
            case 6:
                System.out.println("saturday is a weekend");            
                break;
            case 7:
                System.out.println("sunday is a weekend");            
                break;
            default:
                System.out.println("Invalid day");
            
        
        }
    }

    }











        /* Scanner ob= new Scanner(System.in);
        System.out.println("enter n value");
        int n = ob.nextInt();
        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;

        }*/

