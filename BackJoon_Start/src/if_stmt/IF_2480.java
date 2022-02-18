package if_stmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class IF_2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int res = 0;
		
		if(a == b && b == c)
			res = 10000 + a * 1000;
		else if(a == b && a != c)
			res = 1000 + a * 100; 
		else if(a == c && c != b)
			res = 1000 + c * 100; 
		else if(b == c && b != a)
			res = 1000 + b * 100; 
		else {
			if(a > b && a > c)
				res = a * 100;
			else if(b > a && b > c)
				res = b * 100;
			else if(c > a && c > b)
				res = c * 100;
		}
		bw.write(res + "\n");
		
		br.close();
		bw.close();
	}

}
