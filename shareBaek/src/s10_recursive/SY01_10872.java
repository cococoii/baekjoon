package s10_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY01_10872 {
    public static int factorial(int n){
        if(n==0) return 1;
        return factorial(n-1)*n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
}
