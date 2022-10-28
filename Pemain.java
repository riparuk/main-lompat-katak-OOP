
/**
 * Class ini digunakan untuk menyimpan data dari pemain
 * yang dapat berupa nama dan nilai.
 * @author Rifa Faruqi
 */
public class Pemain{
		/**Atribut nama dari pemain
		*/
		private String nama;
		/**Atribut Nilai dari pemain
		 */
		private int nilai;
		/**
		 * Constructor dengan 1 parameter
		 * @param nama akan di berikan kepada atribut nama.
		 */
		public Pemain(String nama){
			this.nama = nama;
		}
		/**
		 * @return nama atribut nama.
		 */
		public String getNama(){
			return nama;
		}
		/**
		 * Set String untuk nama
		 * @param nama akan diberikan kepada atribut nama.
		 */
		public void setNama(String nama){
			this.nama=nama;
		}
		/**
		 * @return nilai atribut nilai.
		 */
		public int getNilai(){
			return nilai;
		}
		/**
		 * Method akan memberikan nilai kepada atribut nilai
		 * @param nilaibaru nilai yang akan diberikan kepada atribut nilai.
		 */
		public void setNilai(int nilaibaru){
			this.nilai=nilaibaru;
		}
		
}
