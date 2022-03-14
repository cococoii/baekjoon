package s10_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY04_11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void hanoi(int n, int start, int middle,int end){
        //첫번째의 경우 (n=1) 1->3으로 옮겨 지므로 start -> end
        if(n==1){
            sb.append(start+" "+end+"\n");
            //system.println으로 했더니 시간 초과 나옴
            return;
        }
        /*
        n = 2인 경우
        1->2 ( n=1일때와 동일한데 start = 1(start), end =2(middle) 이므로 (n-1, start, end,middle)
        즉, end와 middle의 자리바꿈
        ----------------
        1->3 가운데는 무조건 start -> end로 이동
        ----------------
        2->3 ( n=1일때와 동일하지만 start=2(middle), end=3(end)이므로 (n-1, middle,start,end)
        즉, start,middle의 자리바꿈
         */

        /*
        n=3인 경우
        1-> 3
        1-> 2
        3-> 2 // 1-> 2 (2개 옮김 )
        ------
        1->3 //제일 밑에 있는 거 옮김
        ------
        2-> 1
        2-> 3
        1-> 3 // 1-> 3 ( 2개 옯김)
         */

        hanoi(n-1,start,end,middle);
        sb.append(start+ " "+end+"\n");
        hanoi(n-1,middle,start,end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) Math.pow(2,N)-1).append("\n");

        hanoi(N,1,2,3);
        System.out.println(sb);
    }
}
