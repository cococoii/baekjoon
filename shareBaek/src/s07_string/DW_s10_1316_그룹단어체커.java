package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DW_s10_1316_�׷�ܾ�üĿ {
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		//���� ����� ������, Ʋ������ ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		boolean check = true;

		for(int b=0; b<input; b++) {	//�Է¹��� �ܾ��� ������ŭ for����
			String str = br.readLine();	//�ܾ� �Է¹ޱ�

			//(1)�ܾ��� ���̰� 1�̰ų� 2�϶� 
			if(str.length()==1 || str.length()==2) {	
				count++;}		// �׷�ܾ�üĿ �� +1
				
			//(2)�ܾ��� ���̰� 3�� ��	
			else if(str.length()==3){					
				if(!(str.charAt(0)==str.charAt(2)&&str.charAt(0)!=str.charAt(1))) {		
					count++;	//	index(0)�� index(2)�� �����ϰ�, index(0)�� index(1)�� �ٸ��� �׷�ܾ�ƴ�
								//	�̿��� ��쿡�� ��� conunt++
				}
				
			//(3)�ܾ��� ���̰� 4�̻��� ��	
			}else {	
				for(int i=0; i<str.length(); i++) {		//���ϴ� index ��ü=i
					for(int j=i+2; j<str.length(); j++) {	//�񱳴�� index = j

						if(str.charAt(i)==str.charAt(j)) {
							check=false;	//index+2�� ���ڿ� �����ϴٸ� ->�׷�ܾ�ƴ� (false)
						}	
					}
				}if(check==true) count++;
			}
		}
		System.out.println(count);
	}
}
