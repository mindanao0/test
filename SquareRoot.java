import java.util.Scanner;
public class SquareRoot {
    public static double square(double number){
        double t;

        double squareroot = number / 2;

        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);

        return squareroot;
    }

    public static void main(String[] args)
    {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = (int) sc.nextDouble();
        int root;
        root = (int) square(number);
        System.out.println(number);
        System.out.println(root);
    }
}

