package s05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class MJ_06_8958 {

	public static void main(String[] args) throws IOException {
		//true��ȯ false��ȯ�ϴ°� ����?X
		//Hashset���� �ߺ��Ǵ� ���� ������ ����Ǹ鼭 true��ȯ�ϰ�?X 0 reset
		//�ߺ��Ǽ� ������� ������ false��ȯ�Ѵ�. count++
		//N�� �ݺ�
		//O X ������ �ϰ� �����ϳ�? O
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());

		//int array[] = new int[R];
		String array[] = new String[R]; //*

		for(int i=0;i<R;i++) {
			array[i]=br.readLine();
		}
		for(int i=0;i<R;i++) {

			int count=0;
			int sum=0;

			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') { //*
					count++;
				}else {
					count=0;
				}
				sum+=count;
			}
			System.out.println(sum);

		}
	}
}


