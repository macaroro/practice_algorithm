package study_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
public class Backjoon_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sbject = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		int[] score = new int [sbject];
		int M=0;//최댓값
		//평균을 구하려면(a+b+c)*100/M/3으로 변환 가능
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
