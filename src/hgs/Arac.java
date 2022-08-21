package hgs;

import java.util.ArrayList;

public abstract class Arac {
	public ArrayList<Gecis> gecisler = new ArrayList<Gecis>();
	String isim;
	String soyisim;
	int bakiye=100;
	String id;
	public Arac(String isim, String soyisim, String id) {
		this.isim=isim;
		this.soyisim=soyisim;
		this.id=id;
		
	}
	
	public String getAracTipi() {
		return "";
	}
	
	public void ode(Gise g) {
		
	}
}
