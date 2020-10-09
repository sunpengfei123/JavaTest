package niukeTest;

public class Test834 {
    public static void main(String[] args) {

        int N = 6;
        int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};

        int[] dis = sumOfDistancesInTree(N,edges);

        for(int i = 0; i<N; i++){
                System.out.print(dis[i]);
                System.out.print(" ");

        }

    }

    public static int[] sumOfDistancesInTree(int N, int[][] edges) {

        int[][] dis = new int[N][N];

        for(int i = 0; i<edges.length;i++){
            dis[edges[i][0]][edges[i][1]] = 1;
            dis[edges[i][1]][edges[i][0]] = 1;
        }



        int i = 1;

        while(i<N){
            for(int j = 0; j<N; j++){
                for(int k = 0; k<N; k++){
                    if(dis[j][k] != 0){
                        for(int m = 0; m<N; m++){
                            if(dis[k][m] != 0 && m!=j){
                                if( dis[j][m] == 0){
                                    dis[j][m] = dis[j][k] + dis[k][m];
                                }else{
                                    dis[j][m] = dis[j][k] + dis[k][m] < dis[j][m]?dis[j][k] + dis[k][m]:dis[j][m];
                                }

                            }
                        }
                    }
                }
            }

            i++;
        }

        for(int ii = 0; ii<N; ii++){
            for(int j = 0; j<N; j++){
                System.out.print(dis[ii][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();


        int[] re = new int[N];

        for(int ii = 0; ii<N; ii++){
            for(int j = 0; j<N; j++){
                re[ii] += dis[ii][j];
            }
        }

        return re;

    }
}
