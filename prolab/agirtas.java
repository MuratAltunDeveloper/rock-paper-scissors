package prolab;

public class agirtas extends tas {
	public int  katilik;
	public int dayaniklilik;
	public int seviyePuani;
	public int sicaklik=2;
   public double agirtasetki;
	public agirtas() {
		super();
		this.dayaniklilik=super.dayaniklilik;
		this.katilik=super.katilik;
		this.seviyePuani=super.seviyePuani;
	}
	@Override
	public void nesnePuaniGoster() {

		System.out.println("dayanıklılık:"+dayaniklilik);
		System.out.println("seviye puanı:"+seviyePuani);
		// TODO Auto-generated method stub
		
	}
	@Override
	public double etkiHesapla(nesne gir) {
		// TODO Auto-generated method stub
		if(gir instanceof ustamakas)
		{
			ustamakas rakipUstamakas=new ustamakas();
			double tetki2;
			tetki2=(katilik*sicaklik)/(0.2*rakipUstamakas.keskinlik*rakipUstamakas.direnc);
			return tetki2;
		}else if(gir instanceof makas)
		{
			makas rakipMakas=new makas();
		    double tetki;
		    tetki=(katilik*sicaklik)/(0.2*rakipMakas.keskinlik);
		    //System.out.println("x");
		    return tetki;
		}
		else if(gir instanceof Özelkagit)
		{
			Özelkagit rakipÖzelkagit=new Özelkagit();
			double tetki3;
			//System.out.println("yyy");
			tetki3=(katilik*sicaklik)/(0.8*rakipÖzelkagit.nüfuz*rakipÖzelkagit.kalınlık);
			return tetki3;
			
		}
		else if(gir instanceof kagit)
		{
			kagit rakipKagit=new kagit();
			double tetki4;
			tetki4=(katilik*sicaklik)/(0.8*rakipKagit.nüfuz);
			//System.out.println(".");
			return tetki4;
			
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
