package view;

import controller.ControllaDecrementi;
import controller.ControllaIncrementi;
import controller.ControllaRoberta;

import javax.swing.*;

public class Finestra extends JFrame {
    public static final long serialVersionUID = 1L;
    private JPanel pannelloPazzoSgravo;
    public Finestra(){
        super("SUPER CONTATORE SPAZIALE");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0,0,1500,400);
        setLayout(null);

        pannelloPazzoSgravo = new PannelloPazzoSgravato();

        add(pannelloPazzoSgravo);
        pannelloPazzoSgravo.setBounds(20,10,160,100);
        JButton bDec = new JButton("-");
        JButton bInc = new JButton("+");
        JButton Roberta = new JButton("Roberta");
        add(bInc);
        add(bDec);
        add(Roberta);
        bInc.setBounds(100,150,50,50);
        bInc.addActionListener(new ControllaIncrementi());
        bDec.setBounds(20,150,50,50);
        bDec.addActionListener(new ControllaDecrementi());
        Roberta.setBounds(200,150,500,100);
        Roberta.addActionListener(new ControllaRoberta());
    }
    public JPanel getPannelloPazzoSgravo(){
        return pannelloPazzoSgravo;
    }
}
