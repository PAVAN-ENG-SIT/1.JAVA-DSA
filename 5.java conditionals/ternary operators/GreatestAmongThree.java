import java.util.*;

public class GreatestAmongThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt BEFORE reading input
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();

        // Ternary logic to find the largest number
        int largest = (a >= b && a >= c) ? a :
                      (b >= a && b >= c) ? b : c;

        System.out.println("The largest number is " + largest+" among "+a+","+b+","+c);
    }
}
