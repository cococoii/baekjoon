package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY06_9020 {
	//-----boolean 수 지정 한 경우 10001 -------
    //골드바흐의 추측
    //처음 입력 - 테스트 케이스 개수
    //2보다 큰 짝수 n이 주어졌을 때 n의 골드바흐 파티션 출력
    //만약 가능한 n의 골드 파티션의 여러가지의 경우에는 두소수의 차이가 가장 작은 것을 추출
    //Ex ) 8-> 3,5 , 10 -> 5,5, 16 -> 5,11
    public static boolean prime[]=new boolean[10001];

    static void getPrime(){
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i< Math.sqrt(prime.length);i++){
            for(int j=i*i;j< prime.length;j+=i){
                prime[j]=true;//소수가 아닐 경우
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        getPrime();
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=n/2;j<n+1;j++){
                if(!prime[j]&& !prime[n-j]){
                    System.out.println((n-j)+" "+j);
                    break;
                }
            }
        }
    }
}
