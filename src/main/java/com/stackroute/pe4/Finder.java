package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Finder {       //This class gives the index of given pattern in a string
    public String match(String sentence,String word)
    {

        String output="";
        if(sentence==null){
            output="Null String";
        }
        else if(sentence.equals("")){
            output="Empty String";
        }

     else   if(sentence.contains(word)) {
            int start=0,end=0;
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(sentence);

            while (matcher.find()) {
                start = matcher.start();        //Start index of pattern
                end = matcher.end();               //End index of pattern
                output = output.concat(start + "-" + end + " ");
            }
        }
        else {
            output="Pattern Not found";
        }
        return output;
    }
}
