package com.nikoleta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.next();

        Encrypt encrypt = new Encrypt();
        encrypt.makeEncode(words);

        Decrypt decrypt = new Decrypt();
        decrypt.makeDecode();
    }
}
