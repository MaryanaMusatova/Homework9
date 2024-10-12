public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] cost = {124000, 138760, 54690, 235853, 94321};
        int total = 0;
        for (int i : cost) {
            total += i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        System.out.println("Задача №2");
        int[] expenses = {12400, 18653, 9127, 19555, 14587};
        int min = expenses[0];
        int max = expenses[0];
        {
            for (int value : expenses) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
            System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

            System.out.println("Задача №3");
            int[] costs = {50000, 38761, 54690, 35858, 43219};
            int sum = 0;
            for (int i : costs) {
                sum += i;
            }
            double middle = (double) sum / cost.length;
            System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
        }
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}