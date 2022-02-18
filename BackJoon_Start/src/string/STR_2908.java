package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class STR_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(st.nextToken());
		int one = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuilder(st.nextToken());
		int two = Integer.parseInt(sb.reverse().toString());
		
		if(one > two)
			bw.write(one + "\n");
		else
			bw.write(two + "\n");
		
		br.close();
		bw.close();
	}

}
