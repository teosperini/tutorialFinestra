package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllaDecrementi implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ModalityManager.counterInstance.dec();
    }
}
