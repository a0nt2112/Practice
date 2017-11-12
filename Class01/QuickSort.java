package Solution.Class01;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] array){
        //check null first
        if(array == null || array.length <= 1){
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        //define pivot and use it for partition the array
        int pivotPos = partition(array, left, right);
        quickSort(array, left, pivotPos - 1);
        quickSort(array, pivotPos + 1, right);
    }

    private int partition(int[] array, int left, int right){
        int pivotIndex = pivotIndex(left, right);
        int pivot = array[pivotIndex];

        //swap the pivot element to the rightmost position first
        swap(array, pivotIndex, right);
        //set two index to loop, find the final location of pivot after sorting
        int leftbound = left;
        int rightbound = right - 1;
        while(leftbound <= rightbound){
            if(array[leftbound] <= pivot){
                leftbound++;
            }else if(array[rightbound] >= pivot){
                rightbound--;
            }else{
                swap(array,leftbound++, rightbound--);
            }
        }
        //swap back the pivot element to the array
        swap(array, leftbound, right);
        return leftbound;
    }

    private int pivotIndex(int left, int right){
        return left + (int)(Math.random()*(right-left));
    }

    private void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args){
        QuickSort solution = new QuickSort();

        //Test case
        int[] array = new int[]{1,5,3,6,2};
        array = solution.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
