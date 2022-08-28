public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int total = 0;
        for(int current : arr){
            total = total + current;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        int minSpending = 200000;
        int maxSpending = 0;
        for (int current : arr)
        {
            if(current < minSpending){
                minSpending = current;
            }
            if(current > maxSpending){
                maxSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");

        System.out.println("Средняя сумма трат за месяц составила " + (double)(total / arr.length) + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}