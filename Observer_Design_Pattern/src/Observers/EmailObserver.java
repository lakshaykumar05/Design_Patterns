package Observers;

import Observables.Observable;

public class EmailObserver implements Observer{

    Observable obj;
    String email;

    public EmailObserver(String email, Observable o)
    {
        this.email = email;
        this.obj = o;
    }

    @Override
    public void update() {
        sendEmailNotification(email);
    }


    public void sendEmailNotification(String email)
    {
        System.out.println(email + " got the message i.e " + this.obj.getData() + " is available in limited quantity.");
    }
    
}
