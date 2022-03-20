package s11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SY03_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] array= new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            array[i][0]=Integer.parseInt(st.nextToken());
            array[i][1]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int rank=1;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(array[i][0]<array[j][0] && array[i][1]<array[j][1]){//작은 경우 ++
                    rank++;
                }
            }
            sb.append(rank+" ");
        }
        System.out.println(sb);
    }
}
