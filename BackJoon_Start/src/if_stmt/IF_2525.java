package if_stmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class IF_2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int current_hour = Integer.parseInt(st.nextToken());
		int current_minute = Integer.parseInt(st.nextToken());
		int need_time = Integer.parseInt(br.readLine());
		int hour = 0, minute = 0, time = 0;
		
		time = current_minute + need_time;
		minute = time % 60;
		hour = current_hour + (time / 60);
		if(hour > 23)
			hour -= 24;
		bw.write(hour + " " + minute);
		
		br.close();
		bw.close();
	}

}
