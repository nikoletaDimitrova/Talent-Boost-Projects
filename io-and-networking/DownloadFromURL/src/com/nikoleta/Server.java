package com.nikoleta;

import java.io.*;
import java.net.URL;

public class Server {

    public static void main(String[] args) {
            try {
                URL urlKitten = new URL("https://m3.netinfo.bg/media/images/15192/15192098/960-540-kote-koteta-kotenca.jpg");
               InputStream in = urlKitten.openStream();

                DataInputStream inputStream = new DataInputStream(new BufferedInputStream(in));
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("kitten.jpg"));

                int j;
                byte[] i = new byte[3000];
                while ((j=inputStream.read(i)) != -1) {
                    outputStream.write(i, 0 , j);
                }
            }catch(IOException e){
                e.printStackTrace();
            }
    }
        }
