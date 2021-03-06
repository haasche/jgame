package rltut;

import asciiPanel.AsciiPanel;
import java.awt.*;

public enum Tile {

    FLOOR((char)250, AsciiPanel.yellow),
    WALL((char)177, AsciiPanel.yellow),
    BOUNDS('x', AsciiPanel.brightBlack);

    private final char glyph;
    public char glyph(){
        return glyph;
    }

    private final Color color;
    public Color color(){
        return color;
    }

    Tile(char glyph, Color color){
        this.glyph = glyph;
        this.color = color;
    }

    public boolean isDiggable(){
        return this == Tile.WALL;
    }

    public boolean isGround(){
        return this != WALL && this != BOUNDS;
    }
}
