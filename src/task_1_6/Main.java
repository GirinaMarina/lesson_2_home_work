package task_1_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        double percent = number * 1.15;
        System.out.println("Ваше число. увеличенное на 15% = " + percent);
    }

}
