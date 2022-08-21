package hgs;

import java.util.ArrayList;
import java.time.*;
public class Minibus extends Arac {
	public Minibus(String isim, String soyisim, String id) {
		super(isim, soyisim, id);
		// TODO Auto-generated constructor stub
	}
	public String getAracTipi() {
		return "Minibüs";
	}
	public void ode(Gise g) {
		if(this.bakiye>=2) {
			super.bakiye-=2;
			Gecis gecis = new Gecis(g,LocalDateTime.now());
			super.gecisler.add(gecis);
			g.odeme_kabul(this);
		}
}
}
