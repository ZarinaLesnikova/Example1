package Example;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        int s, d;
        s = 10;
        d = 20;
        if (s < d) {
            System.out.println("S < D");
        }
        s = s * 2;
        if (s == d) {
            System.out.println("S = D");
        }
        s = s * d;
        if (s > d) {
            System.out.println("S > D");
        }
    }
}
