package prolab;

import java.awt.Font;
import java.util.*;
import java.awt.desktop.PrintFilesEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
//OYUNCU ADI VE ID arraya ---attım

public class goruntu{
	public static int toplamhamlesayısı=0;
	//hamleler bundadır
	public static int  hamlesayısı=7;
	static int ekle=0;
	static int nesnesayısı=0;
	static int nesnesayısı1=0;
	static int nesnesayısı2=0;
	static int nesnesayısı3=0;
	static int butonici=0;
	static int toplamnesnesayısı=5;
   static int bilgisayarsecimdeger=0;
   static int tasart=1;
   static int kagıtart=1;
   static int makasart=1;
   static int gir2=1;
   static int gir3=1;
   static String  nesnemvarmı="true";
   static String oynayan1;//kullanıcımı bilgisayarmı tutar
   static String oynayan2;
   static String oynayan3;
   static String oynayan4;
   static String oynayan5;
   static String oynayan6;
   static int kullanıcınesnelersayisi;
   static int bilgisayarvsbilgisayar=0;
   static int kullanıcınesnelerinartımı=0;
    
   //arraylist add le al!!!!!!!!!!!!!!!!!!!!!!11
   //static nesne[] kullanıcınesnelerArrayList=new nesne[30];
    static ArrayList<String>kopya=new ArrayList<String>();
public static void main(String[] args) {
	
	
	
	
	bilgisayar nesne=new bilgisayar();
	ArrayList<Integer>bilgisayarrastgelesecim=new ArrayList<>();
	ArrayList<String>nesneler=new ArrayList<>();
  
	
	ArrayList<nesne>kullanıcınesnlelerArrayList=new ArrayList<>();
       ArrayList<String>kullanıcınesneADArrayList=new ArrayList<>();
	JFrame anapencere=new JFrame("TAS-KAGIT-MAKAS");
	//biseyler setvisible kadar eklenir
	ArrayList<String>bilgisayarrandomsecimdegerleri=new ArrayList<>();
	
	
	ArrayList<nesne>computerrandomsınıfArrayList=new ArrayList<>();
	bilgisayar bilgisayar3=new bilgisayar();
	bilgisayarrandomsecimdegerleri=(ArrayList<String>) bilgisayar3.bilgisayarinsecimi.clone();
	//System.out.println("**********************"+bilgisa);
	System.out.println("------57"+bilgisayarrandomsecimdegerleri);
	System.out.println("-------58"+bilgisayar3.bilgisayarinsecimi);
	kopya=(ArrayList<String>) bilgisayarrandomsecimdegerleri.clone();
	Object[] bilgisayarsecdizi=bilgisayarrandomsecimdegerleri.toArray();
	for(Object i:bilgisayarsecdizi)
	{
		System.out.println("-*"+i);
	}
	
	if(gir2==1)
	{ int tart=1,kart=1,mart=1,bak=1;
     for(int i=0;i<bilgisayarrandomsecimdegerleri.size();i++)
     {   
    	 if(bilgisayarrandomsecimdegerleri.get(i).contains("tas"))
    	 {  
    		 if(tart==1)
    	    { tas bx1=new tas();
    	      computerrandomsınıfArrayList.add(bx1);
              //computerrandomsecimadArrayList.add("tas1");
    	    }
    		 else if(tart==2)
    		 {
    			tas bx2=new tas(); 
    			
    			//System.out.println("bx2");
          	    computerrandomsınıfArrayList.add(bx2);
               // computerrandomsecimadArrayList.add("tas2");
    		 }
    		 else if(tart==3)
    		 {
    			tas bx3=new tas(); 
    			computerrandomsınıfArrayList.add(bx3);
    			//computerrandomsecimadArrayList.add("tas3");
    			//System.out.println("bx3");
    		 }
    		 else if(tart==4)
    		 {
    			tas bx4=new tas(); 
    			computerrandomsınıfArrayList.add(bx4);
    			
    			//computerrandomsecimadArrayList.add("tas4");
    			//System.out.println("bx4");
    		 }
    		 else if(tart==5)
    		 {
    			tas bx5=new tas(); 
    			computerrandomsınıfArrayList.add(bx5);
    			//computerrandomsecimadArrayList.add("tas5");
    			//System.out.println("bx5");
    		 }
    	
    	     tart++;
    		 //System.out.println("                    t");
    	 }
    	 else if(bilgisayarrandomsecimdegerleri.get(i).contains("kagıt"))
    	 {
    		 
    		 if(kart==1)
     	    { kagit by1=new kagit();
     	    computerrandomsınıfArrayList.add(by1);
     	   // computerrandomsecimadArrayList.add("kagit1");
     	    }
     		 else if(kart==2)
     		 {
     			kagit by2=new kagit(); 
     			computerrandomsınıfArrayList.add(by2);
     			//computerrandomsecimadArrayList.add("kagit2");
     		 }
     		else if(kart==3)
    		 {
    			kagit by3=new kagit(); 
    			computerrandomsınıfArrayList.add(by3);
    			 //computerrandomsecimadArrayList.add("kagit3");
    		 }
     		else if(kart==4)
    		 {
    			kagit by4=new kagit(); 
    			computerrandomsınıfArrayList.add(by4);
    			 //computerrandomsecimadArrayList.add("kagit4");
    		 }
     		else if(kart==5)
    		 {
    			kagit by5=new kagit(); 
    			computerrandomsınıfArrayList.add(by5);
    			// computerrandomsecimadArrayList.add("kagit5");
    		 }
     		
     		
     	     kart++;
    		 
    		 
    		 
    		//System.out.println("                         k"); 
    	 }
    	 else {
    		 if(mart==1)
      	    { makas bz1=new makas();
      	    computerrandomsınıfArrayList.add(bz1);
      	//  computerrandomsecimadArrayList.add("tas1");
      	    
      	    }
      		 else if(mart==2)
      		 {
      			makas bz2=new makas(); 
      			computerrandomsınıfArrayList.add(bz2);
      			//computerrandomsecimadArrayList.add("tas2");
      		 }
      		else if(mart==3)
     		 {
     			makas bz3=new makas(); 
     			computerrandomsınıfArrayList.add(bz3);
     			//computerrandomsecimadArrayList.add("tas3");
     			
     		 }
      		 else if(mart==4)
      		 {
      			makas bz4=new makas(); 
      			computerrandomsınıfArrayList.add(bz4);
      			//computerrandomsecimadArrayList.add("tas4");
      		 }
      		else if(mart==5)
     		 {
     			makas bz5=new makas(); 
     			computerrandomsınıfArrayList.add(bz5);
     			//computerrandomsecimadArrayList.add("tas5");
     		 } 
    		 mart++;
		//System.out.println("                              m");	
		}
     }	 
	gir2++;
	}

	System.out.println("--------"+nesneler);
				
				JLabel yaziJLabel=new JLabel();
				JComboBox<String> oyuncusecimi= new JComboBox<String>();
				//combo boxa eleman ekle
				oyuncusecimi.addItem("kullanıcı");
				oyuncusecimi.addItem("Bilgisayar");
				oyuncusecimi.setBounds(250,100,250,30);
			    anapencere.add(oyuncusecimi);
			    anapencere.add(oyuncusecimi);
			    JButton onayButton=new JButton("X");
			    onayButton.setBounds(350,140,50,30);	
			    onayButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 System.out.println(oyuncusecimi.getSelectedItem());
						 String bakString=(String) oyuncusecimi.getSelectedItem();
						 if(bakString.equalsIgnoreCase("kullanıcı"))
						 {
							 
							 
							 JFrame pencere=new JFrame("TAS-KAGIT-MAKAS");
								//biseyler setvisible kadar eklenir
								JButton buton1=new JButton("taş");
								JButton buton2=new JButton("kağıt");
								JButton buton3=new JButton("makas");
								buton1.setBounds(50,100,100,30);
								buton2.setBounds(150,100,100,30);
								buton3.setBounds(250,100,100,30);
								//butonatıklanmayı alma add action
								


								buton1.addActionListener(new ActionListener() {
									
						  
									@Override
									public void actionPerformed(ActionEvent e) {
							 
										String tmp="tas"+(nesnesayısı1+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
										System.out.println(nesneolustur.nesnelerlistesi);
										nesnesayısı1++;
									    nesnesayısı++;
										nesneolustur nesne1=new nesneolustur();
										System.out.println(nesne1.x);
										
									    System.out.println(nesnesayısı1);
										if(nesnesayısı==toplamnesnesayısı)
										{
											JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
											
											
											JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea=new JTextArea();
										   JButton adButton=new JButton();
											adButton.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString=oyuncuadiveıdArea.getText();
													String dizi[]=areatextString.split("-");
													kullanicci.oyuncuAdi=dizi[0];
													kullanicci.oyuncuID=dizi[1];
													//System.out.println(kullanicci.oyuncuID);
													// System.out.println(kullanicci.oyuncuAdi);
													
													System.out.println("kullaniciad:"+dizi[0]);
													System.out.println("kullaniciid:"+dizi[1]);
													
												}
											});
											bilgiJLabel.setBounds(140,30,100,30);
											adButton.setBounds(465,30,10,10);
											oyuncuadiveıdArea.setBounds(240,30,200,30);
											pencere3.add(adButton);
											pencere3.add(bilgiJLabel);
											pencere3.add(oyuncuadiveıdArea);
											
											JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea2=new JTextArea();
										   JButton adButton2=new JButton();
											adButton2.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString2=oyuncuadiveıdArea2.getText();
													String dizi2[]=areatextString2.split("-");
													bilgisayar.oyuncuAdi=dizi2[0];
													bilgisayar.oyuncuID=dizi2[1];
												
													System.out.println("bilgisayarad:"+dizi2[0]);
													System.out.println("bilgisayarid:"+dizi2[1]);
													
												}
											});
											   
											bilgiJLabel2.setBounds(480,30,100,30);
											adButton2.setBounds(800,30,10,10);
											oyuncuadiveıdArea2.setBounds(590,30,200,30);
											pencere3.add(adButton2);
											pencere3.add(bilgiJLabel2);
											pencere3.add(oyuncuadiveıdArea2);
											
											
										   
										   
										   
										   
											
											
											
											
											
											
											
											
											
											JLabel yaziJLabel=new JLabel();
											 JButton btn1=new JButton();
											    btn1.setText(nesneler.get(0));
											    btn1.setBounds(300,193,80,20);
											    btn1.addActionListener(new ActionListener() {
													public int x =1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														
														

														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                             kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                         kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                     kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                               kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														x++;
														//System.out.println(y);
														if(x%2==0)
														{
															
														btn1.setEnabled(false);
														}	
														
													
														
													}
												});
								          
											    JButton btn2=new JButton();
											    btn2.setText(nesneler.get(1));
											    btn2.setBounds(300,230,80,20);
											    btn2.addActionListener(new ActionListener() {
											    	
													public int y=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                             kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                         kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                     kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                               kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														y++;
														System.out.println(y);
														if(y%2==0)
														{
															
														btn2.setEnabled(false);
														}	
														
													
													}
												});
											    JButton btn3=new JButton();
											    btn3.setText(nesneler.get(2));
											    btn3.setBounds(300,270,80,20);
											    btn3.addActionListener(new ActionListener() {
													public int z=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(2));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(2));
														if(tasart<=5&&nesneler.get(2).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t333=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t333);
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t444=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t444);
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t555=new tas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(t555);
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k333=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k333);
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k555=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k555);
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(2).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														z++;
														System.out.println(z);
														if(z%2==0)
														{
															
														btn3.setEnabled(false);
														}	
														
													}
												});
											    JButton btn4=new JButton();
											    btn4.setText(nesneler.get(3));
											    btn4.setBounds(300,310,80,20);
											    btn4.addActionListener(new ActionListener() {
													public int q=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														toplamhamlesayısı++;
														
														
														
														kullanıcınesneADArrayList.add(nesneler.get(3));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(3));
														if(tasart<=5&&nesneler.get(3).contains("tas"))
														{
														 if(tasart==1)
									                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
									                	    tas t1111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t2222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t2222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t3333=new tas();
									                			 kullanıcınesnlelerArrayList.add(t3333);
									                			//System.out.println("x3");
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t4444=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t5555=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t5555);
									                			//System.out.println("x5");
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k1111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k1111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k2222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k2222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k3333=new kagit(); 
									                			//System.out.println("x3");
									                			System.out.println("-----k3");
									                			 kullanıcınesnlelerArrayList.add(k3333);
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k4444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k4444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k5555=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k5555);
									                			//System.out.println("x5");
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(3).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m1111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m2222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m2222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m3333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m3333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m4444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m5555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m5555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														q++;
														
														//System.out.println("+++++193"+kullanıcınesneADArrayList);
														System.out.println(q);
														if(q%2==0)
														{
															
														btn4.setEnabled(false);
														}
														
													}
												});
											    JButton btn5=new JButton();
											    btn5.setText(nesneler.get(4));
											    btn5.setBounds(300,350,80,20);
											    btn5.addActionListener(new ActionListener() {
													public int w=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
						
						kullanıcınesneADArrayList.add(nesneler.get(4));
						//burda gecerli	
						
						System.out.println("--------------------------------tasart5"+tasart);
						kullanıcınesneADArrayList.add(nesneler.get(4));
						if(tasart<=5&&nesneler.get(4).contains("tas"))
						{
						 if(tasart==1)
	                	    { tas t11111=new tas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");
kullanıcınesnlelerArrayList.add(t11111);
					
	                	    }
	                		 else if(tasart==2)
	                		 {
	                			tas t22222=new tas(); 
	                			//System.out.println("-----------------------------------tas2");
	                     System.out.println("-----------t2"); 	 
	                     kullanıcınesnlelerArrayList.add(t22222);
	           
	                		 }
	                		 else if(tasart==3)
	                		 {
	                			tas t33333=new tas(); 
	                			   kullanıcınesnlelerArrayList.add(t33333);
	                			//System.out.println("x3");
	                		 }
	                		 else if(tasart==4)
	                		 {
	                			tas t44444=new tas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(t44444);
	                		 }
	                		 else if(tasart==5)
	                		 {
	                			tas t55555=new tas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(t55555);
	                		 }
						 tasart++;
						
						}
						if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
						{
						 if(kagıtart==1)
	                	    { 
							 kagit k11111=new kagit();
	                	       //System.out.println("-----------------------------------tas1");
					System.out.println("------k1");
					   kullanıcınesnlelerArrayList.add(k11111);
	                	    }
	                		 else if(kagıtart==2)
	                		 {
	                			kagit k22222=new kagit(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(k22222);
	                      	    
	           System.out.println("--------k2");
	                		 }
	                		 else if(kagıtart==3)
	                		 {
	                			kagit k33333=new kagit(); 
	                			//System.out.println("x3");
	                			System.out.println("-----k3");
	                			   kullanıcınesnlelerArrayList.add(k33333);
	                		 }
	                		 else if(kagıtart==4)
	                		 {
	                			kagit k44444=new kagit(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(k44444);
	                		 }
	                		 else if(kagıtart==5)
	                		 {
	                			kagit k55555=new kagit(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(k55555);
	                		 }
						 kagıtart++;
						
						}
						if(makasart<=5&&nesneler.get(4).contains("makas"))
						{
						 if(makasart==1)
	                	    { makas m11111=new makas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");
kullanıcınesnlelerArrayList.add(m11111);
					
	                	    }
	                		 else if(makasart==2)
	                		 {
	                			makas m22222=new makas(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(m22222);
	           System.out.println("---------m2");
	                		 }
	                		 else if(makasart==3)
	                		 {
	                			makas m33333=new makas(); 
	                			//System.out.println("x3");
	                			System.out.println("m3");
	                			   kullanıcınesnlelerArrayList.add(m33333);
	                		 }
	                		 else if(makasart==4)
	                		 {
	                			makas m44444=new makas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(m44444);
	                		 }
	                		 else if(makasart==5)
	                		 {
	                			makas m55555=new makas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(m55555);
	                		 }
						 makasart++;
						//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
						System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														w++;

														System.out.println(w);
														if(w%2==0)
														{
														btn5.setEnabled(false);
														}
														
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn1.setEnabled(true);
														 btn1.addActionListener(new ActionListener() {
																public int x =1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																	//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		
																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(0));
																	if(tasart<=5&&nesneler.get(0).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t1=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                          






			kullanıcınesnlelerArrayList.add(t1);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t2=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	
												                     kullanıcınesnlelerArrayList.add(t2);
			                                                         kullanıcınesnelerinartımı++;
												                    
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t3=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t3);
				                                                             kullanıcınesnelerinartımı++;
												                			
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t4=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t4);
				                                                             kullanıcınesnelerinartımı++;
												                		
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t5=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k1=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k1);
			                                                     kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k2=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                			
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k3=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k4=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                			
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k5=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                			
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(0).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m1=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m1);
			kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m2=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m3=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m4=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m5=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	
																	}
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	x++;
																	System.out.println(x);
																	if(x%2==0)
																	{
																	//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																	
																		
																	btn1.setEnabled(false);
																	
																	}	
																	
																
																
																}
															});
											          
														}
																
																
														if(toplamhamlesayısı<hamlesayısı)
														{	btn2.setEnabled(true);
														  btn2.addActionListener(new ActionListener() {
														    	
																public int y=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{
																		int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																			for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																			{
																			
																				bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																				//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																			}
																			
																			for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																			{
																			kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																			}
																			

																			if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																			{
																				
																				JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																				JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			}
																				
																			else	
																			{
																				JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																				JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																				
																			}
																														
																				
																		//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	if(tasart<=5&&nesneler.get(1).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t11=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t22=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	    
												                     kullanıcınesnlelerArrayList.add(t22);
			                                                         kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t33=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t33);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t44=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t44);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t55=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t55);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																	 tasart++;
																	System.out.print("----------------tasartalt"+tasart);
																	System.out.println();
																	}
																	if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k11=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k11);
			                                                     kullanıcınesnelerinartımı++;
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k22=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("--------k2");
												           kullanıcınesnlelerArrayList.add(k22);
			                                               kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k33=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k33);
				                                                             kullanıcınesnelerinartımı++;
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k44=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k44);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k55=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k55);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(1).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m11=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
			kullanıcınesnelerinartımı++;
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m22=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                            kullanıcınesnlelerArrayList.add(m22);
												                            kullanıcınesnelerinartımı++;
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m33=new makas(); 
												                			//System.out.println("x3"
												                            kullanıcınesnlelerArrayList.add(m33);
												                            kullanıcınesnelerinartımı++;
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m44=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m44);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m55=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m55);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	 if(toplamhamlesayısı==hamlesayısı)
																		{	
																				for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																				{
																					for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																					{
																						if(i==j)
																						{ 
																				double saldıranetki=0;
																			    double savunanetki=0;
																		        int seviyepuanartis=0;		
														saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
														seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
												        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
														int seviyepuanartis2=0;		
														savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
														seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
														kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
														
								//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
													
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
												System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
												// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
												  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
												 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
												
												  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
												  {
													  computerrandomsınıfArrayList.remove(i);
													  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
													  {
														  agirtas agirtas1=new agirtas();
													  }
													  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
													  {
														  
														  Özelkagit özelkagit1=new Özelkagit();
													  }
													  else {
														  
															  ustamakas ustamakas1=new ustamakas();
														  
													}
												  }
												  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
												  {
													  kullanıcınesnlelerArrayList.remove(i);
												  }
												  
												  if(computerrandomsınıfArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
													  
												  }
												  if(kullanıcınesnlelerArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
												  }					  
												  
												  
												  
												  
												/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														  {
													  //tasbilgisayar.
													  System.out.println("bilgisayar sakor art");
													  bilgisayar.skor++;
													  
														  }
												  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														{
													System.out.println("kullanicci skor art");
													kullanicci.skor++;
												}
												  */
												  
												  
												  
												/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
												  System.out.println("/***************kullanici////////"+kullanicci.skor);
												  System.out.println("toplamyahahmle"+toplamhamlesayısı);
												*/
												  
														       
											//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
											if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
											{
												//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
									
											}
														       
																						
																						}
																					}
																				
																				}
								                                           }
																	 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	}
																	y++;
																	System.out.println(y);
																	if(y%2==0)
																	{
																		
																	btn2.setEnabled(false);
																	}	
																	
																}
															});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn3.setEnabled(true);
														 btn3.addActionListener(new ActionListener() {
																public int z=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}	
																		//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	if(tasart<=5&&nesneler.get(2).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t111=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t222=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 
												                     kullanıcınesnlelerArrayList.add(t222);
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t333=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t333);
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t444=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t444);
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t555=new tas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(t555);
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k111=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k111);
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k222=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(k222);
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k333=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k333);
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k444=new kagit(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(k444);
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k555=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k555);
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(2).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m111=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m222=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(m222);
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m333=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m333);
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m444=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m444);
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m555=new makas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(m555);
												                		 }
																	 makasart++;
																	
																	}
																	System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	z++;
																	System.out.println(z);
																	if(z%2==0)
																	{
																		
																	btn3.setEnabled(false);
																	}	
																	
																}
															});
														}
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn4.setEnabled(true);
														btn4.addActionListener(new ActionListener() {
															public int q=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																
																// TODO Auto-generated method stub
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}
																											
																	
																	//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
																}
																
																toplamhamlesayısı++;
																
																
																
																kullanıcınesneADArrayList.add(nesneler.get(3));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(3));
																if(tasart<=5&&nesneler.get(3).contains("tas"))
																{
																 if(tasart==1)
											                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
											                	    tas t1111=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t2222=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 
											                     kullanıcınesnlelerArrayList.add(t2222);
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t3333=new tas();
											                			 kullanıcınesnlelerArrayList.add(t3333);
											                			//System.out.println("x3");
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t4444=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t5555=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t5555);
											                			//System.out.println("x5");
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k1111=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k1111);
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k2222=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(k2222);
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k3333=new kagit(); 
											                			//System.out.println("x3");
											                			System.out.println("-----k3");
											                			 kullanıcınesnlelerArrayList.add(k3333);
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k4444=new kagit(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(k4444);
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k5555=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k5555);
											                			//System.out.println("x5");
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(3).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m1111=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m2222=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(m2222);
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m3333=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m3333);
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m4444=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m5555=new makas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(m5555);
											                		 }
																 makasart++;
																
																}
																System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																q++;
																
																//System.out.println("+++++193"+kullanıcınesneADArrayList);
																System.out.println(q);
																if(q%2==0)
																{
																	
																btn4.setEnabled(false);
																}
																
															}
														});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn5.setEnabled(true);
														 btn5.addActionListener(new ActionListener() {
																public int w=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																		//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
									
									kullanıcınesneADArrayList.add(nesneler.get(4));
									//burda gecerli	
									
									System.out.println("--------------------------------tasart5"+tasart);
									kullanıcınesneADArrayList.add(nesneler.get(4));
									if(tasart<=5&&nesneler.get(4).contains("tas"))
									{
									 if(tasart==1)
				                	    { tas t11111=new tas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");
			kullanıcınesnlelerArrayList.add(t11111);
								
				                	    }
				                		 else if(tasart==2)
				                		 {
				                			tas t22222=new tas(); 
				                			//System.out.println("-----------------------------------tas2");
				                     System.out.println("-----------t2"); 	 
				                     kullanıcınesnlelerArrayList.add(t22222);
				           
				                		 }
				                		 else if(tasart==3)
				                		 {
				                			tas t33333=new tas(); 
				                			   kullanıcınesnlelerArrayList.add(t33333);
				                			//System.out.println("x3");
				                		 }
				                		 else if(tasart==4)
				                		 {
				                			tas t44444=new tas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(t44444);
				                		 }
				                		 else if(tasart==5)
				                		 {
				                			tas t55555=new tas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(t55555);
				                		 }
									 tasart++;
									
									}
									if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
									{
									 if(kagıtart==1)
				                	    { 
										 kagit k11111=new kagit();
				                	       //System.out.println("-----------------------------------tas1");
								System.out.println("------k1");
								   kullanıcınesnlelerArrayList.add(k11111);
				                	    }
				                		 else if(kagıtart==2)
				                		 {
				                			kagit k22222=new kagit(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(k22222);
				                      	    
				           System.out.println("--------k2");
				                		 }
				                		 else if(kagıtart==3)
				                		 {
				                			kagit k33333=new kagit(); 
				                			//System.out.println("x3");
				                			System.out.println("-----k3");
				                			   kullanıcınesnlelerArrayList.add(k33333);
				                		 }
				                		 else if(kagıtart==4)
				                		 {
				                			kagit k44444=new kagit(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(k44444);
				                		 }
				                		 else if(kagıtart==5)
				                		 {
				                			kagit k55555=new kagit(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(k55555);
				                		 }
									 kagıtart++;
									
									}
									if(makasart<=5&&nesneler.get(4).contains("makas"))
									{
									 if(makasart==1)
				                	    { makas m11111=new makas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m11111);
								
				                	    }
				                		 else if(makasart==2)
				                		 {
				                			makas m22222=new makas(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(m22222);
				           System.out.println("---------m2");
				                		 }
				                		 else if(makasart==3)
				                		 {
				                			makas m33333=new makas(); 
				                			//System.out.println("x3");
				                			System.out.println("m3");
				                			   kullanıcınesnlelerArrayList.add(m33333);
				                		 }
				                		 else if(makasart==4)
				                		 {
				                			makas m44444=new makas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(m44444);
				                		 }
				                		 else if(makasart==5)
				                		 {
				                			makas m55555=new makas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(m55555);
				                		 }
									 makasart++;
									//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
			}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
									System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
									if(toplamhamlesayısı==hamlesayısı)
									{	
											for(int i=0;i<computerrandomsınıfArrayList.size();i++)
											{
												for(int j=0;j<computerrandomsınıfArrayList.size();j++)
												{
													if(i==j)
													{ 
											double saldıranetki=0;
										    double savunanetki=0;
									        int seviyepuanartis=0;		
					saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
					seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
			        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
					int seviyepuanartis2=0;		
					savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
					seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
					kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
					
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
				
			System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
			// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
			  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
			 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
			
			  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
			  {
				  computerrandomsınıfArrayList.remove(i);
				  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
				  {
					  agirtas agirtas1=new agirtas();
				  }
				  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
				  {
					  
					  Özelkagit özelkagit1=new Özelkagit();
				  }
				  else {
					  
						  ustamakas ustamakas1=new ustamakas();
					  
				}
			  }
			  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
			  {
				  kullanıcınesnlelerArrayList.remove(i);
			  }
			  
			  if(computerrandomsınıfArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
				  
			  }
			  if(kullanıcınesnlelerArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
			  }					  
			  
			  
			  
			  
			/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					  {
				  //tasbilgisayar.
				  System.out.println("bilgisayar sakor art");
				  bilgisayar.skor++;
				  
					  }
			  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					{
				System.out.println("kullanicci skor art");
				kullanicci.skor++;
			}
			  */
			  
			  
			  
			/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
			  System.out.println("/***************kullanici////////"+kullanicci.skor);
			  System.out.println("toplamyahahmle"+toplamhamlesayısı);
			*/
			  
					       
		//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
		if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
		{
			//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

		}
					       
													
													}
												}
											
											}
                                       }								
									w++;

																	System.out.println(w);
																	if(w%2==0)
																	{
																	btn5.setEnabled(false);
																	}
																}
																});
														}
													
													
														
														
										
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
													
											
													
													
													
											
												for(int i=0;i<computerrandomsınıfArrayList.size();i++)
													{
														for(int j=0;j<computerrandomsınıfArrayList.size();j++)
														{
															if(i==j)
															{ 
													double saldıranetki=0;
												    double savunanetki=0;
											        int seviyepuanartis=0;		
							saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
							seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
					        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
							int seviyepuanartis2=0;		
							savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
							seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
							kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
							
	//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
						
					System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
					// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
					  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
					 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
					
					  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
					  {
						  computerrandomsınıfArrayList.remove(i);
						  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
						  {
							  agirtas agirtas1=new agirtas();
						  }
						  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
						  {
							  
							  Özelkagit özelkagit1=new Özelkagit();
						  }
						  else {
							  
								  ustamakas ustamakas1=new ustamakas();
							  
						}
					  }
					  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
					  {
						  kullanıcınesnlelerArrayList.remove(i);
					  }
					  
					  if(computerrandomsınıfArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
						 
					  }
					  if(kullanıcınesnlelerArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
						
					  }					  
					  
					  
					  
					  
					/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							  {
						  //tasbilgisayar.
						  System.out.println("bilgisayar sakor art");
						  bilgisayar.skor++;
						  
							  }
					  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							{
						System.out.println("kullanicci skor art");
						kullanicci.skor++;
					}
					  */
					  
					  
					  
					/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
					  System.out.println("/***************kullanici////////"+kullanicci.skor);
					  System.out.println("toplamyahahmle"+toplamhamlesayısı);
					*/
					  
							       
				//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
				if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
				{
					//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
		
				}
							       
															
															}
														}
													
													}
	                                           
													
												
											
												
												
													}
													
													
													
													
													
													
													
												});

											    								    
											    JLabel bilgisayarsecimkutu=new JLabel();
											    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
											    bilgisayarsecimdeger++;
											    bilgisayarsecimkutu.setBounds(600,280,100,30 );
											    JButton btn=new JButton("computer secimi");
											    btn.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														JLabel label1 = new JLabel();
														label1.setFont(new Font("Calibri",Font.PLAIN,20));
														label1.setText(kopya.get(0));
														label1.setBounds(700, 200, 300, 40);
														JLabel label2 = new JLabel();
														label2.setFont(new Font("Calibri",Font.PLAIN,20));
														label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
														label2.setBounds(700, 261, 300, 40);
														JLabel label3 = new JLabel();
														label3.setFont(new Font("Calibri",Font.PLAIN,20));
														label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
														label3.setBounds(700, 323, 300, 40);
														JLabel label4 = new JLabel();
														label4.setFont(new Font("Calibri",Font.PLAIN,50));
														label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label4.setBounds(700, 384, 450, 80);
														JLabel label5 = new JLabel();
														label5.setFont(new Font("Calibri",Font.PLAIN,20));
														label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label5.setBounds(700, 480, 450, 80);





														pencere3.add(label1);
														pencere3.add(label2);
														pencere3.add(label3);
														pencere3.add(label4);
														pencere3.add(label5);
													}
												});
											    
											    btn.setBounds(500,280,130,30);
											    
											    
											    
											    
											    
											    
											    
												    
											    
								  
											yaziJLabel.setText("kullanıcıvsbilgisayar");
											yaziJLabel.setBounds(500,200,150,30);
											pencere3.add(btn5);
											pencere3.add(btn4);
											pencere3.add(btn3);
											pencere3.add(btn2);
											pencere3.add(btn1);
											pencere3.add(btn);
											pencere3.add(bilgisayarsecimkutu);
											pencere3.setSize(1000,500);
											pencere3.setLayout(null);	
											pencere3.setVisible(true);
											
										}
									 
										
										
									
										
									}
								});
							 
								buton2.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										 tasart=1;
										 makasart=1;
										 kagıtart=1;
										 
										String tmp="kağıt"+(nesnesayısı2+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
											nesnesayısı++; 
										    nesnesayısı2++;
										nesneolustur nesne2=new nesneolustur();
										System.out.println(nesne2.x);
										System.out.println("kağıt");
										
										System.out.println(nesnesayısı);
										
										if(nesnesayısı==toplamnesnesayısı)
										{
											JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
											JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea=new JTextArea();
										   JButton adButton=new JButton();
											adButton.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString=oyuncuadiveıdArea.getText();
													String dizi[]=areatextString.split("-");
													kullanicci.oyuncuAdi=dizi[0];
													kullanicci.oyuncuID=dizi[1];
													
													System.out.println("kullaniciad:"+dizi[0]);
													System.out.println("kullaniciid:"+dizi[1]);
													
												}
											});
											bilgiJLabel.setBounds(140,30,100,30);
											adButton.setBounds(465,30,10,10);
											oyuncuadiveıdArea.setBounds(240,30,200,30);
											pencere3.add(adButton);
											pencere3.add(bilgiJLabel);
											pencere3.add(oyuncuadiveıdArea);
											JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea2=new JTextArea();
										   JButton adButton2=new JButton();
											adButton2.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString2=oyuncuadiveıdArea2.getText();
													String dizi2[]=areatextString2.split("-");
													bilgisayar.oyuncuAdi=dizi2[0];
													bilgisayar.oyuncuID=dizi2[1];
													
													System.out.println("oyuncuad:"+dizi2[0]);
													System.out.println("oyuncuıd:"+dizi2[1]);
													
												}
											});
											   
											bilgiJLabel2.setBounds(480,30,100,30);
											adButton2.setBounds(800,30,10,10);
											oyuncuadiveıdArea2.setBounds(590,30,200,30);
											pencere3.add(adButton2);
											pencere3.add(bilgiJLabel2);
											pencere3.add(oyuncuadiveıdArea2);
	
											
											
											
											
											JLabel yaziJLabel=new JLabel();
											 JButton btn1=new JButton();
											    btn1.setText(nesneler.get(0));
											    btn1.setBounds(300,193,80,20);
											    btn1.addActionListener(new ActionListener() {
													public int x =1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														
														

														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                             kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                         kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                     kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                               kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														x++;
														//System.out.println(y);
														if(x%2==0)
														{
															
														btn1.setEnabled(false);
														}	
														
													
														
													}
												});
								          
											    JButton btn2=new JButton();
											    btn2.setText(nesneler.get(1));
											    btn2.setBounds(300,230,80,20);
											    btn2.addActionListener(new ActionListener() {
											    	
													public int y=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                             kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                         kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                     kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                               kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														y++;
														System.out.println(y);
														if(y%2==0)
														{
															
														btn2.setEnabled(false);
														}	
														
													
													}
												});
											    JButton btn3=new JButton();
											    btn3.setText(nesneler.get(2));
											    btn3.setBounds(300,270,80,20);
											    btn3.addActionListener(new ActionListener() {
													public int z=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(2));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(2));
														if(tasart<=5&&nesneler.get(2).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t333=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t333);
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t444=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t444);
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t555=new tas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(t555);
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k333=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k333);
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k555=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k555);
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(2).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														z++;
														System.out.println(z);
														if(z%2==0)
														{
															
														btn3.setEnabled(false);
														}	
														
													}
												});
											    JButton btn4=new JButton();
											    btn4.setText(nesneler.get(3));
											    btn4.setBounds(300,310,80,20);
											    btn4.addActionListener(new ActionListener() {
													public int q=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														toplamhamlesayısı++;
														
														
														
														kullanıcınesneADArrayList.add(nesneler.get(3));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(3));
														if(tasart<=5&&nesneler.get(3).contains("tas"))
														{
														 if(tasart==1)
									                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
									                	    tas t1111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t2222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t2222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t3333=new tas();
									                			 kullanıcınesnlelerArrayList.add(t3333);
									                			//System.out.println("x3");
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t4444=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t5555=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t5555);
									                			//System.out.println("x5");
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k1111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k1111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k2222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k2222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k3333=new kagit(); 
									                			//System.out.println("x3");
									                			System.out.println("-----k3");
									                			 kullanıcınesnlelerArrayList.add(k3333);
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k4444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k4444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k5555=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k5555);
									                			//System.out.println("x5");
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(3).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m1111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m2222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m2222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m3333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m3333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m4444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m5555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m5555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														q++;
														
														//System.out.println("+++++193"+kullanıcınesneADArrayList);
														System.out.println(q);
														if(q%2==0)
														{
															
														btn4.setEnabled(false);
														}
														
													}
												});
											    JButton btn5=new JButton();
											    btn5.setText(nesneler.get(4));
											    btn5.setBounds(300,350,80,20);
											    btn5.addActionListener(new ActionListener() {
													public int w=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
						
						kullanıcınesneADArrayList.add(nesneler.get(4));
						//burda gecerli	
						
						System.out.println("--------------------------------tasart5"+tasart);
						kullanıcınesneADArrayList.add(nesneler.get(4));
						if(tasart<=5&&nesneler.get(4).contains("tas"))
						{
						 if(tasart==1)
	                	    { tas t11111=new tas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");
kullanıcınesnlelerArrayList.add(t11111);
					
	                	    }
	                		 else if(tasart==2)
	                		 {
	                			tas t22222=new tas(); 
	                			//System.out.println("-----------------------------------tas2");
	                     System.out.println("-----------t2"); 	 
	                     kullanıcınesnlelerArrayList.add(t22222);
	           
	                		 }
	                		 else if(tasart==3)
	                		 {
	                			tas t33333=new tas(); 
	                			   kullanıcınesnlelerArrayList.add(t33333);
	                			//System.out.println("x3");
	                		 }
	                		 else if(tasart==4)
	                		 {
	                			tas t44444=new tas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(t44444);
	                		 }
	                		 else if(tasart==5)
	                		 {
	                			tas t55555=new tas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(t55555);
	                		 }
						 tasart++;
						
						}
						if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
						{
						 if(kagıtart==1)
	                	    { 
							 kagit k11111=new kagit();
	                	       //System.out.println("-----------------------------------tas1");
					System.out.println("------k1");
					   kullanıcınesnlelerArrayList.add(k11111);
	                	    }
	                		 else if(kagıtart==2)
	                		 {
	                			kagit k22222=new kagit(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(k22222);
	                      	    
	           System.out.println("--------k2");
	                		 }
	                		 else if(kagıtart==3)
	                		 {
	                			kagit k33333=new kagit(); 
	                			//System.out.println("x3");
	                			System.out.println("-----k3");
	                			   kullanıcınesnlelerArrayList.add(k33333);
	                		 }
	                		 else if(kagıtart==4)
	                		 {
	                			kagit k44444=new kagit(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(k44444);
	                		 }
	                		 else if(kagıtart==5)
	                		 {
	                			kagit k55555=new kagit(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(k55555);
	                		 }
						 kagıtart++;
						
						}
						if(makasart<=5&&nesneler.get(4).contains("makas"))
						{
						 if(makasart==1)
	                	    { makas m11111=new makas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");
kullanıcınesnlelerArrayList.add(m11111);
					
	                	    }
	                		 else if(makasart==2)
	                		 {
	                			makas m22222=new makas(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(m22222);
	           System.out.println("---------m2");
	                		 }
	                		 else if(makasart==3)
	                		 {
	                			makas m33333=new makas(); 
	                			//System.out.println("x3");
	                			System.out.println("m3");
	                			   kullanıcınesnlelerArrayList.add(m33333);
	                		 }
	                		 else if(makasart==4)
	                		 {
	                			makas m44444=new makas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(m44444);
	                		 }
	                		 else if(makasart==5)
	                		 {
	                			makas m55555=new makas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(m55555);
	                		 }
						 makasart++;
						//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
						System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														w++;

														System.out.println(w);
														if(w%2==0)
														{
														btn5.setEnabled(false);
														}
														
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn1.setEnabled(true);
														 btn1.addActionListener(new ActionListener() {
																public int x =1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																	//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		
																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(0));
																	if(tasart<=5&&nesneler.get(0).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t1=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                          






			kullanıcınesnlelerArrayList.add(t1);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t2=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	
												                     kullanıcınesnlelerArrayList.add(t2);
			                                                         kullanıcınesnelerinartımı++;
												                    
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t3=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t3);
				                                                             kullanıcınesnelerinartımı++;
												                			
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t4=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t4);
				                                                             kullanıcınesnelerinartımı++;
												                		
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t5=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k1=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k1);
			                                                     kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k2=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                			
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k3=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k4=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                			
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k5=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                			
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(0).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m1=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m1);
			kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m2=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m3=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m4=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m5=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	
																	}
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	x++;
																	System.out.println(x);
																	if(x%2==0)
																	{
																	//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																	
																		
																	btn1.setEnabled(false);
																	
																	}	
																	
																
																
																}
															});
											          
														}
																
																
														if(toplamhamlesayısı<hamlesayısı)
														{	btn2.setEnabled(true);
														  btn2.addActionListener(new ActionListener() {
														    	
																public int y=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{
																		int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																			for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																			{
																			
																				bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																				//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																			}
																			
																			for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																			{
																			kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																			}
																			

																			if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																			{
																				
																				JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																				JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			}
																				
																			else	
																			{
																				JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																				JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																				
																			}
																														
																				
																		//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	if(tasart<=5&&nesneler.get(1).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t11=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t22=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	    
												                     kullanıcınesnlelerArrayList.add(t22);
			                                                         kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t33=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t33);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t44=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t44);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t55=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t55);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																	 tasart++;
																	System.out.print("----------------tasartalt"+tasart);
																	System.out.println();
																	}
																	if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k11=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k11);
			                                                     kullanıcınesnelerinartımı++;
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k22=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("--------k2");
												           kullanıcınesnlelerArrayList.add(k22);
			                                               kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k33=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k33);
				                                                             kullanıcınesnelerinartımı++;
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k44=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k44);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k55=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k55);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(1).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m11=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
			kullanıcınesnelerinartımı++;
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m22=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                            kullanıcınesnlelerArrayList.add(m22);
												                            kullanıcınesnelerinartımı++;
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m33=new makas(); 
												                			//System.out.println("x3"
												                            kullanıcınesnlelerArrayList.add(m33);
												                            kullanıcınesnelerinartımı++;
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m44=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m44);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m55=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m55);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	 if(toplamhamlesayısı==hamlesayısı)
																		{	
																				for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																				{
																					for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																					{
																						if(i==j)
																						{ 
																				double saldıranetki=0;
																			    double savunanetki=0;
																		        int seviyepuanartis=0;		
														saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
														seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
												        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
														int seviyepuanartis2=0;		
														savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
														seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
														kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
														
								//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
													
												System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
												// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
												  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
												 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
												
												  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
												  {
													  computerrandomsınıfArrayList.remove(i);
													  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
													  {
														  agirtas agirtas1=new agirtas();
													  }
													  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
													  {
														  
														  Özelkagit özelkagit1=new Özelkagit();
													  }
													  else {
														  
															  ustamakas ustamakas1=new ustamakas();
														  
													}
												  }
												  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
												  {
													  kullanıcınesnlelerArrayList.remove(i);
												  }
												  
												  if(computerrandomsınıfArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
													  
												  }
												  if(kullanıcınesnlelerArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
												  }					  
												  
												  
												  
												  
												/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														  {
													  //tasbilgisayar.
													  System.out.println("bilgisayar sakor art");
													  bilgisayar.skor++;
													  
														  }
												  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														{
													System.out.println("kullanicci skor art");
													kullanicci.skor++;
												}
												  */
												  
												  
												  
												/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
												  System.out.println("/***************kullanici////////"+kullanicci.skor);
												  System.out.println("toplamyahahmle"+toplamhamlesayısı);
												*/
												  
														       
											//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
											if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
											{
												//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
									
											}
														       
																						
																						}
																					}
																				
																				}
								                                           }
																	 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	}
																	y++;
																	System.out.println(y);
																	if(y%2==0)
																	{
																		
																	btn2.setEnabled(false);
																	}	
																	
																}
															});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn3.setEnabled(true);
														 btn3.addActionListener(new ActionListener() {
																public int z=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}	
																		//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	if(tasart<=5&&nesneler.get(2).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t111=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t222=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 
												                     kullanıcınesnlelerArrayList.add(t222);
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t333=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t333);
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t444=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t444);
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t555=new tas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(t555);
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k111=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k111);
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k222=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(k222);
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k333=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k333);
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k444=new kagit(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(k444);
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k555=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k555);
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(2).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m111=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m222=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(m222);
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m333=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m333);
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m444=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m444);
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m555=new makas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(m555);
												                		 }
																	 makasart++;
																	
																	}
																	System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	z++;
																	System.out.println(z);
																	if(z%2==0)
																	{
																		
																	btn3.setEnabled(false);
																	}	
																	
																}
															});
														}
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn4.setEnabled(true);
														btn4.addActionListener(new ActionListener() {
															public int q=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																
																// TODO Auto-generated method stub
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}
																											
																	
																	//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
																}
																
																toplamhamlesayısı++;
																
																
																
																kullanıcınesneADArrayList.add(nesneler.get(3));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(3));
																if(tasart<=5&&nesneler.get(3).contains("tas"))
																{
																 if(tasart==1)
											                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
											                	    tas t1111=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t2222=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 
											                     kullanıcınesnlelerArrayList.add(t2222);
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t3333=new tas();
											                			 kullanıcınesnlelerArrayList.add(t3333);
											                			//System.out.println("x3");
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t4444=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t5555=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t5555);
											                			//System.out.println("x5");
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k1111=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k1111);
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k2222=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(k2222);
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k3333=new kagit(); 
											                			//System.out.println("x3");
											                			System.out.println("-----k3");
											                			 kullanıcınesnlelerArrayList.add(k3333);
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k4444=new kagit(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(k4444);
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k5555=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k5555);
											                			//System.out.println("x5");
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(3).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m1111=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m2222=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(m2222);
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m3333=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m3333);
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m4444=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m5555=new makas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(m5555);
											                		 }
																 makasart++;
																
																}
																System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																q++;
																
																//System.out.println("+++++193"+kullanıcınesneADArrayList);
																System.out.println(q);
																if(q%2==0)
																{
																	
																btn4.setEnabled(false);
																}
																
															}
														});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn5.setEnabled(true);
														 btn5.addActionListener(new ActionListener() {
																public int w=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																		//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
									
									kullanıcınesneADArrayList.add(nesneler.get(4));
									//burda gecerli	
									
									System.out.println("--------------------------------tasart5"+tasart);
									kullanıcınesneADArrayList.add(nesneler.get(4));
									if(tasart<=5&&nesneler.get(4).contains("tas"))
									{
									 if(tasart==1)
				                	    { tas t11111=new tas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");
			kullanıcınesnlelerArrayList.add(t11111);
								
				                	    }
				                		 else if(tasart==2)
				                		 {
				                			tas t22222=new tas(); 
				                			//System.out.println("-----------------------------------tas2");
				                     System.out.println("-----------t2"); 	 
				                     kullanıcınesnlelerArrayList.add(t22222);
				           
				                		 }
				                		 else if(tasart==3)
				                		 {
				                			tas t33333=new tas(); 
				                			   kullanıcınesnlelerArrayList.add(t33333);
				                			//System.out.println("x3");
				                		 }
				                		 else if(tasart==4)
				                		 {
				                			tas t44444=new tas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(t44444);
				                		 }
				                		 else if(tasart==5)
				                		 {
				                			tas t55555=new tas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(t55555);
				                		 }
									 tasart++;
									
									}
									if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
									{
									 if(kagıtart==1)
				                	    { 
										 kagit k11111=new kagit();
				                	       //System.out.println("-----------------------------------tas1");
								System.out.println("------k1");
								   kullanıcınesnlelerArrayList.add(k11111);
				                	    }
				                		 else if(kagıtart==2)
				                		 {
				                			kagit k22222=new kagit(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(k22222);
				                      	    
				           System.out.println("--------k2");
				                		 }
				                		 else if(kagıtart==3)
				                		 {
				                			kagit k33333=new kagit(); 
				                			//System.out.println("x3");
				                			System.out.println("-----k3");
				                			   kullanıcınesnlelerArrayList.add(k33333);
				                		 }
				                		 else if(kagıtart==4)
				                		 {
				                			kagit k44444=new kagit(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(k44444);
				                		 }
				                		 else if(kagıtart==5)
				                		 {
				                			kagit k55555=new kagit(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(k55555);
				                		 }
									 kagıtart++;
									
									}
									if(makasart<=5&&nesneler.get(4).contains("makas"))
									{
									 if(makasart==1)
				                	    { makas m11111=new makas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m11111);
								
				                	    }
				                		 else if(makasart==2)
				                		 {
				                			makas m22222=new makas(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(m22222);
				           System.out.println("---------m2");
				                		 }
				                		 else if(makasart==3)
				                		 {
				                			makas m33333=new makas(); 
				                			//System.out.println("x3");
				                			System.out.println("m3");
				                			   kullanıcınesnlelerArrayList.add(m33333);
				                		 }
				                		 else if(makasart==4)
				                		 {
				                			makas m44444=new makas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(m44444);
				                		 }
				                		 else if(makasart==5)
				                		 {
				                			makas m55555=new makas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(m55555);
				                		 }
									 makasart++;
									//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
			}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
									System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
									if(toplamhamlesayısı==hamlesayısı)
									{	
											for(int i=0;i<computerrandomsınıfArrayList.size();i++)
											{
												for(int j=0;j<computerrandomsınıfArrayList.size();j++)
												{
													if(i==j)
													{ 
											double saldıranetki=0;
										    double savunanetki=0;
									        int seviyepuanartis=0;		
					saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
					seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
			        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
					int seviyepuanartis2=0;		
					savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
					seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
					kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
					
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
				
			System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
			// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
			  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
			 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
			
			  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
			  {
				  computerrandomsınıfArrayList.remove(i);
				  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
				  {
					  agirtas agirtas1=new agirtas();
				  }
				  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
				  {
					  
					  Özelkagit özelkagit1=new Özelkagit();
				  }
				  else {
					  
						  ustamakas ustamakas1=new ustamakas();
					  
				}
			  }
			  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
			  {
				  kullanıcınesnlelerArrayList.remove(i);
			  }
			  
			  if(computerrandomsınıfArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
				  
			  }
			  if(kullanıcınesnlelerArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
			  }					  
			  
			  
			  
			  
			/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					  {
				  //tasbilgisayar.
				  System.out.println("bilgisayar sakor art");
				  bilgisayar.skor++;
				  
					  }
			  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					{
				System.out.println("kullanicci skor art");
				kullanicci.skor++;
			}
			  */
			  
			  
			  
			/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
			  System.out.println("/***************kullanici////////"+kullanicci.skor);
			  System.out.println("toplamyahahmle"+toplamhamlesayısı);
			*/
			  
					       
		//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
		if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
		{
			//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

		}
					       
													
													}
												}
											
											}
                                       }								
									w++;

																	System.out.println(w);
																	if(w%2==0)
																	{
																	btn5.setEnabled(false);
																	}
																}
																});
														}
													
													
														
														
										
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
													
											
													
													
													
											
												for(int i=0;i<computerrandomsınıfArrayList.size();i++)
													{
														for(int j=0;j<computerrandomsınıfArrayList.size();j++)
														{
															if(i==j)
															{ 
													double saldıranetki=0;
												    double savunanetki=0;
											        int seviyepuanartis=0;		
							saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
							seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
					        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
							int seviyepuanartis2=0;		
							savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
							seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
							kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
							
	//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
						
					System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
					// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
					  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
					 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
					
					  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
					  {
						  computerrandomsınıfArrayList.remove(i);
						  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
						  {
							  agirtas agirtas1=new agirtas();
						  }
						  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
						  {
							  
							  Özelkagit özelkagit1=new Özelkagit();
						  }
						  else {
							  
								  ustamakas ustamakas1=new ustamakas();
							  
						}
					  }
					  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
					  {
						  kullanıcınesnlelerArrayList.remove(i);
					  }
					  
					  if(computerrandomsınıfArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
						 
					  }
					  if(kullanıcınesnlelerArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
						
					  }					  
					  
					  
					  
					  
					/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							  {
						  //tasbilgisayar.
						  System.out.println("bilgisayar sakor art");
						  bilgisayar.skor++;
						  
							  }
					  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							{
						System.out.println("kullanicci skor art");
						kullanicci.skor++;
					}
					  */
					  
					  
					  
					/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
					  System.out.println("/***************kullanici////////"+kullanicci.skor);
					  System.out.println("toplamyahahmle"+toplamhamlesayısı);
					*/
					  
							       
				//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
				if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
				{
					//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
		
				}
							       
															
															}
														}
													
													}
	                                           
													
												
											
												
												
													}
													
													
													
													
													
													
													
												});

											
											
											
											
											
											
											
											
											    JLabel bilgisayarsecimkutu=new JLabel();
											    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
											    bilgisayarsecimdeger++;
											    bilgisayarsecimkutu.setBounds(600,280,100,30 );
											    JButton btn=new JButton("computer secimi");
											    btn.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														JLabel label1 = new JLabel();
														label1.setFont(new Font("Calibri",Font.PLAIN,20));
														label1.setText(kopya.get(0));
														label1.setBounds(700, 200, 300, 40);
														JLabel label2 = new JLabel();
														label2.setFont(new Font("Calibri",Font.PLAIN,20));
														label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
														label2.setBounds(700, 261, 300, 40);
														JLabel label3 = new JLabel();
														label3.setFont(new Font("Calibri",Font.PLAIN,20));
														label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
														label3.setBounds(700, 323, 300, 40);
														JLabel label4 = new JLabel();
														label4.setFont(new Font("Calibri",Font.PLAIN,50));
														label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label4.setBounds(700, 384, 450, 80);
														JLabel label5 = new JLabel();
														label5.setFont(new Font("Calibri",Font.PLAIN,20));
														label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label5.setBounds(700, 480, 450, 80);






														pencere3.add(label1);
														pencere3.add(label2);
														pencere3.add(label3);
														pencere3.add(label4);
														pencere3.add(label5);
													}
												});
											    
											    btn.setBounds(500,280,130,30);
											   
								    
											
											yaziJLabel.setText("kullanıcıvsbilgisayar");
											yaziJLabel.setBounds(500,200,150,30);
											pencere3.add(btn5);
											pencere3.add(btn4);
											pencere3.add(btn3);
											pencere3.add(btn2);
											pencere3.add(btn1);
											pencere3.add(btn);
											pencere3.add(bilgisayarsecimkutu);
											pencere3.setSize(1000,500);
											pencere3.setLayout(null);	
											pencere3.setVisible(true);
											if(gir2==1)
											{ int tart=1,kart=1,mart=1,bak=1;
							                 for(int i=0;i<nesneler.size();i++)
							                 {   System.out.println(nesneler.get(i));
							                	 if(nesneler.get(i).contains("tas"))
							                	 {  
							                		 if(tart==1)
							                	    { tas x1=new tas();
							                	    

							                	    }
							                		 else if(tart==2)
							                		 {
							                			tas x2=new tas(); 
							                			
							                      	    
							           
							                		 }
							                		 else if(tart==3)
							                		 {
							                			tas x3=new tas(); 
							                			
							                		 }
							                		 else if(tart==4)
							                		 {
							                			tas x4=new tas(); 
							                			
							                		 }
							                		 else if(tart==5)
							                		 {
							                			tas x5=new tas(); 
							                			
							                		 }
							                		 else if(tart==6)
							                		 {
							                			tas x6=new tas(); 
							                		 }
							                		 else if(tart==7)
							                		 {
							                			tas x7=new tas(); 
							                		 }
							                		 else if(tart==8)
							                		 {
							                			tas x8=new tas(); 
							                		 }
							                		 else if(tart==9)
							                		 {
							                			tas x9=new tas(); 
							                		 }
							                		 else if(tart==10)
							                		 {
							                			tas x10=new tas(); 
							                		 }else if(tart==11)
							                		 {
							                			tas x11=new tas(); 
							                		 }
							                		 else if(tart==12)
							                		 {
							                			tas x12=new tas(); 
							                		 }
							                	     tart++;
							                		 System.out.println("                    t");
							                	 }
							                	 else if(nesneler.get(i).contains("kagıt"))
							                	 {
							                		 
							                		 if(kart==1)
							                 	    { kagit y1=new kagit();
							                 	    }
							                 		 else if(kart==2)
							                 		 {
							                 			kagit y2=new kagit(); 
							                 		 }
							                 		else if(kart==3)
							                		 {
							                			kagit y3=new kagit(); 
							                		 }
							                 		else if(kart==4)
							                		 {
							                			kagit y4=new kagit(); 
							                		 }
							                 		else if(kart==5)
							                		 {
							                			kagit y5=new kagit(); 
							                		 }
							                 		else if(kart==6)
							                		 {
							                			kagit y6=new kagit(); 
							                		 }
							                 		else if(kart==7)
							                		 {
							                			kagit y7=new kagit(); 
							                		 }
							                 		else if(kart==8)
							                		 {
							                			kagit y8=new kagit(); 
							                		 }
							                 		else if(kart==9)
							                		 {
							                			kagit y9=new kagit(); 
							                		 }
							                 		else if(kart==10)
							                		 {
							                			kagit y10=new kagit(); 
							                		 }
							                 		
							                 	     kart++;
							                		 
							                		 
							                		 
							                		System.out.println("                         k"); 
							                	 }
							                	 else {
							                		 if(mart==1)
							                  	    { makas z1=new makas();
							                  	    }
							                  		 else if(mart==2)
							                  		 {
							                  			makas z2=new makas(); 
							                  		 }
							                  		else if(mart==3)
							                 		 {
							                 			makas z3=new makas(); 
							                 		 }
							                  		 else if(mart==4)
							                  		 {
							                  			makas z4=new makas(); 
							                  		 }
							                  		else if(mart==5)
							                 		 {
							                 			makas z5=new makas(); 
							                 		 } else if(mart==6)
							                  		 {
							                  			makas z6=new makas(); 
							                  		 }
							                  		else if(mart==7)
							                 		 {
							                 			makas z7=new makas(); 
							                 		 } else if(mart==8)
							                  		 {
							                  			makas z8=new makas(); 
							                  		 }
							                  		else if(mart==9)
							                 		 {
							                 			makas z9=new makas(); 
							                 		 }
							                		 mart++;
												System.out.println("                              m");	
												}
							                 }	 
											gir2++;
											}
										}
										}
										
										
										
									
								});
							 
								buton3.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
									tasart=1;
									makasart=1;
									kagıtart=1;
										String tmp="makas"+(nesnesayısı3+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
									   nesnesayısı++;
										nesnesayısı3++;
										nesneolustur nesne3=new nesneolustur();
										System.out.println(nesne3.x);
										System.out.println("makas");
										System.out.println(nesnesayısı);
										if(nesnesayısı==toplamnesnesayısı)
										{
											 JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
												JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
												JTextArea oyuncuadiveıdArea=new JTextArea();
											   JButton adButton=new JButton();
												adButton.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														
														String areatextString=oyuncuadiveıdArea.getText();
														String dizi[]=areatextString.split("-");
														kullanicci.oyuncuAdi=dizi[0];
														kullanicci.oyuncuID=dizi[1];
														
														System.out.println("kullaniciad:"+dizi[0]);
														System.out.println("kullaniciid:"+dizi[1]);
														
													}
												});
												bilgiJLabel.setBounds(140,30,100,30);
												adButton.setBounds(465,30,10,10);
												oyuncuadiveıdArea.setBounds(240,30,200,30);
												pencere3.add(adButton);
												pencere3.add(bilgiJLabel);
												pencere3.add(oyuncuadiveıdArea);
												JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
												JTextArea oyuncuadiveıdArea2=new JTextArea();
											   JButton adButton2=new JButton();
												adButton2.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														
														String areatextString2=oyuncuadiveıdArea2.getText();
														String dizi2[]=areatextString2.split("-");
														bilgisayar.oyuncuAdi=dizi2[0];
														bilgisayar.oyuncuID=dizi2[1];
														
														System.out.println("bilgisayarad:"+dizi2[0]);
														System.out.println("bilgisayarid:"+dizi2[1]);
														
													}
												});
												   
												bilgiJLabel2.setBounds(480,30,100,30);
												adButton2.setBounds(800,30,10,10);
												oyuncuadiveıdArea2.setBounds(590,30,200,30);
												pencere3.add(adButton2);
												pencere3.add(bilgiJLabel2);
												pencere3.add(oyuncuadiveıdArea2);
												
											 
											 
									
												
												JLabel yaziJLabel=new JLabel();
												 JButton btn1=new JButton();
												    btn1.setText(nesneler.get(0));
												    btn1.setBounds(300,193,80,20);
												    btn1.addActionListener(new ActionListener() {
														public int x =1;
														@Override
														public void actionPerformed(ActionEvent e) {
															
															
															

															toplamhamlesayısı++;
															// TODO Auto-generated method stub
															kullanıcınesneADArrayList.add(nesneler.get(1));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(1));
															if(tasart<=5&&nesneler.get(1).contains("tas"))
															{
															 if(tasart==1)
										                	    { tas t11=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
	                                                             kullanıcınesnelerinartımı++;
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t22=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 	    
										                     kullanıcınesnlelerArrayList.add(t22);
	                                                         kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t33=new tas(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(t33);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t44=new tas(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(t44);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t55=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t55);
		                                                             kullanıcınesnelerinartımı++;
										                			//System.out.println("x5");
										                		 }
															 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
															 tasart++;
															System.out.print("----------------tasartalt"+tasart);
															System.out.println();
															}
															if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k11=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k11);
	                                                     kullanıcınesnelerinartımı++;
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k22=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                      	    
										           System.out.println("--------k2");
										           kullanıcınesnlelerArrayList.add(k22);
	                                               kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k33=new kagit(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(k33);
		                                                             kullanıcınesnelerinartımı++;
										                			System.out.println("-----k3");
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k44=new kagit(); 
										                			 kullanıcınesnlelerArrayList.add(k44);
		                                                             kullanıcınesnelerinartımı++;
										                			//System.out.println("x4");
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k55=new kagit(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(k55);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(1).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m11=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
	kullanıcınesnelerinartımı++;
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m22=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                            kullanıcınesnlelerArrayList.add(m22);
										                            kullanıcınesnelerinartımı++;
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m33=new makas(); 
										                			//System.out.println("x3"
										                            kullanıcınesnlelerArrayList.add(m33);
										                            kullanıcınesnelerinartımı++;
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m44=new makas(); 
										                            kullanıcınesnlelerArrayList.add(m44);
										                            kullanıcınesnelerinartımı++;
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m55=new makas(); 
										                            kullanıcınesnlelerArrayList.add(m55);
										                            kullanıcınesnelerinartımı++;
										                			//System.out.println("x5");
										                		 }
															 makasart++;
															 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															}
															x++;
															//System.out.println(y);
															if(x%2==0)
															{
																
															btn1.setEnabled(false);
															}	
															
														
															
														}
													});
									          
												    JButton btn2=new JButton();
												    btn2.setText(nesneler.get(1));
												    btn2.setBounds(300,230,80,20);
												    btn2.addActionListener(new ActionListener() {
												    	
														public int y=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															toplamhamlesayısı++;
															// TODO Auto-generated method stub
															kullanıcınesneADArrayList.add(nesneler.get(1));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(1));
															if(tasart<=5&&nesneler.get(1).contains("tas"))
															{
															 if(tasart==1)
										                	    { tas t11=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
	                                                             kullanıcınesnelerinartımı++;
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t22=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 	    
										                     kullanıcınesnlelerArrayList.add(t22);
	                                                         kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t33=new tas(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(t33);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t44=new tas(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(t44);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t55=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t55);
		                                                             kullanıcınesnelerinartımı++;
										                			//System.out.println("x5");
										                		 }
															 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
															 tasart++;
															System.out.print("----------------tasartalt"+tasart);
															System.out.println();
															}
															if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k11=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k11);
	                                                     kullanıcınesnelerinartımı++;
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k22=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                      	    
										           System.out.println("--------k2");
										           kullanıcınesnlelerArrayList.add(k22);
	                                               kullanıcınesnelerinartımı++;
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k33=new kagit(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(k33);
		                                                             kullanıcınesnelerinartımı++;
										                			System.out.println("-----k3");
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k44=new kagit(); 
										                			 kullanıcınesnlelerArrayList.add(k44);
		                                                             kullanıcınesnelerinartımı++;
										                			//System.out.println("x4");
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k55=new kagit(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(k55);
		                                                             kullanıcınesnelerinartımı++;
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(1).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m11=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
	kullanıcınesnelerinartımı++;
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m22=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                            kullanıcınesnlelerArrayList.add(m22);
										                            kullanıcınesnelerinartımı++;
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m33=new makas(); 
										                			//System.out.println("x3"
										                            kullanıcınesnlelerArrayList.add(m33);
										                            kullanıcınesnelerinartımı++;
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m44=new makas(); 
										                            kullanıcınesnlelerArrayList.add(m44);
										                            kullanıcınesnelerinartımı++;
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m55=new makas(); 
										                            kullanıcınesnlelerArrayList.add(m55);
										                            kullanıcınesnelerinartımı++;
										                			//System.out.println("x5");
										                		 }
															 makasart++;
															 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															}
															y++;
															System.out.println(y);
															if(y%2==0)
															{
																
															btn2.setEnabled(false);
															}	
															
														
														}
													});
												    JButton btn3=new JButton();
												    btn3.setText(nesneler.get(2));
												    btn3.setBounds(300,270,80,20);
												    btn3.addActionListener(new ActionListener() {
														public int z=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															
															toplamhamlesayısı++;
															// TODO Auto-generated method stub
															kullanıcınesneADArrayList.add(nesneler.get(2));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(2));
															if(tasart<=5&&nesneler.get(2).contains("tas"))
															{
															 if(tasart==1)
										                	    { tas t111=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t222=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 
										                     kullanıcınesnlelerArrayList.add(t222);
										           
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t333=new tas(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(t333);
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t444=new tas(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(t444);
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t555=new tas(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(t555);
										                		 }
															 tasart++;
															
															}
															if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k111=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k111);
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k222=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(k222);
										           System.out.println("--------k2");
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k333=new kagit(); 
										                			//System.out.println("x3");
										                			 kullanıcınesnlelerArrayList.add(k333);
										                			System.out.println("-----k3");
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k444=new kagit(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(k444);
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k555=new kagit(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(k555);
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(2).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m111=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m222=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(m222);
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m333=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m333);
										                			//System.out.println("x3");
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m444=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m555=new makas(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(m555);
										                		 }
															 makasart++;
															
															}
															System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															z++;
															System.out.println(z);
															if(z%2==0)
															{
																
															btn3.setEnabled(false);
															}	
															
														}
													});
												    JButton btn4=new JButton();
												    btn4.setText(nesneler.get(3));
												    btn4.setBounds(300,310,80,20);
												    btn4.addActionListener(new ActionListener() {
														public int q=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															// TODO Auto-generated method stub
															toplamhamlesayısı++;
															
															
															
															kullanıcınesneADArrayList.add(nesneler.get(3));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(3));
															if(tasart<=5&&nesneler.get(3).contains("tas"))
															{
															 if(tasart==1)
										                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
										                	    tas t1111=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t2222=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 
										                     kullanıcınesnlelerArrayList.add(t2222);
										           
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t3333=new tas();
										                			 kullanıcınesnlelerArrayList.add(t3333);
										                			//System.out.println("x3");
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t4444=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t5555=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t5555);
										                			//System.out.println("x5");
										                		 }
															 tasart++;
															
															}
															if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k1111=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k1111);
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k2222=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(k2222);
										           System.out.println("--------k2");
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k3333=new kagit(); 
										                			//System.out.println("x3");
										                			System.out.println("-----k3");
										                			 kullanıcınesnlelerArrayList.add(k3333);
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k4444=new kagit(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(k4444);
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k5555=new kagit(); 
										                			 kullanıcınesnlelerArrayList.add(k5555);
										                			//System.out.println("x5");
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(3).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m1111=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m2222=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(m2222);
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m3333=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m3333);
										                			//System.out.println("x3");
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m4444=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m5555=new makas(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(m5555);
										                		 }
															 makasart++;
															
															}
															System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															q++;
															
															//System.out.println("+++++193"+kullanıcınesneADArrayList);
															System.out.println(q);
															if(q%2==0)
															{
																
															btn4.setEnabled(false);
															}
															
														}
													});
												    JButton btn5=new JButton();
												    btn5.setText(nesneler.get(4));
												    btn5.setBounds(300,350,80,20);
												    btn5.addActionListener(new ActionListener() {
														public int w=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															
															toplamhamlesayısı++;
															// TODO Auto-generated method stub
							
							kullanıcınesneADArrayList.add(nesneler.get(4));
							//burda gecerli	
							
							System.out.println("--------------------------------tasart5"+tasart);
							kullanıcınesneADArrayList.add(nesneler.get(4));
							if(tasart<=5&&nesneler.get(4).contains("tas"))
							{
							 if(tasart==1)
		                	    { tas t11111=new tas();
		                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1");
	kullanıcınesnlelerArrayList.add(t11111);
						
		                	    }
		                		 else if(tasart==2)
		                		 {
		                			tas t22222=new tas(); 
		                			//System.out.println("-----------------------------------tas2");
		                     System.out.println("-----------t2"); 	 
		                     kullanıcınesnlelerArrayList.add(t22222);
		           
		                		 }
		                		 else if(tasart==3)
		                		 {
		                			tas t33333=new tas(); 
		                			   kullanıcınesnlelerArrayList.add(t33333);
		                			//System.out.println("x3");
		                		 }
		                		 else if(tasart==4)
		                		 {
		                			tas t44444=new tas(); 
		                			//System.out.println("x4");
		                			   kullanıcınesnlelerArrayList.add(t44444);
		                		 }
		                		 else if(tasart==5)
		                		 {
		                			tas t55555=new tas(); 
		                			//System.out.println("x5");
		                			   kullanıcınesnlelerArrayList.add(t55555);
		                		 }
							 tasart++;
							
							}
							if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
							{
							 if(kagıtart==1)
		                	    { 
								 kagit k11111=new kagit();
		                	       //System.out.println("-----------------------------------tas1");
						System.out.println("------k1");
						   kullanıcınesnlelerArrayList.add(k11111);
		                	    }
		                		 else if(kagıtart==2)
		                		 {
		                			kagit k22222=new kagit(); 
		                			//System.out.println("-----------------------------------tas2");
		                			   kullanıcınesnlelerArrayList.add(k22222);
		                      	    
		           System.out.println("--------k2");
		                		 }
		                		 else if(kagıtart==3)
		                		 {
		                			kagit k33333=new kagit(); 
		                			//System.out.println("x3");
		                			System.out.println("-----k3");
		                			   kullanıcınesnlelerArrayList.add(k33333);
		                		 }
		                		 else if(kagıtart==4)
		                		 {
		                			kagit k44444=new kagit(); 
		                			//System.out.println("x4");
		                			   kullanıcınesnlelerArrayList.add(k44444);
		                		 }
		                		 else if(kagıtart==5)
		                		 {
		                			kagit k55555=new kagit(); 
		                			//System.out.println("x5");
		                			   kullanıcınesnlelerArrayList.add(k55555);
		                		 }
							 kagıtart++;
							
							}
							if(makasart<=5&&nesneler.get(4).contains("makas"))
							{
							 if(makasart==1)
		                	    { makas m11111=new makas();
		                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m");
	kullanıcınesnlelerArrayList.add(m11111);
						
		                	    }
		                		 else if(makasart==2)
		                		 {
		                			makas m22222=new makas(); 
		                			//System.out.println("-----------------------------------tas2");
		                			   kullanıcınesnlelerArrayList.add(m22222);
		           System.out.println("---------m2");
		                		 }
		                		 else if(makasart==3)
		                		 {
		                			makas m33333=new makas(); 
		                			//System.out.println("x3");
		                			System.out.println("m3");
		                			   kullanıcınesnlelerArrayList.add(m33333);
		                		 }
		                		 else if(makasart==4)
		                		 {
		                			makas m44444=new makas(); 
		                			//System.out.println("x4");
		                			   kullanıcınesnlelerArrayList.add(m44444);
		                		 }
		                		 else if(makasart==5)
		                		 {
		                			makas m55555=new makas(); 
		                			//System.out.println("x5");
		                			   kullanıcınesnlelerArrayList.add(m55555);
		                		 }
							 makasart++;
							//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
	}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
							System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															w++;

															System.out.println(w);
															if(w%2==0)
															{
															btn5.setEnabled(false);
															}
															
															
															if(toplamhamlesayısı<hamlesayısı)
															{	btn1.setEnabled(true);
															 btn1.addActionListener(new ActionListener() {
																	public int x =1;
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		
																		
																		if(toplamhamlesayısı>hamlesayısı)
																		{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																		//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																		int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																			for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																			{
																			bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																			}
																			
																			for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																			{
																			kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																			}
																			
																			if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																			{
																				
																				JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																				JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			}
																				
																			else	
																			{
																				JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																				JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																				
																			}
																														
																				
																		}
																		toplamhamlesayısı++;
																		// TODO Auto-generated method stub
																		System.out.println("--------------------------------tasart"+tasart);
																		kullanıcınesneADArrayList.add(nesneler.get(0));
																		if(tasart<=5&&nesneler.get(0).contains("tas"))
																		{
																		 if(tasart==1)
													                	    { tas t1=new tas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("---------t1");                          






				kullanıcınesnlelerArrayList.add(t1);
				                                                             kullanıcınesnelerinartımı++;
																	
													                	    }
													                		 else if(tasart==2)
													                		 {
													                			tas t2=new tas(); 
													                			//System.out.println("-----------------------------------tas2");
													                     System.out.println("-----------t2"); 	
													                     kullanıcınesnlelerArrayList.add(t2);
				                                                         kullanıcınesnelerinartımı++;
													                    
													           
													                		 }
													                		 else if(tasart==3)
													                		 {
													                			tas t3=new tas(); 
													                			//System.out.println("x3");
													                			 kullanıcınesnlelerArrayList.add(t3);
					                                                             kullanıcınesnelerinartımı++;
													                			
													                		 }
													                		 else if(tasart==4)
													                		 {
													                			tas t4=new tas(); 
													                			//System.out.println("x4");
													                			 kullanıcınesnlelerArrayList.add(t4);
					                                                             kullanıcınesnelerinartımı++;
													                		
													                		 }
													                		 else if(tasart==5)
													                		 {
													                			tas t5=new tas(); 
													                			 kullanıcınesnlelerArrayList.add(t5);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x5");
													                		 }
																		 tasart++;
																		
																		}
																		if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																		{
																		 if(kagıtart==1)
													                	    { kagit k1=new kagit();
													                	       //System.out.println("-----------------------------------tas1");
																	System.out.println("------k1");
																	 kullanıcınesnlelerArrayList.add(k1);
				                                                     kullanıcınesnelerinartımı++;
																	
													                	    }
													                		 else if(kagıtart==2)
													                		 {
													                			kagit k2=new kagit(); 
													                			 kullanıcınesnlelerArrayList.add(k2);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("-----------------------------------tas2");
													                			
													           System.out.println("--------k2");
													                		 }
													                		 else if(kagıtart==3)
													                		 {
													                			kagit k3=new kagit(); 
													                			 kullanıcınesnlelerArrayList.add(k3);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x3");
													                			
													                			System.out.println("-----k3");
													                		 }
													                		 else if(kagıtart==4)
													                		 {
													                			kagit k4=new kagit(); 
													                			 kullanıcınesnlelerArrayList.add(k4);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x4");
													                			
													                		 }
													                		 else if(kagıtart==5)
													                		 {
													                			kagit k5=new kagit(); 
													                			 kullanıcınesnlelerArrayList.add(k5);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x5");
													                			
													                		 }
																		 kagıtart++;
																		
																		}
																		if(makasart<=5&&nesneler.get(0).contains("makas"))
																		{
																		 if(makasart==1)
													                	    { makas m1=new makas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("--------m");
				kullanıcınesnlelerArrayList.add(m1);
				kullanıcınesnelerinartımı++;
																	
													                	    }
													                		 else if(makasart==2)
													                		 {
													                			makas m2=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m2);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("-----------------------------------tas2");
													                      	    
													           System.out.println("---------m2");
													                		 }
													                		 else if(makasart==3)
													                		 {
													                			makas m3=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m3);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x3");
													                			System.out.println("m3");
													                		 }
													                		 else if(makasart==4)
													                		 {
													                			makas m4=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m4);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x4");
													                		 }
													                		 else if(makasart==5)
													                		 {
													                			makas m5=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m5);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x5");
													                		 }
																		 makasart++;
																		
																		}
																		if(toplamhamlesayısı==hamlesayısı)
																		{	
																				for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																				{
																					for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																					{
																						if(i==j)
																						{ 
																				double saldıranetki=0;
																			    double savunanetki=0;
																		        int seviyepuanartis=0;		
														saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
														seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
												        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
														int seviyepuanartis2=0;		
														savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
														seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
														kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
														
								//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
													
												System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
												// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
												  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
												 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
												
												  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
												  {
													  computerrandomsınıfArrayList.remove(i);
													  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
													  {
														  agirtas agirtas1=new agirtas();
													  }
													  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
													  {
														  
														  Özelkagit özelkagit1=new Özelkagit();
													  }
													  else {
														  
															  ustamakas ustamakas1=new ustamakas();
														  
													}
												  }
												  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
												  {
													  kullanıcınesnlelerArrayList.remove(i);
												  }
												  
												  if(computerrandomsınıfArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
													  
												  }
												  if(kullanıcınesnlelerArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
												  }					  
												  
												  
												  
												  
												/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														  {
													  //tasbilgisayar.
													  System.out.println("bilgisayar sakor art");
													  bilgisayar.skor++;
													  
														  }
												  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														{
													System.out.println("kullanicci skor art");
													kullanicci.skor++;
												}
												  */
												  
												  
												  
												/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
												  System.out.println("/***************kullanici////////"+kullanicci.skor);
												  System.out.println("toplamyahahmle"+toplamhamlesayısı);
												*/
												  
														       
											//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
											if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
											{
												//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
									
											}
														       
																						
																						}
																					}
																				
																				}
								                                           }
																		x++;
																		System.out.println(x);
																		if(x%2==0)
																		{
																		//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																		
																			
																		btn1.setEnabled(false);
																		
																		}	
																		
																	
																	
																	}
																});
												          
															}
																	
																	
															if(toplamhamlesayısı<hamlesayısı)
															{	btn2.setEnabled(true);
															  btn2.addActionListener(new ActionListener() {
															    	
																	public int y=1;
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		
																		if(toplamhamlesayısı>hamlesayısı)
																		{
																			int bilgisayartoplamdayanıklılık=0;
																		    int kullanıcıtoplamdayanıklılık=0;
																				for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																				{
																				
																					bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																					//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																				}
																				
																				for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																				{
																				kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																				}
																				

																				if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																				{
																					
																					JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																					JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																				}
																					
																				else	
																				{
																					JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																					JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																					
																				}
																															
																					
																			//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																		}
																		toplamhamlesayısı++;
																		// TODO Auto-generated method stub
																		kullanıcınesneADArrayList.add(nesneler.get(1));
																		System.out.println("--------------------------------tasart"+tasart);
																		kullanıcınesneADArrayList.add(nesneler.get(1));
																		if(tasart<=5&&nesneler.get(1).contains("tas"))
																		{
																		 if(tasart==1)
													                	    { tas t11=new tas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
				                                                             kullanıcınesnelerinartımı++;
																	
													                	    }
													                		 else if(tasart==2)
													                		 {
													                			tas t22=new tas(); 
													                			//System.out.println("-----------------------------------tas2");
													                     System.out.println("-----------t2"); 	    
													                     kullanıcınesnlelerArrayList.add(t22);
				                                                         kullanıcınesnelerinartımı++;
													                		 }
													                		 else if(tasart==3)
													                		 {
													                			tas t33=new tas(); 
													                			//System.out.println("x3");
													                			 kullanıcınesnlelerArrayList.add(t33);
					                                                             kullanıcınesnelerinartımı++;
													                		 }
													                		 else if(tasart==4)
													                		 {
													                			tas t44=new tas(); 
													                			//System.out.println("x4");
													                			 kullanıcınesnlelerArrayList.add(t44);
					                                                             kullanıcınesnelerinartımı++;
													                		 }
													                		 else if(tasart==5)
													                		 {
													                			tas t55=new tas(); 
													                			 kullanıcınesnlelerArrayList.add(t55);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x5");
													                		 }
																		 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																		 tasart++;
																		System.out.print("----------------tasartalt"+tasart);
																		System.out.println();
																		}
																		if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																		{
																		 if(kagıtart==1)
													                	    { kagit k11=new kagit();
													                	       //System.out.println("-----------------------------------tas1");
																	System.out.println("------k1");
																	 kullanıcınesnlelerArrayList.add(k11);
				                                                     kullanıcınesnelerinartımı++;
													                	    }
													                		 else if(kagıtart==2)
													                		 {
													                			kagit k22=new kagit(); 
													                			//System.out.println("-----------------------------------tas2");
													                      	    
													           System.out.println("--------k2");
													           kullanıcınesnlelerArrayList.add(k22);
				                                               kullanıcınesnelerinartımı++;
													                		 }
													                		 else if(kagıtart==3)
													                		 {
													                			kagit k33=new kagit(); 
													                			//System.out.println("x3");
													                			 kullanıcınesnlelerArrayList.add(k33);
					                                                             kullanıcınesnelerinartımı++;
													                			System.out.println("-----k3");
													                		 }
													                		 else if(kagıtart==4)
													                		 {
													                			kagit k44=new kagit(); 
													                			 kullanıcınesnlelerArrayList.add(k44);
					                                                             kullanıcınesnelerinartımı++;
													                			//System.out.println("x4");
													                		 }
													                		 else if(kagıtart==5)
													                		 {
													                			kagit k55=new kagit(); 
													                			//System.out.println("x5");
													                			 kullanıcınesnlelerArrayList.add(k55);
					                                                             kullanıcınesnelerinartımı++;
													                		 }
																		 kagıtart++;
																		
																		}
																		if(makasart<=5&&nesneler.get(1).contains("makas"))
																		{
																		 if(makasart==1)
													                	    { makas m11=new makas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
				kullanıcınesnelerinartımı++;
																
																	
													                	    }
													                		 else if(makasart==2)
													                		 {
													                			makas m22=new makas(); 
													                			//System.out.println("-----------------------------------tas2");
													                            kullanıcınesnlelerArrayList.add(m22);
													                            kullanıcınesnelerinartımı++;
													           System.out.println("---------m2");
													                		 }
													                		 else if(makasart==3)
													                		 {
													                			makas m33=new makas(); 
													                			//System.out.println("x3"
													                            kullanıcınesnlelerArrayList.add(m33);
													                            kullanıcınesnelerinartımı++;
													                			System.out.println("m3");
													                		 }
													                		 else if(makasart==4)
													                		 {
													                			makas m44=new makas(); 
													                            kullanıcınesnlelerArrayList.add(m44);
													                            kullanıcınesnelerinartımı++;
													                			//System.out.println("x4");
													                		 }
													                		 else if(makasart==5)
													                		 {
													                			makas m55=new makas(); 
													                            kullanıcınesnlelerArrayList.add(m55);
													                            kullanıcınesnelerinartımı++;
													                			//System.out.println("x5");
													                		 }
																		 makasart++;
																		 if(toplamhamlesayısı==hamlesayısı)
																			{	
																					for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																					{
																						for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																						{
																							if(i==j)
																							{ 
																					double saldıranetki=0;
																				    double savunanetki=0;
																			        int seviyepuanartis=0;		
															saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
															seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
													        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
															int seviyepuanartis2=0;		
															savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
															seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
															kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
															
									//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
														
													System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
													// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
													  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
													 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
													
													  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
													  {
														  computerrandomsınıfArrayList.remove(i);
														  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
														  {
															  agirtas agirtas1=new agirtas();
														  }
														  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
														  {
															  
															  Özelkagit özelkagit1=new Özelkagit();
														  }
														  else {
															  
																  ustamakas ustamakas1=new ustamakas();
															  
														}
													  }
													  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
													  {
														  kullanıcınesnlelerArrayList.remove(i);
													  }
													  
													  if(computerrandomsınıfArrayList.isEmpty())
													  {
														  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
														  
													  }
													  if(kullanıcınesnlelerArrayList.isEmpty())
													  {
														  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
													  }					  
													  
													  
													  
													  
													/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
															  {
														  //tasbilgisayar.
														  System.out.println("bilgisayar sakor art");
														  bilgisayar.skor++;
														  
															  }
													  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
															{
														System.out.println("kullanicci skor art");
														kullanicci.skor++;
													}
													  */
													  
													  
													  
													/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
													  System.out.println("/***************kullanici////////"+kullanicci.skor);
													  System.out.println("toplamyahahmle"+toplamhamlesayısı);
													*/
													  
															       
												//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
												if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
												{
													//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
										
												}
															       
																							
																							}
																						}
																					
																					}
									                                           }
																		 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																		}
																		y++;
																		System.out.println(y);
																		if(y%2==0)
																		{
																			
																		btn2.setEnabled(false);
																		}	
																		
																	}
																});
															}
															if(toplamhamlesayısı<hamlesayısı)
															{	btn3.setEnabled(true);
															 btn3.addActionListener(new ActionListener() {
																	public int z=1;
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		if(toplamhamlesayısı>hamlesayısı)
																		{int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		

																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}	
																			//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																		}
																		toplamhamlesayısı++;
																		// TODO Auto-generated method stub
																		kullanıcınesneADArrayList.add(nesneler.get(2));
																		System.out.println("--------------------------------tasart"+tasart);
																		kullanıcınesneADArrayList.add(nesneler.get(2));
																		if(tasart<=5&&nesneler.get(2).contains("tas"))
																		{
																		 if(tasart==1)
													                	    { tas t111=new tas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
																	
													                	    }
													                		 else if(tasart==2)
													                		 {
													                			tas t222=new tas(); 
													                			//System.out.println("-----------------------------------tas2");
													                     System.out.println("-----------t2"); 
													                     kullanıcınesnlelerArrayList.add(t222);
													           
													                		 }
													                		 else if(tasart==3)
													                		 {
													                			tas t333=new tas(); 
													                			//System.out.println("x3");
													                			 kullanıcınesnlelerArrayList.add(t333);
													                		 }
													                		 else if(tasart==4)
													                		 {
													                			tas t444=new tas(); 
													                			//System.out.println("x4");
													                			 kullanıcınesnlelerArrayList.add(t444);
													                		 }
													                		 else if(tasart==5)
													                		 {
													                			tas t555=new tas(); 
													                			//System.out.println("x5");
													                			 kullanıcınesnlelerArrayList.add(t555);
													                		 }
																		 tasart++;
																		
																		}
																		if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																		{
																		 if(kagıtart==1)
													                	    { kagit k111=new kagit();
													                	       //System.out.println("-----------------------------------tas1");
																	System.out.println("------k1");
																	 kullanıcınesnlelerArrayList.add(k111);
													                	    }
													                		 else if(kagıtart==2)
													                		 {
													                			kagit k222=new kagit(); 
													                			//System.out.println("-----------------------------------tas2");
													                			 kullanıcınesnlelerArrayList.add(k222);
													           System.out.println("--------k2");
													                		 }
													                		 else if(kagıtart==3)
													                		 {
													                			kagit k333=new kagit(); 
													                			//System.out.println("x3");
													                			 kullanıcınesnlelerArrayList.add(k333);
													                			System.out.println("-----k3");
													                		 }
													                		 else if(kagıtart==4)
													                		 {
													                			kagit k444=new kagit(); 
													                			//System.out.println("x4");
													                			 kullanıcınesnlelerArrayList.add(k444);
													                		 }
													                		 else if(kagıtart==5)
													                		 {
													                			kagit k555=new kagit(); 
													                			//System.out.println("x5");
													                			 kullanıcınesnlelerArrayList.add(k555);
													                		 }
																		 kagıtart++;
																		
																		}
																		if(makasart<=5&&nesneler.get(2).contains("makas"))
																		{
																		 if(makasart==1)
													                	    { makas m111=new makas();
													                	       //System.out.println("-----------------------------------tas1");
				System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
																
																	
													                	    }
													                		 else if(makasart==2)
													                		 {
													                			makas m222=new makas(); 
													                			//System.out.println("-----------------------------------tas2");
													                			 kullanıcınesnlelerArrayList.add(m222);
													           System.out.println("---------m2");
													                		 }
													                		 else if(makasart==3)
													                		 {
													                			makas m333=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m333);
													                			//System.out.println("x3");
													                			System.out.println("m3");
													                		 }
													                		 else if(makasart==4)
													                		 {
													                			makas m444=new makas(); 
													                			 kullanıcınesnlelerArrayList.add(m444);
													                			//System.out.println("x4");
													                		 }
													                		 else if(makasart==5)
													                		 {
													                			makas m555=new makas(); 
													                			//System.out.println("x5");
													                			 kullanıcınesnlelerArrayList.add(m555);
													                		 }
																		 makasart++;
																		
																		}
																		System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																		if(toplamhamlesayısı==hamlesayısı)
																		{	
																				for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																				{
																					for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																					{
																						if(i==j)
																						{ 
																				double saldıranetki=0;
																			    double savunanetki=0;
																		        int seviyepuanartis=0;		
														saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
														seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
												        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
														int seviyepuanartis2=0;		
														savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
														seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
														kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
														
								//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
													
												System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
												// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
												  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
												 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
												
												  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
												  {
													  computerrandomsınıfArrayList.remove(i);
													  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
													  {
														  agirtas agirtas1=new agirtas();
													  }
													  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
													  {
														  
														  Özelkagit özelkagit1=new Özelkagit();
													  }
													  else {
														  
															  ustamakas ustamakas1=new ustamakas();
														  
													}
												  }
												  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
												  {
													  kullanıcınesnlelerArrayList.remove(i);
												  }
												  
												  if(computerrandomsınıfArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
													  
												  }
												  if(kullanıcınesnlelerArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
												  }					  
												  
												  
												  
												  
												/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														  {
													  //tasbilgisayar.
													  System.out.println("bilgisayar sakor art");
													  bilgisayar.skor++;
													  
														  }
												  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														{
													System.out.println("kullanicci skor art");
													kullanicci.skor++;
												}
												  */
												  
												  
												  
												/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
												  System.out.println("/***************kullanici////////"+kullanicci.skor);
												  System.out.println("toplamyahahmle"+toplamhamlesayısı);
												*/
												  
														       
											//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
											if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
											{
												//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
									
											}
														       
																						
																						}
																					}
																				
																				}
								                                           }
																		z++;
																		System.out.println(z);
																		if(z%2==0)
																		{
																			
																		btn3.setEnabled(false);
																		}	
																		
																	}
																});
															}
															
															if(toplamhamlesayısı<hamlesayısı)
															{	btn4.setEnabled(true);
															btn4.addActionListener(new ActionListener() {
																public int q=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	
																	// TODO Auto-generated method stub
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																		//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
																	}
																	
																	toplamhamlesayısı++;
																	
																	
																	
																	kullanıcınesneADArrayList.add(nesneler.get(3));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(3));
																	if(tasart<=5&&nesneler.get(3).contains("tas"))
																	{
																	 if(tasart==1)
												                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
												                	    tas t1111=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t2222=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 
												                     kullanıcınesnlelerArrayList.add(t2222);
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t3333=new tas();
												                			 kullanıcınesnlelerArrayList.add(t3333);
												                			//System.out.println("x3");
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t4444=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t4444);
												                			//System.out.println("x4");
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t5555=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t5555);
												                			//System.out.println("x5");
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k1111=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k1111);
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k2222=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(k2222);
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k3333=new kagit(); 
												                			//System.out.println("x3");
												                			System.out.println("-----k3");
												                			 kullanıcınesnlelerArrayList.add(k3333);
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k4444=new kagit(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(k4444);
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k5555=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k5555);
												                			//System.out.println("x5");
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(3).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m1111=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m2222=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(m2222);
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m3333=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m3333);
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m4444=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m4444);
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m5555=new makas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(m5555);
												                		 }
																	 makasart++;
																	
																	}
																	System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	q++;
																	
																	//System.out.println("+++++193"+kullanıcınesneADArrayList);
																	System.out.println(q);
																	if(q%2==0)
																	{
																		
																	btn4.setEnabled(false);
																	}
																	
																}
															});
															}
															if(toplamhamlesayısı<hamlesayısı)
															{	btn5.setEnabled(true);
															 btn5.addActionListener(new ActionListener() {
																	public int w=1;
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		if(toplamhamlesayısı>hamlesayısı)
																		{int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		

																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																			//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																		}
																		toplamhamlesayısı++;
																		// TODO Auto-generated method stub
										
										kullanıcınesneADArrayList.add(nesneler.get(4));
										//burda gecerli	
										
										System.out.println("--------------------------------tasart5"+tasart);
										kullanıcınesneADArrayList.add(nesneler.get(4));
										if(tasart<=5&&nesneler.get(4).contains("tas"))
										{
										 if(tasart==1)
					                	    { tas t11111=new tas();
					                	       //System.out.println("-----------------------------------tas1");
				System.out.println("---------t1");
				kullanıcınesnlelerArrayList.add(t11111);
									
					                	    }
					                		 else if(tasart==2)
					                		 {
					                			tas t22222=new tas(); 
					                			//System.out.println("-----------------------------------tas2");
					                     System.out.println("-----------t2"); 	 
					                     kullanıcınesnlelerArrayList.add(t22222);
					           
					                		 }
					                		 else if(tasart==3)
					                		 {
					                			tas t33333=new tas(); 
					                			   kullanıcınesnlelerArrayList.add(t33333);
					                			//System.out.println("x3");
					                		 }
					                		 else if(tasart==4)
					                		 {
					                			tas t44444=new tas(); 
					                			//System.out.println("x4");
					                			   kullanıcınesnlelerArrayList.add(t44444);
					                		 }
					                		 else if(tasart==5)
					                		 {
					                			tas t55555=new tas(); 
					                			//System.out.println("x5");
					                			   kullanıcınesnlelerArrayList.add(t55555);
					                		 }
										 tasart++;
										
										}
										if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
										{
										 if(kagıtart==1)
					                	    { 
											 kagit k11111=new kagit();
					                	       //System.out.println("-----------------------------------tas1");
									System.out.println("------k1");
									   kullanıcınesnlelerArrayList.add(k11111);
					                	    }
					                		 else if(kagıtart==2)
					                		 {
					                			kagit k22222=new kagit(); 
					                			//System.out.println("-----------------------------------tas2");
					                			   kullanıcınesnlelerArrayList.add(k22222);
					                      	    
					           System.out.println("--------k2");
					                		 }
					                		 else if(kagıtart==3)
					                		 {
					                			kagit k33333=new kagit(); 
					                			//System.out.println("x3");
					                			System.out.println("-----k3");
					                			   kullanıcınesnlelerArrayList.add(k33333);
					                		 }
					                		 else if(kagıtart==4)
					                		 {
					                			kagit k44444=new kagit(); 
					                			//System.out.println("x4");
					                			   kullanıcınesnlelerArrayList.add(k44444);
					                		 }
					                		 else if(kagıtart==5)
					                		 {
					                			kagit k55555=new kagit(); 
					                			//System.out.println("x5");
					                			   kullanıcınesnlelerArrayList.add(k55555);
					                		 }
										 kagıtart++;
										
										}
										if(makasart<=5&&nesneler.get(4).contains("makas"))
										{
										 if(makasart==1)
					                	    { makas m11111=new makas();
					                	       //System.out.println("-----------------------------------tas1");
				System.out.println("--------m");
				kullanıcınesnlelerArrayList.add(m11111);
									
					                	    }
					                		 else if(makasart==2)
					                		 {
					                			makas m22222=new makas(); 
					                			//System.out.println("-----------------------------------tas2");
					                			   kullanıcınesnlelerArrayList.add(m22222);
					           System.out.println("---------m2");
					                		 }
					                		 else if(makasart==3)
					                		 {
					                			makas m33333=new makas(); 
					                			//System.out.println("x3");
					                			System.out.println("m3");
					                			   kullanıcınesnlelerArrayList.add(m33333);
					                		 }
					                		 else if(makasart==4)
					                		 {
					                			makas m44444=new makas(); 
					                			//System.out.println("x4");
					                			   kullanıcınesnlelerArrayList.add(m44444);
					                		 }
					                		 else if(makasart==5)
					                		 {
					                			makas m55555=new makas(); 
					                			//System.out.println("x5");
					                			   kullanıcınesnlelerArrayList.add(m55555);
					                		 }
										 makasart++;
										//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
				}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
										System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
										if(toplamhamlesayısı==hamlesayısı)
										{	
												for(int i=0;i<computerrandomsınıfArrayList.size();i++)
												{
													for(int j=0;j<computerrandomsınıfArrayList.size();j++)
													{
														if(i==j)
														{ 
												double saldıranetki=0;
											    double savunanetki=0;
										        int seviyepuanartis=0;		
						saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
						seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
				        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
						int seviyepuanartis2=0;		
						savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
						seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
						kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
						
	//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
					
				System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
				// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
				  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
				 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
				
				  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
				  {
					  computerrandomsınıfArrayList.remove(i);
					  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
					  {
						  agirtas agirtas1=new agirtas();
					  }
					  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
					  {
						  
						  Özelkagit özelkagit1=new Özelkagit();
					  }
					  else {
						  
							  ustamakas ustamakas1=new ustamakas();
						  
					}
				  }
				  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
				  {
					  kullanıcınesnlelerArrayList.remove(i);
				  }
				  
				  if(computerrandomsınıfArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
					  
				  }
				  if(kullanıcınesnlelerArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
				  }					  
				  
				  
				  
				  
				/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						  {
					  //tasbilgisayar.
					  System.out.println("bilgisayar sakor art");
					  bilgisayar.skor++;
					  
						  }
				  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						{
					System.out.println("kullanicci skor art");
					kullanicci.skor++;
				}
				  */
				  
				  
				  
				/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
				  System.out.println("/***************kullanici////////"+kullanicci.skor);
				  System.out.println("toplamyahahmle"+toplamhamlesayısı);
				*/
				  
						       
			//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
			if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
			{
				//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

			}
						       
														
														}
													}
												
												}
	                                       }								
										w++;

																		System.out.println(w);
																		if(w%2==0)
																		{
																		btn5.setEnabled(false);
																		}
																	}
																	});
															}
														
														
															
															
											
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
														
												
														
														
														
												
													for(int i=0;i<computerrandomsınıfArrayList.size();i++)
														{
															for(int j=0;j<computerrandomsınıfArrayList.size();j++)
															{
																if(i==j)
																{ 
														double saldıranetki=0;
													    double savunanetki=0;
												        int seviyepuanartis=0;		
								saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
								seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
						        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
								int seviyepuanartis2=0;		
								savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
								seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
								kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
								
		//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
							
						System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
						// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
						  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
						 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
						
						  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
						  {
							  computerrandomsınıfArrayList.remove(i);
							  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
							  {
								  agirtas agirtas1=new agirtas();
							  }
							  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
							  {
								  
								  Özelkagit özelkagit1=new Özelkagit();
							  }
							  else {
								  
									  ustamakas ustamakas1=new ustamakas();
								  
							}
						  }
						  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
						  {
							  kullanıcınesnlelerArrayList.remove(i);
						  }
						  
						  if(computerrandomsınıfArrayList.isEmpty())
						  {
							  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
							 
						  }
						  if(kullanıcınesnlelerArrayList.isEmpty())
						  {
							  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
							
						  }					  
						  
						  
						  
						  
						/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
								  {
							  //tasbilgisayar.
							  System.out.println("bilgisayar sakor art");
							  bilgisayar.skor++;
							  
								  }
						  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
								{
							System.out.println("kullanicci skor art");
							kullanicci.skor++;
						}
						  */
						  
						  
						  
						/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
						  System.out.println("/***************kullanici////////"+kullanicci.skor);
						  System.out.println("toplamyahahmle"+toplamhamlesayısı);
						*/
						  
								       
					//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
					if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
					{
						//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
			
					}
								       
																
																}
															}
														
														}
		                                           
														
													
												
													
													
														}
														
														
														
														
														
														
														
													});

												    JLabel bilgisayarsecimkutu=new JLabel();
												    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
												    bilgisayarsecimdeger++;
												    bilgisayarsecimkutu.setBounds(600,280,100,30 );
												    JButton btn=new JButton("computer secimi");
												    btn.addActionListener(new ActionListener() {
														
														@Override
														public void actionPerformed(ActionEvent e) {
															
															JLabel label1 = new JLabel();
															label1.setFont(new Font("Calibri",Font.PLAIN,20));
															label1.setText(kopya.get(0));
															label1.setBounds(700, 200, 300, 40);
															JLabel label2 = new JLabel();
															label2.setFont(new Font("Calibri",Font.PLAIN,20));
															label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
															label2.setBounds(700, 261, 300, 40);
															JLabel label3 = new JLabel();
															label3.setFont(new Font("Calibri",Font.PLAIN,20));
															label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
															label3.setBounds(700, 323, 300, 40);
															JLabel label4 = new JLabel();
															label4.setFont(new Font("Calibri",Font.PLAIN,50));
															label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
															//label4.setText(kopya.get(3));
															label4.setBounds(700, 384, 450, 80);
															JLabel label5 = new JLabel();
															label5.setFont(new Font("Calibri",Font.PLAIN,20));
															label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
															//label4.setText(kopya.get(3));
															label5.setBounds(700, 480, 450, 80);






															pencere3.add(label1);
															pencere3.add(label2);
															pencere3.add(label3);
															pencere3.add(label4);
															pencere3.add(label5);
														}
													});
												    
												    btn.setBounds(500,280,130,30);
												    
												    
												
												yaziJLabel.setText("kullanıcıvsbilgisayar");
												yaziJLabel.setBounds(500,200,150,30);
												pencere3.add(btn5);
												pencere3.add(btn4);
												pencere3.add(btn3);
												pencere3.add(btn2);
												pencere3.add(btn1);
												pencere3.add(btn);
												pencere3.add(bilgisayarsecimkutu);
												pencere3.setSize(1000,500);
												pencere3.setLayout(null);	
												pencere3.setVisible(true);
												if(gir3==1)
												{ int tart=1,kart=1,mart=1,bak=1;
								                 for(int i=0;i<nesneler.size();i++)
								                 {   System.out.println(nesneler.get(i));
								                	 if(nesneler.get(i).contains("tas"))
								                	 {  
								                		 if(tart==1)
								                	    { tas x1=new tas();
								                	    

								                	    }
								                		 else if(tart==2)
								                		 {
								                			tas x2=new tas(); 
								                			
								                      	    
								           
								                		 }
								                		 else if(tart==3)
								                		 {
								                			tas x3=new tas(); 
								                			
								                		 }
								                		 else if(tart==4)
								                		 {
								                			tas x4=new tas(); 
								                			
								                		 }
								                		 else if(tart==5)
								                		 {
								                			tas x5=new tas(); 
								                			
								                		 }
								                		 else if(tart==6)
								                		 {
								                			tas x6=new tas(); 
								                		 }
								                		 else if(tart==7)
								                		 {
								                			tas x7=new tas(); 
								                		 }
								                		 else if(tart==8)
								                		 {
								                			tas x8=new tas(); 
								                		 }
								                		 else if(tart==9)
								                		 {
								                			tas x9=new tas(); 
								                		 }
								                		 else if(tart==10)
								                		 {
								                			tas x10=new tas(); 
								                		 }else if(tart==11)
								                		 {
								                			tas x11=new tas(); 
								                		 }
								                		 else if(tart==12)
								                		 {
								                			tas x12=new tas(); 
								                		 }
								                	     tart++;
								                		 System.out.println("                    t");
								                	 }
								                	 else if(nesneler.get(i).contains("kagıt"))
								                	 {
								                		 
								                		 if(kart==1)
								                 	    { kagit y1=new kagit();
								                 	    }
								                 		 else if(kart==2)
								                 		 {
								                 			kagit y2=new kagit(); 
								                 		 }
								                 		else if(kart==3)
								                		 {
								                			kagit y3=new kagit(); 
								                		 }
								                 		else if(kart==4)
								                		 {
								                			kagit y4=new kagit(); 
								                		 }
								                 		else if(kart==5)
								                		 {
								                			kagit y5=new kagit(); 
								                		 }
								                 		else if(kart==6)
								                		 {
								                			kagit y6=new kagit(); 
								                		 }
								                 		else if(kart==7)
								                		 {
								                			kagit y7=new kagit(); 
								                		 }
								                 		else if(kart==8)
								                		 {
								                			kagit y8=new kagit(); 
								                		 }
								                 		else if(kart==9)
								                		 {
								                			kagit y9=new kagit(); 
								                		 }
								                 		else if(kart==10)
								                		 {
								                			kagit y10=new kagit(); 
								                		 }
								                 		
								                 	     kart++;
								                		 
								                		 
								                		 
								                		System.out.println("                         k"); 
								                	 }
								                	 else {
								                		 if(mart==1)
								                  	    { makas z1=new makas();
								                  	    }
								                  		 else if(mart==2)
								                  		 {
								                  			makas z2=new makas(); 
								                  		 }
								                  		else if(mart==3)
								                 		 {
								                 			makas z3=new makas(); 
								                 		 }
								                  		 else if(mart==4)
								                  		 {
								                  			makas z4=new makas(); 
								                  		 }
								                  		else if(mart==5)
								                 		 {
								                 			makas z5=new makas(); 
								                 		 } else if(mart==6)
								                  		 {
								                  			makas z6=new makas(); 
								                  		 }
								                  		else if(mart==7)
								                 		 {
								                 			makas z7=new makas(); 
								                 		 } else if(mart==8)
								                  		 {
								                  			makas z8=new makas(); 
								                  		 }
								                  		else if(mart==9)
								                 		 {
								                 			makas z9=new makas(); 
								                 		 }
								                		 mart++;
													System.out.println("                              m");	
													}
								                 }	 
												gir3++;
												}
											}
											//System.out.println("++++++++++++++++++++1696"+kullanıcınesnlelerArrayList);
										}
										
										
								
							 
								});
							 
						 
							 
								pencere.add(buton1);
								pencere.add(buton2);
								pencere.add(buton3);
								
								pencere.setSize(1000,500);
							    pencere.setLayout(null);	
							    pencere.setVisible(true); 
							 
							 
		
							 
							 
							 
						 }
						 else {
							bilgisayarvsbilgisayar++;
						}
						 }
			    });
			    JComboBox<String> oyuncusecimi2= new JComboBox<String>();
				//combo boxa eleman ekle
				oyuncusecimi2.addItem("kullanıcı");
				oyuncusecimi2.addItem("Bilgisayar");
				oyuncusecimi2.setBounds(550,100,250,30);
			    anapencere.add(oyuncusecimi2);
			    anapencere.add(oyuncusecimi2);
			    JButton onayButton2=new JButton("X");
			    onayButton2.setBounds(650,140,50,30);	
			    onayButton2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 System.out.println(oyuncusecimi2.getSelectedItem());
						 String bakString=(String) oyuncusecimi2.getSelectedItem();
						 if(bakString.equalsIgnoreCase("kullanıcı"))
						 {	 
							
							 
							 JFrame pencere=new JFrame("TAS-KAGIT-MAKAS");
								//biseyler setvisible kadar eklenir
								JButton buton1=new JButton("taş");
								JButton buton2=new JButton("kağıt");
								JButton buton3=new JButton("makas");
								buton1.setBounds(50,100,100,30);
								buton2.setBounds(150,100,100,30);
								buton3.setBounds(250,100,100,30);
								//butonatıklanmayı alma add action
								


								buton1.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
							 tasart=1;
							 kagıtart=1;
							 makasart=1;
										String tmp="tas"+(nesnesayısı1+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
										System.out.println(nesneolustur.nesnelerlistesi);
										nesnesayısı1++;
									    nesnesayısı++;
										nesneolustur nesne1=new nesneolustur();
										System.out.println(nesne1.x);
										
									    System.out.println(nesnesayısı1);

										JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
										
										
										JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
										JTextArea oyuncuadiveıdArea=new JTextArea();
									   JButton adButton=new JButton();
										adButton.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String areatextString=oyuncuadiveıdArea.getText();
												String dizi[]=areatextString.split("-");
												kullanicci.oyuncuAdi=dizi[0];
												kullanicci.oyuncuID=dizi[1];
												//System.out.println(kullanicci.oyuncuID);
												// System.out.println(kullanicci.oyuncuAdi);
												
												System.out.println("kullaniciad:"+dizi[0]);
												System.out.println("kullaniciid:"+dizi[1]);
												
											}
										});
										bilgiJLabel.setBounds(140,30,100,30);
										adButton.setBounds(465,30,10,10);
										oyuncuadiveıdArea.setBounds(240,30,200,30);
										pencere3.add(adButton);
										pencere3.add(bilgiJLabel);
										pencere3.add(oyuncuadiveıdArea);
										
										JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
										JTextArea oyuncuadiveıdArea2=new JTextArea();
									   JButton adButton2=new JButton();
										adButton2.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String areatextString2=oyuncuadiveıdArea2.getText();
												String dizi2[]=areatextString2.split("-");
												bilgisayar.oyuncuAdi=dizi2[0];
												bilgisayar.oyuncuID=dizi2[1];
											
												System.out.println("bilgisayarad:"+dizi2[0]);
												System.out.println("bilgisayarid:"+dizi2[1]);
												
											}
										});
										   
										bilgiJLabel2.setBounds(480,30,100,30);
										adButton2.setBounds(800,30,10,10);
										oyuncuadiveıdArea2.setBounds(590,30,200,30);
										pencere3.add(adButton2);
										pencere3.add(bilgiJLabel2);
										pencere3.add(oyuncuadiveıdArea2);
										
										
									   
									   
									   
									   
										
										
										
										
										
										
										
										
										
										JLabel yaziJLabel=new JLabel();
										 JButton btn1=new JButton();
										    btn1.setText(nesneler.get(0));
										    btn1.setBounds(300,193,80,20);
										    btn1.addActionListener(new ActionListener() {
												public int x =1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													
													

													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(1));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(1));
													if(tasart<=5&&nesneler.get(1).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t11=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                         kullanıcınesnelerinartımı++;
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t22=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 	    
								                     kullanıcınesnlelerArrayList.add(t22);
                                                     kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t33=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t33);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t44=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t44);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t55=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t55);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
													 tasart++;
													System.out.print("----------------tasartalt"+tasart);
													System.out.println();
													}
													if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k11=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k11);
                                                 kullanıcınesnelerinartımı++;
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k22=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                      	    
								           System.out.println("--------k2");
								           kullanıcınesnlelerArrayList.add(k22);
                                           kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k33=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k33);
                                                             kullanıcınesnelerinartımı++;
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k44=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k44);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k55=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k55);
                                                             kullanıcınesnelerinartımı++;
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(1).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m11=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m22=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                            kullanıcınesnlelerArrayList.add(m22);
								                            kullanıcınesnelerinartımı++;
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m33=new makas(); 
								                			//System.out.println("x3"
								                            kullanıcınesnlelerArrayList.add(m33);
								                            kullanıcınesnelerinartımı++;
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m44=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m44);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m55=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m55);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 makasart++;
													 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													}
													x++;
													//System.out.println(y);
													if(x%2==0)
													{
														
													btn1.setEnabled(false);
													}	
													
												
													
												}
											});
							          
										    JButton btn2=new JButton();
										    btn2.setText(nesneler.get(1));
										    btn2.setBounds(300,230,80,20);
										    btn2.addActionListener(new ActionListener() {
										    	
												public int y=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(1));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(1));
													if(tasart<=5&&nesneler.get(1).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t11=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                         kullanıcınesnelerinartımı++;
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t22=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 	    
								                     kullanıcınesnlelerArrayList.add(t22);
                                                     kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t33=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t33);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t44=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t44);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t55=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t55);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
													 tasart++;
													System.out.print("----------------tasartalt"+tasart);
													System.out.println();
													}
													if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k11=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k11);
                                                 kullanıcınesnelerinartımı++;
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k22=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                      	    
								           System.out.println("--------k2");
								           kullanıcınesnlelerArrayList.add(k22);
                                           kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k33=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k33);
                                                             kullanıcınesnelerinartımı++;
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k44=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k44);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k55=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k55);
                                                             kullanıcınesnelerinartımı++;
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(1).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m11=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m22=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                            kullanıcınesnlelerArrayList.add(m22);
								                            kullanıcınesnelerinartımı++;
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m33=new makas(); 
								                			//System.out.println("x3"
								                            kullanıcınesnlelerArrayList.add(m33);
								                            kullanıcınesnelerinartımı++;
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m44=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m44);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m55=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m55);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 makasart++;
													 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													}
													y++;
													System.out.println(y);
													if(y%2==0)
													{
														
													btn2.setEnabled(false);
													}	
													
												
												}
											});
										    JButton btn3=new JButton();
										    btn3.setText(nesneler.get(2));
										    btn3.setBounds(300,270,80,20);
										    btn3.addActionListener(new ActionListener() {
												public int z=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(2));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(2));
													if(tasart<=5&&nesneler.get(2).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t111=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t222=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 
								                     kullanıcınesnlelerArrayList.add(t222);
								           
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t333=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t333);
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t444=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t444);
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t555=new tas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(t555);
								                		 }
													 tasart++;
													
													}
													if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k111=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k111);
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k222=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(k222);
								           System.out.println("--------k2");
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k333=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k333);
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k444=new kagit(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(k444);
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k555=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k555);
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(2).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m111=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m222=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(m222);
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m333=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m333);
								                			//System.out.println("x3");
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m444=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m555=new makas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(m555);
								                		 }
													 makasart++;
													
													}
													System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													z++;
													System.out.println(z);
													if(z%2==0)
													{
														
													btn3.setEnabled(false);
													}	
													
												}
											});
										    JButton btn4=new JButton();
										    btn4.setText(nesneler.get(3));
										    btn4.setBounds(300,310,80,20);
										    btn4.addActionListener(new ActionListener() {
												public int q=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													toplamhamlesayısı++;
													
													
													
													kullanıcınesneADArrayList.add(nesneler.get(3));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(3));
													if(tasart<=5&&nesneler.get(3).contains("tas"))
													{
													 if(tasart==1)
								                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
								                	    tas t1111=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t2222=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 
								                     kullanıcınesnlelerArrayList.add(t2222);
								           
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t3333=new tas();
								                			 kullanıcınesnlelerArrayList.add(t3333);
								                			//System.out.println("x3");
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t4444=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t4444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t5555=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t5555);
								                			//System.out.println("x5");
								                		 }
													 tasart++;
													
													}
													if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k1111=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k1111);
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k2222=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(k2222);
								           System.out.println("--------k2");
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k3333=new kagit(); 
								                			//System.out.println("x3");
								                			System.out.println("-----k3");
								                			 kullanıcınesnlelerArrayList.add(k3333);
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k4444=new kagit(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(k4444);
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k5555=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k5555);
								                			//System.out.println("x5");
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(3).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m1111=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m2222=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(m2222);
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m3333=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m3333);
								                			//System.out.println("x3");
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m4444=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m4444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m5555=new makas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(m5555);
								                		 }
													 makasart++;
													
													}
													System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													q++;
													
													//System.out.println("+++++193"+kullanıcınesneADArrayList);
													System.out.println(q);
													if(q%2==0)
													{
														
													btn4.setEnabled(false);
													}
													
												}
											});
										    JButton btn5=new JButton();
										    btn5.setText(nesneler.get(4));
										    btn5.setBounds(300,350,80,20);
										    btn5.addActionListener(new ActionListener() {
												public int w=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
					
					kullanıcınesneADArrayList.add(nesneler.get(4));
					//burda gecerli	
					
					System.out.println("--------------------------------tasart5"+tasart);
					kullanıcınesneADArrayList.add(nesneler.get(4));
					if(tasart<=5&&nesneler.get(4).contains("tas"))
					{
					 if(tasart==1)
                	    { tas t11111=new tas();
                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");
kullanıcınesnlelerArrayList.add(t11111);
				
                	    }
                		 else if(tasart==2)
                		 {
                			tas t22222=new tas(); 
                			//System.out.println("-----------------------------------tas2");
                     System.out.println("-----------t2"); 	 
                     kullanıcınesnlelerArrayList.add(t22222);
           
                		 }
                		 else if(tasart==3)
                		 {
                			tas t33333=new tas(); 
                			   kullanıcınesnlelerArrayList.add(t33333);
                			//System.out.println("x3");
                		 }
                		 else if(tasart==4)
                		 {
                			tas t44444=new tas(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(t44444);
                		 }
                		 else if(tasart==5)
                		 {
                			tas t55555=new tas(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(t55555);
                		 }
					 tasart++;
					
					}
					if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
					{
					 if(kagıtart==1)
                	    { 
						 kagit k11111=new kagit();
                	       //System.out.println("-----------------------------------tas1");
				System.out.println("------k1");
				   kullanıcınesnlelerArrayList.add(k11111);
                	    }
                		 else if(kagıtart==2)
                		 {
                			kagit k22222=new kagit(); 
                			//System.out.println("-----------------------------------tas2");
                			   kullanıcınesnlelerArrayList.add(k22222);
                      	    
           System.out.println("--------k2");
                		 }
                		 else if(kagıtart==3)
                		 {
                			kagit k33333=new kagit(); 
                			//System.out.println("x3");
                			System.out.println("-----k3");
                			   kullanıcınesnlelerArrayList.add(k33333);
                		 }
                		 else if(kagıtart==4)
                		 {
                			kagit k44444=new kagit(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(k44444);
                		 }
                		 else if(kagıtart==5)
                		 {
                			kagit k55555=new kagit(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(k55555);
                		 }
					 kagıtart++;
					
					}
					if(makasart<=5&&nesneler.get(4).contains("makas"))
					{
					 if(makasart==1)
                	    { makas m11111=new makas();
                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");
kullanıcınesnlelerArrayList.add(m11111);
				
                	    }
                		 else if(makasart==2)
                		 {
                			makas m22222=new makas(); 
                			//System.out.println("-----------------------------------tas2");
                			   kullanıcınesnlelerArrayList.add(m22222);
           System.out.println("---------m2");
                		 }
                		 else if(makasart==3)
                		 {
                			makas m33333=new makas(); 
                			//System.out.println("x3");
                			System.out.println("m3");
                			   kullanıcınesnlelerArrayList.add(m33333);
                		 }
                		 else if(makasart==4)
                		 {
                			makas m44444=new makas(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(m44444);
                		 }
                		 else if(makasart==5)
                		 {
                			makas m55555=new makas(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(m55555);
                		 }
					 makasart++;
					//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
					System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													w++;

													System.out.println(w);
													if(w%2==0)
													{
													btn5.setEnabled(false);
													}
													
													
													if(toplamhamlesayısı<hamlesayısı)
													{	btn1.setEnabled(true);
													 btn1.addActionListener(new ActionListener() {
															public int x =1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																
																if(toplamhamlesayısı>hamlesayısı)
																{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	
																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(0));
																if(tasart<=5&&nesneler.get(0).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t1=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");                          






		kullanıcınesnlelerArrayList.add(t1);
		                                                             kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t2=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 	
											                     kullanıcınesnlelerArrayList.add(t2);
		                                                         kullanıcınesnelerinartımı++;
											                    
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t3=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t3);
			                                                             kullanıcınesnelerinartımı++;
											                			
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t4=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t4);
			                                                             kullanıcınesnelerinartımı++;
											                		
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t5=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k1=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k1);
		                                                     kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k2=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k2);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("-----------------------------------tas2");
											                			
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k3=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k3);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x3");
											                			
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k4=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k4);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                			
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k5=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                			
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(0).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m1=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");
		kullanıcınesnlelerArrayList.add(m1);
		kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m2=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m2);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("-----------------------------------tas2");
											                      	    
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m3=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m3);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m4=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m4);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m5=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 makasart++;
																
																}
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																x++;
																System.out.println(x);
																if(x%2==0)
																{
																//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																
																	
																btn1.setEnabled(false);
																
																}	
																
															
															
															}
														});
										          
													}
															
															
													if(toplamhamlesayısı<hamlesayısı)
													{	btn2.setEnabled(true);
													  btn2.addActionListener(new ActionListener() {
													    	
															public int y=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																if(toplamhamlesayısı>hamlesayısı)
																{
																	int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		
																			bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																			//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		

																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																	//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																kullanıcınesneADArrayList.add(nesneler.get(1));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(1));
																if(tasart<=5&&nesneler.get(1).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t11=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
		                                                             kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t22=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 	    
											                     kullanıcınesnlelerArrayList.add(t22);
		                                                         kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t33=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t33);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t44=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t44);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t55=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t55);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																 tasart++;
																System.out.print("----------------tasartalt"+tasart);
																System.out.println();
																}
																if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k11=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k11);
		                                                     kullanıcınesnelerinartımı++;
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k22=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                      	    
											           System.out.println("--------k2");
											           kullanıcınesnlelerArrayList.add(k22);
		                                               kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k33=new kagit(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(k33);
			                                                             kullanıcınesnelerinartımı++;
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k44=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k44);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k55=new kagit(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(k55);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(1).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m11=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
		kullanıcınesnelerinartımı++;
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m22=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                            kullanıcınesnlelerArrayList.add(m22);
											                            kullanıcınesnelerinartımı++;
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m33=new makas(); 
											                			//System.out.println("x3"
											                            kullanıcınesnlelerArrayList.add(m33);
											                            kullanıcınesnelerinartımı++;
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m44=new makas(); 
											                            kullanıcınesnlelerArrayList.add(m44);
											                            kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m55=new makas(); 
											                            kullanıcınesnlelerArrayList.add(m55);
											                            kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 makasart++;
																 if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																}
																y++;
																System.out.println(y);
																if(y%2==0)
																{
																	
																btn2.setEnabled(false);
																}	
																
															}
														});
													}
													if(toplamhamlesayısı<hamlesayısı)
													{	btn3.setEnabled(true);
													 btn3.addActionListener(new ActionListener() {
															public int z=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}	
																	//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																kullanıcınesneADArrayList.add(nesneler.get(2));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(2));
																if(tasart<=5&&nesneler.get(2).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t111=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t222=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 
											                     kullanıcınesnlelerArrayList.add(t222);
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t333=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t333);
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t444=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t444);
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t555=new tas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(t555);
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k111=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k111);
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k222=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(k222);
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k333=new kagit(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(k333);
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k444=new kagit(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(k444);
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k555=new kagit(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(k555);
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(2).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m111=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m222=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(m222);
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m333=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m333);
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m444=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m555=new makas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(m555);
											                		 }
																 makasart++;
																
																}
																System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																z++;
																System.out.println(z);
																if(z%2==0)
																{
																	
																btn3.setEnabled(false);
																}	
																
															}
														});
													}
													
													if(toplamhamlesayısı<hamlesayısı)
													{	btn4.setEnabled(true);
													btn4.addActionListener(new ActionListener() {
														public int q=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															
															
															// TODO Auto-generated method stub
															if(toplamhamlesayısı>hamlesayısı)
															{int bilgisayartoplamdayanıklılık=0;
														    int kullanıcıtoplamdayanıklılık=0;
															for(int don=0;don<computerrandomsınıfArrayList.size();don++)
															{
															bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
															}
															
															for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
															{
															kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
															}
															

															if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
															{
																
																JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
															}
																
															else	
															{
																JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																
															}
																										
																
																//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
															}
															
															toplamhamlesayısı++;
															
															
															
															kullanıcınesneADArrayList.add(nesneler.get(3));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(3));
															if(tasart<=5&&nesneler.get(3).contains("tas"))
															{
															 if(tasart==1)
										                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
										                	    tas t1111=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t2222=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 
										                     kullanıcınesnlelerArrayList.add(t2222);
										           
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t3333=new tas();
										                			 kullanıcınesnlelerArrayList.add(t3333);
										                			//System.out.println("x3");
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t4444=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t5555=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t5555);
										                			//System.out.println("x5");
										                		 }
															 tasart++;
															
															}
															if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k1111=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k1111);
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k2222=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(k2222);
										           System.out.println("--------k2");
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k3333=new kagit(); 
										                			//System.out.println("x3");
										                			System.out.println("-----k3");
										                			 kullanıcınesnlelerArrayList.add(k3333);
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k4444=new kagit(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(k4444);
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k5555=new kagit(); 
										                			 kullanıcınesnlelerArrayList.add(k5555);
										                			//System.out.println("x5");
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(3).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m1111=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m2222=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(m2222);
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m3333=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m3333);
										                			//System.out.println("x3");
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m4444=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m5555=new makas(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(m5555);
										                		 }
															 makasart++;
															
															}
															System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															
															if(toplamhamlesayısı==hamlesayısı)
															{	
																	for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																	{
																		for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																		{
																			if(i==j)
																			{ 
																	double saldıranetki=0;
																    double savunanetki=0;
															        int seviyepuanartis=0;		
											saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
											seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
									        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
											int seviyepuanartis2=0;		
											savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
											seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
											kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
											
					//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
										
									System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
									// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
									  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
									 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
									
									  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
									  {
										  computerrandomsınıfArrayList.remove(i);
										  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
										  {
											  agirtas agirtas1=new agirtas();
										  }
										  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
										  {
											  
											  Özelkagit özelkagit1=new Özelkagit();
										  }
										  else {
											  
												  ustamakas ustamakas1=new ustamakas();
											  
										}
									  }
									  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
									  {
										  kullanıcınesnlelerArrayList.remove(i);
									  }
									  
									  if(computerrandomsınıfArrayList.isEmpty())
									  {
										  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
										  
									  }
									  if(kullanıcınesnlelerArrayList.isEmpty())
									  {
										  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
									  }					  
									  
									  
									  
									  
									/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
											  {
										  //tasbilgisayar.
										  System.out.println("bilgisayar sakor art");
										  bilgisayar.skor++;
										  
											  }
									  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
											{
										System.out.println("kullanicci skor art");
										kullanicci.skor++;
									}
									  */
									  
									  
									  
									/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
									  System.out.println("/***************kullanici////////"+kullanicci.skor);
									  System.out.println("toplamyahahmle"+toplamhamlesayısı);
									*/
									  
											       
								//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
								if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
								{
									//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
						
								}
											       
																			
																			}
																		}
																	
																	}
					                                           }
															q++;
															
															//System.out.println("+++++193"+kullanıcınesneADArrayList);
															System.out.println(q);
															if(q%2==0)
															{
																
															btn4.setEnabled(false);
															}
															
														}
													});
													}
													if(toplamhamlesayısı<hamlesayısı)
													{	btn5.setEnabled(true);
													 btn5.addActionListener(new ActionListener() {
															public int w=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}
																											
																	
																	//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
								
								kullanıcınesneADArrayList.add(nesneler.get(4));
								//burda gecerli	
								
								System.out.println("--------------------------------tasart5"+tasart);
								kullanıcınesneADArrayList.add(nesneler.get(4));
								if(tasart<=5&&nesneler.get(4).contains("tas"))
								{
								 if(tasart==1)
			                	    { tas t11111=new tas();
			                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");
		kullanıcınesnlelerArrayList.add(t11111);
							
			                	    }
			                		 else if(tasart==2)
			                		 {
			                			tas t22222=new tas(); 
			                			//System.out.println("-----------------------------------tas2");
			                     System.out.println("-----------t2"); 	 
			                     kullanıcınesnlelerArrayList.add(t22222);
			           
			                		 }
			                		 else if(tasart==3)
			                		 {
			                			tas t33333=new tas(); 
			                			   kullanıcınesnlelerArrayList.add(t33333);
			                			//System.out.println("x3");
			                		 }
			                		 else if(tasart==4)
			                		 {
			                			tas t44444=new tas(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(t44444);
			                		 }
			                		 else if(tasart==5)
			                		 {
			                			tas t55555=new tas(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(t55555);
			                		 }
								 tasart++;
								
								}
								if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
								{
								 if(kagıtart==1)
			                	    { 
									 kagit k11111=new kagit();
			                	       //System.out.println("-----------------------------------tas1");
							System.out.println("------k1");
							   kullanıcınesnlelerArrayList.add(k11111);
			                	    }
			                		 else if(kagıtart==2)
			                		 {
			                			kagit k22222=new kagit(); 
			                			//System.out.println("-----------------------------------tas2");
			                			   kullanıcınesnlelerArrayList.add(k22222);
			                      	    
			           System.out.println("--------k2");
			                		 }
			                		 else if(kagıtart==3)
			                		 {
			                			kagit k33333=new kagit(); 
			                			//System.out.println("x3");
			                			System.out.println("-----k3");
			                			   kullanıcınesnlelerArrayList.add(k33333);
			                		 }
			                		 else if(kagıtart==4)
			                		 {
			                			kagit k44444=new kagit(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(k44444);
			                		 }
			                		 else if(kagıtart==5)
			                		 {
			                			kagit k55555=new kagit(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(k55555);
			                		 }
								 kagıtart++;
								
								}
								if(makasart<=5&&nesneler.get(4).contains("makas"))
								{
								 if(makasart==1)
			                	    { makas m11111=new makas();
			                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");
		kullanıcınesnlelerArrayList.add(m11111);
							
			                	    }
			                		 else if(makasart==2)
			                		 {
			                			makas m22222=new makas(); 
			                			//System.out.println("-----------------------------------tas2");
			                			   kullanıcınesnlelerArrayList.add(m22222);
			           System.out.println("---------m2");
			                		 }
			                		 else if(makasart==3)
			                		 {
			                			makas m33333=new makas(); 
			                			//System.out.println("x3");
			                			System.out.println("m3");
			                			   kullanıcınesnlelerArrayList.add(m33333);
			                		 }
			                		 else if(makasart==4)
			                		 {
			                			makas m44444=new makas(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(m44444);
			                		 }
			                		 else if(makasart==5)
			                		 {
			                			makas m55555=new makas(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(m55555);
			                		 }
								 makasart++;
								//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
		}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
								System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
								if(toplamhamlesayısı==hamlesayısı)
								{	
										for(int i=0;i<computerrandomsınıfArrayList.size();i++)
										{
											for(int j=0;j<computerrandomsınıfArrayList.size();j++)
											{
												if(i==j)
												{ 
										double saldıranetki=0;
									    double savunanetki=0;
								        int seviyepuanartis=0;		
				saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
				seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
		        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
				int seviyepuanartis2=0;		
				savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
				seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
				kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
				
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
			
		System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
		// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
		  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
		 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
		
		  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
		  {
			  computerrandomsınıfArrayList.remove(i);
			  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
			  {
				  agirtas agirtas1=new agirtas();
			  }
			  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
			  {
				  
				  Özelkagit özelkagit1=new Özelkagit();
			  }
			  else {
				  
					  ustamakas ustamakas1=new ustamakas();
				  
			}
		  }
		  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
		  {
			  kullanıcınesnlelerArrayList.remove(i);
		  }
		  
		  if(computerrandomsınıfArrayList.isEmpty())
		  {
			  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
			  
		  }
		  if(kullanıcınesnlelerArrayList.isEmpty())
		  {
			  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
		  }					  
		  
		  
		  
		  
		/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
				  {
			  //tasbilgisayar.
			  System.out.println("bilgisayar sakor art");
			  bilgisayar.skor++;
			  
				  }
		  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
				{
			System.out.println("kullanicci skor art");
			kullanicci.skor++;
		}
		  */
		  
		  
		  
		/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
		  System.out.println("/***************kullanici////////"+kullanicci.skor);
		  System.out.println("toplamyahahmle"+toplamhamlesayısı);
		*/
		  
				       
	//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
	if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
	{
		//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

	}
				       
												
												}
											}
										
										}
                                   }								
								w++;

																System.out.println(w);
																if(w%2==0)
																{
																btn5.setEnabled(false);
																}
															}
															});
													}
												
												
													
													
									
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
												
										
												
												
												
										
											for(int i=0;i<computerrandomsınıfArrayList.size();i++)
												{
													for(int j=0;j<computerrandomsınıfArrayList.size();j++)
													{
														if(i==j)
														{ 
												double saldıranetki=0;
											    double savunanetki=0;
										        int seviyepuanartis=0;		
						saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
						seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
				        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
						int seviyepuanartis2=0;		
						savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
						seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
						kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
						
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
					
				System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
				// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
				  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
				 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
				
				  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
				  {
					  computerrandomsınıfArrayList.remove(i);
					  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
					  {
						  agirtas agirtas1=new agirtas();
					  }
					  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
					  {
						  
						  Özelkagit özelkagit1=new Özelkagit();
					  }
					  else {
						  
							  ustamakas ustamakas1=new ustamakas();
						  
					}
				  }
				  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
				  {
					  kullanıcınesnlelerArrayList.remove(i);
				  }
				  
				  if(computerrandomsınıfArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
					 
				  }
				  if(kullanıcınesnlelerArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
					
				  }					  
				  
				  
				  
				  
				/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						  {
					  //tasbilgisayar.
					  System.out.println("bilgisayar sakor art");
					  bilgisayar.skor++;
					  
						  }
				  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						{
					System.out.println("kullanicci skor art");
					kullanicci.skor++;
				}
				  */
				  
				  
				  
				/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
				  System.out.println("/***************kullanici////////"+kullanicci.skor);
				  System.out.println("toplamyahahmle"+toplamhamlesayısı);
				*/
				  
						       
			//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
			if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
			{
				//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
	
			}
						       
														
														}
													}
												
												}
                                           
												
											
										
											
											
												}
												
												
												
												
												
												
												
											});

										    								    
										    JLabel bilgisayarsecimkutu=new JLabel();
										    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
										    bilgisayarsecimdeger++;
										    bilgisayarsecimkutu.setBounds(600,280,100,30 );
										    JButton btn=new JButton("computer secimi");
										    btn.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													JLabel label1 = new JLabel();
													label1.setFont(new Font("Calibri",Font.PLAIN,20));
													label1.setText(kopya.get(0));
													label1.setBounds(700, 200, 300, 40);
													JLabel label2 = new JLabel();
													label2.setFont(new Font("Calibri",Font.PLAIN,20));
													label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
													label2.setBounds(700, 261, 300, 40);
													JLabel label3 = new JLabel();
													label3.setFont(new Font("Calibri",Font.PLAIN,20));
													label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
													label3.setBounds(700, 323, 300, 40);
													JLabel label4 = new JLabel();
													label4.setFont(new Font("Calibri",Font.PLAIN,50));
													label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
													//label4.setText(kopya.get(3));
													label4.setBounds(700, 384, 450, 80);
													JLabel label5 = new JLabel();
													label5.setFont(new Font("Calibri",Font.PLAIN,20));
													label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
													//label4.setText(kopya.get(3));
													label5.setBounds(700, 480, 450, 80);





													pencere3.add(label1);
													pencere3.add(label2);
													pencere3.add(label3);
													pencere3.add(label4);
													pencere3.add(label5);
												}
											});
										    
										    btn.setBounds(500,280,130,30);
										    
										    
										    
										    
										    
										    
										    
											    
										    
							  
										yaziJLabel.setText("kullanıcıvsbilgisayar");
										yaziJLabel.setBounds(500,200,150,30);
										pencere3.add(btn5);
										pencere3.add(btn4);
										pencere3.add(btn3);
										pencere3.add(btn2);
										pencere3.add(btn1);
										pencere3.add(btn);
										pencere3.add(bilgisayarsecimkutu);
										pencere3.setSize(1000,500);
										pencere3.setLayout(null);	
										pencere3.setVisible(true);
										
									
									    
										
										
										
									}
								});
							 
								buton2.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										 tasart=1;
										 kagıtart=1;
										 makasart=1;
										String tmp="kağıt"+(nesnesayısı2+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
											nesnesayısı++; 
										    nesnesayısı2++;
										nesneolustur nesne2=new nesneolustur();
										System.out.println(nesne2.x);
										System.out.println("kağıt");
										
										System.out.println(nesnesayısı);
										

										JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
										JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
										JTextArea oyuncuadiveıdArea=new JTextArea();
									   JButton adButton=new JButton();
										adButton.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String areatextString=oyuncuadiveıdArea.getText();
												String dizi[]=areatextString.split("-");
												kullanicci.oyuncuAdi=dizi[0];
												kullanicci.oyuncuID=dizi[1];
												
												System.out.println("kullaniciad:"+dizi[0]);
												System.out.println("kullaniciid:"+dizi[1]);
												
											}
										});
										bilgiJLabel.setBounds(140,30,100,30);
										adButton.setBounds(465,30,10,10);
										oyuncuadiveıdArea.setBounds(240,30,200,30);
										pencere3.add(adButton);
										pencere3.add(bilgiJLabel);
										pencere3.add(oyuncuadiveıdArea);
										JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
										JTextArea oyuncuadiveıdArea2=new JTextArea();
									   JButton adButton2=new JButton();
										adButton2.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String areatextString2=oyuncuadiveıdArea2.getText();
												String dizi2[]=areatextString2.split("-");
												bilgisayar.oyuncuAdi=dizi2[0];
												bilgisayar.oyuncuID=dizi2[1];
												
												System.out.println("bilgisayarad:"+dizi2[0]);
												System.out.println("bilgisayarid:"+dizi2[1]);
												
											}
										});
										   
										bilgiJLabel2.setBounds(480,30,100,30);
										adButton2.setBounds(800,30,10,10);
										oyuncuadiveıdArea2.setBounds(590,30,200,30);
										pencere3.add(adButton2);
										pencere3.add(bilgiJLabel2);
										pencere3.add(oyuncuadiveıdArea2);

										
										
										
										
										JLabel yaziJLabel=new JLabel();
										 JButton btn1=new JButton();
										    btn1.setText(nesneler.get(0));
										    btn1.setBounds(300,193,80,20);
										    btn1.addActionListener(new ActionListener() {
												public int x =1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													
													

													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(1));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(1));
													if(tasart<=5&&nesneler.get(1).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t11=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                         kullanıcınesnelerinartımı++;
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t22=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 	    
								                     kullanıcınesnlelerArrayList.add(t22);
                                                     kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t33=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t33);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t44=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t44);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t55=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t55);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
													 tasart++;
													System.out.print("----------------tasartalt"+tasart);
													System.out.println();
													}
													if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k11=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k11);
                                                 kullanıcınesnelerinartımı++;
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k22=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                      	    
								           System.out.println("--------k2");
								           kullanıcınesnlelerArrayList.add(k22);
                                           kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k33=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k33);
                                                             kullanıcınesnelerinartımı++;
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k44=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k44);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k55=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k55);
                                                             kullanıcınesnelerinartımı++;
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(1).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m11=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m22=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                            kullanıcınesnlelerArrayList.add(m22);
								                            kullanıcınesnelerinartımı++;
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m33=new makas(); 
								                			//System.out.println("x3"
								                            kullanıcınesnlelerArrayList.add(m33);
								                            kullanıcınesnelerinartımı++;
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m44=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m44);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m55=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m55);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 makasart++;
													 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													}
													x++;
													//System.out.println(y);
													if(x%2==0)
													{
														
													btn1.setEnabled(false);
													}	
													
												
													
												}
											});
							          
										    JButton btn2=new JButton();
										    btn2.setText(nesneler.get(1));
										    btn2.setBounds(300,230,80,20);
										    btn2.addActionListener(new ActionListener() {
										    	
												public int y=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(1));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(1));
													if(tasart<=5&&nesneler.get(1).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t11=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                         kullanıcınesnelerinartımı++;
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t22=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 	    
								                     kullanıcınesnlelerArrayList.add(t22);
                                                     kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t33=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t33);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t44=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t44);
                                                             kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t55=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t55);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
													 tasart++;
													System.out.print("----------------tasartalt"+tasart);
													System.out.println();
													}
													if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k11=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k11);
                                                 kullanıcınesnelerinartımı++;
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k22=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                      	    
								           System.out.println("--------k2");
								           kullanıcınesnlelerArrayList.add(k22);
                                           kullanıcınesnelerinartımı++;
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k33=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k33);
                                                             kullanıcınesnelerinartımı++;
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k44=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k44);
                                                             kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k55=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k55);
                                                             kullanıcınesnelerinartımı++;
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(1).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m11=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m22=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                            kullanıcınesnlelerArrayList.add(m22);
								                            kullanıcınesnelerinartımı++;
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m33=new makas(); 
								                			//System.out.println("x3"
								                            kullanıcınesnlelerArrayList.add(m33);
								                            kullanıcınesnelerinartımı++;
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m44=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m44);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m55=new makas(); 
								                            kullanıcınesnlelerArrayList.add(m55);
								                            kullanıcınesnelerinartımı++;
								                			//System.out.println("x5");
								                		 }
													 makasart++;
													 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													}
													y++;
													System.out.println(y);
													if(y%2==0)
													{
														
													btn2.setEnabled(false);
													}	
													
												
												}
											});
										    JButton btn3=new JButton();
										    btn3.setText(nesneler.get(2));
										    btn3.setBounds(300,270,80,20);
										    btn3.addActionListener(new ActionListener() {
												public int z=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
													kullanıcınesneADArrayList.add(nesneler.get(2));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(2));
													if(tasart<=5&&nesneler.get(2).contains("tas"))
													{
													 if(tasart==1)
								                	    { tas t111=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t222=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 
								                     kullanıcınesnlelerArrayList.add(t222);
								           
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t333=new tas(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(t333);
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t444=new tas(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(t444);
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t555=new tas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(t555);
								                		 }
													 tasart++;
													
													}
													if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k111=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k111);
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k222=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(k222);
								           System.out.println("--------k2");
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k333=new kagit(); 
								                			//System.out.println("x3");
								                			 kullanıcınesnlelerArrayList.add(k333);
								                			System.out.println("-----k3");
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k444=new kagit(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(k444);
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k555=new kagit(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(k555);
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(2).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m111=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m222=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(m222);
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m333=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m333);
								                			//System.out.println("x3");
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m444=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m555=new makas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(m555);
								                		 }
													 makasart++;
													
													}
													System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													z++;
													System.out.println(z);
													if(z%2==0)
													{
														
													btn3.setEnabled(false);
													}	
													
												}
											});
										    JButton btn4=new JButton();
										    btn4.setText(nesneler.get(3));
										    btn4.setBounds(300,310,80,20);
										    btn4.addActionListener(new ActionListener() {
												public int q=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													toplamhamlesayısı++;
													
													
													
													kullanıcınesneADArrayList.add(nesneler.get(3));
													System.out.println("--------------------------------tasart"+tasart);
													kullanıcınesneADArrayList.add(nesneler.get(3));
													if(tasart<=5&&nesneler.get(3).contains("tas"))
													{
													 if(tasart==1)
								                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
								                	    tas t1111=new tas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
												
								                	    }
								                		 else if(tasart==2)
								                		 {
								                			tas t2222=new tas(); 
								                			//System.out.println("-----------------------------------tas2");
								                     System.out.println("-----------t2"); 
								                     kullanıcınesnlelerArrayList.add(t2222);
								           
								                		 }
								                		 else if(tasart==3)
								                		 {
								                			tas t3333=new tas();
								                			 kullanıcınesnlelerArrayList.add(t3333);
								                			//System.out.println("x3");
								                		 }
								                		 else if(tasart==4)
								                		 {
								                			tas t4444=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t4444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(tasart==5)
								                		 {
								                			tas t5555=new tas(); 
								                			 kullanıcınesnlelerArrayList.add(t5555);
								                			//System.out.println("x5");
								                		 }
													 tasart++;
													
													}
													if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
													{
													 if(kagıtart==1)
								                	    { kagit k1111=new kagit();
								                	       //System.out.println("-----------------------------------tas1");
												System.out.println("------k1");
												 kullanıcınesnlelerArrayList.add(k1111);
								                	    }
								                		 else if(kagıtart==2)
								                		 {
								                			kagit k2222=new kagit(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(k2222);
								           System.out.println("--------k2");
								                		 }
								                		 else if(kagıtart==3)
								                		 {
								                			kagit k3333=new kagit(); 
								                			//System.out.println("x3");
								                			System.out.println("-----k3");
								                			 kullanıcınesnlelerArrayList.add(k3333);
								                		 }
								                		 else if(kagıtart==4)
								                		 {
								                			kagit k4444=new kagit(); 
								                			//System.out.println("x4");
								                			 kullanıcınesnlelerArrayList.add(k4444);
								                		 }
								                		 else if(kagıtart==5)
								                		 {
								                			kagit k5555=new kagit(); 
								                			 kullanıcınesnlelerArrayList.add(k5555);
								                			//System.out.println("x5");
								                		 }
													 kagıtart++;
													
													}
													if(makasart<=5&&nesneler.get(3).contains("makas"))
													{
													 if(makasart==1)
								                	    { makas m1111=new makas();
								                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
											
												
								                	    }
								                		 else if(makasart==2)
								                		 {
								                			makas m2222=new makas(); 
								                			//System.out.println("-----------------------------------tas2");
								                			 kullanıcınesnlelerArrayList.add(m2222);
								           System.out.println("---------m2");
								                		 }
								                		 else if(makasart==3)
								                		 {
								                			makas m3333=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m3333);
								                			//System.out.println("x3");
								                			System.out.println("m3");
								                		 }
								                		 else if(makasart==4)
								                		 {
								                			makas m4444=new makas(); 
								                			 kullanıcınesnlelerArrayList.add(m4444);
								                			//System.out.println("x4");
								                		 }
								                		 else if(makasart==5)
								                		 {
								                			makas m5555=new makas(); 
								                			//System.out.println("x5");
								                			 kullanıcınesnlelerArrayList.add(m5555);
								                		 }
													 makasart++;
													
													}
													System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													q++;
													
													//System.out.println("+++++193"+kullanıcınesneADArrayList);
													System.out.println(q);
													if(q%2==0)
													{
														
													btn4.setEnabled(false);
													}
													
												}
											});
										    JButton btn5=new JButton();
										    btn5.setText(nesneler.get(4));
										    btn5.setBounds(300,350,80,20);
										    btn5.addActionListener(new ActionListener() {
												public int w=1;
												@Override
												public void actionPerformed(ActionEvent e) {
													
													toplamhamlesayısı++;
													// TODO Auto-generated method stub
					
					kullanıcınesneADArrayList.add(nesneler.get(4));
					//burda gecerli	
					
					System.out.println("--------------------------------tasart5"+tasart);
					kullanıcınesneADArrayList.add(nesneler.get(4));
					if(tasart<=5&&nesneler.get(4).contains("tas"))
					{
					 if(tasart==1)
                	    { tas t11111=new tas();
                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");
kullanıcınesnlelerArrayList.add(t11111);
				
                	    }
                		 else if(tasart==2)
                		 {
                			tas t22222=new tas(); 
                			//System.out.println("-----------------------------------tas2");
                     System.out.println("-----------t2"); 	 
                     kullanıcınesnlelerArrayList.add(t22222);
           
                		 }
                		 else if(tasart==3)
                		 {
                			tas t33333=new tas(); 
                			   kullanıcınesnlelerArrayList.add(t33333);
                			//System.out.println("x3");
                		 }
                		 else if(tasart==4)
                		 {
                			tas t44444=new tas(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(t44444);
                		 }
                		 else if(tasart==5)
                		 {
                			tas t55555=new tas(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(t55555);
                		 }
					 tasart++;
					
					}
					if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
					{
					 if(kagıtart==1)
                	    { 
						 kagit k11111=new kagit();
                	       //System.out.println("-----------------------------------tas1");
				System.out.println("------k1");
				   kullanıcınesnlelerArrayList.add(k11111);
                	    }
                		 else if(kagıtart==2)
                		 {
                			kagit k22222=new kagit(); 
                			//System.out.println("-----------------------------------tas2");
                			   kullanıcınesnlelerArrayList.add(k22222);
                      	    
           System.out.println("--------k2");
                		 }
                		 else if(kagıtart==3)
                		 {
                			kagit k33333=new kagit(); 
                			//System.out.println("x3");
                			System.out.println("-----k3");
                			   kullanıcınesnlelerArrayList.add(k33333);
                		 }
                		 else if(kagıtart==4)
                		 {
                			kagit k44444=new kagit(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(k44444);
                		 }
                		 else if(kagıtart==5)
                		 {
                			kagit k55555=new kagit(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(k55555);
                		 }
					 kagıtart++;
					
					}
					if(makasart<=5&&nesneler.get(4).contains("makas"))
					{
					 if(makasart==1)
                	    { makas m11111=new makas();
                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");
kullanıcınesnlelerArrayList.add(m11111);
				
                	    }
                		 else if(makasart==2)
                		 {
                			makas m22222=new makas(); 
                			//System.out.println("-----------------------------------tas2");
                			   kullanıcınesnlelerArrayList.add(m22222);
           System.out.println("---------m2");
                		 }
                		 else if(makasart==3)
                		 {
                			makas m33333=new makas(); 
                			//System.out.println("x3");
                			System.out.println("m3");
                			   kullanıcınesnlelerArrayList.add(m33333);
                		 }
                		 else if(makasart==4)
                		 {
                			makas m44444=new makas(); 
                			//System.out.println("x4");
                			   kullanıcınesnlelerArrayList.add(m44444);
                		 }
                		 else if(makasart==5)
                		 {
                			makas m55555=new makas(); 
                			//System.out.println("x5");
                			   kullanıcınesnlelerArrayList.add(m55555);
                		 }
					 makasart++;
					//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
					System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
													w++;

													System.out.println(w);
													if(w%2==0)
													{
													btn5.setEnabled(false);
													}
													
													
													if(toplamhamlesayısı<hamlesayısı)
													{	btn1.setEnabled(true);
													 btn1.addActionListener(new ActionListener() {
															public int x =1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																
																if(toplamhamlesayısı>hamlesayısı)
																{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	
																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(0));
																if(tasart<=5&&nesneler.get(0).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t1=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");                          






		kullanıcınesnlelerArrayList.add(t1);
		                                                             kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t2=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 	
											                     kullanıcınesnlelerArrayList.add(t2);
		                                                         kullanıcınesnelerinartımı++;
											                    
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t3=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t3);
			                                                             kullanıcınesnelerinartımı++;
											                			
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t4=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t4);
			                                                             kullanıcınesnelerinartımı++;
											                		
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t5=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k1=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k1);
		                                                     kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k2=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k2);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("-----------------------------------tas2");
											                			
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k3=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k3);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x3");
											                			
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k4=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k4);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                			
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k5=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                			
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(0).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m1=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");
		kullanıcınesnlelerArrayList.add(m1);
		kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m2=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m2);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("-----------------------------------tas2");
											                      	    
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m3=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m3);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m4=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m4);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m5=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m5);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 makasart++;
																
																}
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																x++;
																System.out.println(x);
																if(x%2==0)
																{
																//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																
																	
																btn1.setEnabled(false);
																
																}	
																
															
															
															}
														});
										          
													}
															
															
													if(toplamhamlesayısı<hamlesayısı)
													{	btn2.setEnabled(true);
													  btn2.addActionListener(new ActionListener() {
													    	
															public int y=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																if(toplamhamlesayısı>hamlesayısı)
																{
																	int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		
																			bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																			//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		

																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																	//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																kullanıcınesneADArrayList.add(nesneler.get(1));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(1));
																if(tasart<=5&&nesneler.get(1).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t11=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
		                                                             kullanıcınesnelerinartımı++;
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t22=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 	    
											                     kullanıcınesnlelerArrayList.add(t22);
		                                                         kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t33=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t33);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t44=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t44);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t55=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t55);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																 tasart++;
																System.out.print("----------------tasartalt"+tasart);
																System.out.println();
																}
																if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k11=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k11);
		                                                     kullanıcınesnelerinartımı++;
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k22=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                      	    
											           System.out.println("--------k2");
											           kullanıcınesnlelerArrayList.add(k22);
		                                               kullanıcınesnelerinartımı++;
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k33=new kagit(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(k33);
			                                                             kullanıcınesnelerinartımı++;
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k44=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k44);
			                                                             kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k55=new kagit(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(k55);
			                                                             kullanıcınesnelerinartımı++;
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(1).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m11=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
		kullanıcınesnelerinartımı++;
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m22=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                            kullanıcınesnlelerArrayList.add(m22);
											                            kullanıcınesnelerinartımı++;
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m33=new makas(); 
											                			//System.out.println("x3"
											                            kullanıcınesnlelerArrayList.add(m33);
											                            kullanıcınesnelerinartımı++;
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m44=new makas(); 
											                            kullanıcınesnlelerArrayList.add(m44);
											                            kullanıcınesnelerinartımı++;
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m55=new makas(); 
											                            kullanıcınesnlelerArrayList.add(m55);
											                            kullanıcınesnelerinartımı++;
											                			//System.out.println("x5");
											                		 }
																 makasart++;
																 if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																}
																y++;
																System.out.println(y);
																if(y%2==0)
																{
																	
																btn2.setEnabled(false);
																}	
																
															}
														});
													}
													if(toplamhamlesayısı<hamlesayısı)
													{	btn3.setEnabled(true);
													 btn3.addActionListener(new ActionListener() {
															public int z=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}	
																	//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
																kullanıcınesneADArrayList.add(nesneler.get(2));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(2));
																if(tasart<=5&&nesneler.get(2).contains("tas"))
																{
																 if(tasart==1)
											                	    { tas t111=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t222=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 
											                     kullanıcınesnlelerArrayList.add(t222);
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t333=new tas(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(t333);
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t444=new tas(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(t444);
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t555=new tas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(t555);
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k111=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k111);
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k222=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(k222);
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k333=new kagit(); 
											                			//System.out.println("x3");
											                			 kullanıcınesnlelerArrayList.add(k333);
											                			System.out.println("-----k3");
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k444=new kagit(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(k444);
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k555=new kagit(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(k555);
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(2).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m111=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m222=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(m222);
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m333=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m333);
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m444=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m555=new makas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(m555);
											                		 }
																 makasart++;
																
																}
																System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																z++;
																System.out.println(z);
																if(z%2==0)
																{
																	
																btn3.setEnabled(false);
																}	
																
															}
														});
													}
													
													if(toplamhamlesayısı<hamlesayısı)
													{	btn4.setEnabled(true);
													btn4.addActionListener(new ActionListener() {
														public int q=1;
														@Override
														public void actionPerformed(ActionEvent e) {
															
															
															// TODO Auto-generated method stub
															if(toplamhamlesayısı>hamlesayısı)
															{int bilgisayartoplamdayanıklılık=0;
														    int kullanıcıtoplamdayanıklılık=0;
															for(int don=0;don<computerrandomsınıfArrayList.size();don++)
															{
															bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
															}
															
															for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
															{
															kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
															}
															

															if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
															{
																
																JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
															}
																
															else	
															{
																JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																
															}
																										
																
																//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
															}
															
															toplamhamlesayısı++;
															
															
															
															kullanıcınesneADArrayList.add(nesneler.get(3));
															System.out.println("--------------------------------tasart"+tasart);
															kullanıcınesneADArrayList.add(nesneler.get(3));
															if(tasart<=5&&nesneler.get(3).contains("tas"))
															{
															 if(tasart==1)
										                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
										                	    tas t1111=new tas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
														
										                	    }
										                		 else if(tasart==2)
										                		 {
										                			tas t2222=new tas(); 
										                			//System.out.println("-----------------------------------tas2");
										                     System.out.println("-----------t2"); 
										                     kullanıcınesnlelerArrayList.add(t2222);
										           
										                		 }
										                		 else if(tasart==3)
										                		 {
										                			tas t3333=new tas();
										                			 kullanıcınesnlelerArrayList.add(t3333);
										                			//System.out.println("x3");
										                		 }
										                		 else if(tasart==4)
										                		 {
										                			tas t4444=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(tasart==5)
										                		 {
										                			tas t5555=new tas(); 
										                			 kullanıcınesnlelerArrayList.add(t5555);
										                			//System.out.println("x5");
										                		 }
															 tasart++;
															
															}
															if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
															{
															 if(kagıtart==1)
										                	    { kagit k1111=new kagit();
										                	       //System.out.println("-----------------------------------tas1");
														System.out.println("------k1");
														 kullanıcınesnlelerArrayList.add(k1111);
										                	    }
										                		 else if(kagıtart==2)
										                		 {
										                			kagit k2222=new kagit(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(k2222);
										           System.out.println("--------k2");
										                		 }
										                		 else if(kagıtart==3)
										                		 {
										                			kagit k3333=new kagit(); 
										                			//System.out.println("x3");
										                			System.out.println("-----k3");
										                			 kullanıcınesnlelerArrayList.add(k3333);
										                		 }
										                		 else if(kagıtart==4)
										                		 {
										                			kagit k4444=new kagit(); 
										                			//System.out.println("x4");
										                			 kullanıcınesnlelerArrayList.add(k4444);
										                		 }
										                		 else if(kagıtart==5)
										                		 {
										                			kagit k5555=new kagit(); 
										                			 kullanıcınesnlelerArrayList.add(k5555);
										                			//System.out.println("x5");
										                		 }
															 kagıtart++;
															
															}
															if(makasart<=5&&nesneler.get(3).contains("makas"))
															{
															 if(makasart==1)
										                	    { makas m1111=new makas();
										                	       //System.out.println("-----------------------------------tas1");
	System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
													
														
										                	    }
										                		 else if(makasart==2)
										                		 {
										                			makas m2222=new makas(); 
										                			//System.out.println("-----------------------------------tas2");
										                			 kullanıcınesnlelerArrayList.add(m2222);
										           System.out.println("---------m2");
										                		 }
										                		 else if(makasart==3)
										                		 {
										                			makas m3333=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m3333);
										                			//System.out.println("x3");
										                			System.out.println("m3");
										                		 }
										                		 else if(makasart==4)
										                		 {
										                			makas m4444=new makas(); 
										                			 kullanıcınesnlelerArrayList.add(m4444);
										                			//System.out.println("x4");
										                		 }
										                		 else if(makasart==5)
										                		 {
										                			makas m5555=new makas(); 
										                			//System.out.println("x5");
										                			 kullanıcınesnlelerArrayList.add(m5555);
										                		 }
															 makasart++;
															
															}
															System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
															
															if(toplamhamlesayısı==hamlesayısı)
															{	
																	for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																	{
																		for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																		{
																			if(i==j)
																			{ 
																	double saldıranetki=0;
																    double savunanetki=0;
															        int seviyepuanartis=0;		
											saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
											seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
									        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
											int seviyepuanartis2=0;		
											savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
											seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
											kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
											
					//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
										
									System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
									// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
									  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
									 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
									
									  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
									  {
										  computerrandomsınıfArrayList.remove(i);
										  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
										  {
											  agirtas agirtas1=new agirtas();
										  }
										  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
										  {
											  
											  Özelkagit özelkagit1=new Özelkagit();
										  }
										  else {
											  
												  ustamakas ustamakas1=new ustamakas();
											  
										}
									  }
									  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
									  {
										  kullanıcınesnlelerArrayList.remove(i);
									  }
									  
									  if(computerrandomsınıfArrayList.isEmpty())
									  {
										  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
										  
									  }
									  if(kullanıcınesnlelerArrayList.isEmpty())
									  {
										  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
									  }					  
									  
									  
									  
									  
									/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
											  {
										  //tasbilgisayar.
										  System.out.println("bilgisayar sakor art");
										  bilgisayar.skor++;
										  
											  }
									  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
											{
										System.out.println("kullanicci skor art");
										kullanicci.skor++;
									}
									  */
									  
									  
									  
									/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
									  System.out.println("/***************kullanici////////"+kullanicci.skor);
									  System.out.println("toplamyahahmle"+toplamhamlesayısı);
									*/
									  
											       
								//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
								if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
								{
									//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
						
								}
											       
																			
																			}
																		}
																	
																	}
					                                           }
															q++;
															
															//System.out.println("+++++193"+kullanıcınesneADArrayList);
															System.out.println(q);
															if(q%2==0)
															{
																
															btn4.setEnabled(false);
															}
															
														}
													});
													}
													if(toplamhamlesayısı<hamlesayısı)
													{	btn5.setEnabled(true);
													 btn5.addActionListener(new ActionListener() {
															public int w=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}
																											
																	
																	//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																}
																toplamhamlesayısı++;
																// TODO Auto-generated method stub
								
								kullanıcınesneADArrayList.add(nesneler.get(4));
								//burda gecerli	
								
								System.out.println("--------------------------------tasart5"+tasart);
								kullanıcınesneADArrayList.add(nesneler.get(4));
								if(tasart<=5&&nesneler.get(4).contains("tas"))
								{
								 if(tasart==1)
			                	    { tas t11111=new tas();
			                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1");
		kullanıcınesnlelerArrayList.add(t11111);
							
			                	    }
			                		 else if(tasart==2)
			                		 {
			                			tas t22222=new tas(); 
			                			//System.out.println("-----------------------------------tas2");
			                     System.out.println("-----------t2"); 	 
			                     kullanıcınesnlelerArrayList.add(t22222);
			           
			                		 }
			                		 else if(tasart==3)
			                		 {
			                			tas t33333=new tas(); 
			                			   kullanıcınesnlelerArrayList.add(t33333);
			                			//System.out.println("x3");
			                		 }
			                		 else if(tasart==4)
			                		 {
			                			tas t44444=new tas(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(t44444);
			                		 }
			                		 else if(tasart==5)
			                		 {
			                			tas t55555=new tas(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(t55555);
			                		 }
								 tasart++;
								
								}
								if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
								{
								 if(kagıtart==1)
			                	    { 
									 kagit k11111=new kagit();
			                	       //System.out.println("-----------------------------------tas1");
							System.out.println("------k1");
							   kullanıcınesnlelerArrayList.add(k11111);
			                	    }
			                		 else if(kagıtart==2)
			                		 {
			                			kagit k22222=new kagit(); 
			                			//System.out.println("-----------------------------------tas2");
			                			   kullanıcınesnlelerArrayList.add(k22222);
			                      	    
			           System.out.println("--------k2");
			                		 }
			                		 else if(kagıtart==3)
			                		 {
			                			kagit k33333=new kagit(); 
			                			//System.out.println("x3");
			                			System.out.println("-----k3");
			                			   kullanıcınesnlelerArrayList.add(k33333);
			                		 }
			                		 else if(kagıtart==4)
			                		 {
			                			kagit k44444=new kagit(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(k44444);
			                		 }
			                		 else if(kagıtart==5)
			                		 {
			                			kagit k55555=new kagit(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(k55555);
			                		 }
								 kagıtart++;
								
								}
								if(makasart<=5&&nesneler.get(4).contains("makas"))
								{
								 if(makasart==1)
			                	    { makas m11111=new makas();
			                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m");
		kullanıcınesnlelerArrayList.add(m11111);
							
			                	    }
			                		 else if(makasart==2)
			                		 {
			                			makas m22222=new makas(); 
			                			//System.out.println("-----------------------------------tas2");
			                			   kullanıcınesnlelerArrayList.add(m22222);
			           System.out.println("---------m2");
			                		 }
			                		 else if(makasart==3)
			                		 {
			                			makas m33333=new makas(); 
			                			//System.out.println("x3");
			                			System.out.println("m3");
			                			   kullanıcınesnlelerArrayList.add(m33333);
			                		 }
			                		 else if(makasart==4)
			                		 {
			                			makas m44444=new makas(); 
			                			//System.out.println("x4");
			                			   kullanıcınesnlelerArrayList.add(m44444);
			                		 }
			                		 else if(makasart==5)
			                		 {
			                			makas m55555=new makas(); 
			                			//System.out.println("x5");
			                			   kullanıcınesnlelerArrayList.add(m55555);
			                		 }
								 makasart++;
								//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
		}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
								System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
								if(toplamhamlesayısı==hamlesayısı)
								{	
										for(int i=0;i<computerrandomsınıfArrayList.size();i++)
										{
											for(int j=0;j<computerrandomsınıfArrayList.size();j++)
											{
												if(i==j)
												{ 
										double saldıranetki=0;
									    double savunanetki=0;
								        int seviyepuanartis=0;		
				saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
				seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
		        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
				int seviyepuanartis2=0;		
				savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
				seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
				kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
				
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
			
		System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
		// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
		  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
		 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
		
		  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
		  {
			  computerrandomsınıfArrayList.remove(i);
			  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
			  {
				  agirtas agirtas1=new agirtas();
			  }
			  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
			  {
				  
				  Özelkagit özelkagit1=new Özelkagit();
			  }
			  else {
				  
					  ustamakas ustamakas1=new ustamakas();
				  
			}
		  }
		  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
		  {
			  kullanıcınesnlelerArrayList.remove(i);
		  }
		  
		  if(computerrandomsınıfArrayList.isEmpty())
		  {
			  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
			  
		  }
		  if(kullanıcınesnlelerArrayList.isEmpty())
		  {
			  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
		  }					  
		  
		  
		  
		  
		/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
				  {
			  //tasbilgisayar.
			  System.out.println("bilgisayar sakor art");
			  bilgisayar.skor++;
			  
				  }
		  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
				{
			System.out.println("kullanicci skor art");
			kullanicci.skor++;
		}
		  */
		  
		  
		  
		/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
		  System.out.println("/***************kullanici////////"+kullanicci.skor);
		  System.out.println("toplamyahahmle"+toplamhamlesayısı);
		*/
		  
				       
	//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
	if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
	{
		//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

	}
				       
												
												}
											}
										
										}
                                   }								
								w++;

																System.out.println(w);
																if(w%2==0)
																{
																btn5.setEnabled(false);
																}
															}
															});
													}
												
												
													
													
									
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
												
										
												
												
												
										
											for(int i=0;i<computerrandomsınıfArrayList.size();i++)
												{
													for(int j=0;j<computerrandomsınıfArrayList.size();j++)
													{
														if(i==j)
														{ 
												double saldıranetki=0;
											    double savunanetki=0;
										        int seviyepuanartis=0;		
						saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
						seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
				        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
						int seviyepuanartis2=0;		
						savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
						seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
						kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
						
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
					
				System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
				// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
				  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
				 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
				
				  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
				  {
					  computerrandomsınıfArrayList.remove(i);
					  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
					  {
						  agirtas agirtas1=new agirtas();
					  }
					  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
					  {
						  
						  Özelkagit özelkagit1=new Özelkagit();
					  }
					  else {
						  
							  ustamakas ustamakas1=new ustamakas();
						  
					}
				  }
				  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
				  {
					  kullanıcınesnlelerArrayList.remove(i);
				  }
				  
				  if(computerrandomsınıfArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
					 
				  }
				  if(kullanıcınesnlelerArrayList.isEmpty())
				  {
					  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
					
				  }					  
				  
				  
				  
				  
				/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						  {
					  //tasbilgisayar.
					  System.out.println("bilgisayar sakor art");
					  bilgisayar.skor++;
					  
						  }
				  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
						{
					System.out.println("kullanicci skor art");
					kullanicci.skor++;
				}
				  */
				  
				  
				  
				/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
				  System.out.println("/***************kullanici////////"+kullanicci.skor);
				  System.out.println("toplamyahahmle"+toplamhamlesayısı);
				*/
				  
						       
			//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
			if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
			{
				//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
	
			}
						       
														
														}
													}
												
												}
                                           
												
											
										
											
											
												}
												
												
												
												
												
												
												
											});

										
										
										
										
										
										
										
										
										    JLabel bilgisayarsecimkutu=new JLabel();
										    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
										    bilgisayarsecimdeger++;
										    bilgisayarsecimkutu.setBounds(600,280,100,30 );
										    JButton btn=new JButton("computer secimi");
										    btn.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													JLabel label1 = new JLabel();
													label1.setFont(new Font("Calibri",Font.PLAIN,20));
													label1.setText(kopya.get(0));
													label1.setBounds(700, 200, 300, 40);
													JLabel label2 = new JLabel();
													label2.setFont(new Font("Calibri",Font.PLAIN,20));
													label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
													label2.setBounds(700, 261, 300, 40);
													JLabel label3 = new JLabel();
													label3.setFont(new Font("Calibri",Font.PLAIN,20));
													label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
													label3.setBounds(700, 323, 300, 40);
													JLabel label4 = new JLabel();
													label4.setFont(new Font("Calibri",Font.PLAIN,50));
													label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
													//label4.setText(kopya.get(3));
													label4.setBounds(700, 384, 450, 80);
													JLabel label5 = new JLabel();
													label5.setFont(new Font("Calibri",Font.PLAIN,20));
													label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
													//label4.setText(kopya.get(3));
													label5.setBounds(700, 480, 450, 80);






													pencere3.add(label1);
													pencere3.add(label2);
													pencere3.add(label3);
													pencere3.add(label4);
													pencere3.add(label5);
												}
											});
										    
										    btn.setBounds(500,280,130,30);
										   
							    
										
										yaziJLabel.setText("kullanıcıvsbilgisayar");
										yaziJLabel.setBounds(500,200,150,30);
										pencere3.add(btn5);
										pencere3.add(btn4);
										pencere3.add(btn3);
										pencere3.add(btn2);
										pencere3.add(btn1);
										pencere3.add(btn);
										pencere3.add(bilgisayarsecimkutu);
										pencere3.setSize(1000,500);
										pencere3.setLayout(null);	
										pencere3.setVisible(true);
										if(gir2==1)
										{ int tart=1,kart=1,mart=1,bak=1;
						                 for(int i=0;i<nesneler.size();i++)
						                 {   System.out.println(nesneler.get(i));
						                	 if(nesneler.get(i).contains("tas"))
						                	 {  
						                		 if(tart==1)
						                	    { tas x1=new tas();
						                	    

						                	    }
						                		 else if(tart==2)
						                		 {
						                			tas x2=new tas(); 
						                			
						                      	    
						           
						                		 }
						                		 else if(tart==3)
						                		 {
						                			tas x3=new tas(); 
						                			
						                		 }
						                		 else if(tart==4)
						                		 {
						                			tas x4=new tas(); 
						                			
						                		 }
						                		 else if(tart==5)
						                		 {
						                			tas x5=new tas(); 
						                			
						                		 }
						                		 else if(tart==6)
						                		 {
						                			tas x6=new tas(); 
						                		 }
						                		 else if(tart==7)
						                		 {
						                			tas x7=new tas(); 
						                		 }
						                		 else if(tart==8)
						                		 {
						                			tas x8=new tas(); 
						                		 }
						                		 else if(tart==9)
						                		 {
						                			tas x9=new tas(); 
						                		 }
						                		 else if(tart==10)
						                		 {
						                			tas x10=new tas(); 
						                		 }else if(tart==11)
						                		 {
						                			tas x11=new tas(); 
						                		 }
						                		 else if(tart==12)
						                		 {
						                			tas x12=new tas(); 
						                		 }
						                	     tart++;
						                		 System.out.println("                    t");
						                	 }
						                	 else if(nesneler.get(i).contains("kagıt"))
						                	 {
						                		 
						                		 if(kart==1)
						                 	    { kagit y1=new kagit();
						                 	    }
						                 		 else if(kart==2)
						                 		 {
						                 			kagit y2=new kagit(); 
						                 		 }
						                 		else if(kart==3)
						                		 {
						                			kagit y3=new kagit(); 
						                		 }
						                 		else if(kart==4)
						                		 {
						                			kagit y4=new kagit(); 
						                		 }
						                 		else if(kart==5)
						                		 {
						                			kagit y5=new kagit(); 
						                		 }
						                 		else if(kart==6)
						                		 {
						                			kagit y6=new kagit(); 
						                		 }
						                 		else if(kart==7)
						                		 {
						                			kagit y7=new kagit(); 
						                		 }
						                 		else if(kart==8)
						                		 {
						                			kagit y8=new kagit(); 
						                		 }
						                 		else if(kart==9)
						                		 {
						                			kagit y9=new kagit(); 
						                		 }
						                 		else if(kart==10)
						                		 {
						                			kagit y10=new kagit(); 
						                		 }
						                 		
						                 	     kart++;
						                		 
						                		 
						                		 
						                		System.out.println("                         k"); 
						                	 }
						                	 else {
						                		 if(mart==1)
						                  	    { makas z1=new makas();
						                  	    }
						                  		 else if(mart==2)
						                  		 {
						                  			makas z2=new makas(); 
						                  		 }
						                  		else if(mart==3)
						                 		 {
						                 			makas z3=new makas(); 
						                 		 }
						                  		 else if(mart==4)
						                  		 {
						                  			makas z4=new makas(); 
						                  		 }
						                  		else if(mart==5)
						                 		 {
						                 			makas z5=new makas(); 
						                 		 } else if(mart==6)
						                  		 {
						                  			makas z6=new makas(); 
						                  		 }
						                  		else if(mart==7)
						                 		 {
						                 			makas z7=new makas(); 
						                 		 } else if(mart==8)
						                  		 {
						                  			makas z8=new makas(); 
						                  		 }
						                  		else if(mart==9)
						                 		 {
						                 			makas z9=new makas(); 
						                 		 }
						                		 mart++;
											System.out.println("                              m");	
											}
						                 }	 
										gir2++;
										}
									
										
										
										
									}
								});
							 
								buton3.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
									tasart=1;
									makasart=1;
									kagıtart=1;
										String tmp="makas"+(nesnesayısı3+1);
										nesneler.add(tmp);
										System.out.println("--->"+nesneler.get(nesnesayısı));
										nesneolustur.nesnelerlistesi.add(nesneler.get(nesnesayısı));
									   nesnesayısı++;
										nesnesayısı3++;
										nesneolustur nesne3=new nesneolustur();
										System.out.println(nesne3.x);
										System.out.println("makas");
										System.out.println(nesnesayısı);

										 JFrame pencere3=new JFrame("kullanıcıvsbilgisayar");
											JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea=new JTextArea();
										   JButton adButton=new JButton();
											adButton.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString=oyuncuadiveıdArea.getText();
													String dizi[]=areatextString.split("-");
													kullanicci.oyuncuAdi=dizi[0];
													kullanicci.oyuncuID=dizi[1];
													
													System.out.println("kullaniciad:"+dizi[0]);
													System.out.println("kullaniciid:"+dizi[1]);
													
												}
											});
											bilgiJLabel.setBounds(140,30,100,30);
											adButton.setBounds(465,30,10,10);
											oyuncuadiveıdArea.setBounds(240,30,200,30);
											pencere3.add(adButton);
											pencere3.add(bilgiJLabel);
											pencere3.add(oyuncuadiveıdArea);
											JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
											JTextArea oyuncuadiveıdArea2=new JTextArea();
										   JButton adButton2=new JButton();
											adButton2.addActionListener(new ActionListener() {
												
												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													
													String areatextString2=oyuncuadiveıdArea2.getText();
													String dizi2[]=areatextString2.split("-");
													bilgisayar.oyuncuAdi=dizi2[0];
													bilgisayar.oyuncuID=dizi2[1];
													
													System.out.println("bilgisayarad:"+dizi2[0]);
													System.out.println("bilgisayarid:"+dizi2[1]);
													
												}
											});
											   
											bilgiJLabel2.setBounds(480,30,100,30);
											adButton2.setBounds(800,30,10,10);
											oyuncuadiveıdArea2.setBounds(590,30,200,30);
											pencere3.add(adButton2);
											pencere3.add(bilgiJLabel2);
											pencere3.add(oyuncuadiveıdArea2);
											
										 
										 
								
											
											JLabel yaziJLabel=new JLabel();
											 JButton btn1=new JButton();
											    btn1.setText(nesneler.get(0));
											    btn1.setBounds(300,193,80,20);
											    btn1.addActionListener(new ActionListener() {
													public int x =1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														
														

														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                            kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                        kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                    kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                              kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														x++;
														//System.out.println(y);
														if(x%2==0)
														{
															
														btn1.setEnabled(false);
														}	
														
													
														
													}
												});
								          
											    JButton btn2=new JButton();
											    btn2.setText(nesneler.get(1));
											    btn2.setBounds(300,230,80,20);
											    btn2.addActionListener(new ActionListener() {
											    	
													public int y=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(1));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(1));
														if(tasart<=5&&nesneler.get(1).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t11=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
                                                            kullanıcınesnelerinartımı++;
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t22=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 	    
									                     kullanıcınesnlelerArrayList.add(t22);
                                                        kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t33=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t33);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t44=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t44);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t55=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t55);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
														 tasart++;
														System.out.print("----------------tasartalt"+tasart);
														System.out.println();
														}
														if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k11=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k11);
                                                    kullanıcınesnelerinartımı++;
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k22=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                      	    
									           System.out.println("--------k2");
									           kullanıcınesnlelerArrayList.add(k22);
                                              kullanıcınesnelerinartımı++;
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k33=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k33);
	                                                             kullanıcınesnelerinartımı++;
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k44=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k44);
	                                                             kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k55=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k55);
	                                                             kullanıcınesnelerinartımı++;
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(1).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m11=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
kullanıcınesnelerinartımı++;
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m22=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                            kullanıcınesnlelerArrayList.add(m22);
									                            kullanıcınesnelerinartımı++;
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m33=new makas(); 
									                			//System.out.println("x3"
									                            kullanıcınesnlelerArrayList.add(m33);
									                            kullanıcınesnelerinartımı++;
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m44=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m44);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m55=new makas(); 
									                            kullanıcınesnlelerArrayList.add(m55);
									                            kullanıcınesnelerinartımı++;
									                			//System.out.println("x5");
									                		 }
														 makasart++;
														 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														}
														y++;
														System.out.println(y);
														if(y%2==0)
														{
															
														btn2.setEnabled(false);
														}	
														
													
													}
												});
											    JButton btn3=new JButton();
											    btn3.setText(nesneler.get(2));
											    btn3.setBounds(300,270,80,20);
											    btn3.addActionListener(new ActionListener() {
													public int z=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
														kullanıcınesneADArrayList.add(nesneler.get(2));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(2));
														if(tasart<=5&&nesneler.get(2).contains("tas"))
														{
														 if(tasart==1)
									                	    { tas t111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t333=new tas(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(t333);
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t444=new tas(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(t444);
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t555=new tas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(t555);
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k333=new kagit(); 
									                			//System.out.println("x3");
									                			 kullanıcınesnlelerArrayList.add(k333);
									                			System.out.println("-----k3");
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k555=new kagit(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(k555);
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(2).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														z++;
														System.out.println(z);
														if(z%2==0)
														{
															
														btn3.setEnabled(false);
														}	
														
													}
												});
											    JButton btn4=new JButton();
											    btn4.setText(nesneler.get(3));
											    btn4.setBounds(300,310,80,20);
											    btn4.addActionListener(new ActionListener() {
													public int q=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														toplamhamlesayısı++;
														
														
														
														kullanıcınesneADArrayList.add(nesneler.get(3));
														System.out.println("--------------------------------tasart"+tasart);
														kullanıcınesneADArrayList.add(nesneler.get(3));
														if(tasart<=5&&nesneler.get(3).contains("tas"))
														{
														 if(tasart==1)
									                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
									                	    tas t1111=new tas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
													
									                	    }
									                		 else if(tasart==2)
									                		 {
									                			tas t2222=new tas(); 
									                			//System.out.println("-----------------------------------tas2");
									                     System.out.println("-----------t2"); 
									                     kullanıcınesnlelerArrayList.add(t2222);
									           
									                		 }
									                		 else if(tasart==3)
									                		 {
									                			tas t3333=new tas();
									                			 kullanıcınesnlelerArrayList.add(t3333);
									                			//System.out.println("x3");
									                		 }
									                		 else if(tasart==4)
									                		 {
									                			tas t4444=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(tasart==5)
									                		 {
									                			tas t5555=new tas(); 
									                			 kullanıcınesnlelerArrayList.add(t5555);
									                			//System.out.println("x5");
									                		 }
														 tasart++;
														
														}
														if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
														{
														 if(kagıtart==1)
									                	    { kagit k1111=new kagit();
									                	       //System.out.println("-----------------------------------tas1");
													System.out.println("------k1");
													 kullanıcınesnlelerArrayList.add(k1111);
									                	    }
									                		 else if(kagıtart==2)
									                		 {
									                			kagit k2222=new kagit(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(k2222);
									           System.out.println("--------k2");
									                		 }
									                		 else if(kagıtart==3)
									                		 {
									                			kagit k3333=new kagit(); 
									                			//System.out.println("x3");
									                			System.out.println("-----k3");
									                			 kullanıcınesnlelerArrayList.add(k3333);
									                		 }
									                		 else if(kagıtart==4)
									                		 {
									                			kagit k4444=new kagit(); 
									                			//System.out.println("x4");
									                			 kullanıcınesnlelerArrayList.add(k4444);
									                		 }
									                		 else if(kagıtart==5)
									                		 {
									                			kagit k5555=new kagit(); 
									                			 kullanıcınesnlelerArrayList.add(k5555);
									                			//System.out.println("x5");
									                		 }
														 kagıtart++;
														
														}
														if(makasart<=5&&nesneler.get(3).contains("makas"))
														{
														 if(makasart==1)
									                	    { makas m1111=new makas();
									                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
												
													
									                	    }
									                		 else if(makasart==2)
									                		 {
									                			makas m2222=new makas(); 
									                			//System.out.println("-----------------------------------tas2");
									                			 kullanıcınesnlelerArrayList.add(m2222);
									           System.out.println("---------m2");
									                		 }
									                		 else if(makasart==3)
									                		 {
									                			makas m3333=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m3333);
									                			//System.out.println("x3");
									                			System.out.println("m3");
									                		 }
									                		 else if(makasart==4)
									                		 {
									                			makas m4444=new makas(); 
									                			 kullanıcınesnlelerArrayList.add(m4444);
									                			//System.out.println("x4");
									                		 }
									                		 else if(makasart==5)
									                		 {
									                			makas m5555=new makas(); 
									                			//System.out.println("x5");
									                			 kullanıcınesnlelerArrayList.add(m5555);
									                		 }
														 makasart++;
														
														}
														System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														q++;
														
														//System.out.println("+++++193"+kullanıcınesneADArrayList);
														System.out.println(q);
														if(q%2==0)
														{
															
														btn4.setEnabled(false);
														}
														
													}
												});
											    JButton btn5=new JButton();
											    btn5.setText(nesneler.get(4));
											    btn5.setBounds(300,350,80,20);
											    btn5.addActionListener(new ActionListener() {
													public int w=1;
													@Override
													public void actionPerformed(ActionEvent e) {
														
														toplamhamlesayısı++;
														// TODO Auto-generated method stub
						
						kullanıcınesneADArrayList.add(nesneler.get(4));
						//burda gecerli	
						
						System.out.println("--------------------------------tasart5"+tasart);
						kullanıcınesneADArrayList.add(nesneler.get(4));
						if(tasart<=5&&nesneler.get(4).contains("tas"))
						{
						 if(tasart==1)
	                	    { tas t11111=new tas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("---------t1");
kullanıcınesnlelerArrayList.add(t11111);
					
	                	    }
	                		 else if(tasart==2)
	                		 {
	                			tas t22222=new tas(); 
	                			//System.out.println("-----------------------------------tas2");
	                     System.out.println("-----------t2"); 	 
	                     kullanıcınesnlelerArrayList.add(t22222);
	           
	                		 }
	                		 else if(tasart==3)
	                		 {
	                			tas t33333=new tas(); 
	                			   kullanıcınesnlelerArrayList.add(t33333);
	                			//System.out.println("x3");
	                		 }
	                		 else if(tasart==4)
	                		 {
	                			tas t44444=new tas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(t44444);
	                		 }
	                		 else if(tasart==5)
	                		 {
	                			tas t55555=new tas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(t55555);
	                		 }
						 tasart++;
						
						}
						if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
						{
						 if(kagıtart==1)
	                	    { 
							 kagit k11111=new kagit();
	                	       //System.out.println("-----------------------------------tas1");
					System.out.println("------k1");
					   kullanıcınesnlelerArrayList.add(k11111);
	                	    }
	                		 else if(kagıtart==2)
	                		 {
	                			kagit k22222=new kagit(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(k22222);
	                      	    
	           System.out.println("--------k2");
	                		 }
	                		 else if(kagıtart==3)
	                		 {
	                			kagit k33333=new kagit(); 
	                			//System.out.println("x3");
	                			System.out.println("-----k3");
	                			   kullanıcınesnlelerArrayList.add(k33333);
	                		 }
	                		 else if(kagıtart==4)
	                		 {
	                			kagit k44444=new kagit(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(k44444);
	                		 }
	                		 else if(kagıtart==5)
	                		 {
	                			kagit k55555=new kagit(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(k55555);
	                		 }
						 kagıtart++;
						
						}
						if(makasart<=5&&nesneler.get(4).contains("makas"))
						{
						 if(makasart==1)
	                	    { makas m11111=new makas();
	                	       //System.out.println("-----------------------------------tas1");
System.out.println("--------m");
kullanıcınesnlelerArrayList.add(m11111);
					
	                	    }
	                		 else if(makasart==2)
	                		 {
	                			makas m22222=new makas(); 
	                			//System.out.println("-----------------------------------tas2");
	                			   kullanıcınesnlelerArrayList.add(m22222);
	           System.out.println("---------m2");
	                		 }
	                		 else if(makasart==3)
	                		 {
	                			makas m33333=new makas(); 
	                			//System.out.println("x3");
	                			System.out.println("m3");
	                			   kullanıcınesnlelerArrayList.add(m33333);
	                		 }
	                		 else if(makasart==4)
	                		 {
	                			makas m44444=new makas(); 
	                			//System.out.println("x4");
	                			   kullanıcınesnlelerArrayList.add(m44444);
	                		 }
	                		 else if(makasart==5)
	                		 {
	                			makas m55555=new makas(); 
	                			//System.out.println("x5");
	                			   kullanıcınesnlelerArrayList.add(m55555);
	                		 }
						 makasart++;
						//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
						System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
														w++;

														System.out.println(w);
														if(w%2==0)
														{
														btn5.setEnabled(false);
														}
														
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn1.setEnabled(true);
														 btn1.addActionListener(new ActionListener() {
																public int x =1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{  System.out.println("*-*-*-*-**-*-*-*-*-*-*-*-"+toplamhamlesayısı);
																	//	JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																		for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																		{
																		bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																		}
																		
																		for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																		{
																		kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																		}
																		
																		if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																		{
																			
																			JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																			JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		}
																			
																		else	
																		{
																			JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																			JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			
																		}
																													
																			
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(0));
																	if(tasart<=5&&nesneler.get(0).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t1=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                          






			kullanıcınesnlelerArrayList.add(t1);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t2=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	
												                     kullanıcınesnlelerArrayList.add(t2);
			                                                         kullanıcınesnelerinartımı++;
												                    
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t3=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t3);
				                                                             kullanıcınesnelerinartımı++;
												                			
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t4=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t4);
				                                                             kullanıcınesnelerinartımı++;
												                		
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t5=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(0).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k1=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k1);
			                                                     kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k2=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                			
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k3=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k4=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                			
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k5=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                			
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(0).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m1=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m1);
			kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m2=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m2);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m3=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m3);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m4=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m4);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m5=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m5);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	
																	}
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	x++;
																	System.out.println(x);
																	if(x%2==0)
																	{
																	//kullanıcılisteleriADArrayList.set(ekle,nesneler.get(0));
																	
																		
																	btn1.setEnabled(false);
																	
																	}	
																	
																
																
																}
															});
											          
														}
																
																
														if(toplamhamlesayısı<hamlesayısı)
														{	btn2.setEnabled(true);
														  btn2.addActionListener(new ActionListener() {
														    	
																public int y=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	
																	if(toplamhamlesayısı>hamlesayısı)
																	{
																		int bilgisayartoplamdayanıklılık=0;
																	    int kullanıcıtoplamdayanıklılık=0;
																			for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																			{
																			
																				bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																				//JOptionPane.showInputDialog(null, "skor","**", kullanıcıtoplamdayanıklılık);
																			}
																			
																			for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																			{
																			kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																			}
																			

																			if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																			{
																				
																				JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																				JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																			}
																				
																			else	
																			{
																				JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																				JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																				
																			}
																														
																				
																		//JOptionPane.showConfirmDialog(null,"hamle sayısıtamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(1));
																	if(tasart<=5&&nesneler.get(1).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t11=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");                             kullanıcınesnlelerArrayList.add(t11);
			                                                             kullanıcınesnelerinartımı++;
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t22=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 	    
												                     kullanıcınesnlelerArrayList.add(t22);
			                                                         kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t33=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t33);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t44=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t44);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t55=new tas(); 
												                			 kullanıcınesnlelerArrayList.add(t55);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
																	 tasart++;
																	System.out.print("----------------tasartalt"+tasart);
																	System.out.println();
																	}
																	if(kagıtart<=5&&nesneler.get(1).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k11=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k11);
			                                                     kullanıcınesnelerinartımı++;
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k22=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                      	    
												           System.out.println("--------k2");
												           kullanıcınesnlelerArrayList.add(k22);
			                                               kullanıcınesnelerinartımı++;
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k33=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k33);
				                                                             kullanıcınesnelerinartımı++;
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k44=new kagit(); 
												                			 kullanıcınesnlelerArrayList.add(k44);
				                                                             kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k55=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k55);
				                                                             kullanıcınesnelerinartımı++;
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(1).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m11=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");                           kullanıcınesnlelerArrayList.add(m11);
			kullanıcınesnelerinartımı++;
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m22=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                            kullanıcınesnlelerArrayList.add(m22);
												                            kullanıcınesnelerinartımı++;
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m33=new makas(); 
												                			//System.out.println("x3"
												                            kullanıcınesnlelerArrayList.add(m33);
												                            kullanıcınesnelerinartımı++;
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m44=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m44);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m55=new makas(); 
												                            kullanıcınesnlelerArrayList.add(m55);
												                            kullanıcınesnelerinartımı++;
												                			//System.out.println("x5");
												                		 }
																	 makasart++;
																	 if(toplamhamlesayısı==hamlesayısı)
																		{	
																				for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																				{
																					for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																					{
																						if(i==j)
																						{ 
																				double saldıranetki=0;
																			    double savunanetki=0;
																		        int seviyepuanartis=0;		
														saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
														seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
												        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
														int seviyepuanartis2=0;		
														savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
														seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
														kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
														
								//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
													
												System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
												// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
												  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
												 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
												
												  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
												  {
													  computerrandomsınıfArrayList.remove(i);
													  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
													  {
														  agirtas agirtas1=new agirtas();
													  }
													  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
													  {
														  
														  Özelkagit özelkagit1=new Özelkagit();
													  }
													  else {
														  
															  ustamakas ustamakas1=new ustamakas();
														  
													}
												  }
												  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
												  {
													  kullanıcınesnlelerArrayList.remove(i);
												  }
												  
												  if(computerrandomsınıfArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
													  
												  }
												  if(kullanıcınesnlelerArrayList.isEmpty())
												  {
													  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
												  }					  
												  
												  
												  
												  
												/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														  {
													  //tasbilgisayar.
													  System.out.println("bilgisayar sakor art");
													  bilgisayar.skor++;
													  
														  }
												  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
														{
													System.out.println("kullanicci skor art");
													kullanicci.skor++;
												}
												  */
												  
												  
												  
												/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
												  System.out.println("/***************kullanici////////"+kullanicci.skor);
												  System.out.println("toplamyahahmle"+toplamhamlesayısı);
												*/
												  
														       
											//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
											if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
											{
												//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
									
											}
														       
																						
																						}
																					}
																				
																				}
								                                           }
																	 System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	}
																	y++;
																	System.out.println(y);
																	if(y%2==0)
																	{
																		
																	btn2.setEnabled(false);
																	}	
																	
																}
															});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn3.setEnabled(true);
														 btn3.addActionListener(new ActionListener() {
																public int z=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}	
																		//JOptionPane.showConfirmDialog(null,"hamle  tamamlandı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	System.out.println("--------------------------------tasart"+tasart);
																	kullanıcınesneADArrayList.add(nesneler.get(2));
																	if(tasart<=5&&nesneler.get(2).contains("tas"))
																	{
																	 if(tasart==1)
												                	    { tas t111=new tas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");    kullanıcınesnlelerArrayList.add(t111);
																
												                	    }
												                		 else if(tasart==2)
												                		 {
												                			tas t222=new tas(); 
												                			//System.out.println("-----------------------------------tas2");
												                     System.out.println("-----------t2"); 
												                     kullanıcınesnlelerArrayList.add(t222);
												           
												                		 }
												                		 else if(tasart==3)
												                		 {
												                			tas t333=new tas(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(t333);
												                		 }
												                		 else if(tasart==4)
												                		 {
												                			tas t444=new tas(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(t444);
												                		 }
												                		 else if(tasart==5)
												                		 {
												                			tas t555=new tas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(t555);
												                		 }
																	 tasart++;
																	
																	}
																	if(kagıtart<=5&&nesneler.get(2).contains("kağıt"))
																	{
																	 if(kagıtart==1)
												                	    { kagit k111=new kagit();
												                	       //System.out.println("-----------------------------------tas1");
																System.out.println("------k1");
																 kullanıcınesnlelerArrayList.add(k111);
												                	    }
												                		 else if(kagıtart==2)
												                		 {
												                			kagit k222=new kagit(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(k222);
												           System.out.println("--------k2");
												                		 }
												                		 else if(kagıtart==3)
												                		 {
												                			kagit k333=new kagit(); 
												                			//System.out.println("x3");
												                			 kullanıcınesnlelerArrayList.add(k333);
												                			System.out.println("-----k3");
												                		 }
												                		 else if(kagıtart==4)
												                		 {
												                			kagit k444=new kagit(); 
												                			//System.out.println("x4");
												                			 kullanıcınesnlelerArrayList.add(k444);
												                		 }
												                		 else if(kagıtart==5)
												                		 {
												                			kagit k555=new kagit(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(k555);
												                		 }
																	 kagıtart++;
																	
																	}
																	if(makasart<=5&&nesneler.get(2).contains("makas"))
																	{
																	 if(makasart==1)
												                	    { makas m111=new makas();
												                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m111);
															
																
												                	    }
												                		 else if(makasart==2)
												                		 {
												                			makas m222=new makas(); 
												                			//System.out.println("-----------------------------------tas2");
												                			 kullanıcınesnlelerArrayList.add(m222);
												           System.out.println("---------m2");
												                		 }
												                		 else if(makasart==3)
												                		 {
												                			makas m333=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m333);
												                			//System.out.println("x3");
												                			System.out.println("m3");
												                		 }
												                		 else if(makasart==4)
												                		 {
												                			makas m444=new makas(); 
												                			 kullanıcınesnlelerArrayList.add(m444);
												                			//System.out.println("x4");
												                		 }
												                		 else if(makasart==5)
												                		 {
												                			makas m555=new makas(); 
												                			//System.out.println("x5");
												                			 kullanıcınesnlelerArrayList.add(m555);
												                		 }
																	 makasart++;
																	
																	}
																	System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																	if(toplamhamlesayısı==hamlesayısı)
																	{	
																			for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																			{
																				for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																				{
																					if(i==j)
																					{ 
																			double saldıranetki=0;
																		    double savunanetki=0;
																	        int seviyepuanartis=0;		
													saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
													seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
											        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
													int seviyepuanartis2=0;		
													savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
													seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
													kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
													
							//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
												
											System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
											// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
											  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
											 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
											
											  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
											  {
												  computerrandomsınıfArrayList.remove(i);
												  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
												  {
													  agirtas agirtas1=new agirtas();
												  }
												  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
												  {
													  
													  Özelkagit özelkagit1=new Özelkagit();
												  }
												  else {
													  
														  ustamakas ustamakas1=new ustamakas();
													  
												}
											  }
											  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
											  {
												  kullanıcınesnlelerArrayList.remove(i);
											  }
											  
											  if(computerrandomsınıfArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
												  
											  }
											  if(kullanıcınesnlelerArrayList.isEmpty())
											  {
												  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
											  }					  
											  
											  
											  
											  
											/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													  {
												  //tasbilgisayar.
												  System.out.println("bilgisayar sakor art");
												  bilgisayar.skor++;
												  
													  }
											  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
													{
												System.out.println("kullanicci skor art");
												kullanicci.skor++;
											}
											  */
											  
											  
											  
											/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
											  System.out.println("/***************kullanici////////"+kullanicci.skor);
											  System.out.println("toplamyahahmle"+toplamhamlesayısı);
											*/
											  
													       
										//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
										if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
										{
											//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
								
										}
													       
																					
																					}
																				}
																			
																			}
							                                           }
																	z++;
																	System.out.println(z);
																	if(z%2==0)
																	{
																		
																	btn3.setEnabled(false);
																	}	
																	
																}
															});
														}
														
														if(toplamhamlesayısı<hamlesayısı)
														{	btn4.setEnabled(true);
														btn4.addActionListener(new ActionListener() {
															public int q=1;
															@Override
															public void actionPerformed(ActionEvent e) {
																
																
																// TODO Auto-generated method stub
																if(toplamhamlesayısı>hamlesayısı)
																{int bilgisayartoplamdayanıklılık=0;
															    int kullanıcıtoplamdayanıklılık=0;
																for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																{
																bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																}
																
																for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																{
																kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																}
																

																if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																{
																	
																	JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																	JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																}
																	
																else	
																{
																	JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																	JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	
																}
																											
																	
																	//JOptionPane.showConfirmDialog(null,"hamle sayısı tamamlandı oyun bitti");
																}
																
																toplamhamlesayısı++;
																
																
																
																kullanıcınesneADArrayList.add(nesneler.get(3));
																System.out.println("--------------------------------tasart"+tasart);
																kullanıcınesneADArrayList.add(nesneler.get(3));
																if(tasart<=5&&nesneler.get(3).contains("tas"))
																{
																 if(tasart==1)
											                	    {System.out.println("xxxxxxxxxxxxxxxx"); 
											                	    tas t1111=new tas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("---------t1"); kullanıcınesnlelerArrayList.add(t1111);
															
											                	    }
											                		 else if(tasart==2)
											                		 {
											                			tas t2222=new tas(); 
											                			//System.out.println("-----------------------------------tas2");
											                     System.out.println("-----------t2"); 
											                     kullanıcınesnlelerArrayList.add(t2222);
											           
											                		 }
											                		 else if(tasart==3)
											                		 {
											                			tas t3333=new tas();
											                			 kullanıcınesnlelerArrayList.add(t3333);
											                			//System.out.println("x3");
											                		 }
											                		 else if(tasart==4)
											                		 {
											                			tas t4444=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(tasart==5)
											                		 {
											                			tas t5555=new tas(); 
											                			 kullanıcınesnlelerArrayList.add(t5555);
											                			//System.out.println("x5");
											                		 }
																 tasart++;
																
																}
																if(kagıtart<=5&&nesneler.get(3).contains("kağıt"))
																{
																 if(kagıtart==1)
											                	    { kagit k1111=new kagit();
											                	       //System.out.println("-----------------------------------tas1");
															System.out.println("------k1");
															 kullanıcınesnlelerArrayList.add(k1111);
											                	    }
											                		 else if(kagıtart==2)
											                		 {
											                			kagit k2222=new kagit(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(k2222);
											           System.out.println("--------k2");
											                		 }
											                		 else if(kagıtart==3)
											                		 {
											                			kagit k3333=new kagit(); 
											                			//System.out.println("x3");
											                			System.out.println("-----k3");
											                			 kullanıcınesnlelerArrayList.add(k3333);
											                		 }
											                		 else if(kagıtart==4)
											                		 {
											                			kagit k4444=new kagit(); 
											                			//System.out.println("x4");
											                			 kullanıcınesnlelerArrayList.add(k4444);
											                		 }
											                		 else if(kagıtart==5)
											                		 {
											                			kagit k5555=new kagit(); 
											                			 kullanıcınesnlelerArrayList.add(k5555);
											                			//System.out.println("x5");
											                		 }
																 kagıtart++;
																
																}
																if(makasart<=5&&nesneler.get(3).contains("makas"))
																{
																 if(makasart==1)
											                	    { makas m1111=new makas();
											                	       //System.out.println("-----------------------------------tas1");
		System.out.println("--------m"); kullanıcınesnlelerArrayList.add(m1111);
														
															
											                	    }
											                		 else if(makasart==2)
											                		 {
											                			makas m2222=new makas(); 
											                			//System.out.println("-----------------------------------tas2");
											                			 kullanıcınesnlelerArrayList.add(m2222);
											           System.out.println("---------m2");
											                		 }
											                		 else if(makasart==3)
											                		 {
											                			makas m3333=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m3333);
											                			//System.out.println("x3");
											                			System.out.println("m3");
											                		 }
											                		 else if(makasart==4)
											                		 {
											                			makas m4444=new makas(); 
											                			 kullanıcınesnlelerArrayList.add(m4444);
											                			//System.out.println("x4");
											                		 }
											                		 else if(makasart==5)
											                		 {
											                			makas m5555=new makas(); 
											                			//System.out.println("x5");
											                			 kullanıcınesnlelerArrayList.add(m5555);
											                		 }
																 makasart++;
																
																}
																System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
																
																if(toplamhamlesayısı==hamlesayısı)
																{	
																		for(int i=0;i<computerrandomsınıfArrayList.size();i++)
																		{
																			for(int j=0;j<computerrandomsınıfArrayList.size();j++)
																			{
																				if(i==j)
																				{ 
																		double saldıranetki=0;
																	    double savunanetki=0;
																        int seviyepuanartis=0;		
												saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
												seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
										        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
												int seviyepuanartis2=0;		
												savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
												seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
												kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
												
						//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
											
										System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
										// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
										  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
										 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
										
										  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
										  {
											  computerrandomsınıfArrayList.remove(i);
											  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
											  {
												  agirtas agirtas1=new agirtas();
											  }
											  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
											  {
												  
												  Özelkagit özelkagit1=new Özelkagit();
											  }
											  else {
												  
													  ustamakas ustamakas1=new ustamakas();
												  
											}
										  }
										  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
										  {
											  kullanıcınesnlelerArrayList.remove(i);
										  }
										  
										  if(computerrandomsınıfArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
											  
										  }
										  if(kullanıcınesnlelerArrayList.isEmpty())
										  {
											  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
										  }					  
										  
										  
										  
										  
										/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												  {
											  //tasbilgisayar.
											  System.out.println("bilgisayar sakor art");
											  bilgisayar.skor++;
											  
												  }
										  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
												{
											System.out.println("kullanicci skor art");
											kullanicci.skor++;
										}
										  */
										  
										  
										  
										/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
										  System.out.println("/***************kullanici////////"+kullanicci.skor);
										  System.out.println("toplamyahahmle"+toplamhamlesayısı);
										*/
										  
												       
									//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
									if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
									{
										//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
							
									}
												       
																				
																				}
																			}
																		
																		}
						                                           }
																q++;
																
																//System.out.println("+++++193"+kullanıcınesneADArrayList);
																System.out.println(q);
																if(q%2==0)
																{
																	
																btn4.setEnabled(false);
																}
																
															}
														});
														}
														if(toplamhamlesayısı<hamlesayısı)
														{	btn5.setEnabled(true);
														 btn5.addActionListener(new ActionListener() {
																public int w=1;
																@Override
																public void actionPerformed(ActionEvent e) {
																	if(toplamhamlesayısı>hamlesayısı)
																	{int bilgisayartoplamdayanıklılık=0;
																    int kullanıcıtoplamdayanıklılık=0;
																	for(int don=0;don<computerrandomsınıfArrayList.size();don++)
																	{
																	bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
																	}
																	
																	for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
																	{
																	kullanıcıtoplamdayanıklılık+=kullanıcınesnlelerArrayList.get(don).dayaniklilik;	
																	}
																	

																	if(kullanıcıtoplamdayanıklılık>bilgisayartoplamdayanıklılık)
																	{
																		
																		JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan kullanıcı");
																		JOptionPane.showMessageDialog(null, kullanıcıtoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																	}
																		
																	else	
																	{
																		JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar");
																		JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
																		
																	}
																												
																		
																		//JOptionPane.showConfirmDialog(null,"hamle sayısına ulasıldı oyun bitti");
																	}
																	toplamhamlesayısı++;
																	// TODO Auto-generated method stub
									
									kullanıcınesneADArrayList.add(nesneler.get(4));
									//burda gecerli	
									
									System.out.println("--------------------------------tasart5"+tasart);
									kullanıcınesneADArrayList.add(nesneler.get(4));
									if(tasart<=5&&nesneler.get(4).contains("tas"))
									{
									 if(tasart==1)
				                	    { tas t11111=new tas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("---------t1");
			kullanıcınesnlelerArrayList.add(t11111);
								
				                	    }
				                		 else if(tasart==2)
				                		 {
				                			tas t22222=new tas(); 
				                			//System.out.println("-----------------------------------tas2");
				                     System.out.println("-----------t2"); 	 
				                     kullanıcınesnlelerArrayList.add(t22222);
				           
				                		 }
				                		 else if(tasart==3)
				                		 {
				                			tas t33333=new tas(); 
				                			   kullanıcınesnlelerArrayList.add(t33333);
				                			//System.out.println("x3");
				                		 }
				                		 else if(tasart==4)
				                		 {
				                			tas t44444=new tas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(t44444);
				                		 }
				                		 else if(tasart==5)
				                		 {
				                			tas t55555=new tas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(t55555);
				                		 }
									 tasart++;
									
									}
									if(kagıtart<=5&&nesneler.get(4).contains("kağıt"))
									{
									 if(kagıtart==1)
				                	    { 
										 kagit k11111=new kagit();
				                	       //System.out.println("-----------------------------------tas1");
								System.out.println("------k1");
								   kullanıcınesnlelerArrayList.add(k11111);
				                	    }
				                		 else if(kagıtart==2)
				                		 {
				                			kagit k22222=new kagit(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(k22222);
				                      	    
				           System.out.println("--------k2");
				                		 }
				                		 else if(kagıtart==3)
				                		 {
				                			kagit k33333=new kagit(); 
				                			//System.out.println("x3");
				                			System.out.println("-----k3");
				                			   kullanıcınesnlelerArrayList.add(k33333);
				                		 }
				                		 else if(kagıtart==4)
				                		 {
				                			kagit k44444=new kagit(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(k44444);
				                		 }
				                		 else if(kagıtart==5)
				                		 {
				                			kagit k55555=new kagit(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(k55555);
				                		 }
									 kagıtart++;
									
									}
									if(makasart<=5&&nesneler.get(4).contains("makas"))
									{
									 if(makasart==1)
				                	    { makas m11111=new makas();
				                	       //System.out.println("-----------------------------------tas1");
			System.out.println("--------m");
			kullanıcınesnlelerArrayList.add(m11111);
								
				                	    }
				                		 else if(makasart==2)
				                		 {
				                			makas m22222=new makas(); 
				                			//System.out.println("-----------------------------------tas2");
				                			   kullanıcınesnlelerArrayList.add(m22222);
				           System.out.println("---------m2");
				                		 }
				                		 else if(makasart==3)
				                		 {
				                			makas m33333=new makas(); 
				                			//System.out.println("x3");
				                			System.out.println("m3");
				                			   kullanıcınesnlelerArrayList.add(m33333);
				                		 }
				                		 else if(makasart==4)
				                		 {
				                			makas m44444=new makas(); 
				                			//System.out.println("x4");
				                			   kullanıcınesnlelerArrayList.add(m44444);
				                		 }
				                		 else if(makasart==5)
				                		 {
				                			makas m55555=new makas(); 
				                			//System.out.println("x5");
				                			   kullanıcınesnlelerArrayList.add(m55555);
				                		 }
									 makasart++;
									//System.out.println("-----------------------++++++++++++++++"+kullanıcınesnlelerArrayList);
			}System.out.println("kulaalnıcı araylıst ne:"+kullanıcınesnlelerArrayList.get(0));
									System.out.println("/"+tasart+"/   "+kagıtart+"/  "+makasart);
									if(toplamhamlesayısı==hamlesayısı)
									{	
											for(int i=0;i<computerrandomsınıfArrayList.size();i++)
											{
												for(int j=0;j<computerrandomsınıfArrayList.size();j++)
												{
													if(i==j)
													{ 
											double saldıranetki=0;
										    double savunanetki=0;
									        int seviyepuanartis=0;		
					saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
					seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
			        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
					int seviyepuanartis2=0;		
					savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
					seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
					kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
					
//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
				
			System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
			// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
			  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
			 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
			
			  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
			  {
				  computerrandomsınıfArrayList.remove(i);
				  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
				  {
					  agirtas agirtas1=new agirtas();
				  }
				  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
				  {
					  
					  Özelkagit özelkagit1=new Özelkagit();
				  }
				  else {
					  
						  ustamakas ustamakas1=new ustamakas();
					  
				}
			  }
			  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
			  {
				  kullanıcınesnlelerArrayList.remove(i);
			  }
			  
			  if(computerrandomsınıfArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
				  
			  }
			  if(kullanıcınesnlelerArrayList.isEmpty())
			  {
				  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
			  }					  
			  
			  
			  
			  
			/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					  {
				  //tasbilgisayar.
				  System.out.println("bilgisayar sakor art");
				  bilgisayar.skor++;
				  
					  }
			  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
					{
				System.out.println("kullanicci skor art");
				kullanicci.skor++;
			}
			  */
			  
			  
			  
			/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
			  System.out.println("/***************kullanici////////"+kullanicci.skor);
			  System.out.println("toplamyahahmle"+toplamhamlesayısı);
			*/
			  
					       
		//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
		if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
		{
			//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));

		}
					       
													
													}
												}
											
											}
                                      }								
									w++;

																	System.out.println(w);
																	if(w%2==0)
																	{
																	btn5.setEnabled(false);
																	}
																}
																});
														}
													
													
														
														
										
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
														
													
											
													
													
													
											
												for(int i=0;i<computerrandomsınıfArrayList.size();i++)
													{
														for(int j=0;j<computerrandomsınıfArrayList.size();j++)
														{
															if(i==j)
															{ 
													double saldıranetki=0;
												    double savunanetki=0;
											        int seviyepuanartis=0;		
							saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i));
							seviyepuanartis=kullanıcınesnlelerArrayList.get(i).durumGuncelle(saldıranetki);
					        computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
							int seviyepuanartis2=0;		
							savunanetki=kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
							seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
							kullanıcınesnlelerArrayList.get(i).seviyePuani+=seviyepuanartis2;
							
	//System.out.println("hangi eleman:"+kullanıcınesnlelerArrayList.get(i).dayaniklilik);		
						
					System.out.println("bilgisayar nesne etki:"+computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)));
					// System.out.println("bilgisayar seviye puanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
					  System.out.println("kulanıcı nesne etki:"+kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
					 // System.out.println("****************-----------kullanıcı seviye puanı"+kullanıcınesnlelerArrayList.get(i).seviyePuani);
					
					  if(computerrandomsınıfArrayList.get(i).dayaniklilik<0)
					  {
						  computerrandomsınıfArrayList.remove(i);
						  if(kullanıcınesnlelerArrayList.get(i) instanceof tas)
						  {
							  agirtas agirtas1=new agirtas();
						  }
						  else if(kullanıcınesnlelerArrayList.get(i) instanceof kagit)
						  {
							  
							  Özelkagit özelkagit1=new Özelkagit();
						  }
						  else {
							  
								  ustamakas ustamakas1=new ustamakas();
							  
						}
					  }
					  if(kullanıcınesnlelerArrayList.get(i).dayaniklilik<0)
					  {
						  kullanıcınesnlelerArrayList.remove(i);
					  }
					  
					  if(computerrandomsınıfArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :kullanıcı kazandı");
						 
					  }
					  if(kullanıcınesnlelerArrayList.isEmpty())
					  {
						  JOptionPane.showConfirmDialog(null,"nesne bitti :bilgisayar kazandı");
						
					  }					  
					  
					  
					  
					  
					/*  if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))<computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							  {
						  //tasbilgisayar.
						  System.out.println("bilgisayar sakor art");
						  bilgisayar.skor++;
						  
							  }
					  else if(kullanıcınesnlelerArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i))>computerrandomsınıfArrayList.get(i).etkiHesapla(kullanıcınesnlelerArrayList.get(i)))
							{
						System.out.println("kullanicci skor art");
						kullanicci.skor++;
					}
					  */
					  
					  
					  
					/*  System.out.println("/**********computer///////////"+ bilgisayar.skor);
					  System.out.println("/***************kullanici////////"+kullanicci.skor);
					  System.out.println("toplamyahahmle"+toplamhamlesayısı);
					*/
					  
							       
				//System.out.println("999999999999999999999999::::::::::"+computerrandomsınıfArrayList.get(i).seviyePuani);			     
				if(computerrandomsınıfArrayList.get(i).seviyePuani>10)//30 dan buyuk olmalı deneme icin
				{
					//System.out.println("nesne tip                       i::"+computerrandomsınıfArrayList.getClass().getClasses().equals("agirtas"));
		
				}
							       
															
															}
														}
													
													}
	                                           
													
												
											
												
												
													}
													
													
													
													
													
													
													
												});

											    JLabel bilgisayarsecimkutu=new JLabel();
											    String icineyazString=nesne.bilgisayarinsecimi.get(bilgisayarsecimdeger);
											    bilgisayarsecimdeger++;
											    bilgisayarsecimkutu.setBounds(600,280,100,30 );
											    JButton btn=new JButton("computer secimi");
											    btn.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														
														JLabel label1 = new JLabel();
														label1.setFont(new Font("Calibri",Font.PLAIN,20));
														label1.setText(kopya.get(0));
														label1.setBounds(700, 200, 300, 40);
														JLabel label2 = new JLabel();
														label2.setFont(new Font("Calibri",Font.PLAIN,20));
														label2.setText("<html><h1>"+kopya.get(1)+"</h1></html>");
														label2.setBounds(700, 261, 300, 40);
														JLabel label3 = new JLabel();
														label3.setFont(new Font("Calibri",Font.PLAIN,20));
														label3.setText("<html><h2>"+ kopya.get(2)+"</h2></html>");
														label3.setBounds(700, 323, 300, 40);
														JLabel label4 = new JLabel();
														label4.setFont(new Font("Calibri",Font.PLAIN,50));
														label4.setText("<html><h3>"+ kopya.get(3)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label4.setBounds(700, 384, 450, 80);
														JLabel label5 = new JLabel();
														label5.setFont(new Font("Calibri",Font.PLAIN,20));
														label5.setText("<html><h3>"+ kopya.get(4)  + "</h3></html>");
														//label4.setText(kopya.get(3));
														label5.setBounds(700, 480, 450, 80);






														pencere3.add(label1);
														pencere3.add(label2);
														pencere3.add(label3);
														pencere3.add(label4);
														pencere3.add(label5);
													}
												});
											    
											    btn.setBounds(500,280,130,30);
											    
											    
											
											yaziJLabel.setText("kullanıcıvsbilgisayar");
											yaziJLabel.setBounds(500,200,150,30);
											pencere3.add(btn5);
											pencere3.add(btn4);
											pencere3.add(btn3);
											pencere3.add(btn2);
											pencere3.add(btn1);
											pencere3.add(btn);
											pencere3.add(bilgisayarsecimkutu);
											pencere3.setSize(1000,500);
											pencere3.setLayout(null);	
											pencere3.setVisible(true);
											if(gir3==1)
											{ int tart=1,kart=1,mart=1,bak=1;
							                 for(int i=0;i<nesneler.size();i++)
							                 {   System.out.println(nesneler.get(i));
							                	 if(nesneler.get(i).contains("tas"))
							                	 {  
							                		 if(tart==1)
							                	    { tas x1=new tas();
							                	    

							                	    }
							                		 else if(tart==2)
							                		 {
							                			tas x2=new tas(); 
							                			
							                      	    
							           
							                		 }
							                		 else if(tart==3)
							                		 {
							                			tas x3=new tas(); 
							                			
							                		 }
							                		 else if(tart==4)
							                		 {
							                			tas x4=new tas(); 
							                			
							                		 }
							                		 else if(tart==5)
							                		 {
							                			tas x5=new tas(); 
							                			
							                		 }
							                		 else if(tart==6)
							                		 {
							                			tas x6=new tas(); 
							                		 }
							                		 else if(tart==7)
							                		 {
							                			tas x7=new tas(); 
							                		 }
							                		 else if(tart==8)
							                		 {
							                			tas x8=new tas(); 
							                		 }
							                		 else if(tart==9)
							                		 {
							                			tas x9=new tas(); 
							                		 }
							                		 else if(tart==10)
							                		 {
							                			tas x10=new tas(); 
							                		 }else if(tart==11)
							                		 {
							                			tas x11=new tas(); 
							                		 }
							                		 else if(tart==12)
							                		 {
							                			tas x12=new tas(); 
							                		 }
							                	     tart++;
							                		 System.out.println("                    t");
							                	 }
							                	 else if(nesneler.get(i).contains("kagıt"))
							                	 {
							                		 
							                		 if(kart==1)
							                 	    { kagit y1=new kagit();
							                 	    }
							                 		 else if(kart==2)
							                 		 {
							                 			kagit y2=new kagit(); 
							                 		 }
							                 		else if(kart==3)
							                		 {
							                			kagit y3=new kagit(); 
							                		 }
							                 		else if(kart==4)
							                		 {
							                			kagit y4=new kagit(); 
							                		 }
							                 		else if(kart==5)
							                		 {
							                			kagit y5=new kagit(); 
							                		 }
							                 		else if(kart==6)
							                		 {
							                			kagit y6=new kagit(); 
							                		 }
							                 		else if(kart==7)
							                		 {
							                			kagit y7=new kagit(); 
							                		 }
							                 		else if(kart==8)
							                		 {
							                			kagit y8=new kagit(); 
							                		 }
							                 		else if(kart==9)
							                		 {
							                			kagit y9=new kagit(); 
							                		 }
							                 		else if(kart==10)
							                		 {
							                			kagit y10=new kagit(); 
							                		 }
							                 		
							                 	     kart++;
							                		 
							                		 
							                		 
							                		System.out.println("                         k"); 
							                	 }
							                	 else {
							                		 if(mart==1)
							                  	    { makas z1=new makas();
							                  	    }
							                  		 else if(mart==2)
							                  		 {
							                  			makas z2=new makas(); 
							                  		 }
							                  		else if(mart==3)
							                 		 {
							                 			makas z3=new makas(); 
							                 		 }
							                  		 else if(mart==4)
							                  		 {
							                  			makas z4=new makas(); 
							                  		 }
							                  		else if(mart==5)
							                 		 {
							                 			makas z5=new makas(); 
							                 		 } else if(mart==6)
							                  		 {
							                  			makas z6=new makas(); 
							                  		 }
							                  		else if(mart==7)
							                 		 {
							                 			makas z7=new makas(); 
							                 		 } else if(mart==8)
							                  		 {
							                  			makas z8=new makas(); 
							                  		 }
							                  		else if(mart==9)
							                 		 {
							                 			makas z9=new makas(); 
							                 		 }
							                		 mart++;
												System.out.println("                              m");	
												}
							                 }	 
											gir3++;
											}
										
								System.out.println(kullanicci.oyuncuAdi+kullanicci.oyuncuID);
									}
							 
									
								
								});
							 
							 
							 
								pencere.add(buton1);
								pencere.add(buton2);
								pencere.add(buton3);
								
								pencere.setSize(1000,500);
							    pencere.setLayout(null);	
							    pencere.setVisible(true); 
							 
							 
							 
							 	 
			 
							
							
							 
						 }
						 else {
							bilgisayarvsbilgisayar++;
							if(bilgisayarvsbilgisayar==2)
							{
								
								
								JFrame pencere2=new JFrame("bilgisayar vs bilgisayar");
								
                             JLabel yaziJLabel=new JLabel();
								
								yaziJLabel.setText("BİLGİSAYAR 1:");
								yaziJLabel.setBounds(100,150,90,30);
							    
								
								bilgisayar bilgisayar=new bilgisayar();
								JLabel yaziJLabel1=new JLabel();
								
								yaziJLabel1.setText(bilgisayar.bilgisayarinsecimi.get(0));
								yaziJLabel1.setBounds(200,150,50,30);
							    
								JLabel yaziJLabel2=new JLabel();
								yaziJLabel2.setText(bilgisayar.bilgisayarinsecimi.get(1));
								yaziJLabel2.setBounds(270,150,50,30);
							    
								JLabel yaziJLabel3=new JLabel();
								yaziJLabel3.setText(bilgisayar.bilgisayarinsecimi.get(2));
								yaziJLabel3.setBounds(350,150,50,30);
							    
								JLabel yaziJLabel4=new JLabel();
								yaziJLabel4.setText(bilgisayar.bilgisayarinsecimi.get(3));
								yaziJLabel4.setBounds(420,150,50,30);
							    
								JLabel yaziJLabel5=new JLabel();
								yaziJLabel5.setText(bilgisayar.bilgisayarinsecimi.get(4));
								yaziJLabel5.setBounds(490,150,50,30);
								
								
								
								bilgisayar bilgisayar2=new bilgisayar();
							
								ArrayList<String>bilgisayarrandomsecimdegerleri2=new ArrayList<>();
								ArrayList<nesne>computerrandomsınıfArrayList2=new ArrayList<>();
								
								bilgisayarrandomsecimdegerleri2=(ArrayList<String>) bilgisayar2.bilgisayarinsecimi.clone();
								//System.out.println("**********************"+bilgisayarrandomsecimdegerleri);
								Object[] bilgisayarsecdizi2=bilgisayarrandomsecimdegerleri2.toArray();
								for(Object i:bilgisayarsecdizi2)
								{
									System.out.println("-------------"+i);
								}
								if(gir3==1)
								{ int tart=1,kart=1,mart=1,bak=1;
							     for(int i=0;i<bilgisayarrandomsecimdegerleri2.size();i++)
							     {   
							    	 if(bilgisayarrandomsecimdegerleri2.get(i).contains("tas"))
							    	 {  
							    		 if(tart==1)
							    	    { tas bx11=new tas();
							    	      computerrandomsınıfArrayList2.add(bx11);
							              //computerrandomsecimadArrayList.add("tas1");
							    	    }
							    		 else if(tart==2)
							    		 {
							    			tas bx22=new tas(); 
							    			
							    			//System.out.println("bx2");
							          	    computerrandomsınıfArrayList2.add(bx22);
							               // computerrandomsecimadArrayList.add("tas2");
							    		 }
							    		 else if(tart==3)
							    		 {
							    			tas bx33=new tas(); 
							    			computerrandomsınıfArrayList2.add(bx33);
							    			//computerrandomsecimadArrayList.add("tas3");
							    			//System.out.println("bx3");
							    		 }
							    		 else if(tart==4)
							    		 {
							    			tas bx44=new tas(); 
							    			computerrandomsınıfArrayList2.add(bx44);
							    			
							    			//computerrandomsecimadArrayList.add("tas4");
							    			//System.out.println("bx4");
							    		 }
							    		 else if(tart==5)
							    		 {
							    			tas bx55=new tas(); 
							    			computerrandomsınıfArrayList2.add(bx55);
							    			//computerrandomsecimadArrayList.add("tas5");
							    			//System.out.println("bx5");
							    		 }
							    	
							    	     tart++;
							    		 //System.out.println("                    t");
							    	 }
							    	 else if(bilgisayarrandomsecimdegerleri2.get(i).contains("kagıt"))
							    	 {
							    		 
							    		 if(kart==1)
							     	    { kagit by11=new kagit();
							     	    computerrandomsınıfArrayList2.add(by11);
							     	   // computerrandomsecimadArrayList.add("kagit1");
							     	    }
							     		 else if(kart==2)
							     		 {
							     			kagit by22=new kagit(); 
							     			computerrandomsınıfArrayList2.add(by22);
							     			//computerrandomsecimadArrayList.add("kagit2");
							     		 }
							     		else if(kart==3)
							    		 {
							    			kagit by33=new kagit(); 
							    			computerrandomsınıfArrayList2.add(by33);
							    			 //computerrandomsecimadArrayList.add("kagit3");
							    		 }
							     		else if(kart==4)
							    		 {
							    			kagit by44=new kagit(); 
							    			computerrandomsınıfArrayList2.add(by44);
							    			 //computerrandomsecimadArrayList.add("kagit4");
							    		 }
							     		else if(kart==5)
							    		 {
							    			kagit by55=new kagit(); 
							    			computerrandomsınıfArrayList2.add(by55);
							    			// computerrandomsecimadArrayList.add("kagit5");
							    		 }
							     		
							     		
							     	     kart++;
							    		 
							    		 
							    		 
							    		//System.out.println("                         k"); 
							    	 }
							    	 else {
							    		 if(mart==1)
							      	    { makas bz11=new makas();
							      	    computerrandomsınıfArrayList2.add(bz11);
							      	//  computerrandomsecimadArrayList.add("tas1");
							      	    
							      	    }
							      		 else if(mart==2)
							      		 {
							      			makas bz22=new makas(); 
							      			computerrandomsınıfArrayList2.add(bz22);
							      			//computerrandomsecimadArrayList.add("tas2");
							      		 }
							      		else if(mart==3)
							     		 {
							     			makas bz33=new makas(); 
							     			computerrandomsınıfArrayList2.add(bz33);
							     			//computerrandomsecimadArrayList.add("tas3");
							     			
							     		 }
							      		 else if(mart==4)
							      		 {
							      			makas bz44=new makas(); 
							      			computerrandomsınıfArrayList2.add(bz44);
							      			//computerrandomsecimadArrayList.add("tas4");
							      		 }
							      		else if(mart==5)
							     		 {
							     			makas bz55=new makas(); 
							     			computerrandomsınıfArrayList2.add(bz55);
							     			//computerrandomsecimadArrayList.add("tas5");
							     		 } 
							    		 mart++;
									//System.out.println("                              m");	
									}
							     }	 
								gir3++;
								}

										
								
								
								
								
								
								
								int bilgisayartoplamdayanıklılık=0;
							    int bilgisayar2toplamdayanıklılık=0;
								for(int don=0;don<computerrandomsınıfArrayList.size();don++)
								{
								bilgisayartoplamdayanıklılık+=computerrandomsınıfArrayList.get(don).dayaniklilik;	
								}
								
								for(int don=0;don<kullanıcınesnlelerArrayList.size();don++)
								{
								bilgisayar2toplamdayanıklılık+=computerrandomsınıfArrayList2.get(don).dayaniklilik;	
								}
								

								if(bilgisayar2toplamdayanıklılık>bilgisayartoplamdayanıklılık)
								{
									
									JOptionPane.showMessageDialog(null, "hamle sayısı tamamlandı,kazanan bilgisayar2");
									JOptionPane.showMessageDialog(null, bilgisayar2toplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
								}
									
								else	
								{
									JOptionPane.showMessageDialog(null,"hamlesayısı tamamlandı,kazanan bilgisayar1");
									JOptionPane.showMessageDialog(null, bilgisayartoplamdayanıklılık,"skor", JOptionPane.WARNING_MESSAGE);
									
								}
								
								
								
								
								
								
								
								
								
								
								
								
								
								
	
								
								  JLabel yaziJLabel11=new JLabel();
									
									yaziJLabel11.setText("BİLGİSAYAR 2:");
									yaziJLabel11.setBounds(100,290,90,30);
								    
								
							    
								JLabel yaziJLabel6=new JLabel();
								yaziJLabel6.setText(bilgisayar2.bilgisayarinsecimi.get(0));
								yaziJLabel6.setBounds(200,290,50,30);
							    
								JLabel yaziJLabel7=new JLabel();
								yaziJLabel7.setText(bilgisayar2.bilgisayarinsecimi.get(1));
								yaziJLabel7.setBounds(270,290,50,30);
							    
								JLabel yaziJLabel8=new JLabel();
								yaziJLabel8.setText(bilgisayar2.bilgisayarinsecimi.get(2));
								yaziJLabel8.setBounds(350,290,50,30);
							    
								JLabel yaziJLabel9=new JLabel();
								yaziJLabel9.setText(bilgisayar2.bilgisayarinsecimi.get(3));
								yaziJLabel9.setBounds(420,290,50,30);
							    
								JLabel yaziJLabel10=new JLabel();
								yaziJLabel10.setText(bilgisayar2.bilgisayarinsecimi.get(4));
								yaziJLabel10.setBounds(490,290,50,30);
							   
								for(int i=0;i<computerrandomsınıfArrayList.size();i++)
								{
									for(int j=0;j<computerrandomsınıfArrayList2.size();j++)
									{
										if(i==j)
										{ 
								double saldıranetki=0;
							    double savunanetki=0;
						        int seviyepuanartis=0;		
		saldıranetki=computerrandomsınıfArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList2.get(i));
		seviyepuanartis=computerrandomsınıfArrayList2.get(i).durumGuncelle(saldıranetki);
computerrandomsınıfArrayList.get(i).seviyePuani+=seviyepuanartis;
		int seviyepuanartis2=0;		
		savunanetki=computerrandomsınıfArrayList2.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i));
		seviyepuanartis2=computerrandomsınıfArrayList.get(i).durumGuncelle(savunanetki);
		computerrandomsınıfArrayList2.get(i).seviyePuani+=seviyepuanartis2;
		
		
	System.out.println("---bilgisayar1etki"+computerrandomsınıfArrayList.get(i).etkiHesapla(computerrandomsınıfArrayList2.get(i)));
		       System.out.println("---bilgisayar1seviyepuanı"+computerrandomsınıfArrayList.get(i).seviyePuani);
		       System.out.println("---bilgisayar2etki"+computerrandomsınıfArrayList2.get(i).etkiHesapla(computerrandomsınıfArrayList.get(i)));
		       System.out.println("---bilgisayar2seviyepuan"+computerrandomsınıfArrayList2.get(i).seviyePuani);
							}
									}
								}
								

								JLabel bilgiJLabel=new JLabel("oyuncu ad ve Id");
								JTextArea oyuncuadiveıdArea=new JTextArea();
							   JButton adButton=new JButton();
								adButton.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										String areatextString=oyuncuadiveıdArea.getText();
										String dizi[]=areatextString.split("-");
										bilgisayar2.oyuncuAdi=dizi[0];
									    bilgisayar2.oyuncuID=dizi[1];
										System.out.println("bilgisayarad:"+dizi[0]);
										System.out.println("bilgisayarid:"+dizi[1]);
										
									}
								});
								bilgiJLabel.setBounds(140,30,100,30);
								adButton.setBounds(465,30,10,10);
								oyuncuadiveıdArea.setBounds(240,30,200,30);
								pencere2.add(adButton);
								pencere2.add(bilgiJLabel);
								pencere2.add(oyuncuadiveıdArea);
								
								JLabel bilgiJLabel2=new JLabel("oyuncu ad ve Id");
								JTextArea oyuncuadiveıdArea2=new JTextArea();
							   JButton adButton2=new JButton();
								adButton2.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										String areatextString2=oyuncuadiveıdArea2.getText();
										String dizi2[]=areatextString2.split("-");
										bilgisayar2.oyuncuAdi=dizi2[0];
										bilgisayar2.oyuncuID=dizi2[1];
									
										System.out.println("bilgisayar2ad:"+dizi2[0]);
										System.out.println("bilgisayar2id:"+dizi2[1]);
										
									}
								});
								   
								bilgiJLabel2.setBounds(480,30,100,30);
								adButton2.setBounds(800,30,10,10);
								oyuncuadiveıdArea2.setBounds(590,30,200,30);
								pencere2.add(adButton2);
								pencere2.add(bilgiJLabel2);
								pencere2.add(oyuncuadiveıdArea2);
								System.out.println(bilgisayar.oyuncuAdi);
								
							  
							   
								
							    pencere2.add(yaziJLabel11);
							    pencere2.add(yaziJLabel);
								pencere2.add(yaziJLabel10);
								pencere2.add(yaziJLabel9);
								pencere2.add(yaziJLabel8);
								pencere2.add(yaziJLabel7);
								pencere2.add(yaziJLabel6);
								pencere2.add(yaziJLabel5);
								pencere2.add(yaziJLabel4);
								pencere2.add(yaziJLabel3);
								pencere2.add(yaziJLabel2);
								pencere2.add(yaziJLabel1);
								pencere2.setSize(1000,500);
							    pencere2.setLayout(null);
							    pencere2.setVisible(true);	
								
							
								
					    	}
						}
						 
						 

					}		 
					
				});
						

						
     			 
			   
				anapencere.add(onayButton2);
				 anapencere.add(onayButton);
			    //pencere.add(btn);
				//pencere.add(bilgisayarsecimkutu);
				anapencere.add(yaziJLabel);
				anapencere.setSize(1000,500);  
				anapencere.setLayout(null);	
				anapencere.setVisible(true);
			   
			//System.out.println(bilgisayar.oyuncuAdi);	
	
	anapencere.setSize(1000,500);
    anapencere.setLayout(null);	
    anapencere.setVisible(true);
}

}