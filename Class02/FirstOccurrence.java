package Solution.Class02;

public class FirstOccurrence {
    public int firstOccurrence(int[] array, int target){
        //check null first
        if(array == null || array.length == 0){
            return -1;
        }

        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(array[mid] == target){
                right = mid;
            }else if(array[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        if(array[left] == target){
            return left;
        }else{
            return -1;
        }

    }

    public static void main(String[] args){
        FirstOccurrence solution = new FirstOccurrence();

        int[] array = new int[]{3,2};
        int target = 2;
        int result = solution.firstOccurrence(array,target);
        System.out.println(result);

    }
}
