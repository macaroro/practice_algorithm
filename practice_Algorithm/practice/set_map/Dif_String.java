package practice_Algorithm.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dif_String {

	public static void main(String[] args) throws IOException {
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Set<String> list = new HashSet<>();
		
		int size=str.length();
		
		for(int i=1;i<size+1;i++) {
			for(int j=0;j<size-i+1;j++) {
				list.add(str.substring(j,j+i));		
				}
		}
		
		System.out.println(list.size());

	}

}
