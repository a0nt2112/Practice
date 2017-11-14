package Solution.Class02;

public class FirstOccurrence {
    public int firstOccurence (int[] array, int target) {
        //check null first
        if (array == null || array.length == 0) {
            return  -1;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right - 1){
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (array[left] == target) {
            return left;
        }else if (array[right] == target){
            return right;
        }

        return -1;
    }

    public static void main (String[] args) {
        FirstOccurrence solution = new FirstOccurrence();
        int[] array = new int[]{2,2,2};
        int target = 2;
        System.out.println(solution.firstOccurence(array,target));
    }

}
