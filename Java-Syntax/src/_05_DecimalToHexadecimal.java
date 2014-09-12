import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNumber = in.nextInt();
		String numberAsHex = Integer.toHexString(inputNumber);
		System.out.println(numberAsHex.toUpperCase());

	}
}
