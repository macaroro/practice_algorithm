package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bulk {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		int[][] list = new int[test_case][2];
		
		for(int i=0;i<test_case;i++) {
			st = new StringTokenizer(br.readLine()," ");
			list[i][0] = Integer.parseInt(st.nextToken());//������
			list[i][1] = Integer.parseInt(st.nextToken());//Ű
		}
		
		for(int i =0;i<test_case;i++) {
			int rank=1;//�ϳ��� ���Ҷ� ���� �ٽ� �ʱ�ȭ
			
			for(int j=0;j<test_case;j++) {//���� �տ����� Ű�� �����԰� �ڿ� ���� ������ rank++
				if(i==j) continue;
				
				if(list[i][0]<list[j][0]&&list[i][1]<list[j][1]) {
					rank++;
				}
				
				
			}
			sb.append(rank).append(" ");
		}
		
		System.out.println(sb);

	}

}
