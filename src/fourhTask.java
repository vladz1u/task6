public class fourhTask {
    public static void main(String[] args) {
        int[] ar = {21, 5, 9, -4};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        isSorted(ar);
        ar = bubbleSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        isSorted(ar);
    }

    public static int[] bubbleSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }
        return ar;
    }

    public static void isSorted(int[] ar) {
        boolean sorted = true;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Масив отсортований");
        } else {
            System.out.println("Масив не отсортований");
        }
    }
}
