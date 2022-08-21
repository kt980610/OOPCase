package hgs;
import java.util.*;
import java.time.*;
public class Yonetim {
	ArrayList<Gise> giseler= new ArrayList<Gise>();
	ArrayList<Arac> kayitli_araclar = new ArrayList<Arac>();
	public Yonetim() {
		
	}
	public int getToplamGelir() {
		int gunluk_toplam_gelir=0;
		for (int i=0;i<this.giseler.size();i++) {
			gunluk_toplam_gelir+=this.giseler.get(i).gunluk_gelir;
		}
		return gunluk_toplam_gelir;
	}
}
