import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int amount = 1;
        for(int i = 1;i<=x;i++){
            amount*=i;
        }
        if (x==0)
            return 1;
        else
        return amount;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001
    // different from the value Math.E
    public static double calculateE() {
        double ee = 0;
        int x = 0;
        while (Math.abs(ee-2.718281828459045)>=0.00001){
            ee += (1/factorial(x));
            x++;
        }
        return ee;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 15;
        double m = 0;
        while (true){
            m=(n+x/n)/2;
            if (Math.abs(n-m)<=0.00001){
                break;
            }
            n=m;
        }
        return n;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(calculateE());
        System.out.println(factorial(5));
        System.out.println(babylonian(13));
        // YOUR CODE HERE


        

        scan.close();
    }
}
