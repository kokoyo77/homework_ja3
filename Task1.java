import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 6, 4, 7};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = array[j];
            j++;
            k++;
        }

        for (int m = 0; m < temp.length; m++) {
            array[left + m] = temp[m];
        }
    }
}
