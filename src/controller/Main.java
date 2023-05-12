package controller;

import model.Counter;
import view.Finestra;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        ModalityManager.counterInstance = new Counter();      //counter è il Model
        Finestra w = new Finestra();    //finestra è la View
        w.setVisible(true);
        ModalityManager.counterInstance.addObserver((Observer)w.getPannelloPazzoSgravo());
        ModalityManager.counterInstance.reset();

        //continuo

        while(true){
            if (ModalityManager.automatic) {
                ModalityManager.counterInstance.inc();
                //ModalityManager.counterInstance.dec();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
