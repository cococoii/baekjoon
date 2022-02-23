package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY02_2581 {
	
	//소수 일 때의 작업으로 이용한 경우
	static int returnDecimal(int x){
        if(x==1) return 0;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return 0;// 소수가 아닐 경우는 0 반환
            }
        }
        return x;//소수 일 경우는 x값 반환
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        int min =M;
        for(int j=N;j>=M;j--){
            if(returnDecimal(j)!=0){
                min =j;
                sum +=j;
            };
        }
        if(sum==0){
            min=-1;
            System.out.println(min);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
