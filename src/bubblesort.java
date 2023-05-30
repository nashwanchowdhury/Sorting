import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
    int[] intArray = new int[]{10, 5, 8, 2, 4, 9, 1, 3, 6, 7};
    int n = intArray.length;
    bubblesort(intArray, n);
    }
    public static void bubblesort(int[] intArray, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++) {
                if (intArray[j-1] > intArray[j]) {
                   temp = intArray[j-1];
                   intArray[j-1] = intArray[j];
                   intArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }


}