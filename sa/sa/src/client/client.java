package client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Scanner;

import shared.cars;

public class client {
	private static Scanner scan=new Scanner(System.in);
	static File araba=new File("araba.txt");
	static File fatura=new File("fatura.txt");
	static String amrk,fad,aid,fid,s1,str;
	static int a=-1,syc,no;
	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	static HashMap<String, Integer> hm1 = new HashMap<String, Integer>();

	private cars server;
	public client() {
	}
	public String serv(String strr) {
		return "";
		
	}
	public void starat() throws RemoteException, NotBoundException {
		Registry registry=LocateRegistry.getRegistry("localhost",1099);
		server=(cars)registry.lookup("server");
	
	}
	public String tappr(int a) throws RemoteException, FileNotFoundException {
		switch(a) {
		case 1:
			System.out.println("Eklemek istediðiniz aracýn id'sini girin:  ");
			aid=scan.next();
			System.out.println("Eklemek istediðiniz aracýn markasýný girin:  ");
			amrk=scan.next();
			arabakayit(aid,amrk);
			
			break;
		case 2:
			System.out.println("Eklemek istediðiniz faturanýn id'sini girin:  ");
			fid=scan.next();
			System.out.println("Eklemek istediðiniz faturanýn isim bilgisini girin:  ");
			fad=scan.next();
			faturakayit(fid, fad);
			break;
		case 4:
			System.out.println("Id girin:");
			int ariid=Integer.parseInt(scan.next());
			arabanoara(ariid);
			break;
		case 5:
			System.out.println("Marka girin:");
			String armrk=scan.next();
			arabamrkara(armrk);
			break;
		case 6:
			System.out.println("No girin:");
			int arid=Integer.parseInt(scan.next());
			faturanoara(arid);
			break;
		case 7:
			System.out.println("Ad girin:");
			String ftad=scan.next();
			faturaadara(ftad);
			break;
			default:
				break;
		}
		
		
		
		return " ";
		
	}
	public void hasharaba() throws FileNotFoundException {
		try (Scanner r = new Scanner(araba)) {
			for(syc=0;r.hasNextLine();syc++) {
			s1=r.nextLine();
			String [] d=s1.split(" ");
			str=d[1];
			no=Integer.parseInt(d[0]);
			 hm.put(str, no);
			
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void hashfatura() throws FileNotFoundException {
		try (Scanner n = new Scanner(fatura)) {
			for(syc=0;n.hasNextLine();syc++) {
				s1=n.nextLine();
				String [] d=s1.split(" ");
				str=d[1];
				no=Integer.parseInt(d[0]);
			
			 hm1.put(str,no);
			
 }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void arabakayit(String aid, String amrk) {
		
	      try {
			FileWriter yaz = new FileWriter(araba,true);
			 BufferedWriter bWriter = new BufferedWriter(yaz);
			
				bWriter.write(aid+" "+amrk+"\n");
				bWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	
	}
	
	public static void faturakayit(String fid, String fad) {
	
		 try {
				FileWriter yaz1 = new FileWriter(fatura,true);
				 BufferedWriter bWriter = new BufferedWriter(yaz1);
				 
					bWriter.write(fid+" "+fad+"\n");
					bWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		 
		
	

	}
public static void arabanoara(int arid) {
		
	
		 for(String i:hm.keySet()) {
		 if(arid==hm.get(i)) {
		 System.out.println("Araç ID: "+arid+" Araç Marka: "+i);
		 }
	}
	}
	public static void arabamrkara(String armrk) {

		
		 for(String i:hm.keySet()) {
		 if(armrk.equals(i)) {
		 System.out.println("Araç ID: "+hm.get(i)+" Araç Marka: "+armrk);
		 }
	}
	}

	
	public static void faturanoara(int arid) {
		
		 for(String i:hm1.keySet()) {
		 if(arid==hm1.get(i)) {
		 System.out.println("Fatura NO: "+arid+" Alýcý ismi: "+i);
		 }
	}

	}
	public static void faturaadara(String ftad) {
		
		 for(String i:hm1.keySet()) {
		 if(ftad.equals(i)) {
		 System.out.println("Fatura NO: "+hm1.get(i)+" Alýcý ismi: "+ftad);
		 }
	}
	}

}
