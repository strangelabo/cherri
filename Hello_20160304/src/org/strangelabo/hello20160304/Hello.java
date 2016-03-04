package org.strangelabo.hello20160304;

import java.util.List;

import org.strangelabo.hello20160304.output.CharactorGen;

public class Hello {

    public static void main(String[] args) {

        // 表示内容
        List<Character> helloCharList = CharactorGen.getHelloWorldChars();

        // 出力

        //helloCharList.forEach(moji -> System.out.println(moji));

        helloCharList.forEach(System.out::println);


    }


}
