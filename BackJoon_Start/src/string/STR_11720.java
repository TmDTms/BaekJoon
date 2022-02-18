package string;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		int sum = 0;
		for(int i = 0;i < n;i++) {
			sum += Character.getNumericValue(nums.charAt(i));
		}
		bw.write(sum + "\n");
		
		br.close();
		bw.close();
	}

}
