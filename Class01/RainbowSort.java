package Solution.Class01;

import java.util.Arrays;

public class RainbowSort {
    public int[] rainbowSort(int[] array){
        //check null first
        if(array == null || array.length <= 1){
            return array;
        }

        int i = 0;
        int j = 0;
        int k = array.length -1;
        while(j <= k){
            if(array[j] == -1){
                swap(array, i++, j++);
            }else if(array[j] == 0){
                j++;
            }else{
                swap(array, k--, j);
            }
        }

        return array;
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        RainbowSort solution = new RainbowSort();

        //test case
        int[] array = new int[]{1,0,-1,0,1,0};
        array = solution.rainbowSort(array);
        System.out.println(Arrays.toString(array));
    }
}
