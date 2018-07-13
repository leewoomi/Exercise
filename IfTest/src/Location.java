import java.util.Scanner;

/*2차원 공간상의 좌표값을 입력하여 몇 사분면인지 확인하세요*/
public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		Scanner sc = new Scanner(System.in);

		System.out.println("x좌표 : ");
		x = sc.nextInt();
		System.out.println("y좌표 : ");
		y = sc.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println("1사분면 (" + x + ", " + y + ")");
			} else if (y < 0) {
				System.out.println("4사분면 (" + x + ", " + y + ")");
			} else {
				System.out.println("x축 위에 있습니다. (" + x + "," + y + ")");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("2사분면 (" + x + ", " + y + ")");
			} else if (y < 0) {
				System.out.println("3사분면 (" + x + ", " + y + ")");
			} else {
				System.out.println("x축 위에 있습니다. (" + x + "," + y + ")");
			}
		} else {
			if (y != 0) {
				System.out.println("y축 위에 있습니다. (" + x + "," + y + ")");
			} else {
				System.out.println("중심축");
			}
		}
	}

}
