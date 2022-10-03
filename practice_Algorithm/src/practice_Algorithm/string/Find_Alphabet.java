package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Find_Alphabet {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String alphabet = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for(int i=0; i<alphabet.length();i++) {
			list.add(alphabet.charAt(i));
		}
		for(char c = 'a'; c<='z';c++) {
			if(list.indexOf(c)>=0) {
				System.out.print(list.indexOf(c)+" ");
				
			}else {
				System.out.print(-1+" ");
			}
		}
		
	}
		
		
		

}
