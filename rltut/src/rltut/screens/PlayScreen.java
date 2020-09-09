package rltut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class PlayScreen implements Screen {

    public void displayOutput(AsciiPanel terminal) {
        terminal.write("Default text here.",1,1);
        terminal.writeCenter("-- press [escape] to lose or [enter] to win --", 22);
    }

    public Screen respondToUserInput(KeyEvent key) {
        switch(key.getKeyCode()){
            case KeyEvent.VK_ESCAPE:
                return new LoseScreen();
            case KeyEvent.VK_ENTER:
                return new WinScreen();
            default:
                System.out.println("An error has occurred in respond to user input");
        }

        return this;
    }
}
