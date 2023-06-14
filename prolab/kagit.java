package prolab;

public class kagit extends nesne {
	public int dayaniklilik;
	public int seviyePuani;
    public int nüfuz=2;
    public double kagitetki;
	public kagit() {
		super();
		this.dayaniklilik=super.dayaniklilik;
		this.seviyePuani=super.seviyePuani;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void nesnePuaniGoster() {
		// TODO Auto-generated method stub

		System.out.println("dayanıklılık:"+dayaniklilik);
		System.out.println("seviye puanı:"+seviyePuani);
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
	@Override
	public double etkiHesapla(nesne gir) {
	
			 if(gir instanceof agirtas)
		{
			agirtas rakipAgirtas=new agirtas();
			Double ketki2;
			//System.out.println("zz");	
			ketki2=(nüfuz)/(0.2*rakipAgirtas.katilik*rakipAgirtas.sicaklik);
	return ketki2;
			
		}
			 else if(gir instanceof tas)
		{   tas rakiptTas=(tas)gir;
			Double ketki;	
			//System.out.println("tt");
	         ketki=(nüfuz)/(0.2*rakiptTas.katilik);
		return ketki;
		}
		else if(gir instanceof ustamakas)
		{
			ustamakas rakipUstamakas=(ustamakas)gir;
			Double ketki4;
			ketki4=(nüfuz)/(0.8*rakipUstamakas.keskinlik*rakipUstamakas.direnc);
				//System.out.println("xxxxxxxxxxx");	
				return ketki4;
		}
		else if(gir instanceof makas) {
			makas rakipMakas=(makas)gir;
			Double ketki3;
			ketki3=(nüfuz)/(0.8*rakipMakas.keskinlik);
			//System.out.println("yyyy");	
			return ketki3;
		}
	
		return 0;
		
	
	}}
