import java.time.Month;
import java.util.Scanner;

public class StepTracker {
    static MonthData[] monthToData = new MonthData[12];

    StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public static int goalByStepsPerDay = 10000;

    public void changeStepGoal() {
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

    public void addNewNumberStepsPerDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("введите месяц от 1 до 12:");
        int month = scanner.nextInt();

        System.out.println("введите кол-во шагов:");
        long steps = scanner.nextLong();

        if (day <= 30 && day > 0) {
            if (month <= 12 && month > 0) {
                if (steps > 0) {
                    MonthData.days[day - 1] = (int) steps;
                    System.out.println("Количество шагов было успешно изменено.");
                } else {
                    System.out.println("Некорректный ввод шагов.");
                    System.exit(0);
                }

            } else {
                System.out.println("Неправильно введен месяц!");
                System.exit(0);
            }

        } else {
            System.out.println("Неправильное кол-во дней.");
            System.exit(0);
        }
    }

    public void printStatistic(int month) {
        MonthData monthData = new MonthData();
        Converter converter = new Converter();
        if (month < 0 || month > 12) {
            System.out.println("некорректный ввод месяца");
            System.exit(0);

        } else {
            monthData.printDaysAndStepsFromMonth();
            System.out.println();
            monthData.sumStepsFromMonth();
            System.out.println();
            System.out.println("Максимальное количество шагов за месяц: " + monthData.maxSteps());
            System.out.println();
            System.out.println("Среднее количество шагов за месяц: " + monthData.averageSteps());
            System.out.println();
            for (int i = 0; i < MonthData.days.length; i++) {
                converter.convertStepsToKilocalories(MonthData.days[i]);
                System.out.println();
                break;
            }

            for (int i = 0; i < MonthData.days.length; i++) {
                converter.convertToKm(MonthData.days[i]);
                System.out.println();
                break;
            }
            for (int i = 0; i < MonthData.days.length; i++) {
                System.out.println("Лучшая серия шагов: " + monthData.bestSeries(MonthData.days[i]));
                break;
            }
        }
    }
}