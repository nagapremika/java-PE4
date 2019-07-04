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
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException e)
            {
                return "NullPointerException";
            }
        }
        else {
            if (sentence.contains(name)) {      //if sentence contains name the concats with true else false
                output = string.concat(" True");
            } else {
                output = string.concat(" False");
            }
        }
        return output;
    }
}
