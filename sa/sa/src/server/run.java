package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import shared.cars;

public class run {
	public static void main(String [] args) throws RemoteException, AlreadyBoundException {
	cars server=new serv();
	Registry registry=LocateRegistry.createRegistry(1099);
	registry.bind("server", server);
	System.out.println("Sunucu Hazýr");
	}
}
