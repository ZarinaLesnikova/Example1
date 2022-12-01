package Example;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        in.close();
    }
}
