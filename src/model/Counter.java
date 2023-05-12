package model;

import java.util.Observable;

public class Counter extends Observable {
    private long contatore;

    public void inc(){

        contatore++;
        notifica();
    }

    public void dec(){
        if (contatore >0)
            contatore--;
        notifica();
    }

    public void rob(){
        contatore += 104;
        notifica();
    }

    public void reset(){
        contatore = 0;
        notifica();
    }

    private void notifica(){
        setChanged();
        notifyObservers("value: "+contatore);
    }

}
