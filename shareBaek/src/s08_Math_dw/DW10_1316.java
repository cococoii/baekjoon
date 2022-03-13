package s08_Math_dw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DW10_1316{
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int count = 0 ; // �׷�ܾ� ����
		
		for(int i=0; i<input; i++) {
			String str = br.readLine();			//�ܾ� �Է�
			boolean arr[] = new boolean[26];	//���ĺ� ��볻�� Ȯ�ι迭 (booleanŸ���� �迭�� default="false")
			boolean check = true;				//�׷�ܾ��̸� check=true
			
			for(int j=0; j<str.length(); j++) {
				int index = str.charAt(j)-'a';	//����ü������ �迭index = index
				
				//������ ��������� �ִ� ���ڶ��
				if(arr[index]) {	//=true : str�� �ش� index�� ���ĺ��� �����Ѵٸ�
					if(str.charAt(j)!=str.charAt(j-1)) {	//���� ���ڿ� ���ӵ��� �ʴ´ٸ�
						check=false;						//�׷�ܾ �ƴ�
						break;
					}
					
				//������ ������� ���� ���ڶ��	
				}else {	
					arr[index]=true;	//���ڻ�� üũ	
										//check�� �ǵ帮�� �ʾ���(�⺻default�� true�� �����Ǿ�����)
				}		
			}
			if(check) count++;
		}
		System.out.println(count);
	}
}