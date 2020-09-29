package niukeTest;

public class SolutionTest {
    public static void main(String[] args) {
        String s1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXX";

        Solution ss = new Solution();
        String s = ss.gcdOfStrings(s1, s2);

        System.out.println(s);
    }
}
