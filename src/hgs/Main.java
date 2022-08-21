package hgs;

public class Main {
	
	
	public static void main(String[] args) {
		Gise g = new Gise("gise1");
		Otomobil a = new Otomobil("isim1","soyisim1","1");
		Arac b = new Minibus("isim2","soyisim2","2");
		Arac c = new Otobus("isim3","soyisim3","3");
		a.ode(g);
		b.ode(g);
		c.ode(g);
		System.out.println(a.bakiye+" a");
		System.out.println(g.gunluk_gelir);
		a.ode(g);
		System.out.println(a.bakiye+" a");
		System.out.println(g.gunluk_gelir);
		b.ode(g);
		b.ode(g);
		System.out.println(b.bakiye+" b");
		System.out.println(g.gunluk_gelir);
		for (int i=0;i<g.gunluk_arac.size();i++) {
			System.out.print(g.gunluk_arac.get(i).getAracTipi()+" ");
			System.out.print(g.gunluk_arac.get(i).id+" ");
			System.out.print(g.gunluk_arac.get(i).isim+" ");
			System.out.print(g.gunluk_arac.get(i).soyisim+" ");
			System.out.println();
			for (int j=0;j<g.gunluk_arac.get(i).gecisler.size();j++) {
				System.out.println("giþe: "+g.gunluk_arac.get(i).gecisler.get(j).getGise());
				System.out.println("tarih: "+g.gunluk_arac.get(i).gecisler.get(j).getTime());
				
			}
			System.out.println();
		}
		
	}

}
