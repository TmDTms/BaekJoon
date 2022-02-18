package func;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FUN_1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		bw.write(hansoo(n) + "\n");

		br.close();
		bw.close();
	}

	public static int hansoo(int n) {
		if (n < 100)
			return n;
		else {
			int count = 99;
			if (n < 111)
				return 99;
			for (int i = 111; i <= n; i++) {
				int x = i / 100;
				int y = (i % 100) / 10;
				int z = i % 10;

				if ((x - y) == (y - z))
					count++;
			}
			return count;
		}
	}
}
