package Solution.Class01;

import java.util.Arrays;

public class MoveZero {
    public int[] moveZero(int[] array){
        //check null first
        if(array == null || array.length <= 1){
            return array;
        }

        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            if(array[left] == 0){
                swap(array, left, right--);
            }else{
                left++;
            }
        }
        return array;
    }

    private void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args){
        MoveZero solution = new MoveZero();
        //test case
        int[] array = new int[]{0,1,4,0,3,0};
        array = solution.moveZero(array);
        System.out.println(Arrays.toString(array));
    }
}
