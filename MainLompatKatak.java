import java.util.ArrayList;
import java.util.Collections;

class Koin{
	private int nilai;
	public Koin(){
		this.nilai=10;
	}
	public Koin(int nilai){
		this.nilai=nilai;
	}
	public int getNilai(){
		return nilai;
	}
	public void setNilai(int nilaibaru){
		this.nilai=nilaibaru;
	}
	public String toString(){
		return "Koin("+nilai+")";
	}
}
class Monster{
	private int nilai;
	private String nama;
	public Monster(){
		this.nilai=10;
		this.nama="Monster";
	}
	public Monster(int nilai){
		this.nilai=nilai;
	}
	public Monster(int nilai, String nama){
		this.nilai=nilai;
		this.nama=nama;
	}
	public int getNilai(){
		return nilai;
	}
	public String toString(){
		return nama+"("+nilai+")";
	}
}

class Kotak{
	private Koin coin;
	private Monster monsta;
	public Kotak(){
		coin=null;
		monsta=null;
	}
	public void addKoin(Koin c){
		this.coin=c;
	}
	public void addMonster(Monster m){
		this.monsta=m;
	}
	public Koin getKoin(){
		return this.coin;
	}
	public Monster getMonster(){
		return this.monsta;
	}
	public boolean isThereKoin(){
		return coin != null;
	}
	public boolean isThereMonster(){
		return monsta != null;
	}
	public String toString(){
		if(isThereKoin()){
			return "Koin";
		}else if(isThereMonster()){
			return "Monster";
		}
		return toString();
	}
	
}

class KotakPermainan{
	private Kotak[] boardGame;
	private int jumKotak;
	private int jumlahKoin;
	private int jumlahMonster;
	private int[] acakKoin;
	private int[] acakMonster;
	public KotakPermainan(int j, int jk, int jm){
		jumKotak=j;
		jumlahKoin=jk;
		jumlahMonster=jm;
		acakKoin = new int[jk];
		acakMonster = new int[jm];
		generateAcak();
		inisialisasiKotak();
	}
	private void generateAcak(){
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<jumKotak;i++){
			list.add(i);
		}
		Collections.shuffle(list);
		for(int i=0;i<jumKotak;i++){
			System.out.print(list.get(i)+",");
		}
		System.out.print("\nKoin : ");
		for(int i=0;i<jumlahKoin;i++){
			acakKoin[i]=list.get(i);
			System.out.print(acakKoin[i]+",");
		}
		System.out.print("\nMonster : ");
		for(int i=jumlahKoin; i<jumlahMonster+jumlahKoin;i++){
			acakMonster[i-jumlahKoin]=list.get(i);
			System.out.print(acakMonster[i-jumlahKoin]+",");
		}
	}
	private void inisialisasiKotak(){
		boardGame = new Kotak[jumKotak];
			System.out.print("\n");
		for(int i: acakKoin){
			boardGame[i] = new Kotak();
			boardGame[i].addKoin(new Koin(10));
		}
		for(int i: acakMonster){
			boardGame[i] = new Kotak();
			boardGame[i].addMonster(new Monster(10));
		}
		for(int i=0; i<jumKotak; i++){
			System.out.print(boardGame[i]+", ");
		}
		
	}
	public int contain(int posisi){
		if(boardGame[posisi].isThereKoin()){
			return boardGame[posisi].getKoin().getNilai();
		}
		else if(boardGame[posisi].isThereMonster()){
			return -1*boardGame[posisi].getKoin().getNilai();
		}
		return 0;
	}
	
}
class Katak{
	private int posisi;
	private int skor;
	public Katak(){
		this.posisi=0;
		this.skor=100;
	}
	public int getPosisi(){
		return posisi;
	}
	public void setPosisi(int posisiBaru){
		this.posisi=posisiBaru;
	}
	public int getSkor(){
		return skor;
	}
	public void setSkor(int skorBaru){
		this.skor=skorBaru;
	}
	public void loncatDekat(){
		posisi+=1;
	}
	public void loncatJauh(){
		posisi+=2;
	}
	
}
class Pemain{
		private String nama;
		private int nilai;
		public Pemain(String nama){
			this.nama = nama;
		}
		public String getNama(){
			return nama;
		}
		public void setNama(String nama){
			this.nama=nama;
		}
		public int getNilai(){
			return nilai;
		}
		public void setNilai(int nilaibaru){
			this.nilai=nilaibaru;
		}
		
}
class MainLompatKatak{
	private boolean play;
	public MainLompatKatak(){
		
	}
	public void mainkan(){
		play=true;
	}
	public static void main(String[] args){
		KotakPermainan game = new KotakPermainan(10, 2, 5);
	}
}
