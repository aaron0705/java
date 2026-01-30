import java.util.*;

public class collection 
{
    public static void main(String[] args)
    {
        // Array List
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

        // ? các phương thức của map, list, arraylist và set
    }
}