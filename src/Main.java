import java.awt.*;
import javax.swing.*;
public class Main{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,300);


        // Creating an object of MyDrawPanel class which automatically calls paintComponent for me

        ballPanel myBP = new ballPanel();

        myFrame.add(myBP);

        myFrame.setVisible(true);
    }
}