import java.util.Scanner;

public class PermutationDemo {

	static int calFib(int n) {
		if (n <= 1)
			return n;
		return calFib(n - 1) + calFib(n - 2);
	}

	static int countWays(int n) {
		return calFib(n + 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of stair case");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("Number of ways:" + countWays(value));
	}
}
