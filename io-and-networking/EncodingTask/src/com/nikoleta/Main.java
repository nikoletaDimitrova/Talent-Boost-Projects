package com.nikoleta;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) {
   ReadCyrillic readCyrillic = new ReadCyrillic();
   String readedWords = readCyrillic.displayContent();
        try {
            readCyrillic.printBytes();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        WriteCyrillic writeCyrillic = new WriteCyrillic();
   writeCyrillic.writingToFile(readedWords);
   writeCyrillic.printBytes();
    }
}
