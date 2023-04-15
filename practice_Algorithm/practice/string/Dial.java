package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Dial {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='A'||c=='B'||c=='C') {
				list.add(2);
			}else if(c=='D'||c=='E'||c=='F') {
				list.add(3);
			}else if(c=='G'||c=='H'||c=='I') {
				list.add(4);
			}else if(c=='J'||c=='K'||c=='L') {
				list.add(5);
			}else if(c=='M'||c=='N'||c=='O') {
				list.add(6);
			}else if(c=='P'||c=='Q'||c=='R'||c=='S') {
				list.add(7);
			}else if(c=='T'||c=='U'||c=='V') {
				list.add(8);
			}else if(c=='W'||c=='X'||c=='Y'||c=='Z') {
				list.add(9);
			}
			
		}
		
		int add=0;
		for(int i=0;i<list.size();i++) {
			add+= list.get(i)+1;
			
		}
		System.out.println(add);
		
		
	}

}
