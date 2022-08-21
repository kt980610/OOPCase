package hgs;

import java.util.ArrayList;
import java.time.*;
public class Otobus extends Arac {
	public Otobus(String isim, String soyisim, String id) {
		super(isim, soyisim, id);
		// TODO Auto-generated constructor stub
	}
	public String getAracTipi() {
		return "Otobüs";
	}
	public void ode(Gise g) {
		if(this.bakiye>=3) {
			super.bakiye-=3;
			Gecis gecis = new Gecis(g,LocalDateTime.now());
			super.gecisler.add(gecis);
			g.odeme_kabul(this);
		}
}
}
