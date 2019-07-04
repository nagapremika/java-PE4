package com.stackroute.pe4;


import java.util.Arrays;

public class DictionaryOrderGenerator {
    //Gives the words in a paragragh in alphabetical order
    public String dictionary(String list)
    {

        String[] array;
        String string="";
        if(list==null){
            string="Null String";
        }
        else if(list=="")
        {
            string="Empty String";
        }
        else {
            array = list.split(" ");
            int length = array.length;
            String swap;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[i].compareTo(array[j]) > 0) {     //Generates words in lexographical order
                        swap = array[i];
                        array[i] = array[j];
                        array[j] = swap;
                    }
                }
            }
            string= Arrays.toString(array);     //Converting array to String
        }
return string;
    }
}
