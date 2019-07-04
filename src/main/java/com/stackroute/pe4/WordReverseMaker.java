package com.stackroute.pe4;

public class WordReverseMaker {     //WordReversemaker reverses every word in given string
    public String reverse(String input)
    {
        String output="";
        String[] array;
        if(input==null){
         output="Null String";
        }
        else if(input.equals("")){
            output="Empty String";
        }

      else {
             array=input.split(" ");
            StringBuffer[] word=new StringBuffer[array.length];
            for (int i=0;i<array.length;i++) {
                word[i] = new StringBuffer(array[i]);       //reverse() method reverses the string
                word[i].reverse();

                output = output.concat(word[i].toString()+" ");     //Concatenating output
            }
      }
       return output;
    }
}
