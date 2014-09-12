import java.util.Scanner;


public class _03_PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 13.5) {
			if (x > 17.5 && x < 22.5 && y > 8.5) {
				System.out.println("Outside");
			}
			else{
				System.out.println("Inside");
			}
		}
		else{
			System.out.println("Outside");
		}
	}

}
