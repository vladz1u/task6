public class secondTask {
    public static void main(String[] args) {
        task2(567, 128);
    }

    public static void task2(int num, int userSum) {
        int sum = 0;
        int tmp = 0;
        while (num > 0) {
            tmp = num % 10;
            sum += tmp;
            num /= 10;
        }
        if (sum == userSum) {
            System.out.println("you counted corrected");
        } else
            System.out.println("you counted uncorrected, correct sum = " + sum);
    }
}
