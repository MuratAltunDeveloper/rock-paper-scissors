package prolab;

public class makas extends nesne{
public int dayaniklilik;
public int seviyePuani;
public int keskinlik=2;
public double makasetki;
   public makas() {
	  super();
	  this.dayaniklilik=super.dayaniklilik;
	  this.seviyePuani=super.seviyePuani;
    } 
	@Override
	public void nesnePuaniGoster() {
		// TODO Auto-generated method stub

		System.out.println("dayanıklılık:"+dayaniklilik);
		System.out.println("seviye puanı:"+seviyePuani);
	}
	@Override
	public double etkiHesapla(nesne gir) {
		 if(gir instanceof Özelkagit)
		{  Özelkagit rakipÖzelkagit =new Özelkagit();
		   double metki2;
		   metki2=(keskinlik)/(0.2*rakipÖzelkagit.nüfuz*rakipÖzelkagit.kalınlık);
		  // System.out.println("x");
		return metki2;	
		}
		 else if(gir instanceof kagit)
		{
			kagit rakipKagit=new kagit();
			double metki;
			metki=(keskinlik)/(0.2*rakipKagit.nüfuz);
			return metki;
		}
		else if(gir instanceof agirtas)
		{
			agirtas rakipAgirtas=new agirtas();
			double metki3;
			metki3=(keskinlik)/(0.8*rakipAgirtas.katilik*rakipAgirtas.sicaklik);
			return metki3;
		}
		else if(gir instanceof tas)
		{
			tas rakipTas=new tas();
			double metki4;
			metki4=(keskinlik)/(0.8*rakipTas.katilik);System.out.println("z");
			return metki4;
			
		}
		else 
		{
		return -100;	
		}
		
		
		
		
		
		
		
		
		
	}

	@Override
	public int durumGuncelle(double etki) {
		// TODO Auto-generated method stub
		this.dayaniklilik=this.dayaniklilik-(int) etki;
		if(dayaniklilik<=0)
		{
		return 20;	
		}
		return 0;
	}

}
