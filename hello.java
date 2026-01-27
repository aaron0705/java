

public class hello {
    public static void main(String[] args) {
        System.out.println(plus(1,2));
        create_student(args[0], Integer.parseInt(args[1]));
        String env = System.getenv("PATH");
        System.out.println(env);
        String os = System.getProperty("os.name");
        System.out.println(os);
        lib.HelloWorld("Văn An");
    }
    private static int plus(int a, int b)
    {
        return a + b;
    }
    private static void create_student(String name, int age)
    {
        Student s1 = new Student(name, age);
        System.out.println(s1.get_age());
    }
}

class Student
{
    private int age;
    private String name;
    Student(String name, int age)
    {
        this.name = name;
        set_age(age);
    }
    // setter 
    void set_age(int age)
    {
        if (age > 0)
        {
            this.age = age;
            return;
        }
        else
        {
            System.out.println("Invalid age");
            return;
        }
    }
    // getter
    int get_age()
    {
        return this.age;
    }
}
