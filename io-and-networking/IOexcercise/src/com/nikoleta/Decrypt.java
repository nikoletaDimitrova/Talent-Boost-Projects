package com.nikoleta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decrypt {

    public void makeDecode(){
    String words = readingFromFile();
    decode(words);
    }

    private String readingFromFile(){
        StringBuilder readedWords = new StringBuilder();
        try(InputStreamReader in = new InputStreamReader(new FileInputStream("encodedText.txt"))){
            int l;
            while((l = in.read()) > 10){
                readedWords.append((char)l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readedWords.toString();
    }

    private void decode(String words){
       char[] chars = words.toCharArray();
       StringBuilder decodedWords = new StringBuilder();
       for(char ch : chars){
           ch-=13;
           decodedWords.append(ch);
       }
        System.out.println(decodedWords);
     }

}
