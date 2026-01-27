import java.util.Scanner;

public class basic5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            int num = 5;
            int sum = 0;
            for (int i = 0; i < num; i++)
            {
                sum += sc.nextInt();
            }
            System.out.println(sum);
            t--;
        }
    }
}