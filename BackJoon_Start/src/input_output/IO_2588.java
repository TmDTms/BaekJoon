package input_output;

import java.util.Scanner;

public class IO_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		int x, y, z;
		x = a * (b / 100);
		y = a * ((b % 100) / 10);
		z = a * (b % 10);
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		System.out.println((x * 100) + (y * 10) + z);
		scan.close();
	}

}
