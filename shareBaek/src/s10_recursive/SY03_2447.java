package s10_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SY03_2447 {
	
    public static String[][] array;

    public static void star(int startX,int startY,int n){
        if(n==1){
            array[startX][startY]= "*";
            return;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!(i==1 &&j==1)){
                    star(startX+(n/3*i),startY+(n/3*j),n/3);
                }else{
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        array = new String[n][n];
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                array[i][j]=" ";
            }
        }
        star(0,0,n);
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                sb.append(array[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
