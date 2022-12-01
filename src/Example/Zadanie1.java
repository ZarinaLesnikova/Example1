package Example;

import java.util.Scanner;

public class Zadanie1 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Input surname: ");
                String surname = in.nextLine();

                System.out.println("Input name: ");
                String name = in.nextLine();

                System.out.println("Input Patronymic: ");
                String Patronymic = in.nextLine();

                System.out.println("Surname: " + surname);
                System.out.println("Name: " + name);
                System.out.println("Patronymic: " + Patronymic);

                System.out.println("Hello, " + surname + name  + Patronymic  + "!");
                in.close();

            }
        }
