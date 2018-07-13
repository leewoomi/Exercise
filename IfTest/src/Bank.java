import java.util.Scanner;

/*은행에 500만원이 저축되어 있다.
 * 50만원이면 백화점에 가고 , 곰인형을 구입합니다.
 * 아니면,80만원이면 아울렛에 가서 원피스를 구입합니다.
 *  아니면, 20만원이면 이마트에 가서 런닝화를 구입합니다.
 *  아니면, 10만원이면 술집(막걸리)으로 가서 술+안주 등을 먹습니다.
 *  아니면, 과자를 잔돈에서 10%만큼 구입한다.
 *  잔돈은 다시 저축
 * */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bank = 5000000;

		Scanner sc = new Scanner(System.in);

		int pay = 0;

		boolean a=true;
		while (a==true) {
			System.out.println("통장에" + bank + " 원이 있습니다. 사용할 금액을 입력하세요.");
			pay = sc.nextInt();
			pay=pay*10000;
			System.out.println("입력하신 금액은 " + pay + "원 입니다.");
			if (pay < bank) {
				switch (pay) {
				
				case 10:
					
					System.out.println("술집(막걸리)으로 가서 술+안주 등을 먹습니다.");

					bank = bank - pay;
					System.out.println(bank + "원 은 다시 저축합니다. ");
					break;
				case 20:
					
					System.out.println("이마트에 가서 런닝화를 구입합니다.");
					bank = bank - pay;
					System.out.println(bank + "원 은 다시 저축합니다. ");
					break;
				case 50:
					
					System.out.println("백화점에 가서 곰인형을 구입합니다.");
					bank = bank - pay;
					System.out.println(bank + "원 은 다시 저축합니다. ");
					break;
				case 80:
					
					System.out.println("백화점에 가서 원피스를 구입합니다.");
					bank = bank - pay;
					System.out.println(bank + "원 은 다시 저축합니다. ");
					break;
				default:
					System.out.println("잔돈"+bank+" 원의 10%인 " + (bank * 0.1) + "만원을 과자값으로 사용합니다.");
					bank = (int) (bank - (bank * 0.1));
					System.out.println(bank + "만원 은 다시 저축합니다. ");
					break;

				}

				System.out.println();

			}else {
				System.out.println("\n\n잔액 :"+bank);
				 a = false;
			}
			
		}

	}
}