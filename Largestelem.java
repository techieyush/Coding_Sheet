import java.util.Scanner;

public class Largestelem {

    public static int largestElement(int nums[])
    {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println( largestElement(nums));
       
    }
    
}
