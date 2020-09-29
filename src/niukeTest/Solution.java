package niukeTest;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l = str1.length() > str2.length()?str1.length():str2.length();
        int s = str1.length() <= str2.length()?str1.length():str2.length();

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i<shortest(str1); i++){
            s1.append(str1.charAt(i));
        }

        for(int i = 0; i<shortest(str2); i++){
            s2.append(str2.charAt(i));
        }

        StringBuilder ss = new StringBuilder();



        if(s1.equals(s2)){
            return "";

        }else{
            ss.append(s1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("");
        String sr = sb.toString();

        for(int i = 0; i<=s/ss.length(); i++){
            if(judge(str1,sb.toString()) && judge(str2,sb.toString())){
                sr = sb.toString();
            }
            sb.append(ss);
        }

        return sr;
    }

    public Boolean judge(String s1,String s2){
        int l = s2.length();

        if(s2.length() == 0){
            return true;
        }

        if(s1.length()%l != 0){
            System.out.println(1);
            System.out.println(s1.length());
            System.out.println(l);
            return false;
        }

        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i%l)){
                System.out.println(2);
                return false;
            }
        }
        return true;
    }

    public int shortest(String s1) {
        int l = s1.length();
        for (int i = 1; i <= l; i++) {
            for (int j = 0; j < l; j++) {
                if(s1.charAt(j) != s1.charAt(j%i))
                {
                    break;
                }
                if(j == l -1)
                {
                    return i;
                }
            }
        }

        return 0;
    }

}
