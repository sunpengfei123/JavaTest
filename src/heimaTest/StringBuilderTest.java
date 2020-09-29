package heimaTest;
/*
    StringBuileder构造方法：
        pubilc StringBuilder():创建一个空白的可变字符串对象
        pubilc StringBuilder(Sting str):根据字符串内容，来创建可变字符串对象

 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //pubilc StringBuilder():创建一个空白的可变字符串对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        //pubilc StringBuilder(Sting str):根据字符串内容，来创建可变字符串对象
        StringBuilder sbb = new StringBuilder("StringBuilder");
        System.out.println("sbb:"+sbb);

        //append(任意类型)：添加数据，并返回对象本身
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("hello");
        System.out.println("sb1:"+sb1);
        System.out.println("sb2:"+sb2);
        System.out.println(sb1 == sb2);

        sb1.append(" world");
        System.out.println("sb1:"+sb1);
        sb1.append(" java").append(" 100");
        System.out.println("sb1:"+sb1);

        //reverse():返回相反的字符序列
        System.out.println("sbb:"+sbb);
        sbb.reverse();
        System.out.println("sbb_reverse:"+sbb);

        //StringBuilder和String的相互转换
        //StringBuilder  to   String :直接使用toString
        //String  to   StringBuilder :通过StringBulider()构造方法转化

    }

}
