package study_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon_2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int start=0, end=0; //�������� ����
		int sum=0, cnt=0; //sum: ��, cnt: ������(����)
		while(start<=N) {
			while(++end<=N) { //end ����
				sum += end; //�κ����� ����
				if(sum>=N) {
					if(sum==N) cnt++;
					break;
				}
			}
			while(++start<=N) { //start ����
				sum -= start; //�κ����� ����
				if(sum<=N) {
					if(sum==N) cnt++;
					break;
				}
			}	
		}
		System.out.println(cnt);
	}

}
