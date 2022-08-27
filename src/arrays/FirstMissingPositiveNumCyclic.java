package company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FirstMissingPositiveNumCyclic
{
    public static void main(String[] a) {
        int[] arr = {4, 0, 1, 2};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            int cor=arr[i]-1;
            if (arr[i] >0 && arr[i] != arr[cor] && arr[i]  <  arr.length+1) {
                swap(arr, arr[i], i) ;
            }
            else
            {
                i++;
            }
        }
        int j=0;
        for( j=0;j<=arr.length;j++)
        {
            if(arr[j]!=j+1)
                return j+1;
        }
        return -1;
    }
    ///swap
    static int[] swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
}

//    public static void main(String[] args) {
//        int[] arr={7,8,9,11,12};
//        System.out.println(firstMissingPositive(arr));
//    }
//    public static int firstMissingPositive(int[] nums)
//    {
//        int i=0;
//        while(i<nums.length)
//        {
//            int cor=nums[i]-1;
//            if(nums[i]<1 || nums[i]>nums.length+1 )
//            {
//                i++;
//            }
//            else if (nums[i]!=nums[cor]){
//                swap(nums,i,cor);
//            }
//            else
//            {
//                i++;
//            }
//        }
////        List<Integer> ans= new ArrayList<>();
//        for(int j=0;j<nums.length;j++)
//        {
//            if(nums[j]!=j+1)
//            {
//                return j+1;
//            }
//        }
//        return -1;
//    }
//    static void  swap(int[] arr, int a,int b)
//    {
//        int temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//    }
//}
