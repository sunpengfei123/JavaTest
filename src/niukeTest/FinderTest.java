package niukeTest;

public class FinderTest {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        int n = 5;
        int K = 3;
        int b;
        Finder ff = new Finder();
        b = ff.findKth(a,n,K);
        System.out.println(b);
    }
}

