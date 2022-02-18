package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STR_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int size = s.length();
		char[] arr = new char[size];
		for (int i = 0; i < size; i++)
			arr[i] = s.charAt(i);

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (i < (size - 1)) {
				if (arr[i] == 'c') {
					if (arr[i + 1] == '=' || arr[i + 1] == '-')
						continue;
				} else if (arr[i] == 'd') {
					if (arr[i + 1] == '-')
						continue;
					if (i < (size - 2)) {
						if (arr[i + 1] == 'z' && arr[i + 2] == '=')
							continue;
					}
				} else if (arr[i] == 'l' || arr[i] == 'n') {
					if (arr[i + 1] == 'j')
						continue;
				} else if (arr[i] == 's' || arr[i] == 'z') {
					if (arr[i + 1] == '=')
						continue;
				}
			}
			count++;
		}
		bw.write(count + "\n");

		br.close();
		bw.close();
	}

}
