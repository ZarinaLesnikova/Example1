package Example;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input weekday: ");
        String weekday = in.nextLine();

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input day: ");
        int day = in.nextInt();

        System.out.println("Day:" + day);
        System.out.println("Weekday:" + weekday);
        System.out.println("Month:" + month);
        in.close();
    }
}