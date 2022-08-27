package company.leetcode;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesCyclic
{
    public static void main(String[] args)
    {
        int[] arr = {4, 2, 5, 2, 1, 5};
        System.out.println(findAllDuplicates(arr));
    }
        static List<Integer> findAllDuplicates ( int[] arr)
        {
            int i=0;
            while(i<arr.length)
            {
                int cor = arr[i] - 1;
                if (arr[i] != arr[cor])
                {
                    swap(arr, i, cor);
                } else
                {
                    i++;
                }
            }
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=j+1)
                {
                    l1.add(arr[j]);
                }
            }
            return l1;
        }
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
