package prolab;

public class tas extends nesne{
public int katilik=2;
public int dayaniklilik;
public int seviyePuani;
public double tasetki;

	public tas() {
		super();
		this.dayaniklilik=super.dayaniklilik;
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
	if(gir instanceof ustamakas)
	{
		ustamakas rakipUstamakas=new ustamakas();
		double tetki2;
		tetki2=(katilik)/(0.2*rakipUstamakas.keskinlik*rakipUstamakas.direnc);
		return tetki2;
	}else if(gir instanceof makas)
	{
		makas rakipMakas=new makas();
	    double tetki;
	    tetki=(katilik)/(0.2*rakipMakas.keskinlik);
	    return tetki;
	}
	else if(gir instanceof Özelkagit)
	{
		Özelkagit rakipÖzelkagit=new Özelkagit();
		double tetki3;
		//System.out.println("yyy");
		tetki3=(katilik)/(0.8*rakipÖzelkagit.nüfuz*rakipÖzelkagit.kalınlık);
		return tetki3;
		
	}
	else if(gir instanceof kagit)
	{
		kagit rakipKagit=new kagit();
		double tetki4;
		tetki4=(katilik)/(0.8*rakipKagit.nüfuz);
		return tetki4;
		
	}
	else 
	{
	return -100;	
	}
	
		
	}

	@Override
	public int durumGuncelle(double etki) {
	
		this.dayaniklilik=this.dayaniklilik-(int) etki;
		if(dayaniklilik<=0)
		{
		return 20;	
		}
		return 0;
	}

}
