import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static int seclargestElement(int nums[])
    {
        int n=nums.length;
        int largest=nums[0];
        int secLargest=-1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>largest)
            {
                secLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]>secLargest)
            {
                secLargest=nums[i];
            }
        }
        return secLargest;
       
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(seclargestElement(nums));
       
    
}
}
