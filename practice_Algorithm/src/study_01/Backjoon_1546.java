package study_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
public class Backjoon_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sbject = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		int[] score = new int [sbject];
		int M=0;//�ִ�
		//����� ���Ϸ���(a+b+c)*100/M/3���� ��ȯ ����
		int sum_score=0;
		double avg=0;
		for(int i=0; i<sbject;i++)
		{
			score[i]  = Integer.parseInt(st.nextToken());
			sum_score +=score[i];
			if(M<score[i]) 
			{
				M=score[i];
			}
		}
		
		avg = sum_score*100.0/M/sbject;
		System.out.println(avg);
		

	}

}
