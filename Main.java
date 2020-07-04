import java.awt.*;


public class Main
{
    public static void main(String [] agrs)

    {
        TankFrame t = new TankFrame();
        for(;;){
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            t.repaint();
        }
    }
}