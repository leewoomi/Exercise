import java.io.*;


public class Jumsu {

	public static void main(String[] args) throws IOException {
	
		int jumsu;
		char hakjum = 0;
		String iput;
		System.out.println("*******  result  *******");
		System.out.println("Input jumsu (0~100) : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		iput = br.readLine();
		jumsu = Integer.parseInt(iput);

	/*	if (jumsu >= 90 && jumsu <=100) {
			hakjum = 'A';
		} else if (jumsu >= 80 && jumsu <90) {
			hakjum = 'B';
		} else if (jumsu >= 70 && jumsu <80) {
			hakjum = 'C';
		} else if (jumsu >= 60 && jumsu <70) {
			hakjum = 'D';
		} else{
			hakjum = 'F';
		}*/
		switch(jumsu/10) {
		case 10: 
			hakjum ='A';
			break;
		case 9: 
			hakjum ='A';
			break;
		case 8: 
			hakjum ='B';
			break;
		case 7: 
			hakjum ='C';
			break;
		case 6: 
			hakjum ='D';
			break;
		default: 
			hakjum ='F';
			break;
		}
		System.out.println("HAKJUM : " + hakjum);
	}

}
