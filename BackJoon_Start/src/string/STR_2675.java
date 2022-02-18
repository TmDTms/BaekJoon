package string;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class STR_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String res = "";
			
			for (int j = 0; j < str.length(); j++) {
				for (int i = 0; i < r; i++) {
					res += str.charAt(j);
				}
			}
			bw.write(res + "\n");
		}

		br.close();
		bw.close();
	}

}
