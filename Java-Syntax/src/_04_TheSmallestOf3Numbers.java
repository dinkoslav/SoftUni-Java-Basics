import java.util.Arrays;
import java.util.Scanner;


public class _04_TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[] numbers = new float[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = in.nextFloat();
		}
		Arrays.sort(numbers);
		System.out.println(numbers[0]);

	}

}
