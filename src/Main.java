public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int dayMin = arr[0]; // переменная минимальной суммы
        int dayMax = arr[0]; //максимальной суммы


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < dayMin) {
                dayMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + dayMin + " рублей");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > dayMax) {
                dayMax = arr[i];
            }
        }
        System.out.println("Максимальная  сумма трат за день составила " + dayMax + " рублей");

        // 3 Задание

        double day30 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / 30;
            day30 = sum / 30;
        }

        System.out.println("Средняя сумма трат за месяц составила " + day30 + " рублей");

        // 4 задание

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};


        for (int i = reverseFullName.length - 1; i >= 0; i--) {

                System.out.print(reverseFullName[i]);

        }


    }


}















