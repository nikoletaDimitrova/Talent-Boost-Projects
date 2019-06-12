package com.nikoleta;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost",3333)){
            DataInputStream in = new DataInputStream(socket.getInputStream());
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(new File("someWords2.txt")));
            byte[] j = new byte[356];
            while((in.read(j)) > -1){
                writer.write(j);
            }

            writer.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
