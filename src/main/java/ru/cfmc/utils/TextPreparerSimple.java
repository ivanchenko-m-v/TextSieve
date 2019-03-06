package ru.cfmc.utils;

public class TextPreparerSimple extends TextPreparer
{
    public TextPreparerSimple( String text )
    {
        super( text );
    }

    @Override
    public String prepare( )
    {
        //в простейшем случае анализируем все символы,
        //без исключений
        return this.text;
    }

}//public class TextPreparerSimple
