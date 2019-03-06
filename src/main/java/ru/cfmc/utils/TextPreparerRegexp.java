package ru.cfmc.utils;

public abstract class TextPreparerRegexp extends TextPreparer
{

    public abstract String getNotMatchRegex( );

    TextPreparerRegexp( String text )
    {
        super( text );
    }

    @Override
    public String prepare( )
    {
        //удаляем все символы, которые не должны присутствовать в результате
        return text.replace( getNotMatchRegex( ), "" );
    }

}//public class TextPreparerRegexp
