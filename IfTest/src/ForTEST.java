
public class ForTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int j=0;
		
		for(i=0;i<10;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("#  ");
			}
			System.out.println();
		}
		for(i=0;i<11;i++) {
			for(j=0;j<=10-i;j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
	}

}
