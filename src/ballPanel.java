import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class ballPanel extends JPanel{
   Ball b1 = new Ball();
    public ballPanel(){
        setBackground(Color.GREEN);
        setFocusable(true);
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int key = e.getKeyCode();
                if(key == 68 || key == 39){
                    b1.moveRight();
                }
                if(key == 69){
                    b1.changeColor();
                }
                if(key == 87 || key == 38){
                    b1.moveDown();
                }
                if(key == 83 || key == 40){
                    b1.moveUp();
                }
                if(key == 65 || key == 37) {
                    b1.moveLeft();
                }
                if(key == 65 && key == 83){
                    b1.moveLeft();
                    b1.moveUp();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    @Override
    protected void paintComponent(Graphics G){
        super.paintComponent(G);
        G.setColor(new Color(b1.getR(),b1.getG(),b1.getB()));
b1.drawBall(G);


        try{
            Thread.sleep(5);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }
}
