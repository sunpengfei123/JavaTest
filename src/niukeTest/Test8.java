package niukeTest;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        String s = "  0000000000012345678";
        int y = myAtoi(s);
        System.out.println(y);
    //    System.out.println(Integer.MIN_VALUE);
    }

    public static int myAtoi(String str) {
        ArrayList<Character> sb = new ArrayList<Character>();
        int tt = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                if(sb.size() > 0){
                    break;
                }
                continue;
            }else if( ((int)str.charAt(i) != 45)&&((int)str.charAt(i) != 43)&&((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57 )){
                break;
            }else if(tt >1){
                return 0;
            }else{
                if((str.charAt(i) == '+')||(str.charAt(i) == '-')){
                    tt++;
                }
                sb.add(str.charAt(i));
            }
        }

        System.out.println(sb);

        int l = sb.size();
        long re = 0;
        long b = 1;
        if( l == 0){
            return 0;
        }else if( l == 1 && ((int)sb.get(0) == 45 || (int)sb.get(0) == 43)){
            return 0;
        }else{
            for(int i = l-1; i>=0; i--){
                if((int)sb.get(i) != 45 && (int)sb.get(i) != 43){
                    if(Integer.parseInt(sb.get(i)+"") <= Integer.MAX_VALUE/b){
                        re += Integer.parseInt(sb.get(i)+"")*b;
                        b*=10;
                    }else{
                        if(sb.get(0) == '-'){
                            return Integer.MIN_VALUE;
                        }
                        return Integer.MAX_VALUE;
                    }

                }else if (sb.get(i) == '-') {
                    re = -1*re;
                }
                

            }

            System.out.println("re"+re);

            if(re > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(re < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else{
                return (int)re;
            }
        }

    }
}
