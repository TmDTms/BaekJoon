package func;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FUN_4673 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10001];
		
		for (int i = 1; i < 10001; i++)
			arr[i] = i;
		for (int i = 1; i < 10001; i++) {
			int n = selfNum(i);
			for(int j = 1; j < 10001; j++) {
				if(arr[j] == n) {
					arr[j] = 0;
					break;
				}
			}
		}
		for (int i = 1; i < 10001; i++) {
			if (arr[i] != 0)
				bw.write(arr[i] + "\n");
		}
		bw.close();
	}

	public static int selfNum(int n) {
		int res = 0;
		if (n < 10)
			res = n + n;
		else if (10 <= n && n < 100)
			res = n + (n / 10) + (n % 10);
		else if (100 <= n && n < 1000)
			res = n + (n / 100) + ((n % 100) / 10) + (n % 10);
		else if (1000 <= n && n < 10000)
			res = n + (n / 1000) + ((n % 1000) / 100) + ((n % 100) / 10) + (n % 10);
		return res;
	}

}
