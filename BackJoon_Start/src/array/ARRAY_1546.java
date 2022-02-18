package array;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ARRAY_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i < n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		double m = (double) findMax(arr);
		double sum = 0;
		for(int i = 0;i < n; i++) {
			sum += arr[i] / m * 100.0;
		}
		double avg = sum / n;
		bw.write(avg + "\n");
		
		br.close();
		bw.close();
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		int size = arr.length;
		for(int i = 1;i < size; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
}
