package input_output;

import java.util.Scanner;

public class IO_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a-b);
		scan.close();
	}

}
