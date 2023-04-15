package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie_Director {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
	    int first = 666;
	    int count=1;
	    
	    while(count !=num){
	    {
	    	first++;
	    	if(String.valueOf(first).contains("666")) {
	    		count++;
	    	}
	    }

	}
	    System.out.println(first);

}
}
