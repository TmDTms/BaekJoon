package for_stmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FOR_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n, x;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a;
		
		for(int i = 0;i < n;i++) {
			a = Integer.parseInt(st.nextToken());
			if(a < x)
				bw.write(a + " ");
		}
		
		br.close();
		bw.close();
	}

}
