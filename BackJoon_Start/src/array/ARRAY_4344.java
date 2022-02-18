package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ARRAY_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		int[] students;
		int n, sum, count;
		double avg;
		StringTokenizer st;
		
		for(int i = 0;i < c;i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			sum = 0;
			count = 0;
			students = new int[n];
			for(int j = 0;j < n;j++) {
				students[j] = Integer.parseInt(st.nextToken());
				sum += students[j];
			}
			avg = sum / (double) n;
			for(int j = 0;j < n;j++) {
				if(avg < students[j])
					count++;
			}
			System.out.printf("%.3f", (count / (double) n) * 100);
			System.out.println("%");
		}
		
		br.close();
	}

}
