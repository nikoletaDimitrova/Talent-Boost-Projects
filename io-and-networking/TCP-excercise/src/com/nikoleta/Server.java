package com.nikoleta;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static String filename = "someWords.txt";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3333);

        try (Socket socket = serverSocket.accept()) {

            System.out.println("Client accepted!");

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(filename));
            byte[] i = new byte[356];
            while (reader.read(i) > -1) {
                out.write(i);
            }
//            out.writeUTF(filename);
        }catch(IOException e){
            e.printStackTrace();
        }
        serverSocket.close();
    }

}

