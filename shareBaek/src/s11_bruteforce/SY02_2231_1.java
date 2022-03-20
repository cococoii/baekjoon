package s11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY02_2231_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //216이라고 하면 일의자리 9, 십의 자리 9가 최대 , 백의 자리의 최대는 2
        //216- 9- 9- 2 = 196 start
        //(int)Math.log10(N)+1 -> 정수형 자리수       //정수형 자리수-1 ^10 로 나눈 몫 (백의 자리 값)
        int start = N - (int)(Math.log10(N))*9 - N/(int)Math.pow(10,(int)(Math.log10(N)));
        int result = 0;
        for(int i=start;i<N;i++){
            int number = i;// i값이 계속 변할 수 없으므로 변수 설정
            int sum = 0;//각 자릿수
            while (number >0){
                sum += number%10;
                number /=10;
            }
            if(sum + i ==N){ 
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}