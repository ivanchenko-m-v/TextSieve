package ru.cfmc.utils;

public class TextPart
{
    private final String    text;
    private final int       posStart;
    private final int       length;

    public String getText( )
    {
        return text;
    }

    public int getPosStart( )
    {
        return posStart;
    }

    public int getLength( )
    {
        return length;
    }

    TextPart( String text, int posStart, int length )
    {
        this.text = text;
        this.posStart = posStart;
        this.length = length;
    }

    @Override
    public String toString( )
    {
        return text.substring( posStart, posStart + length );
    }

}//public class TextPart
