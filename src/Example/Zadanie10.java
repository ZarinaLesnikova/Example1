package Example;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();

        int a = x - 1;
        int b = x + 1;
        int s = x + a + b;

        System.out.println(a);
        System.out.println(x);
        System.out.println(b);
        System.out.println(s * s);

        in.close();
    }
}
