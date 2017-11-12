package Solution.Class02;
import java.util.Arrays;

public class ClassicalBinarySearch {
    public int classicalBinarySeach(int[] A, int T){
        //check null first and A size = 0
        if(A == null || A.length == 0){
            return -1;
        }

        int left = 0;
        int right = A.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(A[mid] == T){
                return mid;
            }else if(A[mid] < T){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;// if not found the target

    }

    public static void main(String[] args){
        ClassicalBinarySearch solution = new ClassicalBinarySearch();

        int[] A = new int[]{1,3,5,1,3};
        int T = 3;
        int result = solution.classicalBinarySeach(A,T);
        System.out.println(result);

    }
}
