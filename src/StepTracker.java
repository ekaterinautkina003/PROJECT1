import java.util.Scanner;

public class StepTracker {
    static MonthData[] monthToData = new MonthData[12];

    StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public static int goalByStepsPerDay = 10000;

    public static void changeStepGoal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во шагов");
        int steps = scanner.nextInt();

        if (steps < 0) {
            System.out.println("некорректный ввод шагов");
            System.exit(0);
        } else {
            goalByStepsPerDay = steps;
            System.out.println("шаги были обновленны");
            System.out.println();
        }
    }

    public static void addNewNumberStepsPerDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("введите месяц от 1 до 12:");
        int month = scanner.nextInt();

        System.out.println("введите кол-во шагов:");
        long steps = scanner.nextLong();

        if (day <= 30) {
            MonthData.days[day] = (int) steps;

            if (month <= 12) {
                System.out.println("кол-во шагов было успешно изменено");
                System.out.println();

            } else {
                System.out.println("Неправильно введен месяц!");
                System.exit(0);
            }

        } else {
            System.out.println("Неправильное кол-во шагов!");
            System.exit(0);
        }
    }

    public static void printStatistic(int month) {
        if (month < 0 || month > 12) {
            System.out.println("некорректный ввод месяца");
            System.exit(0);

        } else {
            MonthData.printDaysAndStepsFromMonth();
            System.out.println();
            MonthData.sumStepsFromMonth();
            System.out.println();
            System.out.println(MonthData.maxSteps());
            System.out.println();
            System.out.println(MonthData.averageSteps());
            System.out.println();
            System.out.println(Converter.convertStepsToKilocalories(MonthData.days[0]));
            System.out.println();
            System.out.println(Converter.convertToKm(month));
            System.out.println();
            System.out.println(MonthData.bestSeries(goalByStepsPerDay));
        }
    }
}