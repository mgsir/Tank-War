import java.awt.*;
import java.awt.event.*;


public class Tank {
    public static final int SPEED = 3;
    private int x, y;
    private boolean bH = false, bJ = false, bK = false, bL = false;

    Dir dir ;
    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    

    public void paint(Graphics g) {
        g.fillRect(x, y, 100, 100);
        move();
    }

    public void pressed(KeyEvent e) {
        int key = e.getKeyChar();

        switch (key) {
            case KeyEvent.VK_H:
                bH = true;
                break;
            case KeyEvent.VK_J:
                bJ = true;
                break;
            case KeyEvent.VK_K:
                bK = true;
                break;
            case KeyEvent.VK_L:
                bL = true;
        }
        changeDir();

    }

    void released(KeyEvent e)
    {
        int key = e.getKeyChar();

        switch (key) {
            case KeyEvent.VK_H:
                bH = false;
                break;
            case KeyEvent.VK_J:
                bJ = false;
                break;
            case KeyEvent.VK_K:
                bK = false;
                break;
            case KeyEvent.VK_L:
                bL = false;
        }
        changeDir();

    }

    private void changeDir(){
        if(!bH && !bJ && !bK && !bL){
            this.dir = Dir.NUll_;
        }
        if(bH && !bJ && !bK && !bL){
            this.dir = Dir.H;
        }
        if(!bH && bJ && !bK && !bL){
            this.dir = Dir.J;
        }
        if(!bH && !bJ && bK && !bL){
            this.dir = Dir.K;
        }
        if(!bH && !bJ && !bK && bL){
            this.dir = Dir.L;
        }

    }
 
 
    private void move( ){
        switch (dir) {
            case H:
                x -= SPEED;
                break;
            case J:
                y += SPEED;
                break;
            case K:
                y -= SPEED;
                break;
            case L:
                x += SPEED;
                break;
        }

    }
}