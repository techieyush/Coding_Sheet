import java.util.Scanner;

public class SecondSmallest {
    public static int secSmallestElement(int nums[])
    {
        int n=nums.length;
        int smallest=nums[0];
        int secSmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<smallest)
            {
                secSmallest=smallest;
                smallest=nums[i];
            }
            else if(nums[i]!=smallest && nums[i]<secSmallest)
            {
                secSmallest=nums[i];
            }
        }
        return secSmallest;
       
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(secSmallestElement(nums));
       
     }
    
}
