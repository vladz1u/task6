public class firstTask {
    public static void main(String[] args) {
        task1(20, 20);

    }

    public static void task1(int a, int b) {
        int nsd = 0;
        for (int i = 1; i < a + 1 && i < b + 1; i++) {
            if (a % i == 0 && b % i == 0) {
                nsd = i;
            }
        }
        System.out.println(nsd);
    }


}



