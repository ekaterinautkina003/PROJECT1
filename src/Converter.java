public class Converter {
    public static int convertToKm(int steps) {
        int sm = 75;
        int sum = sm * steps;

        if (sum < 100000) {
            System.out.println("Вы еще не прошли километр. До одного километра осталось: " + (100000 - sum) + " сантиметров.");
            return 0;

        } else {
            sum = sum / 100000;
            System.out.println("Вы прошли " + sum + " километров.");
            return sum;
        }
    }

    public static int convertStepsToKilocalories(int steps) {
        int calories = 50;
        int sum = calories * steps;
        int kilocalories = calories * 20;

        if (sum < kilocalories) {
            System.out.println("Вы еще не прошли нужное количество шагов, чтобы сжечь 1 килокалорий. Осталось сжечь: " + (kilocalories - sum) + "калорий.");
            return 0;

        } else {
            sum = sum / kilocalories;
            System.out.println("Вы сожгли " + sum + "килокалорий.");
            return sum;
        }
    }
}