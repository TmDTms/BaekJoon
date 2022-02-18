package array;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ARRAY_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i < n;i++) {
			int sum = 0;
			int cont = 0;
			String[] str = br.readLine().split("");
			for(String s : str) {
				if(s.compareTo("O") == 0)
					cont += 1;
				else
					cont = 0;
				sum += cont;
			}
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.close();
	}

}
