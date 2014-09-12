import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		float x1 = 12.5f, y1 = 8.5f;
		float x2 = 17.5f, y2 = 3.5f;
		float x3 = 22.5f, y3 = 8.5f;

		float abc = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		float abp = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		float apc = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		float pbc = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
		if (abp + apc + pbc == abc) {
			System.out.println("Inside");
		}
	}

}
