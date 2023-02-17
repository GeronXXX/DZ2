
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;

        double S = pi * radius * radius;
        double D = 2 * pi * radius;
        int S1 = (int) S;
        int D1 = (int) D;

        System.out.println(S1);
        System.out.println(D1);

    }
}