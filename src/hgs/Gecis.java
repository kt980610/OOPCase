package hgs;
import java.util.*;
import java.time.*;
public class Gecis {
	Gise g;
	LocalDateTime ld;
	public Gecis(Gise gise, LocalDateTime tarih) {
		this.g=gise;
		this.ld=tarih;
	}

	public String getGise() {
		return this.g.isim;
	}
	public LocalDateTime getTime() {
		return this.ld;
	}
}
