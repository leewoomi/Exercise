
public class Gogodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, j = 0;
		System.out.println("******** result *********");

		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}

}
