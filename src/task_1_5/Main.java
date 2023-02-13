package task_1_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение температуры в градусах Цельсия: ");
        Scanner scanner = new Scanner(System.in);
        double temperatureC = scanner.nextDouble();
        double temperatureF = (9.0 / 5.0) * temperatureC + 32;
        System.out.println("Температура по Фаренгейту " + temperatureF);
    }

}
