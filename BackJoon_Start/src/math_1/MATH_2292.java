package math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MATH_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int i = 0;
		int res = 0;

		if (n == 1)
			res = 1;
		else {
			int sum = 2;
			while (true) {
				sum += (i * 6);
				if(sum <= n && n < (sum + ((i+1) * 6))) {
					res = i + 2;
					break;
				}
				else
					i++;
			}
		}
		bw.write(res + "\n");
		
		br.close();
		bw.close();
	}

}
