import java.util.*;

public class collection 
{
    public static void main(String[] args)
    {
        /* // Array List
        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(10);
        array_list.add(20);
        array_list.add(30);

        System.out.println(array_list);
        System.out.println(array_list.get(0));

        // phương thứ array list
        array_list.add(1);
        System.out.println(array_list);
        array_list.add(1, 2);
        System.out.println(array_list);
        array_list.set(2, 0);
        System.out.println(array_list);
        array_list.remove(2);
        System.out.println(array_list);
        array_list.remove(Integer.valueOf(30));
        System.out.println(array_list);

        // List
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        list = new LinkedList<>();
        System.out.println(list);

        // ? khác biệt giữa arraylist và list -> list có bậc cao hơn array list
        

        // set
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);
        // ? cách lấy phần tử cảu set -> không có cách nào

        // map
        Map<String, Integer> map = new HashMap<>();

        map.put("Hello", 123);
        System.out.println(map);
        System.out.println(map.get("Hello"));
        System.out.println(map.keySet());

        // ? thử remove element tỏng map
        map.remove("Hello");
        System.out.println(map);
        map.put("B", 2);
        System.out.println(map);
        int v = map.getOrDefault("B", 0);
        System.out.println(v);

        // ? các phương thức của map, list, arraylist và set */
        // dequeue();
        set();
    }

    public static void queue()
    {
        Queue<Integer> q = new LinkedList<>();
        if (q.isEmpty() == true)
            q.add(1);
        System.out.println(q);
        int t = q.peek();
        System.out.println(t);
        q.offer(2);
        System.out.println(q);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq);
        return;
    }

    public static void dequeue()
    {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq);

        int l = dq.pollLast();
        int f = dq.pollFirst();
        System.out.println(l);
        System.out.println(f);

        System.out.println(dq);
    }

    public static void set()
    {
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0;i < 100; i++)
        {
            s1.add(i);
        }

        boolean c = s1.contains(1);
        System.out.println(c);
        System.out.println(s1);

        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);

        System.out.println(s2);

        TreeSet<Integer> s3 = new TreeSet<>();
        for (int i = 100;i >= 0; i--)
        {
            s3.add(i);
        }
        System.out.println(s3);
        System.out.println(s3.higher(50));
        System.out.println(s3.lower(50));
    }

}