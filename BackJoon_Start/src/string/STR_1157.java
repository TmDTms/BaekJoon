package string;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer[] alphabet = new Integer[26];
		char tmp = ' ';
		String str = br.readLine().toUpperCase();
		
		for(int i = 0;i < 26; i++) {
			alphabet[i] = 0;
		}
		
		for(int i = 0;i < str.length(); i++) {
			tmp = str.charAt(i);
			
			for(int j = 0; j < 26; j++) {
				if((tmp - 'A') == j)
					alphabet[j] += 1;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i = 0;i < 26; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				ch = (char) (i + 65);
			}
			else if(alphabet[i] == max)
				ch = '?';
		}
		
		bw.write(ch + "\n");
		
		br.close();
		bw.close();
	}

}
