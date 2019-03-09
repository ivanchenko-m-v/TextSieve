package ru.cfmc;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class PalindromeAnalyzerApp
{
    public static void main( String[] args )
    {
        try
        {
            String text = "арозаупаланалапуазора";
            List lst = extractCandidatePalindromes( text, 3 );

            System.out.println( text );
            System.out.println( lst );
        }
        catch( Exception ex )
        {
            System.out.println( ex.getLocalizedMessage( ) );
        }
    }

    static List<String> extractPalindromes( String text, int minLength )
    {
        List<String> list = new ArrayList<>( );
        return list;
    }

    static List<String> extractCandidatePalindromes( String text, int minLength )
    {
        List<String> list = new ArrayList<>( );
        for( int i = 0; i < text.length( ) - minLength; ++i )
        {
            analyzeFromPos( text, i, list, minLength );
        }
        return list;
    }

    static void analyzeFromPos( final String text, final int pos, List<String> results, int minLength )
    {
        int foundPos = text.length( ) - 1;
        do
        {
            foundPos = text.lastIndexOf(  text.charAt( pos ), foundPos );
            if( foundPos - pos < minLength - 1 )
            {
                break;
            }
            results.add( text.substring( pos, foundPos + 1 ) );
            foundPos -= 1;
        }
        while(  pos < foundPos && foundPos - pos >= minLength );
    }

}//public class PalindromeAnalyzerApp
