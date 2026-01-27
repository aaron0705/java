import java.util.Scanner;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = 0;
        t = sc.nextInt();
        while (t > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(validate(x, y));
            t--;
        }
    }
    public static int validate(int x, int y)
    {
        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else if (x > 0 && y < 0) return 4;
        else return 0;
    }
}