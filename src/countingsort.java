import java.io.*;

public class countingsort {

    public static void main(String[] args) {
        int[] intArray = new int[]{10, 5, 8, 2, 4, 3, 7, 2, 9, 1, 12, 11, 16, 17};
        int n = intArray.length;

        quickSort(intArray, 0, n - 1);
        print(intArray);
    }

    public static int partition(int [] intArray, int low, int high) {
        int mid = intArray[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (intArray[j] < mid) {
                i++;
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }

        }
        int temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;
        return (i+1);

    }
    public static void quickSort(int[] intArray, int low, int high) {
        if (low < high) {
            int num = partition(intArray, low, high);
            quickSort(intArray, low, num - 1);
            quickSort(intArray, num + 1, high);
        }
    }
    public static void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
