package helpfromsam;

import java.util.Scanner;

public class HelpFromSam {
	
	public static int helpFromSam(int A) {
		int count = 0;
		int row = 1;
		while(A >= row) {
			A -= row;
			row++;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int results = helpFromSam(A);
		System.out.println(results);
	}

}
