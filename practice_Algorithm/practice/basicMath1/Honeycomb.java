package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count=1;
		int range=2;
		
		if(num==1) {
			System.out.println(1);
		}else {
			while(range<=num) {
				range=range+(6*count);
				count++;
			}
			System.out.println(count);
		}

	}

}
