import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String nAsBinary = Integer.toBinaryString(n);
		int count = 0;
		
		for (int i = 0; i < nAsBinary.length()-1; i++) {
			int curent = (n>>i)&1;
			int next = (n>>i+1)&1;
			if (curent == next) {
				count++;
			}
		}
		System.out.println(count);
	}

}
