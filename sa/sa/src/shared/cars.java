package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface cars extends Remote{
String tappr(int srr) throws RemoteException;
}
