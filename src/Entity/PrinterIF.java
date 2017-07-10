package Entity;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public interface PrinterIF extends Remote{
   void print(JobIF job)  throws RemoteException;
}
