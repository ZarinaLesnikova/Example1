package Example;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите свое имя: ");
            String name = in.nextLine();

            System.out.print("Введите год рождения: ");
            int year = in.nextInt();

            System.out.println(name + " " + (2022 - year) + " лет");
            in.close();
    }
}
