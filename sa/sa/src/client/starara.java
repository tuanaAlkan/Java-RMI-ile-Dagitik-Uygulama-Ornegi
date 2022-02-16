package client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Scanner;

public class starara {
	static File araba=new File("araba.txt");
	static File fatura=new File("fatura.txt");
	static String amrk,fad,aid,fid,s1,str;
	static int a=-1,syc,no;
	 static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	 static HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
	
	public static void main(String [] args) throws RemoteException, AlreadyBoundException, NotBoundException, FileNotFoundException {
	client client=new client();
	client.starat();
	
		dosyaac();
			
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("araba kayýt için 1 \n"
					+ "fatura kayýt için 2 \n"+
					"sorgulama için 3\n"
					+"çýkýþ için 0 girin");
			
			
			while(true) {
				
				a=in.nextInt();
				
				if(a==1||a==2) {
				System.out.println("araba kayýt için 1 \n"+
				"fatura kayýt için 2 \n"+
				"sorgulama için 3\n"+
				"çýkýþ için 0 girin\n");
				}
				if(a==0) {
					System.out.println("Çýkýþ Yapýldý");
					break;
				}
				
				
				
					
			switch(a) {
			
			case 1:
				client.tappr(a);
				break;
			case 2:
				client.tappr(a);
				break;
			case 3:
				client.hasharaba();
				client.hashfatura();
				System.out.println("serino ile araba arama için 4 \n"
						+ "marka ile araba arama için 5 \n"
						+ "faturaid ile arama için 6 \n"
						+ "alýcýadý ile arama için 7 \n"
						+ "çýkýþ için 0 girin");
				break;
			case 4:
				client.tappr(a);
				break;
			case 5:
				client.tappr(a);
				break;
			case 6:
				client.tappr(a);
				break;
			case 7:
				client.tappr(a);
				break;
				default:
					break;
			}
			}
		}
	
	
}
	public static void dosyaac() {
		if(!araba.exists()) {
			try {
				araba.createNewFile();
				System.out.println("dosya olusturuldu.");
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			else {
				araba.delete();
				System.out.println("dosya1 silinip yeniden olusturuldu.");
				try {
					araba.createNewFile();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		if(!fatura.exists()) {

			try {
				fatura.createNewFile();
				System.out.println("dosya olusturuldu.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else {
				fatura.delete();
				System.out.println("dosya2 silinip yeniden olusturuldu.");
				try {
					fatura.createNewFile();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			
	}
	
	}
}