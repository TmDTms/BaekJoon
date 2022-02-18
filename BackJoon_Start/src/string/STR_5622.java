package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split("");
		int res = 0;
		for(int i = 0;i < str.length; i++) {
			res += whatSeconds(str[i].charAt(0));
		}
		bw.write(res + "\n");
		
		br.close();
		bw.close();
	}

	public static int whatSeconds(char s) {
		if(65 <= s && s < 68)
			return 3;
		else if(68 <= s && s < 71)
			return 4;
		else if(71 <= s && s < 74)
			return 5;
		else if(74 <= s && s < 77)
			return 6;
		else if(77 <= s && s < 80)
			return 7;
		else if(80 <= s && s < 84)
			return 8;
		else if(84 <= s && s < 87)
			return 9;
		else
			return 10;
	}
}
