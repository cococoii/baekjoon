package s08_Math_dw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s01_1712_���ͺб��� {

	/* A : �������
	 * B : �������
	 * C : ��Ʈ�ϰ��� 
	 * 
	 ** �Ѻ��� �Ѽ����� �������� ����
	 * (n*��Ʈ�� ����) = ������� + (n*�������)
	 * => n = �������/��Ʈ�ϰ���-�������
	 * => n = (A / C-B)
	 * 
	 ** ������ �߻��ϴ� ���� = n+1
	 * 
	 * ������ �߻����� �ʴ� ���� : C-B<=0
	 * */
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
 
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}		
	}
	
}
