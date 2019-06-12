package com.nikoleta;

import java.io.*;

public class WriteCyrillic {
    private int countBytes = 0;

    public void writingToFile(String readedWords){
        try(OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(new File("output_win1251.txt")), "windows-1251")){
            out.write(readedWords);
            countBytes+=readedWords.getBytes("windows-1251").length;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printBytes(){
        System.out.println("Bytes: " + countBytes);
    }
}
