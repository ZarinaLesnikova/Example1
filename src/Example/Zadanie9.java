package Example;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x = in.nextInt();

        System.out.print("Введите второе число: ");
        int y = in.nextInt();

        System.out.println(x + y);
        in.close();
    }
}
