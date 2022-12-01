package Example;

import java.util.Scanner;
public class Zadanie6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите год рождения: ");
            int year = in.nextInt();

            System.out.println(2022 - year);
            in.close();
        }
    }
