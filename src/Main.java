import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();
    }
    public static void printMenu() {
        Scanner scanner = new Scanner (System.in);
        StepTracker stepTracker = new StepTracker();
        while (true) {
            System.out.println("Чтобы запустить нужные вам функции нажмите:");
            System.out.println("1 - изменить желаемое кол-во шагов за определенный день");
            System.out.println("2 - Напечатать статистику за месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");
            System.out.println("4 - выйти из программы");

            int i = scanner.nextInt();

            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();

            } else if (i == 2) {
                System.out.println("Введите месяц(от 1 до 12):" );
                stepTracker.printStatistic(scanner.nextInt());

            } else if (i == 3) {
                stepTracker.changeStepGoal();

            } else if (i == 4) {
                System.out.println("Программа завершена.");
                System.exit(0);

            } else {
                System.out.println("Такой команды нет.");
            }
        }
    }
}