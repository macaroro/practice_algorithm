package practice_Algorithm.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Start_Link {

	
	static int people;
	static int[][] map;
	static boolean[] visit;
	
	static int min= Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		people = Integer.parseInt(br.readLine());
 
		map = new int[people][people];
		visit = new boolean[people];
 
 
		for (int i = 0; i < people; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < people; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		combi(0, 0);
		System.out.println(min);
 
	}
 
	// idx�� �ε���, count�� ���� ����(=��� ����)
	static void combi(int idx, int count) {
		// �� ������ �ϼ��� ���
		if(count == people / 2) {
			/*
			 �湮�� ���� �湮���� ���� ���� ���� ������
			 �� ���� ������ ���� �� �ּڰ��� ã�´�.
			*/
			diff();
			return;
		}
 
		for(int i = idx; i < people; i++) {
			// �湮���� �ʾҴٸ�?
			if(!visit[i]) {
				visit[i] = true;	// �湮���� ����
				combi(i + 1, count + 1);	// ��� ȣ��
				visit[i] = false;	// ��Ͱ� ������ ��湮���� ����
			}
		}
	}
 
	// �� ���� �ɷ�ġ ���̸� ����ϴ� �Լ� 
	static void diff() {
		int team_start = 0;
		int team_link = 0;
 
		for (int i = 0; i < people - 1; i++) {
			for (int j = i + 1; j < people; j++) {
				// i ��° ����� j ��° ����� true��� ��ŸƮ������ ���� �÷��� 
				if (visit[i] == true && visit[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				// i ��° ����� j ��° ����� false��� ��ũ������ ���� �÷��� 
				else if (visit[i] == false && visit[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		// �� ���� ���� ���� (����)
		int val = Math.abs(team_start - team_link);
		
		/*
		  �� ���� �������� 0�̶�� ���� ���� �ּڰ��̱� ������
		  ���̻��� Ž�� �ʿ���� 0�� ����ϰ� �����ϸ� �ȴ�.
		 */
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
				
	}
}
