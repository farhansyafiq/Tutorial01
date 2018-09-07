public class Mahasiswa {
	private String nama;
	private int npm;
	
	public Mahasiswa(String nama, int npm) {
		super();
		this.nama = nama;
		this.npm = npm;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNpm() {
		return npm;
	}

	public void setNpm(int npm) {
		this.npm = npm;
	}
}
