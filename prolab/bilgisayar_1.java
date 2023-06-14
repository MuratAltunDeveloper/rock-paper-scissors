package prolab;

import java.security.PublicKey;
import java.util.*;
import javax.swing.*;
public class bilgisayar extends oyuncu{
	public static  String oyuncuAdi;
	public  static String oyuncuID;
	Random rastgele=new Random();
	public String[] atama=new String[3];
	static int nesnesayısı2=5;
	public int rastgelebilgisayarsecim; 
	// static araylistleri public yaptım
	public ArrayList<Integer>secilenelemanlar=new ArrayList<>();
	public ArrayList<String>nesneelemanlari=new ArrayList<>();
	public ArrayList<String>bilgisayarinsecimi=new ArrayList<>();
	
    public bilgisayar()
    { 
    int[] gelensecim=new int[nesnesayısı2];
	int nesneelemanlarıındex=1;
for(int i=0;i<nesnesayısı2;i++)
{  

	gelensecim[i]=rastgele.nextInt(3)+1;
	//System.out.println(gelensecim[i]);
	if(gelensecim[i]==1)
	{  
		nesneelemanlari.add("tas");
	
		nesneelemanlarıındex++;
	}
	if(gelensecim[i]==2)
	{   nesneelemanlari.add("kagıt");
	
		nesneelemanlarıındex++;
	}
	if(gelensecim[i]==3)
	{   nesneelemanlari.add("makas");
		
		nesneelemanlarıındex++;
	}
	
}
System.out.println("--------------------");

for(int i=0;;i++)
{ 
	
	Random rastgele2=new Random();
	rastgelebilgisayarsecim=rastgele2.nextInt(gelensecim.length)+1;
	if(i==0)
	{
		secilenelemanlar.add(rastgelebilgisayarsecim);
	}
	else {
	int index=secilenelemanlar.indexOf(rastgelebilgisayarsecim);
	if(index<0)
	{
		secilenelemanlar.add(rastgelebilgisayarsecim);
	}
		
   if(secilenelemanlar.size()==nesnesayısı2)
   {
	   break;
   }
	}	
}for(int x=0;x<secilenelemanlar.size();x++)
{
bilgisayarinsecimi.add(nesneelemanlari.get(secilenelemanlar.get(x)-1));

}
System.out.println(secilenelemanlar);
System.out.println("bilgisayarelemanları:"+nesneelemanlari);

System.out.println("bilgisayarınelemanlarrandomsecimi:"+bilgisayarinsecimi);


    }
	
	@Override
	public void nesneSec() {
	 
	System.out.println("secilen nesneler:");
for(int y=0;y<secilenelemanlar.size();y++)
{
	System.out.println(bilgisayarinsecimi.get(y));
}

		
	}

	@Override
	public void SkorGoster() {
		// TODO Auto-generated method stub
		
	}

}
