package math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MATH_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());
		int cross = 1, prev_count = 0;
		int numerator = 0, denominator = 0;

		while (true) {
			if (x <= prev_count + cross) {
				if (cross % 2 == 1) {
					numerator = cross - (x - prev_count - 1);
					denominator = x - prev_count;
					break;
				} else {
					numerator = x - prev_count;
					denominator = cross - (x - prev_count - 1);
					break;
				}
			} else {
				prev_count += cross;
				cross++;
			}
		}
		bw.write(numerator + "/" + denominator + "\n");

		br.close();
		bw.close();
	}

}
