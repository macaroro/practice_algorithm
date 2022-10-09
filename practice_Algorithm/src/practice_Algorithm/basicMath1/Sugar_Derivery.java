package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_Derivery {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int kg = Integer.parseInt(br.readLine());
	     
	     if(kg%5==3) {
	    	 System.out.println((kg/5)+1);
	     }else if(kg%5==0&& kg%15==0) {
	    	 System.out.println(kg/5);
	     }else if(kg%3==0) {
	    	 System.out.println(kg/3);
	     }else if(kg%8==3||kg%8==5) {
	    	 System.out.println(((kg/8)*2)+1);
	     }else {
	    	 System.out.println(-1);
	     }


	}

}
