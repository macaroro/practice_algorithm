package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittlePrince {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int test_Case=Integer.parseInt(br.readLine());
		
		while(test_Case-->0) {//������� �������� �¤Ф�
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			int n=Integer.parseInt(br.readLine());//�༺ ����
			
			int count=0;//�༺ ����/ ��Ż
			
			
			for(int i=0;i<n;i++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int r=Integer.parseInt(st.nextToken());//�༺�� ������
				
				//�������� �༺ �ȿ� �ִ��� �Ǻ� (�ȿ� ������ false, �ۿ� ������ true)
				boolean flag1=false;
				//�������� �༺ �ȿ� �ִ��� �Ǻ� 
				boolean flag2=false;
				
				//��Ÿ��� �������� �� r�� ���� -> �캯�� �º����� ���� ��쿡 �༺ �ۿ� �ִ� ��� 
				if(Math.pow(x1-x, 2)+Math.pow(y1-y, 2)>Math.pow(r, 2)) flag1=true;
				if(Math.pow(x2-x, 2)+Math.pow(y2-y, 2)>Math.pow(r, 2)) flag2=true;
				
				
				//�������� �������� �ٸ� ���� �ִ� ��쿡 ������ -> ���������� �� �� ��輱�� ������ ������ answer�� �����ش� 
				if(flag1!=flag2) count++;
			}
			
			System.out.println(count);
		}	
	}

}
