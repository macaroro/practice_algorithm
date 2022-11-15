package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Intercal_Sum4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		
		int num_count = Integer.parseInt(st.nextToken());
		int add_count = Integer.parseInt(st.nextToken());
		
		int[] list = new int[num_count+1];
		
		st = new StringTokenizer(br.readLine()," ");
		list[0]=0;
		for(int i=1;i<=num_count;i++) {
			//�迭�� �������� ����
			list[i]=list[i-1]+Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=add_count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			//���� ������ �������� ���� ������ �������� �����տ�
			//���� �������� ��ĭ �Ʒ��� �������� ���� ���� �� ����
			sb.append(list[end]-list[start-1]).append("\n");
		}
		
		System.out.println(sb);
		

	}

}
