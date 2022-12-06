package practice_Algorithm.debuging;

import java.util.Scanner;

public class Debuging {

	//문제: 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오(오류찾기:디버깅 연습)
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		//int answer = 0;//변수의 초기화의 잘못(계속 testcase가 돌때마다 그 값이 저장됨)
		
		//int[] a = new int[100001];
	//	int[] s = new int[100001];//배열을 보면 음수로 저장되어 있는 것이 보임 자료형이 달라서 그럼 long로 바꿔야 됨
		
		long[] a = new long[100001];
		long[] s = new long[100001];
		for(int i=1;i<=100000;i++) {
			a[i] = (long)(Math.random()*Long.MAX_VALUE);
			//s[i] = s[i-1]+a[i];//배열안에 값이 계속 0으로 채워짐 잘못 넣음(구간합을 넣은 배열)
			s[1]=a[1];
			s[i] = s[i-1]+a[i];
		}
		
		for(int t=1;t<testcase;t++) {
			int query = sc.nextInt();
			int answer=0;
			for(int i=0;i<query;i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += s[end]-s[start-1];
				//System.out.println(testcase+" "+answer);//각 테스트케이스의 값을 알 고 싶은것 그러니 testcase를 t로 바꿔야 함
				System.out.println(t+" "+answer);
			}
		}

	}

}
