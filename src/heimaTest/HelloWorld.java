package heimaTest;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String args[]) {
        int i = 10;
        System.out.println(reverse("Hello"));

        String s1 = "1223";
        String s2 = "1233";
        StringBuilder sb = new StringBuilder();
        int[] num1 = {1,6,5,4,7,3,9,5,3,7,8,4,1,1,4};
        int[] num2 = {4,3,1,3,5,9};

        sb.append(1);


        System.out.println(sb.toString());

    }
    public static String reverse(String s){
        String ss = "";
        for (int i = s.length() -1; i>=0; i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
