package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] alpha = new int[26];
		for(int i = 0;i < 26; i++)
			alpha[i] = -1;
		
		for(int i = 0;i < str.length(); i++) {
			if(alpha[str.charAt(i) - 97] == -1)
				alpha[str.charAt(i) - 97] = i;
		}
		
		for(int i = 0;i < 26;i++)
			bw.write(alpha[i] + " ");
		
		
		br.close();
		bw.close();
	}

}
