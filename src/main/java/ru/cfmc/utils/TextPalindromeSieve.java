package ru.cfmc.utils;

import java.util.List;

public class TextPalindromeSieve extends TextSieve
{
    public TextPalindromeSieve( String text, ParametersSieve parameters )
    {
        super( text, parameters );
    }

    @Override
    public ITextPreparerFabrique getTextPreparerFabrique( )
    {
        return null;
    }

    @Override
    public List<TextPart> sift( )
    {
        return null;
    }

    @Override
    Boolean isMatchCriteria( TextPart textPart )
    {
        return null;
    }
}//public class TextPalindromeSieve
