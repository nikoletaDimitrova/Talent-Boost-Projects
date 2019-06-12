package com.nikoleta;

import java.io.*;

public class ReadCyrillic {
    private int countBytes = 0;

    public String readingFile() {
        StringBuilder readingWords = new StringBuilder();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream("src/input_utf8.txt"), "utf8")) {
            int l;
            while ((l = in.read()) > 10) {
                readingWords.append((char)l);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readingWords.toString();
    }

    public String displayContent(){
        String wordsFile = readingFile();
        System.out.println(wordsFile);
       return wordsFile;
    }

    public void printBytes() throws UnsupportedEncodingException {
        String wordsFile = readingFile();
        System.out.println("Bytes: " +  wordsFile.getBytes("UTF-8").length);
    }

}
