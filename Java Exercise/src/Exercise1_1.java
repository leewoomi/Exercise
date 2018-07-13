import java.text.DecimalFormat;

public class Exercise1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.lang.String su = "2000000";
		int isu = Integer.parseInt(su);
		java.lang.System.out.println(isu);
		
		DecimalFormat df = new DecimalFormat("#,##0");
		String str = df.format(isu);
		System.out.println("\\"+str);
	}

}
