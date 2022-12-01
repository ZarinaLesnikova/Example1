package Example;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input day: ");
        int day = in.nextInt();

        System.out.println("Месяц " + month + " содержит " + day + " дней");
        in.close();
    }
}