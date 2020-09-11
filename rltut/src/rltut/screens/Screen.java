package rltut.screens;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public interface Screen {

    public default void displayOutput(AsciiPanel terminal) {

    }

    public default Screen respondToUserInput(KeyEvent key) {
        return null;
    }
}
