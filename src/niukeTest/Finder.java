package niukeTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        ArrayList b = f(a);
        int nn = b.size();

        return (int)b.get(nn - K + 1);
    }
    public ArrayList f(int[] a){
        int last = -1;
        int num = 0;
        ArrayList b = new ArrayList();
        for(int i = 0; i<a.length; i++){
            if ( i == 0){
                last = a[i];
                num++;
                b.add(a[i]);
            }else{
                if(a[i] != last){
                    num++;
                    b.add(a[i]);
                }
            }
            last = a[i];
        }
        return b;
    }
}
