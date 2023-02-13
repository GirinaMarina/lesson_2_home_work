package home_work_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите Ваш возраст: ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Введено значение " + age);

        if (age < 0) {
            System.out.println("Введенео некоректное значение");
        } else if (age < 18) {
            System.out.println("Вы ребенок");
        } else if (age < 45) {
            System.out.println("Вы молодой человек");
        } else if (age < 60) {
            System.out.println("Вы человек среднего возраста");
        } else if (age < 90) {
            System.out.println("Вы пожилй человек");
        } else {
            System.out.println("Вы долгожитель");
        }
    }
}