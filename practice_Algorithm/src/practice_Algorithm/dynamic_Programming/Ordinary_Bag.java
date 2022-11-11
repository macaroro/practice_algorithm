package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ordinary_Bag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//�׽�Ʈ ���̽�
		int n = Integer.parseInt(st.nextToken());
		//�ִ�� ���� �� �� �ִ� ����
		int kg = Integer.parseInt(st.nextToken());
		
		
		int[] weight = new int[n + 1]; // ����
		int[] value = new int[n + 1]; // ��ġ
		
		int[] lcs = new int[kg + 1];//������ ���� ����ϱ� ���� �迭
		
		//�� ��ǰ�� ���Կ� ��ġ�� �迭�� ����
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			weight[i]=Integer.parseInt(st.nextToken());
			value[i]=Integer.parseInt(st.nextToken());
		}
		
		
		//0�� �ƹ� ���Ե� ���� 1���� ����
		for (int i = 1; i <= n; i++) {
			
			// K���� Ž���Ͽ� ���� �� �ִ� ���� �Ѱ�ġ�� ���� ���� ������ �ݺ� 
			for (int j = kg; j - weight[i] >= 0; j--) {
				lcs[j] = Math.max(lcs[j], lcs[j - weight[i]] + value[i]);
			}
		}
		System.out.println(lcs[kg]);
	
	}

}
