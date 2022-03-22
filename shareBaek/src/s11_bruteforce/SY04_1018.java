package s11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SY04_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//M N
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                array[i][j] = s.charAt(j);
            }
        }
        int min = M * N;//64라고 지정해도 무관
        for (int i = 0; i < M - 7; i++) {
            for (int j = 0; j < N - 7; j++) {
                int B = 0;//B부터 시작했을 때 다시 칠해야하는 수
                int W = 0;//W부터 시작했을 때 다시 칠해야하는 수
                for (int p = i; p < i + 8; p++) {
                    for (int q = j; q < j + 8; q++) {
                        //한줄에 한글자씩 뽑아서 비교
                        if ((p + q) % 2 == 0) {//(홀,홀),(짝,짝)
                            if (array[p][q] == 'B') W++;
														//B로 시작했을 경우 합은 짝수일때는 B이므로 B인 경우 더하지 않고 W로 시작한 경우에는 더해준다.
                            else B++;//그 와달리 W인 경우는 반대
                        } else {
                            if (array[p][q] == 'W') W++;
														//B로 시작한 경운에 BWBW 이므로 둘의 합이 홀수 인 경우는 W
                            else B++;
                        }
                    }
                }
                min = Math.min(min, Math.min(B, W));
                //System.out.println(min);
            }
        }
        System.out.println(min);
    }
}
