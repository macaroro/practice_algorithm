package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ascll {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char str =br.readLine().charAt(0);
		
		int num = str;
		System.out.println(num);
	}

}
