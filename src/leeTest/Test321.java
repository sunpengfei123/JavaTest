package leeTest;

public class Test321 {
    public static void main(String[] args) {

        /**
         *
         [1,6,5,4,7,3,9,5,3,7,8,4,1,1,4]
         [4,3,1,3,5,9]
         21
         */

//        int[] num1 = {1,6,5,4,7,3,9,5,3,7,8,4,1,1,4};
//        int[] num2 = {4,3,1,3,5,9};
        int[] num1 = {8,9,7,3,5,9,1,0,8,5,3,0,9,2,7,4,8,9,8,1,0,2,0,2,7,2,3,5,4,7,4,1,4,0,1,4,2,1,3,1,5,3,9,3,9,0,1,7,0,6,1,8,5,6,6,5,0,4,7,2,9,2,2,7,6,2,9,2,3,5,7,4,7,0,1,8,3,6,6,3,0,8,5,3,0,3,7,3,0,9,8,5,1,9,5,0,7,9,6,8,5,1,9,6,5,8,2,3,7,1,0,1,4,3,4,4,2,4,0,8,4,6,5,5,7,6,9,0,8,4,6,1,6,7,2,0,1,1,8,2,6,4,0,5,5,2,6,1,6,4,7,1,7,2,2,9,8,9,1,0,5,5,9,7,7,8,8,3,3,8,9,3,7,5,3,6,1,0,1,0,9,3,7,8,4,0,3,5,8,1,0,5,7,2,8,4,9,5,6,8,1,1,8,7,3,2,3,4,8,7,9,9,7,8,5,2,2,7,1,9,1,5,5,1,3,5,9,0,5,2,9,4,2,8,7,3,9,4,7,4,8,7,5,0,9,9,7,9,3,8,0,9,5,3,0,0,3,0,4,9,0,9,1,6,0,2,0,5,2,2,6,0,0,9,6,3,4,1,2,0,8,3,6,6,9,0,2,1,6,9,2,4,9,0,8,3,9,0,5,4,5,4,6,1,2,5,2,2,1,7,3,8,1,1,6,8,8,1,8,5,6,1,3,0,1,3,5,6,5,0,6,4,2,8,6,0,3,7,9,5,5,9,8,0,4,8,6,0,8,6,6,1,6,2,7,1,0,2,2,4,0,0,0,4,6,5,5,4,0,1,5,8,3,2,0,9,7,6,2,6,9,9,9,7,1,4,6,2,8,2,5,3,4,5,2,4,4,4,7,2,2,5,3,2,8,2,2,4,9,8,0,9,8,7,6,2,6,7,5,4,7,5,1,0,5,7,8,7,7,8,9,7,0,3,7,7,4,7,2,0,4,1,1,9,1,7,5,0,5,6,6,1,0,6,9,4,2,8,0,5,1,9,8,4,0,3,1,2,4,2,1,8,9,5,9,6,5,3,1,8,9,0,9,8,3,0,9,4,1,1,6,0,5,9,0,8,3,7,8,5};
        int[] num2 = {7,8,4,1,9,4,2,6,5,2,1,2,8,9,3,9,9,5,4,4,2,9,2,0,5,9,4,2,1,7,2,5,1,2,0,0,5,3,1,1,7,2,3,3,2,8,2,0,1,4,5,1,0,0,7,7,9,6,3,8,0,1,5,8,3,2,3,6,4,2,6,3,6,7,6,6,9,5,4,3,2,7,6,3,1,8,7,5,7,8,1,6,0,7,3,0,4,4,4,9,6,3,1,0,3,7,3,6,1,0,0,2,5,7,2,9,6,6,2,6,8,1,9,7,8,8,9,5,1,1,4,2,0,1,3,6,7,8,7,0,5,6,0,1,7,9,6,4,8,6,7,0,2,3,2,7,6,0,5,0,9,0,3,3,8,5,0,9,3,8,0,1,3,1,8,1,8,1,1,7,5,7,4,1,0,0,0,8,9,5,7,8,9,2,8,3,0,3,4,9,8,1,7,2,3,8,3,5,3,1,4,7,7,5,4,9,2,6,2,6,4,0,0,2,8,3,3,0,9,1,6,8,3,1,7,0,7,1,5,8,3,2,5,1,1,0,3,1,4,6,3,6,2,8,6,7,2,9,5,9,1,6,0,5,4,8,6,6,9,4,0,5,8,7,0,8,9,7,3,9,0,1,0,6,2,7,3,3,2,3,3,6,3,0,8,0,0,5,2,1,0,7,5,0,3,2,6,0,5,4,9,6,7,1,0,4,0,9,6,8,3,1,2,5,0,1,0,6,8,6,6,8,8,2,4,5,0,0,8,0,5,6,2,2,5,6,3,7,7,8,4,8,4,8,9,1,6,8,9,9,0,4,0,5,5,4,9,6,7,7,9,0,5,0,9,2,5,2,9,8,9,7,6,8,6,9,2,9,1,6,0,2,7,4,4,5,3,4,5,5,5,0,8,1,3,8,3,0,8,5,7,6,8,7,8,9,7,0,8,4,0,7,0,9,5,8,2,0,8,7,0,3,1,8,1,7,1,6,9,7,9,7,2,6,3,0,5,3,6,0,5,9,3,9,1,1,0,0,8,1,4,3,0,4,3,7,7,7,4,6,4,0,0,5,7,3,2,8,5,1,4,5,8,5,6,7,5,7,3,3,9,6,8,1,5,1,1,1,0,3};

        int[] re = maxNumber(num1,num2,500);
//        System.out.println(num1.length);
        for(int i:re){
            System.out.print(i+" ");
        }

    }

    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[]  re = new int[k];
        StringBuilder sb = new StringBuilder();
        String s = ff(nums1,nums2,k,-1,-1,-1,sb);
//        System.out.println(s);
        for(int i = 0 ; i<k; i++){
            re[i] = s.charAt(i)-'0';
        }
        return re;

    }

    public static String ff(int[] nums1, int[] nums2, int k, int in1, int in2, int you, StringBuilder re){
        int dis = nums1.length + nums2.length - in1 - in2 - k + you;

        int max1 = -1;
        int max2 = -1;

        int next1 = -1;
        int next2 = -1;

//        System.out.println("in1::"+in1);
//        System.out.println("in2::"+in2);
//        System.out.println("dis::"+dis);
//        System.out.println("you::"+you);
//        System.out.println();

        if(you >= k-1){
//            System.out.println("re::");
//            for(int i:re){
//                System.out.print(i+" ");
//            }
//            System.out.println();
            return re.toString();
        }

        for(int i = in1+1; i<=in1+dis && i<nums1.length; i++){
            if(max1 < nums1[i]){
                max1 = nums1[i];
                next1 = i;
            }
        }

        for(int i = in2+1; i<=in2+dis && i < nums2.length; i++){
            if(max2 < nums2[i]){
                max2 = nums2[i];
                next2 = i;
            }
        }

        if(max1 > max2){
            re.append(max1);
            return ff(nums1,nums2,k,next1,in2,you+1,re);
        }else if(max2 > max1){
            re.append(max2);
            return ff(nums1,nums2,k,in1,next2,you+1,re);
        }
//        else if(dis == 1){
//            for(int i = 2; i<nums1.length-1-next1 && i<nums2.length-1-next2; i++){
//                if(nums1[in1+i] > nums2[in2+i]){
//                    re[you+1] = max1;
//                    return ff(nums1,nums2,k,next1,in2,you+1,re);
//                }else if(nums1[in1+i] < nums2[in2+i]){
//                    re[you+1] = max2;
//                    return ff(nums1,nums2,k,in1,next2,you+1,re);
//                }
//            }
//
//            int[] re1 = new int[k];
//            int[] re2 = new int[k];
//            re[you+1] = max2;
//            for(int j = 0; j<=you+1; j++){
//                re1[j] = re[j];
//                re2[j] = re[j];
//            }
//
//            re1 = ff(nums1,nums2,k,next1,in2,you+1,re1);
//            re2 = ff(nums1,nums2,k,in1,next2,you+1,re2);
//
//            for(int j = 0; j<k; j++){
//                if(re1[j] > re2[j]){
//                    return re1;
//                }else if(re1[j] < re2[j]){
//                    return re2;
//                }
//            }
//            return re1;
//
//        }
        else{

            re.append(max1);

            int[] re1 = new int[k];
            int[] re2 = new int[k];

            StringBuilder sb1 = new StringBuilder(re);
            StringBuilder sb2 = new StringBuilder(re);

//            for(int j = 0; j<=you+1; j++){
//                re1[j] = re[j];
//                re2[j] = re[j];
//            }

//            System.out.println(re.toString());

            String ss1 = ff(nums1,nums2,k,next1,in2,you+1,sb1);
            String ss2 = ff(nums1,nums2,k,in1,next2,you+1,sb2);

            if (ss1.compareTo(ss2) >= 0) {
//                System.out.println(ss1);
                return ss1;
            }else{
                return ss2;
            }

//            for(int i = 0; i<k; i++){
//                if(re1[i] > re2[i]){
//                    for(int j = 0; j<=you+1;j++ ){
//                        re1[j] = re[j];
//                    }
//                    return re1;
//                }else if(re1[i] < re2[i]){
//                    for(int j = 0; j<=you+1;j++ ){
//                        re2[j] = re[j];
//                    }
//                    return re2;
//                }
//            }
//            for(int j = 0; j<=you+1;j++ ){
//                re1[j] = re[j];
//            }
//            return re1;
        }

    }
}

