package s09_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SY09_4153 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("0 0 0")){
                break;
            }
            StringTokenizer st = new StringTokenizer(s," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int[] array = new int[]{x,y,z};
            Arrays.sort(array);
            if(Math.pow(array[0],2)+Math.pow(array[1],2)==Math.pow(array[2],2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }


    }
}
