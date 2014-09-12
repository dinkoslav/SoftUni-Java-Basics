import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();
		int area = (aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY))/2;
		area = Math.abs(area);
		System.out.println(area);
	}

}
