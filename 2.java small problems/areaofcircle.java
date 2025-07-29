import java.util.Scanner;

public class areaofcircle {
    public static void main (String[] args){
        int r;
        double pi=3.14;
        double area=0;
        Scanner me = new Scanner(System.in);
        System.out.println("enter r:");
        r=me.nextInt();
        area=pi*r*r;
        System.out.println("The area of the circle is:"+area);
        me.close();


    } 
}
