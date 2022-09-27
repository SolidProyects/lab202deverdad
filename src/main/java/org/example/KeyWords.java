package org.example;

import java.util.List;

public class KeyWords {
    public static boolean keywordInString(String word){

        List<String> keywords = List.of("abstract", "continue", "for", "new", "switch",
                "assert", "default", "if", "package", "synchronized", "boolean",
                "do", "goto", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof",
                "return", "transient", "catch", "extends", "int", "short", "try", "char", "final",
                "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile",
                "const", "float", "native", "super", "while", "null", "true", "false");

        List<String> keywordInPhrase = List.of(word.split(" "));
        for(String e : keywords){
            if(keywordInPhrase.contains(e)){
                return true;
            }
        }
        return false;


    }

}
