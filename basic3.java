import java.util.Scanner;

public class basic3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            String name = sc.nextLine();
            String out = "Hi " + name;
            System.out.println(out);
            t--;
        }
    }
}