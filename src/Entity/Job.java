package Entity;

import java.rmi.RemoteException;
import java.util.Date;

/**
 * Created by Faßreiter on 10.07.2017.
 */
public class Job implements JobIF {
    private Date date;
    private int pages;

    public Job(Date date, int pages) {
        this.date = date;
        this.pages = pages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void sendConfirmation() throws RemoteException {
        System.out.println("Print Job is Done, Confirmation obtained.");
    }
}
