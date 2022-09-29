package practice_Algorithm.Roop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus_Cycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int x = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = x;
        
		do {
			x = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10);
			cnt++;
		} while (copy != x);
		
		System.out.println(cnt);
	}

}
