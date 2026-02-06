import java.util.*;

public class compare
{
    public static void main(String[] args)
    {
        Student s1 = new Student("An", 20);
        Student s2 = new Student("Anh", 18);
        Referee r = new Referee();
        System.out.println(r.compare(s1, s2));
        
        /* int a = s1.compareTo(s2);
        if (a > 0)
        {
            System.out.println("Higher");
        }
        else if (a < 0)
        {
            System.out.println("Lower");
        }
        else
        {
            System.out.println("Equal");
        } */
    }
    public static class Student implements Comparable<Student>
    {
        String name;
        int age;

        Student(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public int compareTo(Student other)
        {
            return this.age - other.age;
        }
    }
    public static class Referee implements Comparator<Student>
    {
        @Override
        public int compare(Student s1, Student s2)
        {
            if (s1.age > s2.age)
            {
                return 1;
            }
            else if (s1.age < s2.age)
            {
                return -1;
            }
            else
            {
                if (s1.name.compareTo(s2.name) < 0)
                {
                    return 1;
                }
                else if (s1.name.compareTo(s2.name) > 0)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
}