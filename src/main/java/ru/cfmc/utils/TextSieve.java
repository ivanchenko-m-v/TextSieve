package ru.cfmc.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * TextSieve -  абстрактный класс вычленения (просеивания)
 *              частей из заданного текста по заданным критериям
 */
public abstract class TextSieve
{
    final String            text;
    final ParametersSieve   parameters;
    final TextPreparer      textPreparer;

    /**
     * getTextPreparerFabrique( ) - фабрика классов для объекта предварительной обработки
     * текста в зависимости от параметров просеивания
     * @return
     */
    public abstract ITextPreparerFabrique getTextPreparerFabrique( );

    TextSieve( String text, ParametersSieve parameters )
    {
        this.text = text;
        this.parameters = parameters;
        this.textPreparer = getTextPreparerFabrique( ).createTextPreparer( parameters );
    }

    /**
     * sift( ) -    Абстрактная функция вычленения (просеивания)
     *              частей из заданного текста по заданным критериям
     * @return -    Список просеянных частей, соответствующих
     *              критериям выбора
     */
    public abstract List<TextPart> sift( );

    abstract Boolean isMatchCriteria( TextPart textPart );

}//public class TextSieve
