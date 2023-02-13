package task_1_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите длину бассейна (м): ");
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        System.out.print("Введите ширину бассейна (м): ");
        double b = scanner.nextDouble();
        System.out.print("Введите глубину бассейна (м): ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Вы ввели отрицательное значение");
        } else {
            double poolVolume = a * b * c;
            System.out.println("Объем бассейна " + poolVolume + " литров.");
        }
    }
}
