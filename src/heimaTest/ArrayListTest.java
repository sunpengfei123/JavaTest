package heimaTest;

import java.util.ArrayList;

public class ArrayListTest {
    /*
        ArrayList():创建一个空的集合对象
        add(E e):将指定元素追加到此集合的末尾
        add(int index,E element):在此集合的指定位置插入指定元素
     */
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("array:"+array);
        System.out.println(array.add("hello"));
        array.add("world");
        array.add("java");
        System.out.println("array:"+array);

        array.add(1,"ssse");
        System.out.println("array:"+array);
        //集合索引越界
        //array.add(10000,"ssse");s
    }
}
