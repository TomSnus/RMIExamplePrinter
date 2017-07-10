package Entity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public interface JobIF extends Remote{

    int getPages() throws RemoteException;
    Date getDate() throws RemoteException;
    void sendConfirmation() throws RemoteException;


}
