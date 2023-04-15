package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remainder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int num_count = Integer.parseInt(st.nextToken());//���� ����
		int mod = Integer.parseInt(st.nextToken());//������ ��
		
		int sum = 0;
	    int[] count = new int[mod];
	    
	    st = new StringTokenizer(br.readLine());
	    for (int i = 0; i < num_count; i++) {
	            sum = (sum + Integer.parseInt(st.nextToken())) % mod;//�������� �������� ����
	            count[sum]++;//�������� �ε����� ��� �� ���� �ϳ��� �ø���.
	    }

	    long ans = count[0];//�������� �������� 0�� ��
	    
	    // 3. S[j] % M == S[i-1] % mod �� �����ϴ� (i,j)�� ���� ������� ���Ѵ�.
        // ��, count[i](i�� �������� �ε����� ��)���� 2������ �̴� ����� �� ī�����Ѵ�.
	    //������ ������ ǥ���ϸ�  aCb = a*(a-1))/2
	    for (int i = 0; i < mod; i++) {
	            ans += (long) count[i] * (count[i] - 1) / 2;
	     }
	    System.out.println(ans);

}
}
