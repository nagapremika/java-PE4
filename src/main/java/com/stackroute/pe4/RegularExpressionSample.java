package com.stackroute.pe4;

public class RegularExpressionSample {      //This class gives message as true if String has Harry
    public String finder(String sentence)
    {
        String name="Harry",string="Is Harry here?",output;
        if(sentence=="")
        {
            output="Empty String";

        }
        else if(sentence==null){
            output="Null String";
        }
        else {
            if (sentence.contains(name)) {
                output = string.concat(" True");
            } else {
                output = string.concat(" False");
            }
        }
        return output;
    }
}
