package rltut;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import rltut.screens.Screen;
import rltut.screens.StartScreen;

import java.awt.event.KeyEvent;

public class ApplicationMain extends JFrame{
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;
    private Screen screen;

    public ApplicationMain(){
        super();
        terminal = new AsciiPanel();
        add(terminal);
        pack();
        screen = new StartScreen();
        repaint();
    }

    public void repaint(){
        terminal.clear();
        screen.displayOutput(terminal);
        super.repaint();
    }

    public void keyReleased(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){

    }


    public static void main(String[] args){
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
