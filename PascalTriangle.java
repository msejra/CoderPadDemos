import java.util.Scanner;

class PascalTriangle {
	public static void main(String args[]) {
		int rows, value = 0, x, y;
		System.out.println("Enter the rows:");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		System.out.println("Enter the x coordinate");
		x = sc.nextInt();
		System.out.println("Enter the y coordinate");
		y = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int sp = 0; sp < rows - i - 1; sp++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				value = bionomialCoefficient(i, j);
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("The value of " + x + " coordinate " + y
				+ " coordinate " + bionomialCoefficient(x - 1, y - 1));

	}

	static int bionomialCoefficient(int line, int col) {
		if (col == 0 || col == line) {
			return 1;
		} else {
			return bionomialCoefficient(line - 1, col - 1)
					+ bionomialCoefficient(line - 1, col);
		}
	}

}