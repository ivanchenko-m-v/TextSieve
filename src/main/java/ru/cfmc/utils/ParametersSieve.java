package ru.cfmc.utils;

public class ParametersSieve
{
    //влияние регистра символов при анализе текста
    final TextAnalyzeCase       analyzeCase;
    //набор символов, включенных в анализ
    //(учитываемых при анализе, остальные - отбрасываются)
    final TextAnalyzeSymbols    analyzeSymbols;
    //минимальная длина текстового блока для соответствия результату
    //(текстовые блоки, менее заданной длины - отбрасываются)
    final Integer               minPartLength;

    ParametersSieve(
         TextAnalyzeCase       analyzeCase
        ,TextAnalyzeSymbols    analyzeSymbols
        ,Integer               minPartLength
                   )
    {
        this.analyzeCase    = analyzeCase;
        this.analyzeSymbols = analyzeSymbols;
        this.minPartLength  = minPartLength;
    }
}//public class ParametersSieve
