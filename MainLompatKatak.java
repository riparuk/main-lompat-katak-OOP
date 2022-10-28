
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * <h1>Lompat hai katak, lompat! </h1> 
 * Program permainan katak menggunakan sistem OOP
 * 
 * Ini adalah class Utama yang didalamnya terdapat method main
 * yang nantinya akan dijalankan. 
 * <p>
 * Dibuat static semua agar bisa langsung dijalankan di dalam method main.
 * 
 * @author RIfa Faruqi
 */
public class MainLompatKatak{
	static private boolean play;
	/**Method mutator untuk mengubah atribut play menjadi true
	 */
	static public void mainkan(){
		play=true;
	}
	/**
	 * Method static main. Tempat logika permainan
	 * "Lompat hai katak, lompat!" dimasukkan.
	 * @param args argumen dari main
	 */
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		short step=0,d;
		int maxBox=500;
		boolean check=true;
		KotakPermainan game = new KotakPermainan(maxBox, 250, 250);
		Pemain pemain;
		Katak katak = new Katak();
		mainkan();
		System.out.print("Masukkan nama anda : ");
		pemain = new Pemain(myObj.nextLine());
		do{
			if(check==true){
			try{
				//Pilih kesulitan
				System.out.print("Kesulitan(1/2/3/) : ");
				d = myObj.nextShort();
			}catch(InputMismatchException e){
				System.out.println("**Input salah!");
				System.out.println("**set to default=2");
				d=2;
			}myObj.nextLine();
				switch(d){
					case 1:
						game = new KotakPermainan(maxBox, 275, 80);
						check=false;
						break;
					case 2:
						game = new KotakPermainan(maxBox, 250, 130);
						check=false;
						break;
					case 3:
						game = new KotakPermainan(maxBox, 200, 200);
						check=false;
						break;
					default:
						System.out.println("**Input salah!");
						System.out.println("**set to default=2");
						game = new KotakPermainan(maxBox, 250, 150);
						check=false;
				}
			}
			
			switch(step){
				case 0:
					break;
				case 1:
					katak.loncatDekat();
					katak.setSkor(katak.getSkor()+game.contain(katak.getPosisi()));
					break;
				case 2:
					katak.loncatJauh();
					katak.setSkor(katak.getSkor()+game.contain(katak.getPosisi()));
					break;
				default:
					System.out.println("Katak hanya bisa melompat 1 atau 2 loncat ke depan");
			}
			
			System.out.println("**Game Started");
			System.out.println("Posisi : "+katak.getPosisi());
			System.out.println("Skor : "+katak.getSkor());
			//End Terminate
			if(katak.getPosisi()>=maxBox-1 || katak.getSkor()<0){
				katak.setPosisi(maxBox-1);
				pemain.setNilai(katak.getSkor());
				System.out.println("===HASIL AKHIR===");
				System.out.println("Nama : " + pemain.getNama());
				System.out.println("Nilai : " + pemain.getNilai());
				if(pemain.getNilai() >= 1500){
					System.out.println("Nilai Anda Excellent!");
				}else if(pemain.getNilai() >= 500 && pemain.getNilai() < 1500){
					System.out.println("Nilai Anda Good!");
				}else if(pemain.getNilai() < 500){
					System.out.println("Nilai Anda Bad!");	
				}
				
				System.out.print("Apakah ingin bermain lagi?(y/n)");
				char c=myObj.next().charAt(0);
				if(c=='n'){
					System.out.println("**Exit...");
					myObj.close();
					break;
				}else if(c=='y'){
					pemain.setNilai(0);
					katak.setSkor(100);
					katak.setPosisi(0);
					check=true;
					continue;
				}else {
					System.out.println("Input tidak diizinkan");
					System.out.println("**Auto Exit...");
					myObj.close();
					break;
				}
			}
			//Terminate when position at the end
			
			try{
			System.out.print("Loncat(1/2) : ");
			step=myObj.nextShort();
			//step=2;
			}catch(InputMismatchException e){
				System.out.println("**Input Salah");
				step=0;
			}myObj.nextLine();	//clear buffer
						
			if(katak.getPosisi()==maxBox-2 && step==2){
				System.out.println("**Batas sampai posisi no "+(maxBox-1));
				System.out.println("**Otomatis set ke posisi no "+(maxBox-1));
				step=1;
				continue;
			}
			
			
		}while(play);
		
	}//end of main
}//end of class
