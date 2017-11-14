package Solution.Class01;
import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array) {
        // Write your solution here.
        //check null before all other conditions
        if(array == null ||array.length <= 1){
            return array;
        }
        //allocate helper to help merge step;
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int left, int right){
        if(left >= right){
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }

    private void merge(int[] array, int[] helper, int left, int mid, int right) {
        //copy content to helper array
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int leftIndex = left;
        int rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightIndex++];
            }
        }
        //if we still have content in the left side, we need to copy them
        while (leftIndex <= mid) {
            array[left++] = helper[leftIndex++];
        }
    }
    public static void main(String[] args){
        MergeSort solution = new MergeSort();
        //test case
        int[] array = new int[]{2,4,5,1};
        array = solution.mergeSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{3,4,5,1};
        array2 = solution.mergeSort(array2);
        System.out.println(Arrays.toString(array2));


    }
}
