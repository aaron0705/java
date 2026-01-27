import java.util.Scanner;
import java.util.ArrayList;

public class basic10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            ArrayList<Integer> out = new ArrayList<>();
            int n = sc.nextInt();
            while (n > 0)
            {
                if (n >= 10)
                {
                    int m = (n % 10) * 10;
                    n /= 10;
                    m += n % 10;
                    n /= 10;
                    out.add(m);
                }
                else
                {
                    out.add(n);
                    n = 0;
                }
            }
            int sum = 0;
            for (int i = out.size() - 1; i >= 0; i--) 
            {
                sum = sum * 100 + out.get(i);
            }
            System.out.println(sum);
            t--;
        }
    }
}