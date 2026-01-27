public class basic8
{
    public static void main(String[] args)
    {
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        int sum = 0;
        for (int i = 101; i <= 200; )
        {
            if (i % 9 == 0)
            {
                System.out.println(i);
                sum += i;
                i += 9;
            }
            else
            {
                i++;
            }
        }
        System.out.println(sum);
    }
}