import java.util.Scanner;

public class StepTracker {
    MonthData [] monthToData = new MonthData[12];
    StepTracker(Scanner sc) {
        Scanner scanner = sc;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }

    }
    public static int goalByStepsPerDay = 10000;

    public static void changeStepGoal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("введите месяц:");
        int month = scanner.nextInt();

        System.out.println("введите кол-во шагов:");
        int steps = scanner.nextInt();

        if (day >= 30) {
            steps = MonthData.days[day];

            if (month <= 12) {
                System.out.println("кол-во шагов было успешно изменено");

            } else {
                System.out.println("Неправильно введен месяц!");
                System.exit(0);
            }

        } else {
            System.out.println("Неправильное кол-во шагов!");
            System.exit(0);
        }
    }
    public static void addNewNumberStepsPerDay() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("введите месяц от 1 до 12:");
        int month = scanner.nextInt();

        System.out.println("введите кол-во шагов:");
        int steps = scanner.nextInt();

        if (day <= 30) {
            steps = MonthData.days[day];

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
    public static void printStatistic(int steps) {
        MonthData.printDaysAndStepsFromMonth();
        System.out.println();
        MonthData.sumStepsFromMonth();
        System.out.println();
        MonthData.maxSteps();
        System.out.println();
        MonthData.averageSteps();
        System.out.println();
        Converter.convertStepsToKilocalories(steps);
        System.out.println();
        Converter.convertToKm(steps);
        System.out.println();
        MonthData.bestSeries(goalByStepsPerDay);
    }
}