package view;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.util.Observable;
import java.util.Observer;

public class PannelloPazzoSgravato extends JPanel implements Observer {

    @Serial
    private static final long serialVersionUID = 1234L;
    private String stringaDaStampare ="ciao";

    public PannelloPazzoSgravato(){
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.WHITE);
        g2.drawString( stringaDaStampare,10,40 );
    }
    public void update(Observable obs, Object msg){
        if (msg != null) {
            stringaDaStampare = (String) msg;
            repaint();
        }
    }
}
