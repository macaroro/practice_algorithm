package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remainder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int num_count = Integer.parseInt(st.nextToken());//수의 개수
		int mod = Integer.parseInt(st.nextToken());//나누는 수
		
		int sum = 0;
	    int[] count = new int[mod];
	    
	    st = new StringTokenizer(br.readLine());
	    for (int i = 0; i < num_count; i++) {
	            sum = (sum + Integer.parseInt(st.nextToken())) % mod;//누적합의 나머지를 구함
	            count[sum]++;//나머지를 인덱스로 삼아 그 값을 하나씩 늘린다.
	    }

	    long ans = count[0];//누적합의 나머지가 0인 수
	    
	    // 3. S[j] % M == S[i-1] % mod 을 만족하는 (i,j)의 수를 결과값에 더한다.
        // 즉, count[i](i가 나머지인 인덱스의 수)에서 2가지를 뽑는 경우의 수 카운팅한다.
	    //조합을 식으로 표션하면  aCb = a*(a-1))/2
	    for (int i = 0; i < mod; i++) {
	            ans += (long) count[i] * (count[i] - 1) / 2;
	     }
	    System.out.println(ans);

}
}
