package study_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_12891 {
	static int[] password;//비밀번호가 될 조건:0,a/1,c/2,g/3,t
	static int[] check;//내가 선택한 문자열의 문자의 개수 체크하여 위에 배열과 비교용도
	static int checkSecret;//조건이 몇개 맞았는지 확인
	
	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int s = Integer.parseInt(st.nextToken());//dna 문자열의 길이
			int p = Integer.parseInt(st.nextToken());//비밀번호가 될 문자열 길이
			
			char[] dna = new char[s];
			check = new int[4];
			password = new int[4];
			int re=0;//조건의 맞는 문자열의 개수
			checkSecret=0;//check 배열과 password의 배열의 값이 같은가 봄
			
			dna = br.readLine().toCharArray();//입력한 문자열 배열에 저장
			
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<4;i++) {
				password[i] = Integer.parseInt(st.nextToken());
				if(password[i]==0) checkSecret++;
				
			}
			
			for(int i=0;i<p;i++) {//첫 문자열 부터 비밀번호 길이까지 일단 체크
				add(dna[i]);
			}
			
			if(checkSecret==4) re++;//만약 조건을 만족한다면 re++
			
			for(int i=p;i<s;i++) {//그 다음부턴 시작점을 한칸 앞으로(문자 제거) 끝점을 한칸뒤로(문자 추가)
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
				if(password[0]==check[0]) checkSecret--;//제거하기 전에 같다면 조건에 맞지 않은것 이므로 --
				check[0]--;//개수 또한 감소
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
