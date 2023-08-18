import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();
    }
    public static void printMenu() {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Чтобы запустить нужные вам функции нажмите:");
            System.out.println("1 - изменить желаемое кол-во шагов за день");
            System.out.println("2 - Напечатать статистику за месяц");
            System.out.println("3 - вывести статистику");
            System.out.println("4 - выйти из программы");

            int i = scanner.nextInt();

            if (i == 1) {
                StepTracker.addNewNumberStepsPerDay();

            } else if (i == 2) {
                System.out.println("Статистика за месяц:");
                MonthData.printDaysAndStepsFromMonth();

            } else if (i == 3) {
                System.out.println("Введите количество шагов:" );
                StepTracker.printStatistic(scanner.nextInt());

            } else if (i == 4) {
                System.out.println("Программа завершена.");
                System.exit(0);

            } else {
                System.out.println("Такой команды нет.");
            }
        }
    }
}