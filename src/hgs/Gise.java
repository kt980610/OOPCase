package hgs;
import java.util.*;
public class Gise {
	ArrayList<Arac> gunluk_arac = new ArrayList<Arac>();
	int gunluk_gelir=0;
	String isim;
	public Gise(String isim) {
		this.isim=isim;
	}
	
	public void odeme_kabul(Arac a) {
		if(this.gunluk_arac.contains(a)) {
			for(int i=0;i<this.gunluk_arac.size();i++) {
				if(this.gunluk_arac.get(i).equals(a)) {
					this.gunluk_arac.remove(i);
					this.gunluk_arac.add(i, a);
					break;
				}
			}
		}
		else {
			this.gunluk_arac.add(a);
		}
		if(a.getAracTipi().equals("Otomobil")) {
			this.gunluk_gelir+=1;
		}
		else if(a.getAracTipi().equals("Minibüs")) {
			this.gunluk_gelir+=2;
		}
        else if(a.getAracTipi().equals("Otobüs")) {
			this.gunluk_gelir+=3;
		}
	}
	
	
}
