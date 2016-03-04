package org.strangelabo.hello20160304.output;

import java.util.Arrays;
import java.util.List;

public class CharactorGen {

    private static final List<Character> helloCharList = Arrays.<Character>asList('H','e','l','l','o',' ','W','o','r','l','d','!');


    public static List<Character> getHelloWorldChars(){
        return helloCharList;
    }

}
