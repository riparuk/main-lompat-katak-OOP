import java.util.ArrayList;
import java.util.Collections;
/**
 * <h1>Lompat hai katak, lompat!<h1> 
 * Program permainan katak menggunakan sistem OOP
 * <p>
 * @author RIfa Faruqi
 * Ini adalah class KotakPermainan 
 * 
 */
public class KotakPermainan{
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
		
		for(int i=0;i<jumlahKoin;i++){
			acakKoin[i]=list.get(i);
		//	System.out.print(acakKoin[i]+,);
		}
		
		for(int i=jumlahKoin; i<jumlahMonster+jumlahKoin;i++){
			acakMonster[i-jumlahKoin]=list.get(i);
		//	System.out.print(acakMonster[i-jumlahKoin]+,);
		}
		//end
	}
	private void inisialisasiKotak(){
		boardGame = new Kotak[jumKotak];
		for(int i=0; i<jumKotak; i++){
			boardGame[i] = new Kotak();
		}
		for(int i: acakKoin){
			boardGame[i].addKoin(new Koin(10));
		}
		for(int i: acakMonster){
			boardGame[i].addMonster(new Monster(10));
		}
	}
	public int contain(int posisi){
		if(boardGame[posisi].isThereKoin()){
			return boardGame[posisi].getKoin().getNilai();
		}
		else if(boardGame[posisi].isThereMonster()){
			return -1*boardGame[posisi].getMonster().getNilai();
		}else {
			return 0;
		}
	}
	
}

