package s11_bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SY02_2231_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String으로 받아들이기
        String str_N = br.readLine();

        //N의 자리수 구하기
        int N_len = str_N.length();

        int N = Integer.parseInt(str_N);
        int result = 0;

        //216 - 9*3부터 시작
        for(int i = N-N_len*9; i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }

}