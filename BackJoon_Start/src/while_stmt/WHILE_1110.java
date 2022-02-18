package while_stmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WHILE_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int num = 0;
		int a = n / 10;
		int b = n % 10;
		do {
			num = b * 10 + ((a + b) % 10);
			a = num / 10;
			b = num % 10;
			count++;
		} while(num != n);
		bw.write(count + "\n");
		
		br.close();
		bw.close();
	}

}
