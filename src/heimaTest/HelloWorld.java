package heimaTest;

public class HelloWorld {
    public static void main(String args[]) {
        int i = 10;
        System.out.println(reverse("Hello"));
    }
    public static String reverse(String s){
        String ss = "";
        for (int i = s.length() -1; i>=0; i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
