package math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MATH_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int res = 0;

		if (n == 4 || n == 7)
			res = -1;
		else if (n % 5 == 0)
			res = n / 5;
		else if (n % 5 == 1 || n % 5 == 3)
			res = n / 5 + 1;
		else if (n % 5 == 2 || n % 5 == 4)
			res = n / 5 + 2;
		bw.write(res + "\n");

		br.close();
		bw.close();
	}

}
