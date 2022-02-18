package if_stmt;

import java.util.Scanner;

public class IF_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if(a > b)
			System.out.println(">");
		else if(a < b)
			System.out.println("<");
		else if(a == b)
			System.out.println("==");
		scan.close();
	}

}
