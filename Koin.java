/**
 * Kelas koin nantinya akan dipakai di kelas Kotak.
 * @author RIfa Faruqi
 */

public class Koin{
	/**
	 * private atribute daripada nilai.
	 */
	private int nilai;
	/**
	 * default constructor yang akan
	 * memberikan nilai kepada objek Koin sebesar 10
	 */
	public Koin(){
		this.nilai=10;
	}
	/**
	 * Constructor dengan satu parameter
	 * @param nilai nilai yang ingin di beri kepada objeck Koin.
	 */
	public Koin(int nilai){
		this.nilai=nilai;
	}
	/**
	 * Merupakan method accessor untuk mengembaikan nilai
	 * @return nilai dari Koin.
	 */
	public int getNilai(){
		return nilai;
	}
	/**
	 * Merupakan method mutator untuk mengubah nilai.
	 * @param nilaibaru nilai baru yang ingin di beri kepada atribut nilai.
	 */
	public void setNilai(int nilaibaru){
		this.nilai=nilaibaru;
	}
	/**
	 * toString method daripada kelas Koin
	 * @return Koin beserta nilainya.
	 */
	public String toString(){
		return "Koin("+nilai+")";
	}
}
