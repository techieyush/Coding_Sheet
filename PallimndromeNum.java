import java.util.Scanner;

public class PallimndromeNum {

    public static void pallindromeNum(int num)
    {
        int rem=0;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("Pallindrome Num");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
       
         pallindromeNum(num);
    }

    
}
