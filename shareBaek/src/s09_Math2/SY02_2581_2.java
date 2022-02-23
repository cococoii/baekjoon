package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY02_2581_2 {
	public static boolean prime[];

    static void getPrime(){
        //소수인 경우는 false, 소수가 아닌 경우는 true
        //0과 1은 무조건 false
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i<=Math.sqrt(prime.length);i++){
            for(int j=i*i;j< prime.length;j+=i){
                prime[j]=true;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());//제일 작은 수
        int N = Integer.parseInt(br.readLine());//제일 큰수

        prime = new boolean[N+1];//N도 포함해야하므로 +1
        getPrime();// 소수가 아닌 수들은 true 변하고, 소수인 경우는 false 초기값은 false이므로

        int sum =0;
        int min =0;
        for(int i=N;i>=M;i--){//최소값 구하기 위해서 마이너스 함,,
            if(prime[i]==false){
                sum +=i;
                min=i;
            }
        }
        if(sum ==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
