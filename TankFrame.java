import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class TankFrame extends Frame {
    Tank tank;

    public TankFrame() {
        this.setTitle("tank war");
        this.setLocation(400,100);
        this.setSize(600, 700);
        this.setVisible(true);
        this.addKeyListener(new TankKeyListener());

         tank = new Tank(200,200,Dir.NUll_);
    }

    @Override
    public void paint(Graphics g ){
        tank.paint(g);
    }

    private class TankKeyListener extends KeyAdapter {
    public void keyTyped(KeyEvent e) {
       
    }

    public void keyPressed(KeyEvent e) {
        tank.pressed(e);
    }

    public void keyReleased(KeyEvent e) {
        tank.released(e);
        
    }
    

   }
}