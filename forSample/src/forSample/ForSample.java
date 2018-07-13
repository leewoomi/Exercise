package forSample;

public class ForSample {

	public static void main(String[] args) {

		// System.out.print("*");
		// System.out.println("");

		// *****Enter

		for (int i = 0; i < 5; i++) {

			if (i <= 2) {
				for (int j = 0; j <=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for (int j = 0; j <5-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	
		}
	}

}
