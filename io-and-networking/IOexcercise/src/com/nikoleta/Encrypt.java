package com.nikoleta;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Encrypt {

    public void makeEncode(String words){
        writingToFile(rotate13(words));
    }

    private String rotate13(String words) {
        char[] chars = words.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (char ch : chars) {
            ch += 13;
            newString.append(ch);
        }
        return newString.toString();
    }

    private void writingToFile(String encodedWords) {
        try (OutputStreamWriter out = new OutputStreamWriter(
                new FileOutputStream(new File("encodedText.txt")))) {
            out.write(encodedWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
