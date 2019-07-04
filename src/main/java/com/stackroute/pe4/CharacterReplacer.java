package com.stackroute.pe4;

public class CharacterReplacer {        //CharacterReplacer replaces 'd' with 'f' and 'l' with 't' in given string
    public String converter(String input)
    {

        String word="";
        if(input==null)
        {
            return null;
        }
        else if(input=="")
        {
            word="Empty string";
        }
        else if(input.contains("d")||input.contains("I")){
            word=input.replaceAll("d","f");     //Replaces "d" with "f"
            word=word.replaceAll("l","t");       //Replaces "l" with "t"
        }
        else{
            word=input;
        }
        return word;
    }
}
