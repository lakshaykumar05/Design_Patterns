package Observables;

import Observers.Observer;

public interface Observable {
    public void add(Observer obj);
    public void remove(Observer obj);
    public void notifyy();
    public void setData(int setQuantity);
    public String getData();
}
