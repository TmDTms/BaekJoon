package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ARRAY_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		for(int i = 0;i < 9;i++)
			arr[i] = Integer.parseInt(br.readLine());
		int max = arr[0];
		int idx = 1;
		for(int i = 1;i < 9;i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i + 1;
			}
		}
		bw.write(max + "\n" + idx + "\n");
		
		br.close();
		bw.close();
	}

}
