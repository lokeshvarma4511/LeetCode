package company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int[] arr) {
        int a=arr.length;
        List<List<Integer>> outer=new ArrayList<>();
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                for(int k=j+1;k<a;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0 && i!=j && i!=k && j!=k)
                    {
                        List<Integer> inner=new ArrayList<>();
                        inner.add(arr[i]);
                        inner.add(arr[j]);
                        inner.add(arr[k]);
                        outer.add(inner);
//                        System.out.println(outer);
                    }
                }
            }
        }
        return outer;
    }
}
