package if_stmt;

import java.util.Scanner;

public class IF_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int h, m;
		h = scan.nextInt();
		m = scan.nextInt();
		if(m >= 45)
			m -= 45;
		else if(h > 0 && m < 45) {
			h -= 1;
			m += 15;
		}
		else {
			h = 23;
			m += 15;
		}
		System.out.println(h + " " + m);
		scan.close();
	}
}
