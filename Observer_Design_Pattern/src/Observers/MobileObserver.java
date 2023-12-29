package Observers;

import Observables.Observable;

public class MobileObserver implements Observer {

    Observable obj;
    String phoneNumber;

    public MobileObserver(String number, Observable o)
    {
        this.phoneNumber = number;
        this.obj = o;
    }

    @Override
    public void update() {
        sendMobileNotification(phoneNumber);
    }


    public void sendMobileNotification(String phoneNumber)
    {
        System.out.println(phoneNumber + " got the message i.e " + this.obj.getData() + " is available in limited quantity.");
    }
    
}
