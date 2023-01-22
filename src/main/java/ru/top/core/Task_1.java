package ru.top.core;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    /*
        Разработать и протестировать набор классов для решения задачи подсчета зароботной платы сотрудников некоторой фирмы.
        На фирме есть несколько способов оплаты труда:
        ■ ставка – указывается, сколько сотрудник получает за
        рабочий день; для каждого сотрудника записывается,
        сколько дней он отработал в месяце;
        ■ почасовая – указывается, сколько сотрудник получает в
        час, для каждого сотрудника; записывается, сколько часов
        он отработал в месяце
        ■ сдельная – указывается, сколько сотрудник получит за
        выполненную работу; для каждого сотрудника записываются
        суммы для каждой работы, что он успел сделать за месяц.
     */
    public static void main(String[] args) {
        Workers[] workers = new Workers[5];
        Workers workers1 = getWorkerFromConsole();
        Workers workers2 = getWorkerFromConsole();
        workers[0] = workers1;
        workers[1] = workers2;

        printWorkersInfo(workers);
    }

    private static void printWorkersInfo(Workers[] abstractWorkers) {
        int sum = 0;
        System.out.println("ФИО Вид оплаты Сумма");

        for (Workers abstractWorker : abstractWorkers) {
            if (abstractWorker == null) {
                continue;
            }
            sum += abstractWorker.getSalary();
            System.out.println(abstractWorker);
        }
        System.out.println("Итого " + sum);
    }

    private static Workers getWorkerFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фио");
        String fio = scanner.nextLine();
        System.out.println("Введите тип оплаты " + Arrays.toString(TypeSalary.values()));
        String salaryType = scanner.nextLine();

        if (salaryType.equals(TypeSalary.BET.name())) {
            System.out.println("Введите ставку");
            String bet = scanner.nextLine();
            System.out.println("Введите количество дней");
            String dayCount = scanner.nextLine();
            return new Bet(fio, TypeSalary.fromName(salaryType), Integer.valueOf(bet), Integer.valueOf(dayCount));
        } else {
            System.out.println("Введите почасовую оплату");
            String hourSalary = scanner.nextLine();
            System.out.println("Введите количество часов");
            String hourCount = scanner.nextLine();
            return new Hourly(fio, TypeSalary.fromName(salaryType), Integer.valueOf(hourSalary), Integer.valueOf(hourCount));
        }
    }
}
