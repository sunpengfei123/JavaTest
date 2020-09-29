package niukeTest;

public class Test1072 {
    public static void main(String[] args) {

//        int[][] m = {{0,0,1},{1,1,0}};
//        int t = maxEqualRowsAfterFlips(m);
        //System.out.println(t);
        StringBuilder sb1 = new StringBuilder();
        sb1.append("12345");
        StringBuilder sb2 = sb1;
        sb2.append("6789");
        System.out.println(sb1.toString());
//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//
//        char c1  = 'a';
//        char c2 = c1;
//        c2 = 'b';
//        System.out.println("c1==c2:"+ (c1 == c2));
//
//        Double d1 = 100.0;
//        Double d2 = 100.0;
//        Double d3 = 200.0;
//        Double d4 = 200.0;
//        String a = "abc";
//        String b = a;
//        System.out.println(b == a);
//        a="a";
//        System.out.println(b);
//        System.out.println(a);

//        System.out.println(d1.equals(d2));


//        System.out.println(i1 == i2);
//        System.out.println(i3 == i4);
//        System.out.println(d1==d2);
//        System.out.println(d3==d4);


    }

    public static int maxEqualRowsAfterFlips(int[][] matrix) {
        int l = matrix[0].length;
        int h = matrix.length;

        String[] s = new String[h];

        for(int i = 0; i<h;i++){
            StringBuilder ss =new StringBuilder();
            if(matrix[i][0] == 1){
                for(int j = 0 ;j <l; j++){
                    matrix[i][j] = (matrix[i][j] + 1)%2;
                    ss.append(matrix[i][j]+"");
                }
            }else{
                for(int j = 0 ;j <l; j++){
                    ss.append(matrix[i][j]+"");
                }
            }

            s[i] = ss.toString();
            System.out.println(s[i]);
        }



        int max = 0;
        int num = 0;

        for(int i = 0; i<h;i++){
            for(int j = 0 ;j <h; j++){
                if(s[i].equals(s[j])){
                    num++;
                }
            }
            if(max < num){
                max = num;
            }

            num = 0;
        }

        return max;

    }
}
