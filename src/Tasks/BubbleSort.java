package Tasks;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        Sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}


