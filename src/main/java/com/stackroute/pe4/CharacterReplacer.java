package com.stackroute.pe4;

public class CharacterReplacer {        //CharacterReplacer replaces 'd' with 'f' and 'I' with 't' in given string
    public String converter(String input)
    {

        String word="";
        if(input==null)
        {
            word="Null string";
        }
        else if(input.contains("d")||input.contains("I")){
            word=input.replaceAll("d","f");
            word=word.replaceAll("l","t");
        }
        else{
            word=input;
        }
        return word;
    }
}
