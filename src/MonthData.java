public class MonthData {

    public static int [] days = new int[30];
    public static void sumStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            int sum = 0;
            sum += days[i];

            System.out.println("Статистика за месяц:" + sum);
        }
    }
    public static void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println("Шагов за первый день: " + days[0]);
            System.out.println("Шагов за второй день: " + days[1]);
            System.out.println("Шагов за третий день: " + days[2]);
            System.out.println("Шагов за четвертый день: " + days[3]);
            System.out.println("Шагов за пятый день: " + days[4]);
            System.out.println("Шагов за шестой день: " + days[5]);
            System.out.println("Шагов за седьмой день: " + days[6]);
            System.out.println("Шагов за восьмой день: " + days[7]);
            System.out.println("Шагов за девятый день: " + days[8]);
            System.out.println("Шагов за десятый день: " + days[9]);
            System.out.println("Шагов за одинадцатый день: " + days[10]);
            System.out.println("Шагов за двенадцатый день: " + days[11]);
            System.out.println("Шагов за тринадцатый день: " + days[12]);
            System.out.println("Шагов за четырнадцатый день: " + days[13]);
            System.out.println("Шагов за пятнадцатый день: " + days[14]);
            System.out.println("Шагов за шестнадцатый день: " + days[15]);
            System.out.println("Шагов за семнадцатый день: " + days[16]);
            System.out.println("Шагов за восемнадцатый день: " + days[17]);
            System.out.println("Шагов за девятнадцатый день: " + days[18]);
            System.out.println("Шагов за двадцатый день: " + days[19]);
            System.out.println("Шагов за двадцать первый день: " + days[20]);
            System.out.println("Шагов за двадцать второй день: " + days[21]);
            System.out.println("Шагов за двадцать третий день: " + days[22]);
            System.out.println("Шагов за двадцать четвертый день: " + days[23]);
            System.out.println("Шагов за двадцать пятый день: " + days[24]);
            System.out.println("Шагов за двадцать шестой день: " + days[25]);
            System.out.println("Шагов за двадцать седьмой день: " + days[26]);
            System.out.println("Шагов за двадцать восьмой день: " + days[27]);
            System.out.println("Шагов за двадцать девятый день: " + days[28]);
            System.out.println("Шагов за тридцатый день: " + days[29]);
        }
    }

    public static int maxSteps() {
        int sumMaxSteps = days[0];

        for (int i = 1; i < days.length; i++) {
            if (sumMaxSteps < days[i]) {
                sumMaxSteps = days[i];
            }
        }

        return sumMaxSteps;
    }
    public static int bestSeries(int goalByStepsPerDay) {
        goalByStepsPerDay = days[0];
        int currentSeries = 0;
        int finalSeries = 0;

        for (int i = 1; i < days.length; i++) {
            if (goalByStepsPerDay < days[i]) {
                currentSeries -= 1;
                goalByStepsPerDay = days[i];

                if (goalByStepsPerDay >= days[i]) {
                    currentSeries += 1;
                }
            }

            finalSeries = currentSeries;
        }

        return finalSeries;
    }
    public static int averageSteps() {
        int average = 0;
        int sum = 0;

        if (days.length > 0) {
            for (int i = 0; i < days.length; i++) {
                sum += days[i];
            }
        }

        average = sum / days.length;
        return average;
    }
}