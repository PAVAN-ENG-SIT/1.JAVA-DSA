public class overloading {
    public static void main(String[] args) {
        int a=1000;
        int b=20;
        int c=50;

        System.out.println(division(a,b,c));
        
    }

        static int division(int x , int y){
        return x/y;

    }
        static int division(int a,int b,int c){
            return a*b*c;
        }

}






