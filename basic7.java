import java.util.Scanner;

public class basic7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            int year = sc.nextInt();
            String out = String.valueOf(year);
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            {
                out += " : Leap-year";
                System.out.println(out);
            }
            else
            {
                out += " : Non Leap-year";
                System.out.println(out);
            }
            t--;
        }
    }
}