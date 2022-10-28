
/**
 * Pada class ini skor pada katak defaultnya adalah 100
 * @author Rifa Faruqi
 */
public class Katak{
	/**Posisi dari katak
	 */
	private int posisi;
	/**Skor dari katak
	 */
	private int skor;
	/**Default constructor Katak
	 * posisinya akan dibuat 0 dan skor 100.
	 */
	public Katak(){
		this.posisi=0;
		this.skor=100;
	}
	/**@return posisi katak
	 */
	public int getPosisi(){
		return posisi;
	}
	/**Mengubah nilai posisi dari katak
	 * @param posisiBaru nilai yang akan di beri kepada posisi.
	 */
	public void setPosisi(int posisiBaru){
		this.posisi=posisiBaru;
	}
	/**@return skor katak
	 */
	public int getSkor(){
		return this.skor;
	}
	/**Mengubah nilai skor dari katak
	 * @param skorBaru nilai yang akan diberi kepada skor.
	 */
	public void setSkor(int skorBaru){
		this.skor=skorBaru;
	}
	/**Jika method ini dijalankan, maka posisi akan bertambah sebanyak 1.
	 */
	public void loncatDekat(){
		posisi+=1;
	}
	/**Jika method ini dijalankan, maka posisi akan bertambah sebanyak 2.
	 */
	public void loncatJauh(){
		posisi+=2;
	}
	
}
