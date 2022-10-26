public class Katak{
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
		return this.skor;
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
