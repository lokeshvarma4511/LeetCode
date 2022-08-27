package company.leetcode;

public class FindDuplicate {

    public static void main(String[] arg)
    {
        int[] arr={4,3,1,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr)
    {
        int i = 0;
//        int target =Integer.MIN_VALUE;
        while (i < arr.length)
        {
            if(arr[i]!=i+1)
            {
                int cor = arr[i] - 1;
                if (arr[i] != arr[cor])
                {
                    swap(arr, i, cor);
                } else
                {
//                        target = arr[i];
                    return arr[i];
                }
                }
            else {
                i++;
            }
            }
        return -1;
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
//        int j;
//        for(j=0;j<arr.length;j++)
//        {
//            if(arr[j]!=j+1)
//            {
//                return arr[j];
//            }
//        }
//        return j;
