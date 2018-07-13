
public class Contine_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if ((i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0)) {
				System.out.println(i);
				break;
			}
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
			
				if(i==j) {
					continue;
				}
				System.out.println("i= "+i+"j="+j);
			}
		}
	}

}
