package niukeTest;

import java.util.TreeMap;

public class Test12 {
    public static void main(String[] args) {

        int a = 3;
//        System.out.println(intToRoman(a));
        String s = "sdfasdfsad";
        char[] c = s.toCharArray();
        System.out.println(c[0]);

    }

    public static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();


        TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        hm.put(1000,"M");
        hm.put(900,"CM");
        hm.put(500,"D");
        hm.put(400,"CD");
        hm.put(100,"C");
        hm.put(90,"XC");
        hm.put(50,"L");
        hm.put(40,"XL");
        hm.put(10,"X");
        hm.put(9,"IX");
        hm.put(5,"V");
        hm.put(4,"IV");
        hm.put(1,"I");

        while(num>0){
            for(int i = 0; i<hm.size(); i++){
                if(num >= a[i]){
                    num -= a[i];
                    sb.append(hm.get(a[i]));
                    break;
                }
            }
        }
        return sb.toString();

    }
}
