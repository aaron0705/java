import java.util.Scanner;
import java.util.ArrayList;

public class basic11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0)
        {
            String s = sc.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            String[] arr = s.split(" ");
            for (String str : arr) 
            {
                list.add(Integer.parseInt(str));
            }
            System.out.println(minGap(list));
            t--;
        }
    }
    public static int minGap(ArrayList<Integer> in)
    {
        if (in.size() < 2)
            return 0;
        else
        {
            int min = in.get(1) - in.get(0);
            for (int i = 1; i < in.size(); i++)
            {
                if (min > (in.get(i) - in.get(i-1)))
                    min = in.get(i) - in.get(i-1);
            }
            return min;
        }
    }
}