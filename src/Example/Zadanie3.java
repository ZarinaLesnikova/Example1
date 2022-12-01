package Example;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        int day = in.nextInt();

        System.out.println("Input weekday: ");
        int weekday = in.nextInt();

        System.out.println("Input month: ");
        int month = in.nextInt();

        System.out.println("Input year: ");
        int year = in.nextInt();

        System.out.println("Day:" + day);
        System.out.println("Weekday:" + weekday);
        System.out.println("Month:" + month);
        System.out.println("year:"  + year);
        in.close();
    }
}
