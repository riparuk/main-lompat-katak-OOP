
/**
 * Kotak dapat terdiri dari 1 koin dan/atau 1 monster. Kotak juga
 * bisa tidak memiliki koin maupun monster. Koin dan monster dapat ditambahkan ke dalam kotak. Setiap
 * kotak dapat diuji apakah memiliki koin dan/atau memiliki monster.
 * @author RIfa Faruqi
 */
public class Kotak{
	private Koin coin;
	private Monster monsta;
	/**
	 * method untuk set monster ke dalam kotak
	 * @param c objek koin yang di passing.
	 */
	public void addKoin(Koin c){
		this.coin=c;
	}
	/**
	 * method untuk set monster ke dalam kotak
	 * @param m objek monster yang di passing.
	 */
	public void addMonster(Monster m){
		this.monsta=m;
	}
	/**
	 * method untuk mengembalkan koin
	 * @return coin mengembalikan coin
	 */
	public Koin getKoin(){
		return this.coin;
	}
	/**
	 * method untuk mengembalkan monster
	 * @return monsta mengembalikan monsta
	 */
	public Monster getMonster(){
		return this.monsta;
	}
	/**
	 * Method isThereKoin()
	 * @return true jika pada kotak terdapat koin.
	 */
	public boolean isThereKoin(){
		return coin != null;
	}
	/**
	 * Method isThereMonster()
	 * @return true jika pada kotak terdapat Monster.
	 */
	public boolean isThereMonster(){
		return monsta != null;
	}
	/**
	 * dibutuhkan untuk debugging.
	 * @return mengembalikan koin jika koin ada dan monster sebaliknya.
	 */
	public String toString(){
		if(isThereKoin()){
			return "Koin";
		}else if(isThereMonster()){
			return "Monster";
		}
		return "Kosong";
	}
	
}
