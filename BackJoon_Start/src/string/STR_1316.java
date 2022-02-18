package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		char[] arr;
		
		for(int i = 0;i < n;i++) {
			String str = br.readLine();
			int size = str.length();
			int idx = 0;
			arr = new char[size];
			arr[0] = str.charAt(0);
			for(int k = 1;k < size;k++) {
				char c = str.charAt(k);
				if(c != arr[idx])
					arr[++idx] = c;
			}
			count += isSame(arr, idx);
		}
		bw.write(count + "\n");
		
		br.close();
		bw.close();
	}

	public static int isSame(char[] arr, int idx) {
		for(int i = 0;i < idx; i++) {
			for(int j = i + 1; j <= idx; j++) {
				if(arr[i] == arr[j])
					return 0;
			}
		}
		return 1;
	}
}
