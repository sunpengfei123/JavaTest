package leeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test49 {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> a = groupAnagrams(s);

        System.out.println(a);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int[][] t = new int[strs.length][26];
        String[] s = new String[strs.length];
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        List<List<String>> re = new ArrayList<List<String>>();
        int num = 0;
        for(int i = 0; i<strs.length; i++){
            for(int j = 0;j<strs[i].length(); j++){
                t[i][strs[i].charAt(j)-'a']++;
            }
            s[i] = Arrays.toString(t[i]);
            System.out.println(s[i]);

            if(!hm.containsKey(s[i])){
                hm.put(s[i],num);
                List<String> l = new ArrayList<String>();
                l.add(strs[i]);
                re.add(l);
                num++;
            }else{
                re.get(hm.get(s[i])).add(strs[i]);
            }
        }

        return re;
    }

}


