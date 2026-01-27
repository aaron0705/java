import java.util.Scanner;

public class basic2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            String msg = sc.nextLine();
            System.out.println(msg);
            t--;
        }
    }
}