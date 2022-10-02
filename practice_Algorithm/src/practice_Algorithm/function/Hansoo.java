package practice_Algorithm.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansoo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		hanSu(n);
		br.close();
	}
	
	public static void hanSu(int n){
		int count = 0;
		if(n<100) System.out.println(n);
		else {
			for(int i=100;i<=n;i++) {
				int i1 = i/100; 
				int i2 = i%100/10; 
				int i3 = i%10;
				if((i1 - i2)==(i2 - i3))
					count++;
			}
			System.out.println(99+count);
		}
	}
}
