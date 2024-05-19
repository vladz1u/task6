public class thirdTask {
    public static void main(String[] args) {
        int[] fib = fibonachi(25);
        boolean bool = false;
        for (int i = 0; i < fib.length; i++) {
            bool = isSimple(fib[i]);
            if (bool == true) {
                System.out.println("В цьому масиві є просте число: " + fib[i]);
                break;
            } else {
                //
            }
        }
    }

    public static int[] fibonachi(int userNum) {
        int[] ar = new int[userNum];
//        int[] fibonachi = {0};
        ar[0] = 1;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            ar[i] = ar[i - 1] + ar[i - 2];
        }
        return ar;
    }

    public static boolean isSimple(int num) {
        boolean isWork = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isWork = true;
                return false;
            }
        }
        if (!isWork) {
            return true;
        }
        return false;
    }

}
