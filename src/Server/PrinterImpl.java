package Server;

import Entity.Job;
import Entity.JobIF;
import Entity.PrinterIF;

import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public class PrinterImpl implements PrinterIF {


    @Override
    public void print(JobIF job) throws RemoteException {
        System.out.println("Printer: new Job - > " + job.getDate() + " pages -> " + job.getPages());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start printing...");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("Printing done. ----- Sending Confirmation");
                    job.sendConfirmation();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
