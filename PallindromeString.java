import java.util.Scanner;

public class PallindromeString {


    public static void pallindromeStr(String str)
    {
        String rev="";
        boolean res=false;
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        pallindromeStr(str);

        

    }
}
