
import java.util.Scanner;

public class Ptrn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        int space=0;
        while(row<=n)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print(" ");
                j++;
            }
            int i=1;
            while(i<=nst)
            {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            row++;
            nst--;
            space++;

        }
    }
    
}
