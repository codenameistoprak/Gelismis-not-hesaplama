import java.util.Scanner;

public class deneme11 {

	public static void main(String[] args) {
		/* 
		  kullanıcıdan vize1 , vize2 ve final notunu
		 alarak hesaplama sistemi yapmaya çalıştım.
		 Kullanıcıdan okuldaki genel ortalamasını alarak
		 DD ve 2.50'nin altında olma koşuluna göre ekrana
		 bir tavsiye mesajı yazdırdım.
		 
		 vize1 ve vize2 toplam notun %30 una etki edecek
		 final toplam notun %40 ına etki edecek
		  
		 Toplam not 90 ise AA
		 Toplam not 85 ise BA
		 Toplam not 80 ise BC
		 Toplam not 75 ise CB
		 Toplam not 70 ise CC
		 Toplam not 65 ise DC
		 Toplam not 60 ise DD
		 Toplam not 55 ise FD
		 Toplam not 50 ise FF
		 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("İlk vize notunuz: ");
		int vize1 = scanner.nextInt();
		System.out.print("İkinci vize notunuz: ");
		int vize2 = scanner.nextInt();
		System.out.print("Final notunuz: ");
		int Final = scanner.nextInt();
		
		double toplam;
		toplam = vize1*(3/10.0)+ vize2*(3/10.0)+Final*(4/10.0);
		
		// 3/10 olsaydı tam olarak double bir değer alamazdık
		
		System.out.print("Genel ortalamanız:(örn. 3,43)   ");
		double genel_ort = scanner.nextDouble();
		
		if(toplam >= 90) {
			System.out.println("AA aldınız...");
			}
		
			else if(toplam >= 85) {
				System.out.println("BA aldınız...");
			}
			else if(toplam >= 80 ) {
				System.out.println("BB aldınız...");
			}
	
			else if(toplam >= 75) {
				System.out.println("CB aldınız...");
			}
			else if(toplam >= 70) {
				System.out.println("CC aldınız...");
			}
		
			else if(toplam >= 65) {
				System.out.println("DC aldınız...");
			}
			else if(toplam >= 60) {
				System.out.println("DD aldınız...");
			
     		if (genel_ort<2.50) {
     			System.out.println("DD aldınız ve genel ortalamanız düşük. "
     					+ "Bu dersi "
     					+"tekrar almayı düşünebilirsiniz...");
     		
     		
     		}
			}
		
			else if(toplam >=  55) {
				System.out.println("FD aldınız ve kaldınız...");
			}
		
			else  {
				System.out.println("FF aldınız ve kaldınız...");
			}
		
		scanner.close();
		
		}
	}
	


