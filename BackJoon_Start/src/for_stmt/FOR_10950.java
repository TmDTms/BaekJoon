package for_stmt;

import java.util.Scanner;

public class FOR_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x, y;
		for(int i = 0; i < n; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(x + y);
		}
		scan.close();
	}

}
