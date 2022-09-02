package company.leetcode;

public class Find132Pattern
{
    public static void main(String[] args) {
        int[] arr={3,1,4,2};
        System.out.println(find132pattern(arr));
    }
    static boolean find132pattern(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                if(arr[i+1]>arr[i+2])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
