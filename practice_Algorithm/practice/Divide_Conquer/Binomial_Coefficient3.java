package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binomial_Coefficient3 {
	
	final static long MOD = 1000000007;//���� ��
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		// ���� n!
		long numer = factorial(n);
		
		// �и� (k! * (n-k)!) % MOD
		long denom = factorial(k) * factorial(n - k) % MOD;	
	
		
		// n! * �и��� ����((k! * (n-k)!)  
		System.out.println(numer * pow(denom, MOD - 2) % MOD);
		
	}
	
	
	// ���丮�� �Լ� 
	public static long factorial(long N) {
		long fac = 1L;
		
		while(N > 1) {
			fac = (fac * N) % MOD;
			N--;
		}
		return fac;
	}
	
 
	/*
	 * ���� ���ϴ� �Լ� 
	 * 
	 * base : ��,   expo = ���� (exponent)
	 * 
	 * �ŵ� ������ ���� ���� ������� Ǭ��.
	 * 
	 */
	public static long pow(long base, long expo) {
		// ������ 1�� ��� base^1 �̹Ƿ� base % P�� ����
		if(expo == 1) {
			return base % MOD;
		}
		
		// ������ ���ݿ� �ش��ϴ� base^(expo / 2) �� ���Ѵ�.
		long temp = pow(base, expo / 2);
		
		/*
		 * ���� ������ Ȧ �� ���ٸ�
		 * base^(expo / 2) * base^(expo / 2) * base �̹Ƿ�
		 * base�� �� �� �� �����־�� �Ѵ�.
		 * 
		 * ex) A^9 = A^4 * A^4 * A
		 */
		if(expo % 2 == 1) {
			return (temp * temp % MOD) * base % MOD;
		}
		return temp * temp % MOD;
		
	}
	

}
