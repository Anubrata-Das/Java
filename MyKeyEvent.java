import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code=MyKeyEvent width=400 height = 300>
</applet>
 */

public class MyKeyEvent extends Applet implements KeyListener {
    String m="";
    public void init(){
        addKeyListener(this);
    }
    public void paint(Graphics g){
        g.drawString(m,50,40);
    }
    public void keyReleased(KeyEvent ke){
        showStatus("Key released");
    }
    public void keyTyped(KeyEvent ke){
        m=m+ke.getKeyChar();
        repaint();
    }
    public void keyPressed(KeyEvent ke){
        int n = ke.getKeyCode();
        switch (n){
            case KeyEvent.VK_Y:
                m="<<Y>>";
            break;
            case KeyEvent.VK_F3:
                m="<<F3>>";
            break;
            case KeyEvent.VK_LEFT:
                m="<<Left arrow>>";
            break;
            case KeyEvent.VK_PAGE_DOWN:
                m="<<Page down>>";
            break;
            case KeyEvent.VK_ENTER:
                m="";
        }
        showStatus("Key Pressed");
        repaint();
    }
}
