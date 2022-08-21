package hgs;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.*;
public class Otomobil extends Arac {
	public Otomobil(String isim, String soyisim, String id) {
		super(isim, soyisim, id);
		// TODO Auto-generated constructor stub
	}
	public String getAracTipi() {
		return "Otomobil";
	}
	public void ode(Gise g) {
		if(this.bakiye>=1) {
			super.bakiye-=1;
			Gecis gecis = new Gecis(g,LocalDateTime.now());
			super.gecisler.add(gecis);
			g.odeme_kabul(this);
		}
		
	}
}
