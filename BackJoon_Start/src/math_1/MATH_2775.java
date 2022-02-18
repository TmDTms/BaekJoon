package math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MATH_2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int res = 0;

			if (n == 1)
				res = 1;
			else {
				int[][] apart = new int[k + 1][n + 1];
				for (int i = 0; i <= k; i++) {
					if (i == 0) {
						for (int j = 1; j <= n; j++)
							apart[i][j] = j;
					} else {
						for (int j = 1; j <= n; j++)
							apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
					}
				}
				res = apart[k][n];
			}
			bw.write(res + "\n");
		}

		br.close();
		bw.close();
	}

}
