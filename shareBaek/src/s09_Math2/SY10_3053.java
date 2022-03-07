package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY10_3053 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        System.out.println(Math.pow(R,2)*Math.PI);
        System.out.println(Math.pow(2*R,2)*1/2);//마름모 넓이 구하는 공식
    }
}
