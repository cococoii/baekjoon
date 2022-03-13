package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY05_4948 {
	//함수로 표현한 식- 
    public static boolean prime[];

    static void getPrime(){
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i<Math.sqrt(prime.length);i++){
            for(int j=i*i;j< prime.length;j+=i){
                prime[j]=true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count =0;
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            prime = new boolean[2*n+1];
            getPrime();//이것이 메모리 시간을 잡아먹는데 오래걸림 - 맨날 다시 소수 구하므로 
            count =0;
            for(int i=n+1;i<2*n+1;i++){
                if(!prime[i]){
                    count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
