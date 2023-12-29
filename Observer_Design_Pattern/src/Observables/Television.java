package Observables;

import java.util.ArrayList;
import java.util.List;

import Observers.Observer;

public class Television implements Observable {

    public List<Observer> itemObservers = new ArrayList<Observer>();

    int itemQuantity = 0;

    String data = "Television";

    @Override
    public void add(Observer obj) {
        itemObservers.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        itemObservers.remove(obj);
    }

    @Override
    public void notifyy() {
        
        for(Observer item : itemObservers)
        {
            item.update();
        }
    }

    @Override
    public void setData(int setQuantity) {

        if(setQuantity > 0)
        {
            itemQuantity += setQuantity;
            notifyy();
        }
    }

    @Override
    public String getData()
    {
        return data;
    }
}
