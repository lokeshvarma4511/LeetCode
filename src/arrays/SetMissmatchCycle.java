package company.leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class SetMissmatchCyclic
{
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
        public static int[] findErrorNums(int[] arr)
        {
            int i = 0;
            while (i < arr.length) {
                int cor = arr[i] - 1;
                if (arr[i] != arr[cor]) {
                    swap(arr, i, cor);
                } else {
                    i++;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j + 1) {
                    return new int[]{arr[j],j + 1  };

                }
            }
            return new int[]{-1,-1};
        }
        static void swap ( int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
