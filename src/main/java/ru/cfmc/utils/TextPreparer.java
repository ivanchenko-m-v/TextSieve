package ru.cfmc.utils;

public abstract class TextPreparer
{
    final String text;

    TextPreparer( String text )
    {
        this.text = text;
    }

    abstract public String prepare( );

}//public class TextPreparer
