import java.util.Arrays;
import java.util.Scanner;


public class SortArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String[] towns = new String[n];
		for (int i = 0; i < towns.length; i++) {
			towns[i] = input.nextLine();
		}
		Arrays.sort(towns);
		for (int i = 0; i < towns.length; i++) {
			System.out.println(towns[i]);
		}

	}

}
