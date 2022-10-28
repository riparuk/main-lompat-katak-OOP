
import java.util.ArrayList;
import java.util.Collections;
/**
 * Ini adalah class KotakPermainan 
 * @author RIfa Faruqi
 */
public class KotakPermainan{
	/**Array dari kotak untuk menyimpan koin atau monster
	 */
	private Kotak[] boardGame;
	/**dipakai untuk menentukan jumlah kotak
	 */
	private int jumKotak;
	/**dipakai untuk menentukan jumlah koin
	 */
	private int jumlahKoin;
	/**dipakai untuk menentukan jumlah monster
	 */
	private int jumlahMonster;
	/**tempat menyimpan nilai index daripada koin
	 */
	private int[] acakKoin;
	/**tempat menyimpan nilai index daripada monster
	 */
	private int[] acakMonster;
	/**
	 * Constructor kotakPermainan dengan 3 parameters
	 * <p>
	 * Method generateAcak() dan inisialisasiKotak() akan dipanggil disini
	 * @param j akan diberikan kepada atribut jumKotak
	 * @param jk akan diberikan kepada atribut jumlahKoin
	 * @param jm akan diberikan kepada atribut jumlahMonster
	 */
	public KotakPermainan(int j, int jk, int jm){
		jumKotak=j;
		jumlahKoin=jk;
		jumlahMonster=jm;
		acakKoin = new int[jk];
		acakMonster = new int[jm];
		generateAcak();
		inisialisasiKotak();
	}
	/**
	 * Digunakan untuk menghasilkan nilai acak sesuai dengan JumKotak
	 * dan akan dimasukkan nilai-nilai tersebut kedalam variable acakKoin 
	 * dan acakMonster sesuai dengan jumlah mereka dari jumlahKoin dan jumlahMonster
	 */
	private void generateAcak(){
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<jumKotak;i++){
			list.add(i);
		}
		Collections.shuffle(list);
		
		for(int i=0;i<jumlahKoin;i++){
			acakKoin[i]=list.get(i);
		}
		
		for(int i=jumlahKoin; i<jumlahMonster+jumlahKoin;i++){
			acakMonster[i-jumlahKoin]=list.get(i);
		}
		//end
	}
	/**
	 * akan membuat kotak sebanyak jumKotak. Lalu menambahkan Koin dan/atau
	 * Monster pada indeks yang disesuaikan dengan nilai pada acakKoin dan acakMonster.
	 */
	private void inisialisasiKotak(){
		boardGame = new Kotak[jumKotak];
		Koin coin = new Koin(10);
		Monster monsta = new Monster(-10);
		for(int i=0; i<jumKotak; i++){
			boardGame[i] = new Kotak();
		}
		for(int i: acakKoin){
			boardGame[i].addKoin(coin);
		}
		for(int i: acakMonster){
			boardGame[i].addMonster(monsta);
		}/*
		for(int i=0;i<jumKotak; i++){
			System.out.print(boardGame[i]+", ");
		}
		*/
	}
	/**
	 * akan melalukan pengecekan apakah terdapat koin atau monster pada kotak
	 * dengan posisi tertentu. Apabila ada koin maka akan mengembalikan sejumlah
	 * nilai koin, dan jika ada monster akan mengembalikan sejumlah nilai monster.
	 * Method ini akan dipakai untuk menambah/mengurangi nilai skor jika ada koin/monster.
	 * @return mengembalikan nilai dari isi dalam kotak, baik koin/monster.	 
	 * @param posisi untuk mengetahui isi kotak pada posisi tertentu.
	 */ 
	public int contain(int posisi){
		if(boardGame[posisi].isThereKoin()){
			return boardGame[posisi].getKoin().getNilai();
		}
		else if(boardGame[posisi].isThereMonster()){
			return boardGame[posisi].getMonster().getNilai();
		}else {
			return 0;
		}
	}
	
}

