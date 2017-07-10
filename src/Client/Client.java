package Client;

import Entity.Job;
import Entity.JobIF;
import Entity.PrinterIF;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry("localhost", 1098);
        PrinterIF stub = (PrinterIF) registry.lookup("printer");

        JobIF clientStub = (JobIF) UnicastRemoteObject.exportObject(new Job(new Date(), 125), 0);


        stub.print(clientStub);
    }
}
