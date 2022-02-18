package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ARRAY_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String res = Integer.toString((a * b * c));
		String[] str = res.split("");
		int freq = 0;
		
		for(int i = 0;i < 10;i++) {
			for(String s : str) {
				if(Integer.parseInt(s) == i)
					freq++;
			}
			bw.write(freq + "\n");
			freq = 0;
		}
		
		br.close();
		bw.close();
	}

}
