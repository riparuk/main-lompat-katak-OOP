
/**
 * Kelas Monster nantinya akan dipakai di kelas Kotak.
 * @author RIfa Faruqi
 */
public class Monster implements Benda{
	/**
	 * private atribute daripada nilai.
	 */
	private int nilai;
	/**
	 * private atribute daripada nama.
	 */
	private String nama;
	/**
	 * default constructor yang akan
	 * memberikan nilai kepada objek Koin sebesar 10
	 * dan nama default adalah "Monster"
	 */
	public Monster(){
		this.nilai=-10;
		this.nama="Monster";
	}
	/**
	 * Constructor dengan satu parameter
	 * @param nilai nilai daripada monster
	 */
	public Monster(int nilai){
		this.nilai=nilai;
	}
	/**
	 * Constructor dengan dua parameter
	 * @param nilai nilai daripada monster
	 * @param nama nama yang ingin di berikan
	 */
	public Monster(int nilai, String nama){
		this.nilai=nilai;
		this.nama=nama;
	}
	/**
	 * Method accessor untuk mengembalikan nilai.
	 * @return nilai dari monster
	 */
	@Override
	public int getNilai(){
		return nilai;
	}

	/**
	 * Merupakan method mutator untuk mengubah nilai.
	 * @param nilaibaru nilai baru yang ingin di beri kepada atribut nilai.
	 */
	@Override
	public void setNilai(int nilaibaru){
		this.nilai=nilaibaru;
	}
	/**
	 * Method toString daripada kelas Monster
	 * @return nama monster dan nilainya.
	 */
	public String toString(){
		return nama+"("+nilai+")";
	}
}
