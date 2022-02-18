package math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MATH_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());	// 층 수
			int w = Integer.parseInt(st.nextToken());	// 방 수
			int n = Integer.parseInt(st.nextToken());	// 손님 수
			int room_h = 0, room_w = 0;
			
			if((n % h) == 0)
				room_h = h * 100;
			else
				room_h = (n % h) * 100;
			
			for(int i = 1;i <= w; i++) {
				if((i-1)*h < n && n <= i * h) {
					room_w = i;
					break;
				}
			}
			
			bw.write(room_h + room_w + "\n");
		}

		br.close();
		bw.close();
	}

}
