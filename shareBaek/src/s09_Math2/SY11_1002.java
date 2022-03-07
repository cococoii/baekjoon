package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SY11_1002 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double d = Math.pow(x1-x2,2)+Math.pow(y1-y2,2); //두 중심사이의 거리

            if(d==0 && r1==r2){ //중심이 일치하고 반지름이 같은 경우 -> 완전 동일
                System.out.println(-1);//개수는 무한대
            }else if(d<Math.pow(r1-r2,2) || d>Math.pow(r1+r2,2)){
                //한 원이 다른 원 사이에 있지만 만나지 않는 경우 , 두 원이 떨어여 있어서 만나지 않는 경우 
                // 중심이 일치하고 만나지 않는 경우
                System.out.println(0);
            }else if(d==Math.pow(r1-r2,2)|| d==Math.pow(r1+r2,2)){
                //두 원이 외접한 경우, 내접한 경우
                System.out.println(1);
            }else{
                //두원이 겹치는 경우
                System.out.println(2);
            }
        }
    }
}
