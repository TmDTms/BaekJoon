package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class ARRAY_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x;
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0;i < 10; i++) {
			x = Integer.parseInt(br.readLine());
			set.add(x % 42);
		}
		bw.write(set.size() + "\n");
		
		br.close();
		bw.close();
	}

}
