package LoopPro;
import java.io.*;

public class loop {

	public static void main(String[] args)throws IOException {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int input;
		
		
		for(;;) {
			System.out.print("Bir Sayı Giriniz:  (Çıkmak İçin Boş Bırakınız!!) ");
			
			
			try {
				input = new Integer(b.readLine());
			}
			catch(NumberFormatException e) {
				break;
			} 
			
			for(int i = 0; i < input; i++) {
				
				System.out.print(input);
			}
			System.out.print(" ");
			
			
		}
		
		System.out.println("Program Sonlandırıldı...[NumberFormatException]");

	}

}
