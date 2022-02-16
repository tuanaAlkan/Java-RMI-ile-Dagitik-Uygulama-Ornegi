package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import shared.cars;

public class serv implements cars{
public serv() throws RemoteException {
	UnicastRemoteObject.exportObject(this,0);
}
	@Override
	public String tappr(int sr) throws RemoteException {
		return " ";	}

}
