package niukeTest;

public class Test13 {
    public static void main(String[] args) {

        String s = "MDCXCV";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ss = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        char[] c = s.toCharArray();

        int j = 0;

        int re = 0;


        for(int i = 0; i<a.length && j < s.length() ;i++){
            if(ss[i].length() == 1 || j == s.length() -1){
                while(j < s.length() && ss[i].equals(s.charAt(j)+"")){
                    re += a[i];
                    j++;
                }
            }else{
                while(j + 1< s.length() && ss[i].equals(s.charAt(j)+""+s.charAt(j+1))){
                    re += a[i];
                    j+=2;
                }
            }
        }

        return re;
    }
}
