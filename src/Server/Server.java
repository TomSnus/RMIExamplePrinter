package Server;

import Entity.PrinterIF;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public class Server {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {

        PrinterImpl printer = new PrinterImpl();
        PrinterIF skelleton = (PrinterIF) UnicastRemoteObject.exportObject(printer, 0);

        Registry registry = LocateRegistry.createRegistry(1098);
        registry.bind("printer", skelleton);

        System.out.println("Server running....");


    }
}
