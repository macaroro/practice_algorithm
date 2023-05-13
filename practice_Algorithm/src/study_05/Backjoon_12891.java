package study_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_12891 {
	static int[] password;//��й�ȣ�� �� ����:0,a/1,c/2,g/3,t
	static int[] check;//���� ������ ���ڿ��� ������ ���� üũ�Ͽ� ���� �迭�� �񱳿뵵
	static int checkSecret;//������ � �¾Ҵ��� Ȯ��
	
	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int s = Integer.parseInt(st.nextToken());//dna ���ڿ��� ����
			int p = Integer.parseInt(st.nextToken());//��й�ȣ�� �� ���ڿ� ����
			
			char[] dna = new char[s];
			check = new int[4];
			password = new int[4];
			int re=0;//������ �´� ���ڿ��� ����
			checkSecret=0;//check �迭�� password�� �迭�� ���� ������ ��
			
			dna = br.readLine().toCharArray();//�Է��� ���ڿ� �迭�� ����
			
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<4;i++) {
				password[i] = Integer.parseInt(st.nextToken());
				if(password[i]==0) checkSecret++;
				
			}
			
			for(int i=0;i<p;i++) {//ù ���ڿ� ���� ��й�ȣ ���̱��� �ϴ� üũ
				add(dna[i]);
			}
			
			if(checkSecret==4) re++;//���� ������ �����Ѵٸ� re++
			
			for(int i=p;i<s;i++) {//�� �������� �������� ��ĭ ������(���� ����) ������ ��ĭ�ڷ�(���� �߰�)
				int j = i-p;
				add(dna[i]);
				remove(dna[j]);
				if(checkSecret==4) re++;
			}
			
			System.out.println(re);
		}

		private static void add(char c) {
			switch (c) {
			case 'A': 
				check[0]++;
				if(password[0]==check[0]) checkSecret++;
				break;

			case 'C': 
				check[1]++;
				if(password[1]==check[1]) checkSecret++;
				break;
			case 'G': 
				check[2]++;
				if(password[2]==check[2]) checkSecret++;
				break;
			case 'T': 
				check[3]++;
				if(password[3]==check[3]) checkSecret++;
				break;
			}
			
		}

		private static void remove(char c) {
			switch (c) {
			case 'A': 
				if(password[0]==check[0]) checkSecret--;//�����ϱ� ���� ���ٸ� ���ǿ� ���� ������ �̹Ƿ� --
				check[0]--;//���� ���� ����
				break;

			case 'C': 
				
				if(password[1]==check[1]) checkSecret--;
				check[1]--;
				break;
			case 'G': 
				
				if(password[2]==check[2]) checkSecret--;
				check[2]--;
				break;
			case 'T': 
				
				if(password[3]==check[3]) checkSecret--;
				check[3]--;
				break;
			}
			
			
		}
}
