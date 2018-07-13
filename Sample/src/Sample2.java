
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ken = 2, boo = 7, yoo = -7;
		System.out.println("***** result ***** \n");
		System.out.println("ken=2, boo=7, yoo = - 7");
		System.out.println(" --- bitwise AND --- ");
		System.out.println(" ken&boo - > " + (ken & boo));
		System.out.println(" --- bitwise OR --- ");
		System.out.println(" ken|boo - > " + (ken | boo));
		System.out.println(" --- bitwise XOR --- ");
		System.out.println(" ken^boo - > " + (ken ^ boo));
		System.out.println(" --- complement --- ");
		System.out.println("~ken    - > " + (~ken));
		System.out.println(" --- shift --- ");
		System.out.println("boo<<2  - > " + (boo << 2));
		System.out.println("boo>>2  - > " + (boo >> 2));
		System.out.println("boo>>>2  - > " + (boo >>> 1));
		System.out.println(" yoo <<3  - > " + (yoo << 3));
		System.out.println(" yoo >>3  - > " + (yoo >> 3));
	}
}
