package prolab;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.remote.SubjectDelegationPermission;

public class kullanicci extends oyuncu{
	
	Scanner scan=new Scanner(System.in);
	public int index;
	public  static String oyuncuAdi;
	public  static String oyuncuID;
	public static int skor=0;
	public kullanicci() {
			for(int i=0;i<nesneListesi.length;i++)
			{System.out.println("nesnedeki elemanlar:");
			String tmp=scan.nextLine();
			  nesneListesi[i]=tmp;
			}
		}
	@Override
	public void nesneSec() {
	
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SkorGoster() {
		System.out.println("skor:"+skor);
		// TODO Auto-generated method stub
		
	}

}
