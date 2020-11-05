package leeTest;

import java.util.*;

public class test127 {
    static HashMap<String,Integer> wordID = new HashMap<String,Integer>();
    static List<List<Integer>> edge = new ArrayList<List<Integer>>();
    static int wordnum = 0;
    static String beginWord;
    static String endWord;
    static List<String> wordList;

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("log");
        wordList.add("cog");
        wordList.add("lot");
        int re = ladderLength(beginWord,endWord,wordList);
        System.out.println(wordID);
        System.out.println(re);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        test127.beginWord = beginWord;
        test127.endWord = endWord;
        test127.wordList = wordList;

        for(String s: wordList){
            addedge(s);
        }

        addedge(beginWord);

        if(!wordID.containsKey(endWord)){
            return 0;
        }

        int[] begin = new int[wordID.size()];
        Arrays.fill(begin,Integer.MAX_VALUE);

        LinkedList<Integer> que = new LinkedList<Integer>();

        int beginID = wordID.get(beginWord);
        int endID = wordID.get(endWord);

        que.addFirst(beginID);
        begin[beginID] = 0;

        while(!que.isEmpty()){
            int x = que.removeLast();
            if(x == endID){
                return begin[endID];
            }

            for(int i: edge.get(x)){
                if(begin[i] == Integer.MAX_VALUE){
                    begin[i] = begin[x] + 1;
                    que.addFirst(i);
                }

            }
        }

        return 0;

    }

    public static boolean ff(String a, String b){
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int v = 0;
        for(int i = 0; i<aa.length; i++){
            if(aa[i] != bb[i]){
                v++;
            }
        }

        if(v == 1){
            return true;
        }
        return false;
    }

    public static void addedge(String s){
        addword(s);
        int id1 = wordID.get(s);
        if(ff(s, beginWord)){
            addword(beginWord);
            int id2 = wordID.get(beginWord);
            edge.get(id1).add(id2);
        }

        for(String ss: wordList){
            if(ff(s,ss)){
                addword(ss);
                int id2 = wordID.get(ss);
                edge.get(id1).add(id2);
            }
        }

    }

    public static void addword(String s){
        if(!wordID.containsKey(s)){
            wordID.put(s,wordnum++);
            edge.add(new ArrayList<Integer>());
        }
    }
}
